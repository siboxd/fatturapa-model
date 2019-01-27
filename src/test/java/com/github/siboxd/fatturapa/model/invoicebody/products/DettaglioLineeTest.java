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

        final DettaglioLinee testObj = new DettaglioLinee
                .Builder("1", "Bene cod. X", "150.00", "3750.00", "21.00")
                .quantita("25.00")
                .unitaMisura("Pezzo")
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDettaglioLinee_2() throws URISyntaxException {
        final String testFileName = "DettaglioLinee_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final ScontoMaggiorazione scontoMaggiorazione = new ScontoMaggiorazione
                .Builder(TipoScontoMaggiorazione.SC)
                .percentuale("5.00")
                .build();

        final DettaglioLinee testObj = new DettaglioLinee
                .Builder("1", "Servizio abcde", "5500.00", "5225.00", "10.00")
                .dataInizioPeriodo("2012-01-01")
                .dataFinePeriodo("2012-03-31")
                .scontoMaggiorazione(singletonList(scontoMaggiorazione))
                .ritenuta(Ritenuta.SI)
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
