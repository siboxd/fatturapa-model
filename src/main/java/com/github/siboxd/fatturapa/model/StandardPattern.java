package com.github.siboxd.fatturapa.model;

import java.util.regex.Pattern;

/**
 * An enumeration of standard patterns used through FatturaPA model
 *
 * @author Enrico
 */
public enum StandardPattern {

    // BASIC LATIN PATTERNS
    STRING_10_TYPE(Pattern.compile("[\\x00-\\x7F]{1,10}")),
    STRING_15_TYPE(Pattern.compile("[\\x00-\\x7F]{1,15}")),
    STRING_20_TYPE(Pattern.compile("[\\x00-\\x7F]{1,20}")),
    STRING_35_TYPE(Pattern.compile("[\\x00-\\x7F]{1,35}")),
    STRING_60_TYPE(Pattern.compile("[\\x00-\\x7F]{1,60}")),
    STRING_80_TYPE(Pattern.compile("[\\x00-\\x7F]{1,80}")),
    STRING_100_TYPE(Pattern.compile("[\\x00-\\x7F]{1,100}")),

    // BASIC LATIN + LATIN-1 SUPPLEMENT PATTERNS
    STRING_60_LATIN_TYPE(Pattern.compile("[\\x00-\\xFF]{1,60}")),
    STRING_80_LATIN_TYPE(Pattern.compile("[\\x00-\\xFF]{1,80}")),
    STRING_100_LATIN_TYPE(Pattern.compile("[\\x00-\\xFF]{1,100}")),
    STRING_200_LATIN_TYPE(Pattern.compile("[\\x00-\\xFF]{1,200}")),
    STRING_1000_LATIN_TYPE(Pattern.compile("[\\x00-\\xFF]{1,1000}")),

    EMAIL_TYPE(Pattern.compile("(?=.+@.+[.]+.+).{7,256}")),

    ISO_3166_1_ALPHA_2(Pattern.compile("[A-Z]{2}"));

    private final Pattern pattern;

    StandardPattern(final Pattern pattern) {
        this.pattern = pattern;
    }

    /**
     * @return the standard associated pattern
     */
    public Pattern pattern() {
        return pattern;
    }
}
