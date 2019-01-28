package com.github.siboxd.fatturapa.model.utils;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.function.Supplier;
import java.util.regex.Pattern;

/**
 * Utility class to manage Pattern class instances and checks
 *
 * @author Enrico
 */
public class Patterns {

    /**
     * A utility method to check if a string satisfies a given pattern; it can be used upon constructing objects
     *
     * @param toMatchString     the string to check
     * @param pattern           the pattern to check against
     * @param exceptionSupplier the exceptionSupplier that will be called if the string doesn't match the pattern
     * @return true if the string matches (useful if used in if statements, throws an unchecked exception otherwise
     */
    public static boolean matchAgainstPatternOrThrow(@NonNull final String toMatchString,
                                                     @NonNull final Pattern pattern,
                                                     @Nullable final Supplier<? extends RuntimeException> exceptionSupplier) {

        if (pattern.matcher(toMatchString).matches()) {
            return true;
        } else {
            throw exceptionSupplier == null
                    ? new RuntimeException("Given string [" + toMatchString + "] does not match pattern " + pattern)
                    : exceptionSupplier.get();
        }
    }

}
