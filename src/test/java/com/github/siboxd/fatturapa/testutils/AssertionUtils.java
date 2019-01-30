package com.github.siboxd.fatturapa.testutils;

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

        assertEquals(expectedLines.size(), actualLines.size(),
                "Line count not matching for " + expectedFilePath + " file!!");

        for (int i = 0; i < expectedLines.size(); i++) {
            final String expected = expectedLines.get(i).trim();
            final String actual = actualLines.get(i).trim();

            assertEquals(expected, actual, "At line " + (i + 1));
        }
    }
}
