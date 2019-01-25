package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;
import com.github.siboxd.fatturapa.model.invoicecommon.Indirizzo;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * A test class for {@link CedentePrestatore}
 *
 * @author Enrico
 */
class CedentePrestatoreTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_header/supplier";

    @Test
    void exampleCedentePrestatore_1() throws URISyntaxException {
        final String testFileName = "CedentePrestatore_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT", "01234567890");

        final Anagrafica anagrafica = new Anagrafica.Builder().denominazione("AlphaBeta Srl").build();

        final DatiAnagraficiCedente datiAnagrafici = new DatiAnagraficiCedente();
        datiAnagrafici.setIdFiscaleIVA(idFiscale);
        datiAnagrafici.setCodiceFiscale("98765432109");
        datiAnagrafici.setAnagrafica(anagrafica);
        datiAnagrafici.setRegimeFiscale(RegimeFiscale.RF01);

        final Indirizzo indirizzo = new Indirizzo.Builder(
                "Via Nazionale, 443",
                "40100",
                "Bologna",
                "IT")
                .provincia("BO")
                .build();

        final IscrizioneREA iscrizioneREA = new IscrizioneREA();
        iscrizioneREA.setUfficio("BO");
        iscrizioneREA.setNumeroREA("102030");
        iscrizioneREA.setCapitaleSociale("500000.00");
        iscrizioneREA.setSocioUnico(SocioUnico.SU);
        iscrizioneREA.setStatoLiquidazione(StatoLiquidazione.LN);

        final Contatti contatti = new Contatti();
        contatti.setTelefono("051456789");
        contatti.setFax("051456799");
        contatti.setEmail("amministrazione@alphabeta.it");

        final CedentePrestatore testObj = new CedentePrestatore
                .Builder(datiAnagrafici, indirizzo)
                .iscrizioneREA(iscrizioneREA)
                .contatti(contatti)
                .riferimentoAmministrazione("AD10BB")
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleCedentePrestatore_2() throws URISyntaxException {
        final String testFileName = "CedentePrestatore_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final IdFiscale idFiscale = new IdFiscale("IT", "09988776600");

        final Anagrafica anagrafica = new Anagrafica.Builder()
                .nome("Giovanni")
                .cognome("Verdi")
                .titolo("Dott.")
                .build();

        final DatiAnagraficiCedente datiAnagrafici = new DatiAnagraficiCedente();
        datiAnagrafici.setIdFiscaleIVA(idFiscale);
        datiAnagrafici.setCodiceFiscale("VRDGNN99B99H501P");
        datiAnagrafici.setAnagrafica(anagrafica);
        datiAnagrafici.setAlboProfessionale("Dottori Commercialisti");
        datiAnagrafici.setProvinciaAlbo("RM");
        datiAnagrafici.setNumeroIscrizioneAlbo("111222333444");
        datiAnagrafici.setDataIscrizioneAlbo("2005-10-30");
        datiAnagrafici.setRegimeFiscale(RegimeFiscale.RF02);

        final Indirizzo indirizzo = new Indirizzo.Builder(
                "Piazza S. Vincenzo",
                "00133",
                "Roma",
                "IT")
                .numeroCivico("12 C")
                .provincia("RM")
                .build();

        final Contatti contatti = new Contatti();
        contatti.setTelefono("3381110000");
        contatti.setFax("061234567");
        contatti.setEmail("gverdi@abc.it");

        final CedentePrestatore testObj = new CedentePrestatore
                .Builder(datiAnagrafici, indirizzo)
                .contatti(contatti)
                .riferimentoAmministrazione("C109033")
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
