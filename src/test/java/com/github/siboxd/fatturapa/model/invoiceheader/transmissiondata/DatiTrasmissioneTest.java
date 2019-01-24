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

        final IdFiscale idFiscale = new IdFiscale("IT","RSSMRA99B99H501X");

        final ContattiTrasmittente contattiTrasmittente = new ContattiTrasmittente();
        contattiTrasmittente.setTelefono("061234567");
        contattiTrasmittente.setEmail("rossi.mario@abc.it");

        final DatiTrasmissione testObj = new DatiTrasmissione();
        testObj.setIdTrasmittente(idFiscale);
        testObj.setProgressivoInvio("AB001");
        testObj.setFormatoTrasmissione(FormatoTrasmissione.FPR12);
        testObj.setCodiceDestinatario("ABC1234");
        testObj.setContattiTrasmittente(contattiTrasmittente);

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleCedentePrestatore_B2C_pec() throws URISyntaxException {
        final String testFileName = "DatiTrasmissione_B2C_pec.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT","RSSMRA99B99H501X");

        final ContattiTrasmittente contattiTrasmittente = new ContattiTrasmittente();
        contattiTrasmittente.setTelefono("061234567");
        contattiTrasmittente.setEmail("rossi.mario@abc.it");

        final DatiTrasmissione testObj = new DatiTrasmissione();
        testObj.setIdTrasmittente(idFiscale);
        testObj.setProgressivoInvio("AB001");
        testObj.setFormatoTrasmissione(FormatoTrasmissione.FPR12);
        testObj.setCodiceDestinatario("0000000");
        testObj.setContattiTrasmittente(contattiTrasmittente);
        testObj.setPecDestinatario("privato@pec.it");

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleCedentePrestatore_B2PA() throws URISyntaxException {
        final String testFileName = "DatiTrasmissione_B2PA.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT","RSSMRA99B99H501X");

        final ContattiTrasmittente contattiTrasmittente = new ContattiTrasmittente();
        contattiTrasmittente.setTelefono("061234567");
        contattiTrasmittente.setEmail("rossi.mario@abc.it");

        final DatiTrasmissione testObj = new DatiTrasmissione();
        testObj.setIdTrasmittente(idFiscale);
        testObj.setProgressivoInvio("AB001");
        testObj.setFormatoTrasmissione(FormatoTrasmissione.FPA12);
        testObj.setCodiceDestinatario("AHJ65T");
        testObj.setContattiTrasmittente(contattiTrasmittente);

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
