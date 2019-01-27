package com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata;

import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * A test class for {@link DatiTrasmissione}
 *
 * @author Enrico
 */
class DatiTrasmissioneTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_header/transmission_data";

    @Test
    void exampleCedentePrestatore_B2C() throws URISyntaxException {
        final String testFileName = "DatiTrasmissione_B2C.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT", "RSSMRA99B99H501X");

        final ContattiTrasmittente contattiTrasmittente = new ContattiTrasmittente.Builder()
                .telefono("061234567")
                .email("rossi.mario@abc.it")
                .build();

        final DatiTrasmissione testObj = new DatiTrasmissione
                .Builder(idFiscale, "AB001", FormatoTrasmissione.FPR12, "ABC1234")
                .contattiTrasmittente(contattiTrasmittente)
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleCedentePrestatore_B2C_pec() throws URISyntaxException {
        final String testFileName = "DatiTrasmissione_B2C_pec.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT", "RSSMRA99B99H501X");

        final ContattiTrasmittente contattiTrasmittente = new ContattiTrasmittente.Builder()
                .telefono("061234567")
                .email("rossi.mario@abc.it")
                .build();

        final DatiTrasmissione testObj = new DatiTrasmissione
                .Builder(idFiscale, "AB001", FormatoTrasmissione.FPR12, "0000000")
                .contattiTrasmittente(contattiTrasmittente)
                .pecDestinatario("privato@pec.it")
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleCedentePrestatore_B2PA() throws URISyntaxException {
        final String testFileName = "DatiTrasmissione_B2PA.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT", "RSSMRA99B99H501X");

        final ContattiTrasmittente contattiTrasmittente = new ContattiTrasmittente.Builder()
                .telefono("061234567")
                .email("rossi.mario@abc.it")
                .build();

        final DatiTrasmissione testObj = new DatiTrasmissione
                .Builder(idFiscale, "AB001", FormatoTrasmissione.FPA12, "AHJ65T")
                .contattiTrasmittente(contattiTrasmittente)
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
