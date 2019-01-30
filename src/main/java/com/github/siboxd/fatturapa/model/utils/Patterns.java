package com.github.siboxd.fatturapa.model.utils;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.regex.Pattern;

import static java.util.Objects.requireNonNull;

/**
 * Utility class to manage Pattern class instances and checks
 *
 * @author Enrico
 */
public final class Patterns {

    /**
     * A utility method to check if a string satisfies a given pattern; it can be used upon constructing objects
     *
     * @param toMatchString the string to check
     * @param pattern       the pattern to check against
     * @return true if the string matches; throws an unchecked exception, retrieved by
     * invoking the exceptionSupplier, otherwise
     * @throws NullPointerException     if some NonNull annotated parameter is {@code null}
     * @throws IllegalArgumentException if the string doesn't match the provided pattern
     */
    public static boolean matchAgainstPatternOrThrow(@NonNull final String toMatchString,
                                                     @NonNull final Pattern pattern) {
        requireNonNull(toMatchString);
        requireNonNull(pattern);

        if (pattern.matcher(toMatchString).matches()) {
            return true;
        } else {
            final String causeMessage = "Given string " + toMatchString + " does not match pattern " + pattern;
            throw new IllegalArgumentException(causeMessage);
        }
    }
}
