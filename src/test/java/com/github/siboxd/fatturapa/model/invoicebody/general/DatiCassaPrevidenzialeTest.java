package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Serialization tests for {@link DatiCassaPrevidenziale}
 *
 * @author Enrico
 */
class DatiCassaPrevidenzialeTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/general_data/document_general/pension_funds";

    @Test
    void exampleDatiCassaPrevidenziale_1() throws URISyntaxException {
        final String testFileName = "DatiCassaPrevidenziale_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiCassaPrevidenziale testObj = new DatiCassaPrevidenziale
                .Builder(TipoCassa.TC02, "2.00", "32.00", "21.00")
                .imponibileCassa("1600.00")
                .riferimentoAmministrazione("ABCD")
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiCassaPrevidenziale_2() throws URISyntaxException {
        final String testFileName = "DatiCassaPrevidenziale_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiCassaPrevidenziale testObj = new DatiCassaPrevidenziale
                .Builder(TipoCassa.TC22, "4.00", "64.00", "21.00")
                .imponibileCassa("1600.00")
                .ritenuta(Ritenuta.SI)
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
