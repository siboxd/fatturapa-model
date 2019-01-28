package com.github.siboxd.fatturapa.model.utils;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.function.Function;
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
     * @param toMatchString     the string to check
     * @param pattern           the pattern to check against
     * @param exceptionSupplier the exceptionSupplier that will be used to generate exception if
     *                          the string doesn't match the pattern; could be the preferred exception
     *                          constructor;<br><br>
     *                          <code>
     *                          matchAgainstPatternOrThrow( ... , IllegalArgumentException::new)
     *                          </code>
     * @return true if the string matches; throws an unchecked exception, retrieved by
     * invoking the exceptionSupplier, otherwise
     * @throws NullPointerException if some NonNull annotated parameter is {@code null}
     */
    public static boolean matchAgainstPatternOrThrow(@NonNull final String toMatchString,
                                                     @NonNull final Pattern pattern,
                                                     @Nullable final Function<String, ? extends RuntimeException> exceptionSupplier) {
        requireNonNull(toMatchString);
        requireNonNull(pattern);

        if (pattern.matcher(toMatchString).matches()) {
            return true;
        } else {
            final String causeMessage = "Given string " + toMatchString + " does not match pattern " + pattern;
            throw exceptionSupplier == null
                    ? new PatternNotMatchingException(causeMessage)
                    : exceptionSupplier.apply(causeMessage);
        }
    }

    /**
     * Exception class for patterns not matching strings
     *
     * @author Enrico
     */
    private static class PatternNotMatchingException extends RuntimeException {
        private PatternNotMatchingException(final String message) {
            super(message);
        }
    }
}
