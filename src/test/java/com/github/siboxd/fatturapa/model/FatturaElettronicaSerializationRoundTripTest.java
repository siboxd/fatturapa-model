package com.github.siboxd.fatturapa.model;

import com.google.common.io.Resources;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @author Enrico
 */
class FatturaElettronicaSerializationRoundTripTest {

    private static final String INVOICES_RESOURCE_FOLDER = "invoiceExamples";

    private Serializer persister;
    private static Path invoicesFolderPath;

    @BeforeAll
    static void before() {
        try {
            invoicesFolderPath = Paths.get(Resources.getResource(INVOICES_RESOURCE_FOLDER).toURI());
        } catch (URISyntaxException e) {
            Assertions.fail(e);
        }
    }

    @BeforeEach
    void setUp() {
        persister = new Persister();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void deserializeXmlInvoices() {
        try {
            Assumptions.assumeTrue(Files.isDirectory(invoicesFolderPath));
            Assumptions.assumeFalse(Files.list(invoicesFolderPath).count() == 0);

            final List<File> invoicesFromFolder = getInvoicesFromFolder(invoicesFolderPath);

            Assertions.assertTrue(invoicesFromFolder.stream()
                    .map(this::parseFromXmlFile)
                    .allMatch(Optional::isPresent));
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void serializationRoundTripTest() {
        final List<FatturaElettronica> parsedInvoices = parseInvoicesInFolder(invoicesFolderPath);
        final List<File> temporaryFiles = createTempFiles(parsedInvoices.size());


        IntStream.range(0, parsedInvoices.size())
                .forEach(index ->
                        writeModelToXmlFile(
                                parsedInvoices.get(index),
                                temporaryFiles.get(index)
                        ));

        final List<File> expectedInvoices = getInvoicesFromFolder(invoicesFolderPath);

        try {
            // check all files equals to samples provided
            for (int i = 0; i < temporaryFiles.size(); i++) {
                final String actualString = FileUtils.readFileToString(temporaryFiles.get(i), StandardCharsets.UTF_8);
                final String expectedString = FileUtils.readFileToString(expectedInvoices.get(i), StandardCharsets.UTF_8);

                Assertions.assertEquals(expectedString, actualString, "A produced file is not as expected -> " + temporaryFiles.get(i));
            }
        } catch (final IOException e) {
            Assertions.fail(e);
        }
    }

    /**
     * Parses all invoices in provided folder
     *
     * @param invoicesFolderPath the folder path where to parse files
     * @return The list of parsed invoices
     */
    private List<FatturaElettronica> parseInvoicesInFolder(final Path invoicesFolderPath) {
        Optional<List<FatturaElettronica>> optionalParsedInvoices = Optional.empty();
        try {
            optionalParsedInvoices = Optional.of(
                    getInvoicesFromFolder(invoicesFolderPath).stream()
                            .map(this::parseFromXmlFile)
                            .filter(Optional::isPresent).map(Optional::get)
                            .collect(toList())
            );

            Assumptions.assumeTrue(optionalParsedInvoices.get().size() == Files.list(invoicesFolderPath).count());
        } catch (final IOException e) {
            Assertions.fail(e);
        }
        return optionalParsedInvoices.get();
    }

    /**
     * Parses the given file into a {@link FatturaElettronica} instance
     *
     * @param xmlInvoiceFile te file to parse
     * @return Optionally the parsed invoice
     */
    private Optional<FatturaElettronica> parseFromXmlFile(final File xmlInvoiceFile) {
        try {
            return Optional.of(persister.read(FatturaElettronica.class, xmlInvoiceFile));
        } catch (final Exception e) {
            Assertions.fail(e);
            return Optional.empty();
        }
    }

    /**
     * Writes an invoice to an xml file
     *
     * @param invoice the invoice object to transform
     * @param xmlFile the file where to write
     */
    private void writeModelToXmlFile(final FatturaElettronica invoice, final File xmlFile) {
        try {
            persister.write(invoice, xmlFile);
        } catch (final Exception e) {
            Assertions.fail(e);
        }
    }

    /**
     * Returns a list of newly created temporary files
     *
     * @param numberOfFiles the number of temporary files to create
     * @return a list of temporary files newaly created
     */
    private List<File> createTempFiles(final int numberOfFiles) {
        return IntStream.range(0, numberOfFiles)
                .mapToObj(ignored -> {
                    try {
                        return Optional.of(Files.createTempFile("invoice", "temp"));
                    } catch (final IOException e) {
                        Assertions.fail(e);
                        return Optional.<Path>empty();
                    }
                })
                .map(Optional::get)
                .map(Path::toFile)
                .collect(toList());
    }

    /**
     * Returns the invoices in provided folder path
     *
     * @param invoicesFolderPath the path where to search
     * @return Optionally the list of files
     */
    private List<File> getInvoicesFromFolder(final Path invoicesFolderPath) {
        try {
            return Files.list(invoicesFolderPath)
                    .map(Path::toFile)
                    .collect(toList());
        } catch (IOException e) {
            Assertions.fail(e);
            return new ArrayList<>();
        }
    }
}