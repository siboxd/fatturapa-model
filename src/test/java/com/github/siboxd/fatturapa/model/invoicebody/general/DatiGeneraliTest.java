package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * A test class for {@link DatiGenerali} class
 *
 * @author Enrico
 */
class DatiGeneraliTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/general_data";

    @Test
    void exampleDatiDDT_1() throws URISyntaxException {
        final String testFileName = "DatiGenerali_DatiDDT_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiGenerali testObj = new DatiGenerali();
        testObj.setDatiGeneraliDocumento(createMandatoryDatiGeneraliContent());

        final DatiDDT datiDDT1 = new DatiDDT
                .Builder("1452012", "2012-06-12")
                .riferimentoNumeroLinea(singletonList("1"))
                .build();

        final DatiDDT datiDDT2 = new DatiDDT
                .Builder("2202012", "2012-06-26")
                .riferimentoNumeroLinea(asList("2", "3"))
                .build();

        testObj.setDatiDDT(asList(datiDDT1, datiDDT2));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiOrdineAcquisto_1() throws URISyntaxException {
        final String testFileName = "DatiGenerali_DatiOrdineAcquisto_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiGenerali testObj = new DatiGenerali();
        testObj.setDatiGeneraliDocumento(createMandatoryDatiGeneraliContent());

        final DatiDocumentiCorrelati datiOrdineAcquisto = new DatiDocumentiCorrelati
                .Builder("2012-07")
                .data("2012-03-21")
                .numItem("1")
                .build();

        testObj.setDatiOrdineAcquisto(singletonList(datiOrdineAcquisto));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiOrdineAcquisto_2() throws URISyntaxException {
        final String testFileName = "DatiGenerali_DatiOrdineAcquisto_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiGenerali testObj = new DatiGenerali();
        testObj.setDatiGeneraliDocumento(createMandatoryDatiGeneraliContent());

        final DatiDocumentiCorrelati datiOrdineAcquisto = new DatiDocumentiCorrelati
                .Builder("2012-07")
                .data("2012-03-21")
                .numItem("1")
                .riferimentoNumeroLinea(asList("1", "2", "3"))
                .build();

        testObj.setDatiOrdineAcquisto(singletonList(datiOrdineAcquisto));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiOrdineAcquisto_3() throws URISyntaxException {
        final String testFileName = "DatiGenerali_DatiOrdineAcquisto_3.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiGenerali testObj = new DatiGenerali();
        testObj.setDatiGeneraliDocumento(createMandatoryDatiGeneraliContent());

        final DatiDocumentiCorrelati datiOrdineAcquisto1 = new DatiDocumentiCorrelati
                .Builder("2012-05")
                .data("2012-03-07")
                .numItem("1")
                .codiceCIG("ABCD")
                .riferimentoNumeroLinea(asList("1", "2"))
                .build();

        final DatiDocumentiCorrelati datiOrdineAcquisto2 = new DatiDocumentiCorrelati
                .Builder("2012-06")
                .data("2012-03-14")
                .numItem("1")
                .codiceCIG("ABCD")
                .riferimentoNumeroLinea(asList("3", "4", "5"))
                .build();

        testObj.setDatiOrdineAcquisto(asList(datiOrdineAcquisto1, datiOrdineAcquisto2));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    /**
     * Shorthand method to create common mandatory part of DatiGenerali xml document
     *
     * @return the mandatory part of DatiGenerali xml
     */
    private DatiGeneraliDocumento createMandatoryDatiGeneraliContent() {
        final DatiGeneraliDocumento datiGeneraliDocumento = new DatiGeneraliDocumento();
        datiGeneraliDocumento.setTipoDocumento(TipoDocumento.TD01);
        datiGeneraliDocumento.setDivisa("EUR");
        datiGeneraliDocumento.setData("2012-03-10");
        datiGeneraliDocumento.setNumero("A-2012-15");
        return datiGeneraliDocumento;
    }

}
