package com.github.siboxd.fatturapa.testutils;

import com.google.common.collect.Streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Utility class for asserting in JUnit5
 *
 * @author Enrico
 */
@SuppressWarnings("UnstableApiUsage")
public final class AssertionUtils {

    /**
     * <ol>
     * <li>Checks if the two files have the same line number</li>
     * <li>then Compares for equality each line of both given files in order,
     * calling {@link String#trim()} method on each line before comparing</li>
     * </ol>
     *
     * @param expectedFilePath the file with expected contents
     * @param actualFilePath   the file with actual contents
     * @throws IOException in case of problems reading these files
     */
    public static void assertFileLinesTrimmedEquals(final Path expectedFilePath, final Path actualFilePath) throws IOException {
        final List<String> expectedLines = Files.readAllLines(expectedFilePath, StandardCharsets.UTF_8);
        final List<String> actualLines = Files.readAllLines(actualFilePath, StandardCharsets.UTF_8);

        assertEquals(expectedLines.size(), actualLines.size());

        Streams.forEachPair(expectedLines.stream(), actualLines.stream(),
                (expected, actual) -> assertEquals(expected.trim(), actual.trim()));
    }
}
