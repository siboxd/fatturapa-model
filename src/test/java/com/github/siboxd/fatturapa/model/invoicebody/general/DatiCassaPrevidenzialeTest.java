package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;
import com.github.siboxd.fatturapa.testutils.AbstractTestWithTemporaryFiles;
import com.github.siboxd.fatturapa.testutils.ResourceResolver;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.github.siboxd.fatturapa.testutils.AssertionUtils.assertFileLinesTrimmedEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Serialization tests for {@link DatiCassaPrevidenziale}
 *
 * @author Enrico
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DatiCassaPrevidenzialeTest extends AbstractTestWithTemporaryFiles implements ResourceResolver {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/general_data/document_general/pension_funds";

    private Serializer persister;

    @BeforeAll
    void before() {
        try {
            final Path examplesFolderPath = resolveResourcePath(EXAMPLES_RESOURCE_FOLDER);
            assumeTrue(Files.isDirectory(examplesFolderPath));
            assumeFalse(Files.list(examplesFolderPath).count() == 0);
        } catch (final URISyntaxException | IOException e) {
            fail(e);
        }
    }

    @BeforeEach
    protected void setUp() {
        super.setUp();

        persister = new Persister();
    }

    @Test
    void exampleDatiCassaPrevidenziale_1() {
        final DatiCassaPrevidenziale testObj = new DatiCassaPrevidenziale();
        testObj.setTipoCassa(TipoCassa.TC02);
        testObj.setAlCassa("2.00");
        testObj.setImportoContributoCassa("32.00");
        testObj.setImponibileCassa("1600.00");
        testObj.setAliquotaIVA("21.00");
        testObj.setRiferimentoAmministrazione("ABCD");

        persistAndCheck(testObj, "DatiCassaPrevidenziale_1.xml");
    }

    @Test
    void exampleDatiCassaPrevidenziale_2() {
        final DatiCassaPrevidenziale testObj = new DatiCassaPrevidenziale();
        testObj.setTipoCassa(TipoCassa.TC22);
        testObj.setAlCassa("4.00");
        testObj.setImportoContributoCassa("64.00");
        testObj.setImponibileCassa("1600.00");
        testObj.setAliquotaIVA("21.00");
        testObj.setRitenuta(Ritenuta.SI);

        persistAndCheck(testObj, "DatiCassaPrevidenziale_2.xml");
    }

    /**
     * Utility method to persist the created model object to XML and check back with example provided
     *
     * @param toPersist        the object to persist to XML
     * @param expectedFileName the file name of file that should be generated
     */
    private void persistAndCheck(final Object toPersist, final String expectedFileName) {
        try {
            final Path expectedFilePath = resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, expectedFileName);
            final Path actualFilePath = createTempFilePath();
            persister.write(toPersist, actualFilePath.toFile());

            assertFileLinesTrimmedEquals(expectedFilePath, actualFilePath);
        } catch (final Exception e) {
            fail(e);
        }
    }
}