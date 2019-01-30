package com.github.siboxd.fatturapa.testutils;

import org.junit.jupiter.api.BeforeEach;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.nio.file.Path;

import static com.github.siboxd.fatturapa.testutils.AssertionUtils.assertFileLinesTrimmedEquals;
import static com.github.siboxd.fatturapa.testutils.ResourceResolver.resolveResourcePath;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Base class for XML serialization tests that require temporary files and resource access
 *
 * @author Enrico
 */
public abstract class AbstractXmlSerializationTest extends AbstractTestWithTemporaryFiles {

    protected Serializer persister;

    @BeforeEach
    protected void setUp() {
        super.setUp();
        persister = new Persister();
    }

    /**
     * Utility method to persist the created model object to XML and check back with example provided
     *
     * @param toPersist        the object to persist to XML
     * @param resourceFolder   the resource folder where to find the resource file
     * @param expectedFileName the file name of file that should be generated
     */
    protected void persistAndCheck(final Object toPersist, final String resourceFolder, final String expectedFileName) {
        try {
            final Path expectedFilePath = resolveResourcePath(resourceFolder, expectedFileName);
            final Path actualFilePath = createTempFilePath();
            persister.write(toPersist, actualFilePath.toFile());

            // Helps in IntelliJ Idea IDE to find errors in tests, but makes tests fail...
            // enable only for debugging purposes
//             assertEquals(
//                     FileUtils.readFileToString(expectedFilePath.toFile(), StandardCharsets.UTF_8),
//                     FileUtils.readFileToString(actualFilePath.toFile(), StandardCharsets.UTF_8));

            assertFileLinesTrimmedEquals(expectedFilePath, actualFilePath);
        } catch (final Exception e) {
            fail(e);
        }
    }

}
