package com.github.siboxd.fatturapa.model.utils;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Lists utility class
 *
 * @author Enrico
 */
public final class Lists {

    /**
     * Utility method to do defensive copy of a list or return empty list if parameter is null
     *
     * @param toCopy the list to copy
     * @param <T>    the type of lists' elements
     * @return the copy of the list, or an empty list if provided parameter is null
     */
    public static <T> List<T> defensiveCopy(@Nullable final List<? extends T> toCopy) {
        return toCopy != null ? new ArrayList<>(toCopy) : new ArrayList<>();
    }
}
