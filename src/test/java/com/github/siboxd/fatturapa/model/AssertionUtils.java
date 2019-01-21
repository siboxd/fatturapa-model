package com.github.siboxd.fatturapa.model;

import com.google.common.collect.Streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Utility class for asserting in JUnit5
 *
 * @author Enrico
 */
@SuppressWarnings("UnstableApiUsage")
public final class AssertionUtils {

    /**
     * Compares for equality each line of both given files in order, calling {@link String#trim()} method on each line before comparing
     *
     * @param expectedFilePath the file with expected contents
     * @param actualFilePath   the file with actual contents
     * @throws IOException in case of problems reading these files
     */
    public static void assertFileLinesTrimmedEquals(final Path expectedFilePath, final Path actualFilePath) throws IOException {
        Streams.forEachPair(
                Files.lines(expectedFilePath, StandardCharsets.UTF_8),
                Files.lines(actualFilePath, StandardCharsets.UTF_8),
                (expected, actual) -> assertEquals(expected.trim(), actual.trim()));
    }

}
