package com.github.siboxd.fatturapa.testutils;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * A test in which you can create temporary files that will be deleted on test end
 *
 * @author Enrico
 */
public abstract class AbstractTestWithTemporaryFiles {

    private List<Path> toDeleteTempFilePaths;

    @BeforeEach
    protected void setUp() {
        toDeleteTempFilePaths = new LinkedList<>();
    }

    @AfterEach
    protected void tearDown() {
        toDeleteTempFilePaths.stream().map(Path::toFile).forEach(FileUtils::deleteQuietly);
        toDeleteTempFilePaths.clear();
    }

    /**
     * @return the Path pointing to a new temporary file
     */
    protected Path createTempFilePath() {
        try {
            final Path tempFilePath = Files.createTempFile(null, null);
            toDeleteTempFilePaths.add(tempFilePath);
            return tempFilePath;
        } catch (final IOException e) {
            return fail(e);
        }
    }

    /**
     * Returns a stream of newly created temporary files
     *
     * @param numberOfFiles the number of temporary files to create
     * @return a stream of new temporary files
     */
    protected Stream<Path> createTempFiles(final int numberOfFiles) {
        return IntStream.range(0, numberOfFiles)
                .mapToObj(ignored -> createTempFilePath());
    }

}
