package com.github.siboxd.fatturapa.testutils;

import com.google.common.io.Resources;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Utility interface that adds the resource loading feature into classes
 *
 * @author Enrico
 */
public interface ResourceResolver {

    /**
     * Resolves a resource path
     *
     * @param resourcePath the path to file/directory to load
     * @return the resource path
     * @throws URISyntaxException if there are problems converting the complete path
     */
    @SuppressWarnings("UnstableApiUsage")
    default Path resolveResourcePath(final String resourcePath) throws URISyntaxException {
        return Paths.get(Resources.getResource(resourcePath).toURI());
    }

    /**
     * Resolves a resource path as a concatenation of two paths
     *
     * @param basePath     the relative path from "resources" folder
     * @param resourcePath the final part of path to file/directory to load
     * @return the resource path
     * @throws URISyntaxException if there are problems converting the complete path
     */
    @SuppressWarnings("UnstableApiUsage")
    default Path resolveResourcePath(final String basePath, final String resourcePath) throws URISyntaxException {
        return Paths.get(Resources.getResource(basePath + File.separator + resourcePath).toURI());
    }
}
