package com.github.siboxd.fatturapa.model;

import java.util.regex.Pattern;

/**
 * An enumeration of standard patterns used through FatturaPA model
 *
 * @author Enrico
 */
public enum StandardPatterns {

    ISO_3166_1_ALPHA_2(Pattern.compile("[A-Z]{2}"));

    private final Pattern pattern;

    StandardPatterns(final Pattern pattern) {
        this.pattern = pattern;
    }

    /**
     * @return the standard associated pattern
     */
    public Pattern pattern() {
        return pattern;
    }
}
