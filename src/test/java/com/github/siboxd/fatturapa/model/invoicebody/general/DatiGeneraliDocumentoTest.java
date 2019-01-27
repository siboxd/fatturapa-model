package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Test class for {@link DatiGeneraliDocumento} serialization
 *
 * @author Enrico
 */
class DatiGeneraliDocumentoTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/general_data/document_general";

    @Test
    void exampleDatiGeneraliDocumento_1() throws URISyntaxException {
        final String testFileName = "DatiGeneraliDocumento_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiRitenuta datiRitenuta = new DatiRitenuta();
        datiRitenuta.setTipoRitenuta(TipoRitenuta.RT01);
        datiRitenuta.setImportoRitenuta("240.25");
        datiRitenuta.setAliquotaRitenuta("20.00");
        datiRitenuta.setCausalePagamento(CausalePagamento.A);

        final DatiGeneraliDocumento testObj = new DatiGeneraliDocumento
                .Builder(TipoDocumento.TD01, "EUR", "2012-03-10", "A-2012-15")
                .datiRitenuta(datiRitenuta)
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiGeneraliDocumento_2() throws URISyntaxException {
        final String testFileName = "DatiGeneraliDocumento_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiCassaPrevidenziale datiCassa1 = new DatiCassaPrevidenziale
                .Builder(TipoCassa.TC22, "4.00", "60.00", "21.00")
                .imponibileCassa("1500.00")
                .ritenuta(Ritenuta.SI)
                .build();

        final DatiCassaPrevidenziale datiCassa2 = new DatiCassaPrevidenziale
                .Builder(TipoCassa.TC03, "2.00", "31.20", "21.00")
                .imponibileCassa("1560.00")
                .build();

        final DatiGeneraliDocumento testObj = new DatiGeneraliDocumento
                .Builder(TipoDocumento.TD01, "EUR", "2012-03-10", "A-2012-15")
                .datiCassaPrevidenziale(asList(datiCassa1, datiCassa2))
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
