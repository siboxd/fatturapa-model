package com.github.siboxd.fatturapa.model;

import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.github.siboxd.fatturapa.testutils.ResourceResolver.resolveResourcePath;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Test for de/serialization of whole {@link FatturaElettronica}
 *
 * @author Enrico
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FatturaElettronicaSerializationRoundTripTest extends AbstractXmlSerializationTest {

    private static final String INVOICES_RESOURCE_FOLDER = "complete_invoice_examples";
    private static final String[] INVOICE_FILES_EXTENSIONS = new String[]{"xml"};

    private static Path invoicesFolderPath;
    private static int numberOfInvoicesExamples;

    @BeforeAll
    void before() {
        try {
            invoicesFolderPath = resolveResourcePath(INVOICES_RESOURCE_FOLDER);
            assumeTrue(Files.isDirectory(invoicesFolderPath));

            numberOfInvoicesExamples = getInvoicesFromFolder(invoicesFolderPath).size();
            assumeFalse(numberOfInvoicesExamples == 0);
        } catch (final URISyntaxException e) {
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
        assertEquals(parseInvoicesInFolder(invoicesFolderPath).size(), numberOfInvoicesExamples);
    }

    @Test
    void serializationRoundTripTest() {
        final List<Path> invoicesPaths = new ArrayList<>();
        for (final File file : getInvoicesFromFolder(invoicesFolderPath)) {
            invoicesPaths.add(invoicesFolderPath.relativize(file.toPath()));
        }

        final List<FatturaElettronica> parsedInvoices = parseInvoicesInFolder(invoicesFolderPath);

        for (int i = 0; i < invoicesPaths.size(); i++) {
            final String expectedXmlInvoiceFilePath = invoicesPaths.get(i).toString();
            final FatturaElettronica parsedInvoice = parsedInvoices.get(i);

            persistAndCheck(parsedInvoice, INVOICES_RESOURCE_FOLDER, expectedXmlInvoiceFilePath);
        }
    }

    /**
     * Parses all invoices in provided folder
     *
     * @param invoicesFolderPath the folder path where to parse files
     * @return The stream of parsed invoices
     */
    private List<FatturaElettronica> parseInvoicesInFolder(final Path invoicesFolderPath) {
        final List<FatturaElettronica> list = new ArrayList<>();
        for (final File file : getInvoicesFromFolder(invoicesFolderPath)) {
            list.add(parseFromXmlFile(file));
        }
        return list;
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
     * Returns the invoices in provided folder path
     *
     * @param invoicesFolderPath the path where to search
     * @return The files in path
     */
    private Collection<File> getInvoicesFromFolder(final Path invoicesFolderPath) {
        return FileUtils.listFiles(invoicesFolderPath.toFile(), INVOICE_FILES_EXTENSIONS, true);
    }
}
