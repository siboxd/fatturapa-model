package com.github.siboxd.fatturapa.model;

import com.github.siboxd.fatturapa.testutils.AbstractTestWithTemporaryFiles;
import com.github.siboxd.fatturapa.testutils.ResourceResolver;
import com.google.common.collect.Streams;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.simpleframework.xml.Serializer;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.github.siboxd.fatturapa.testutils.AssertionUtils.assertFileLinesTrimmedEquals;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Test for de/serialization of whole {@link FatturaElettronica}
 *
 * @author Enrico
 */
@SuppressWarnings("UnstableApiUsage")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FatturaElettronicaSerializationRoundTripTest extends AbstractTestWithTemporaryFiles implements ResourceResolver {

    private static final String INVOICES_RESOURCE_FOLDER = "complete_invoice_examples";
    private static final String[] INVOICE_FILES_EXTENSIONS = new String[]{"xml"};

    private Serializer persister;
    private static Path invoicesFolderPath;
    private static long numberOfInvoicesExamples;

    @BeforeAll
    void before() {
        try {
            invoicesFolderPath = resolveResourcePath(INVOICES_RESOURCE_FOLDER);
            assumeTrue(Files.isDirectory(invoicesFolderPath));

            numberOfInvoicesExamples = Files.list(invoicesFolderPath).count();
            assumeFalse(numberOfInvoicesExamples == 0);
        } catch (final URISyntaxException | IOException e) {
            fail(e);
        }
    }

    @BeforeEach
    protected void setUp() {
        super.setUp();

        persister = new PersisterWithXMLDeclaration();
    }

    @Test
    void deserializeXmlInvoices() {
        assertEquals(parseInvoicesInFolder(invoicesFolderPath).count(), numberOfInvoicesExamples);
    }

    @Test
    void serializationRoundTripTest() {
        final List<FatturaElettronica> parsedInvoices = parseInvoicesInFolder(invoicesFolderPath)
                .collect(toList());
        final List<Path> temporaryFiles = createTempFiles(parsedInvoices.size())
                .collect(toList());

        // fill up temporary files with serialization of FatturaElettronica object
        IntStream.range(0, parsedInvoices.size())
                .forEach(index ->
                        writeModelToXmlFile(parsedInvoices.get(index), temporaryFiles.get(index)));

        final Stream<Pair<Integer, Path>> expectedInvoicesIndexedFiles =
                Streams.zip(
                        IntStream.range(0, parsedInvoices.size()).boxed(),
                        getInvoicesFromFolder(invoicesFolderPath).stream().map(File::toPath),
                        ImmutablePair::new);

        expectedInvoicesIndexedFiles
                .forEach(indexToInvoiceFilePair -> {
                    try {
                        final int fileIndex = indexToInvoiceFilePair.getKey();
                        final Path actualFilePath = temporaryFiles.get(fileIndex);
                        final Path expectedFilePath = indexToInvoiceFilePair.getValue();

                        // files contents equal
                        assertFileLinesTrimmedEquals(expectedFilePath, actualFilePath);
                    } catch (final IOException e) {
                        fail(e);
                    }
                });
    }

    /**
     * Parses all invoices in provided folder
     *
     * @param invoicesFolderPath the folder path where to parse files
     * @return The stream of parsed invoices
     */
    private Stream<FatturaElettronica> parseInvoicesInFolder(final Path invoicesFolderPath) {
        return getInvoicesFromFolder(invoicesFolderPath)
                .stream()
                .map(this::parseFromXmlFile);
    }

    /**
     * Parses the given file into a {@link FatturaElettronica} instance
     *
     * @param xmlInvoiceFile te file to parse
     * @return Optionally the parsed invoice
     */
    private FatturaElettronica parseFromXmlFile(final File xmlInvoiceFile) {
        try {
            return persister.read(FatturaElettronica.class, xmlInvoiceFile);
        } catch (final Exception e) {
            return fail(e);
        }
    }

    /**
     * Writes an invoice to an xml file
     *
     * @param invoice     the invoice object to transform
     * @param xmlFilePath the file where to write
     */
    private void writeModelToXmlFile(final FatturaElettronica invoice, final Path xmlFilePath) {
        try {
            persister.write(invoice, xmlFilePath.toFile());
        } catch (final Exception e) {
            fail(e);
        }
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