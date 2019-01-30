package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;
import com.github.siboxd.fatturapa.model.invoicecommon.Indirizzo;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static com.github.siboxd.fatturapa.testutils.ResourceResolver.resolveResourcePath;
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

        final IdFiscale idFiscale = new IdFiscale("IT", "12345678901");


        final Anagrafica anagrafica = new Anagrafica.Builder().denominazione("Direzione Regionale Entrate Lazio").build();

        final DatiAnagraficiCessionario datiAnagrafici = new DatiAnagraficiCessionario
                .Builder(anagrafica)
                .idFiscaleIVA(idFiscale)
                .build();

        final Indirizzo indirizzo = new Indirizzo.Builder(
                "Via Capranesi, 60",
                "00155",
                "Roma",
                "IT")
                .provincia("RM")
                .build();

        final CessionarioCommittente testObj = new CessionarioCommittente
                .Builder(datiAnagrafici, indirizzo).build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleCessionarioCommittente_2() throws URISyntaxException {
        final String testFileName = "CessionarioCommittente_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final Anagrafica anagrafica = new Anagrafica.Builder()
                .nome("Mario")
                .cognome("Rossi")
                .build();

        final DatiAnagraficiCessionario datiAnagrafici = new DatiAnagraficiCessionario
                .Builder(anagrafica)
                .codiceFiscale("RSSMRA99A99H501A")
                .build();

        final Indirizzo indirizzo = new Indirizzo.Builder(
                "Corso Italia",
                "00100",
                "Roma",
                "IT")
                .numeroCivico("99")
                .provincia("RM")
                .build();

        final CessionarioCommittente testObj = new CessionarioCommittente
                .Builder(datiAnagrafici, indirizzo).build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
