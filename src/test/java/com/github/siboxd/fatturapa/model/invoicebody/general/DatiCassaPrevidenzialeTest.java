package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Serialization tests for {@link DatiCassaPrevidenziale}
 *
 * @author Enrico
 */
class DatiCassaPrevidenzialeTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/general_data/document_general/pension_funds";

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

    @Test
    void exampleDatiCassaPrevidenziale_1() {
        final DatiCassaPrevidenziale testObj = new DatiCassaPrevidenziale();
        testObj.setTipoCassa(TipoCassa.TC02);
        testObj.setAlCassa("2.00");
        testObj.setImportoContributoCassa("32.00");
        testObj.setImponibileCassa("1600.00");
        testObj.setAliquotaIVA("21.00");
        testObj.setRiferimentoAmministrazione("ABCD");

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, "DatiCassaPrevidenziale_1.xml");
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

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, "DatiCassaPrevidenziale_2.xml");
    }

}
