package com.github.siboxd.fatturapa.model;

import com.google.common.collect.Streams;
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
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javafx.util.Pair;

import static java.util.stream.Collectors.toList;

/**
 * Test for de/serialization of whole {@link FatturaElettronica}
 *
 * @author Enrico
 */
class FatturaElettronicaSerializationRoundTripTest {

    private static final String INVOICES_RESOURCE_FOLDER = "invoiceExamples";
    private static final String[] INVOICE_FILES_EXTENSIONS = new String[]{"xml"};

    private Serializer persister;
    private static Path invoicesFolderPath;

    @BeforeAll
    static void before() {
        try {
            invoicesFolderPath = Paths.get(Resources.getResource(INVOICES_RESOURCE_FOLDER).toURI());
        } catch (final URISyntaxException e) {
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

            final boolean allInvoicesDeserializedSuccessfully =
                    getInvoicesFromFolder(invoicesFolderPath)
                            .stream()
                            .map(this::parseFromXmlFile)
                            .allMatch(Optional::isPresent);

            Assertions.assertTrue(allInvoicesDeserializedSuccessfully);
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void serializationRoundTripTest() {
        final List<FatturaElettronica> parsedInvoices = parseInvoicesInFolder(invoicesFolderPath);
        final List<File> temporaryFiles = createTempFiles(parsedInvoices.size());

        // fill up temporary files with serialization of FatturaElettronica object
        IntStream.range(0, parsedInvoices.size())
                .forEach(index ->
                        writeModelToXmlFile(parsedInvoices.get(index), temporaryFiles.get(index)));

        final Stream<Pair<Integer, File>> expectedInvoicesIndexedFiles =
                Streams.zip(
                        IntStream.range(0, parsedInvoices.size()).boxed(),
                        getInvoicesFromFolder(invoicesFolderPath).stream(),
                        Pair::new);

        expectedInvoicesIndexedFiles
                .forEach(indexToInvoiceFilePair -> {
                    try {
                        final int fileIndex = indexToInvoiceFilePair.getKey();
                        final File expectedFile = indexToInvoiceFilePair.getValue();

                        final Stream<String> expectedLines = Files.lines(expectedFile.toPath(), StandardCharsets.UTF_8);
                        final Stream<String> actualLines = Files.lines(temporaryFiles.get(fileIndex).toPath(), StandardCharsets.UTF_8);

                        Streams.forEachPair(expectedLines, actualLines,
                                (expected, actual) -> Assertions.assertEquals(expected.trim(), actual.trim()));

                    } catch (final IOException e) {
                        Assertions.fail(e);
                    }
                });
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
                    getInvoicesFromFolder(invoicesFolderPath)
                            .stream()
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
            return Assertions.fail(e);
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
                        return Assertions.fail(e);
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
     * @return The files in path
     */
    private Collection<File> getInvoicesFromFolder(final Path invoicesFolderPath) {
        return FileUtils.listFiles(invoicesFolderPath.toFile(), INVOICE_FILES_EXTENSIONS, true);
    }
}