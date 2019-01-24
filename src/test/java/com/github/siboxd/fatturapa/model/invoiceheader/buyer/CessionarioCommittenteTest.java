package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;
import com.github.siboxd.fatturapa.model.invoicecommon.Indirizzo;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * A test class for {@link CessionarioCommittente}
 *
 * @author Enrico
 */
class CessionarioCommittenteTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_header/buyer";

    @Test
    void exampleCessionarioCommittente_1() throws URISyntaxException {
        final String testFileName = "CessionarioCommittente_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT","12345678901");


        final Anagrafica anagrafica = new Anagrafica();
        anagrafica.setDenominazione("Direzione Regionale Entrate Lazio");

        final DatiAnagraficiCessionario datiAnagrafici = new DatiAnagraficiCessionario();
        datiAnagrafici.setIdFiscaleIVA(idFiscale);
        datiAnagrafici.setAnagrafica(anagrafica);

        final Indirizzo indirizzo = new Indirizzo();
        indirizzo.setIndirizzo("Via Capranesi, 60");
        indirizzo.setCap("00155");
        indirizzo.setComune("Roma");
        indirizzo.setProvincia("RM");
        indirizzo.setNazione("IT");

        final CessionarioCommittente testObj = new CessionarioCommittente();
        testObj.setDatiAnagrafici(datiAnagrafici);
        testObj.setSede(indirizzo);

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleCessionarioCommittente_2() throws URISyntaxException {
        final String testFileName = "CessionarioCommittente_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final Anagrafica anagrafica = new Anagrafica();
        anagrafica.setNome("Mario");
        anagrafica.setCognome("Rossi");

        final DatiAnagraficiCessionario datiAnagrafici = new DatiAnagraficiCessionario();
        datiAnagrafici.setCodiceFiscale("RSSMRA99A99H501A");
        datiAnagrafici.setAnagrafica(anagrafica);

        final Indirizzo indirizzo = new Indirizzo();
        indirizzo.setIndirizzo("Corso Italia");
        indirizzo.setNumeroCivico("99");
        indirizzo.setCap("00100");
        indirizzo.setComune("Roma");
        indirizzo.setProvincia("RM");
        indirizzo.setNazione("IT");

        final CessionarioCommittente testObj = new CessionarioCommittente();
        testObj.setDatiAnagrafici(datiAnagrafici);
        testObj.setSede(indirizzo);

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
