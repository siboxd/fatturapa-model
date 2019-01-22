package com.github.siboxd.fatturapa.model.invoicebody.products;

import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;
import com.github.siboxd.fatturapa.model.invoicebody.ScontoMaggiorazione;
import com.github.siboxd.fatturapa.model.invoicebody.general.TipoScontoMaggiorazione;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * a test class for {@link DettaglioLinee}
 *
 * @author Enrico
 */
class DettaglioLineeTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/product_details/lines";

    @Test
    void exampleDettaglioLinee_1() throws URISyntaxException {
        final String testFileName = "DettaglioLinee_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DettaglioLinee testObj = new DettaglioLinee();
        testObj.setNumeroLinea("1");
        testObj.setDescrizione("Bene cod. X");
        testObj.setQuantita("25.00");
        testObj.setUnitaMisura("Pezzo");
        testObj.setPrezzoUnitario("150.00");
        testObj.setPrezzoTotale("3750.00");
        testObj.setAliquotaIVA("21.00");

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDettaglioLinee_2() throws URISyntaxException {
        final String testFileName = "DettaglioLinee_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DettaglioLinee testObj = new DettaglioLinee();
        testObj.setNumeroLinea("1");
        testObj.setDescrizione("Servizio abcde");
        testObj.setDataInizioPeriodo("2012-01-01");
        testObj.setDataFinePeriodo("2012-03-31");
        testObj.setPrezzoUnitario("5500.00");

        final ScontoMaggiorazione scontoMaggiorazione = new ScontoMaggiorazione();
        scontoMaggiorazione.setTipo(TipoScontoMaggiorazione.SC);
        scontoMaggiorazione.setPercentuale("5.00");

        testObj.setScontoMaggiorazione(singletonList(scontoMaggiorazione));
        testObj.setPrezzoTotale("5225.00");
        testObj.setAliquotaIVA("10.00");
        testObj.setRitenuta(Ritenuta.SI);

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
