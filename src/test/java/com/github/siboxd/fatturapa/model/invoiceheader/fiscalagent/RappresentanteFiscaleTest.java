package com.github.siboxd.fatturapa.model.invoiceheader.fiscalagent;

import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * A test class for {@link RappresentanteFiscale}
 *
 * @author Enrico
 */
class RappresentanteFiscaleTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_header/fiscal_agent";

    @Test
    void exampleRappresentanteFiscale_1() throws URISyntaxException {
        final String testFileName = "RappresentanteFiscale_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT", "00667788990");

        final Anagrafica anagrafica = new Anagrafica.Builder()
                .nome("Bianchi")
                .cognome("Carlo")
                .titolo("Avv.")
                .build();

        final DatiAnagraficiRappresentante datiAnagrafici = new DatiAnagraficiRappresentante
                .Builder(idFiscale, anagrafica)
                .codiceFiscale("BNCCRL99A99H501Y")
                .build();

        final RappresentanteFiscale testObj = new RappresentanteFiscale(datiAnagrafici);

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
