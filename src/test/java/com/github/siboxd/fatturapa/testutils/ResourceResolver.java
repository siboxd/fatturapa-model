package com.github.siboxd.fatturapa.testutils;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.util.Objects.requireNonNull;

/**
 * Utility interface that adds the resource loading feature into classes
 *
 * @author Enrico
 */
public final class ResourceResolver {

    /**
     * Resolves a resource path
     *
     * @param resourcePath the path to file/directory to load
     * @return the resource path
     * @throws URISyntaxException if there are problems converting the complete path
     */
    public static Path resolveResourcePath(final String resourcePath) throws URISyntaxException {
        final URL resourceUrl = requireNonNull(
                ResourceResolver.class.getClassLoader().getResource(resourcePath),
                "Resource not found " + resourcePath
        );
        return Paths.get(resourceUrl.toURI());
    }

    /**
     * Resolves a resource path as a concatenation of two paths
     *
     * @param basePath     the relative path from "resources" folder
     * @param resourcePath the final part of path to file/directory to load
     * @return the resource path
     * @throws URISyntaxException if there are problems converting the complete path
     */
    public static Path resolveResourcePath(final String basePath, final String resourcePath) throws URISyntaxException {
        return resolveResourcePath(basePath + File.separator + resourcePath);
    }
}
