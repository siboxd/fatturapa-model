package com.github.siboxd.fatturapa.testutils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.nio.file.Path;

import static com.github.siboxd.fatturapa.testutils.AssertionUtils.assertFileLinesTrimmedEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Base class for XML serialization tests that require temporary files and resource access
 *
 * @author Enrico
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AbstractXmlSerializationTest extends AbstractTestWithTemporaryFiles implements ResourceResolver {

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

            assertFileLinesTrimmedEquals(expectedFilePath, actualFilePath);
        } catch (final Exception e) {
            fail(e);
        }
    }

}
