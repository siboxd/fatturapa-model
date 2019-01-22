package com.github.siboxd.fatturapa.model.invoicebody.products;

import com.github.siboxd.fatturapa.model.invoicebody.Natura;
import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * A test class for {@link DatiBeniServizi}
 *
 * @author Enrico
 */
class DatiBeniServiziTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/product_details";

    @Test
    void exampleDatiRiepilogo_1() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiBeniServizi testObj = new DatiBeniServizi();

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee();
        dettaglioLinee1.setNumeroLinea("1");
        dettaglioLinee1.setDescrizione("Bene cod. X");
        dettaglioLinee1.setQuantita("10.00");
        dettaglioLinee1.setUnitaMisura("Pezzo");
        dettaglioLinee1.setPrezzoUnitario("315.00");
        dettaglioLinee1.setPrezzoTotale("3150.00");
        dettaglioLinee1.setAliquotaIVA("21.00");

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee();
        dettaglioLinee2.setNumeroLinea("2");
        dettaglioLinee2.setDescrizione("Bene cod. y");
        dettaglioLinee2.setQuantita("10.00");
        dettaglioLinee2.setUnitaMisura("Pezzo");
        dettaglioLinee2.setPrezzoUnitario("75.00");
        dettaglioLinee2.setPrezzoTotale("750.00");
        dettaglioLinee2.setAliquotaIVA("21.00");

        final DatiRiepilogo datiRiepilogo = new DatiRiepilogo();
        datiRiepilogo.setAliquotaIVA("21.00");
        datiRiepilogo.setSpeseAccessorie("50.00");
        datiRiepilogo.setImponibileImporto("3900.00");
        datiRiepilogo.setImposta("819.00");
        datiRiepilogo.setEsigibilitaIVA(EsigibilitaIVA.S);

        testObj.setDettaglioLinee(asList(dettaglioLinee1, dettaglioLinee2));
        testObj.setDatiRiepilogo(singletonList(datiRiepilogo));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_2() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiBeniServizi testObj = new DatiBeniServizi();

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee();
        dettaglioLinee1.setNumeroLinea("1");
        dettaglioLinee1.setDescrizione("Bene cod. X");
        dettaglioLinee1.setQuantita("10.00");
        dettaglioLinee1.setUnitaMisura("Pezzo");
        dettaglioLinee1.setPrezzoUnitario("500.00");
        dettaglioLinee1.setPrezzoTotale("5000.00");
        dettaglioLinee1.setAliquotaIVA("10.00");

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee();
        dettaglioLinee2.setNumeroLinea("2");
        dettaglioLinee2.setDescrizione("Bene cod. y");
        dettaglioLinee2.setQuantita("10.00");
        dettaglioLinee2.setUnitaMisura("Pezzo");
        dettaglioLinee2.setPrezzoUnitario("1000.00");
        dettaglioLinee2.setPrezzoTotale("10000.00");
        dettaglioLinee2.setAliquotaIVA("21.00");

        final DatiRiepilogo datiRiepilogo1 = new DatiRiepilogo();
        datiRiepilogo1.setAliquotaIVA("10.00");
        datiRiepilogo1.setImponibileImporto("5000.00");
        datiRiepilogo1.setImposta("500.00");
        datiRiepilogo1.setEsigibilitaIVA(EsigibilitaIVA.S);

        final DatiRiepilogo datiRiepilogo2 = new DatiRiepilogo();
        datiRiepilogo2.setAliquotaIVA("21.00");
        datiRiepilogo2.setImponibileImporto("10000.00");
        datiRiepilogo2.setImposta("2100.00");
        datiRiepilogo2.setEsigibilitaIVA(EsigibilitaIVA.S);

        testObj.setDettaglioLinee(asList(dettaglioLinee1, dettaglioLinee2));
        testObj.setDatiRiepilogo(asList(datiRiepilogo1, datiRiepilogo2));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_3() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_3.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiBeniServizi testObj = new DatiBeniServizi();

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee();
        dettaglioLinee1.setNumeroLinea("1");
        dettaglioLinee1.setDescrizione("Bene cod. x");
        dettaglioLinee1.setQuantita("10.00");
        dettaglioLinee1.setUnitaMisura("Pezzo");
        dettaglioLinee1.setPrezzoUnitario("315.00");
        dettaglioLinee1.setPrezzoTotale("3150.00");
        dettaglioLinee1.setAliquotaIVA("21.00");

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee();
        dettaglioLinee2.setNumeroLinea("2");
        dettaglioLinee2.setDescrizione("Bene cod. y");
        dettaglioLinee2.setQuantita("10.00");
        dettaglioLinee2.setUnitaMisura("Pezzo");
        dettaglioLinee2.setPrezzoUnitario("75.00");
        dettaglioLinee2.setPrezzoTotale("750.00");
        dettaglioLinee2.setAliquotaIVA("21.00");

        final DettaglioLinee dettaglioLinee3 = new DettaglioLinee();
        dettaglioLinee3.setNumeroLinea("3");
        dettaglioLinee3.setTipoCessionePrestazione(TipoCessionePrestazione.AC);
        dettaglioLinee3.setDescrizione("Materiale da imballaggio");
        dettaglioLinee3.setPrezzoUnitario("50.00");
        dettaglioLinee3.setPrezzoTotale("50.00");
        dettaglioLinee3.setAliquotaIVA("21.00");

        final DatiRiepilogo datiRiepilogo = new DatiRiepilogo();
        datiRiepilogo.setAliquotaIVA("21.00");
        datiRiepilogo.setImponibileImporto("3950.00");
        datiRiepilogo.setImposta("829.50");
        datiRiepilogo.setEsigibilitaIVA(EsigibilitaIVA.S);

        testObj.setDettaglioLinee(asList(dettaglioLinee1, dettaglioLinee2, dettaglioLinee3));
        testObj.setDatiRiepilogo(singletonList(datiRiepilogo));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_4() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_4.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiBeniServizi testObj = new DatiBeniServizi();

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee();
        dettaglioLinee1.setNumeroLinea("1");
        dettaglioLinee1.setDescrizione("Servizio X");
        dettaglioLinee1.setPrezzoUnitario("3150.00");
        dettaglioLinee1.setPrezzoTotale("3150.00");
        dettaglioLinee1.setAliquotaIVA("21.00");
        dettaglioLinee1.setRitenuta(Ritenuta.SI);

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee();
        dettaglioLinee2.setNumeroLinea("2");
        dettaglioLinee2.setDescrizione("Servizio y");
        dettaglioLinee2.setPrezzoUnitario("750.00");
        dettaglioLinee2.setPrezzoTotale("750.00");
        dettaglioLinee2.setAliquotaIVA("21.00");
        dettaglioLinee2.setRitenuta(Ritenuta.SI);

        final DatiRiepilogo datiRiepilogo = new DatiRiepilogo();
        datiRiepilogo.setAliquotaIVA("21.00");
        datiRiepilogo.setImponibileImporto("3900.00");
        datiRiepilogo.setImposta("819.00");
        datiRiepilogo.setEsigibilitaIVA(EsigibilitaIVA.I);

        testObj.setDettaglioLinee(asList(dettaglioLinee1, dettaglioLinee2));
        testObj.setDatiRiepilogo(singletonList(datiRiepilogo));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_5() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_5.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiBeniServizi testObj = new DatiBeniServizi();

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee();
        dettaglioLinee1.setNumeroLinea("1");
        dettaglioLinee1.setDescrizione("Bene cod. X");
        dettaglioLinee1.setQuantita("10.00");
        dettaglioLinee1.setUnitaMisura("Pezzo");
        dettaglioLinee1.setPrezzoUnitario("315.00");
        dettaglioLinee1.setPrezzoTotale("3150.00");
        dettaglioLinee1.setAliquotaIVA("21.00");

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee();
        dettaglioLinee2.setNumeroLinea("2");
        dettaglioLinee2.setDescrizione("Bene cod. y");
        dettaglioLinee2.setQuantita("10.00");
        dettaglioLinee2.setUnitaMisura("Pezzo");
        dettaglioLinee2.setPrezzoUnitario("75.00");
        dettaglioLinee2.setPrezzoTotale("750.00");
        dettaglioLinee2.setAliquotaIVA("21.00");

        final DettaglioLinee dettaglioLinee3 = new DettaglioLinee();
        dettaglioLinee3.setNumeroLinea("3");
        dettaglioLinee3.setDescrizione("Prestazione zkw");
        dettaglioLinee3.setPrezzoUnitario("1600.50");
        dettaglioLinee3.setPrezzoTotale("1600.50");
        dettaglioLinee3.setAliquotaIVA("0.00");
        dettaglioLinee3.setNatura(Natura.N4);

        final DatiRiepilogo datiRiepilogo1 = new DatiRiepilogo();
        datiRiepilogo1.setAliquotaIVA("21.00");
        datiRiepilogo1.setImponibileImporto("3900.00");
        datiRiepilogo1.setImposta("819.00");
        datiRiepilogo1.setEsigibilitaIVA(EsigibilitaIVA.S);

        final DatiRiepilogo datiRiepilogo2 = new DatiRiepilogo();
        datiRiepilogo2.setAliquotaIVA("0.00");
        datiRiepilogo2.setNatura(Natura.N4);
        datiRiepilogo2.setImponibileImporto("1600.50");
        datiRiepilogo2.setImposta("0.00");
        datiRiepilogo2.setRiferimentoNormativo("Art. x Decreto y");

        testObj.setDettaglioLinee(asList(dettaglioLinee1, dettaglioLinee2, dettaglioLinee3));
        testObj.setDatiRiepilogo(asList(datiRiepilogo1, datiRiepilogo2));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_6() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_6.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiBeniServizi testObj = new DatiBeniServizi();

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee();
        dettaglioLinee1.setNumeroLinea("1");
        dettaglioLinee1.setDescrizione("Bene cod. X");
        dettaglioLinee1.setQuantita("50.00");
        dettaglioLinee1.setUnitaMisura("Pezzo");
        dettaglioLinee1.setPrezzoUnitario("125.56432");
        dettaglioLinee1.setPrezzoTotale("6278.216");
        dettaglioLinee1.setAliquotaIVA("21.00");

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee();
        dettaglioLinee2.setNumeroLinea("2");
        dettaglioLinee2.setDescrizione("Bene cod. y");
        dettaglioLinee2.setQuantita("100.00");
        dettaglioLinee2.setUnitaMisura("Pezzo");
        dettaglioLinee2.setPrezzoUnitario("35.487643");
        dettaglioLinee2.setPrezzoTotale("3548.7643");
        dettaglioLinee2.setAliquotaIVA("21.00");

        final DatiRiepilogo datiRiepilogo = new DatiRiepilogo();
        datiRiepilogo.setAliquotaIVA("21.00");
        datiRiepilogo.setArrotondamento("-0.0003");
        datiRiepilogo.setImponibileImporto("9826.98");
        datiRiepilogo.setImposta("2063.67");
        datiRiepilogo.setEsigibilitaIVA(EsigibilitaIVA.S);

        testObj.setDettaglioLinee(asList(dettaglioLinee1, dettaglioLinee2));
        testObj.setDatiRiepilogo(singletonList(datiRiepilogo));

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDettaglioLinee_1() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DettaglioLinee_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiBeniServizi testObj = new DatiBeniServizi();

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee();
        dettaglioLinee1.setNumeroLinea("1");
        dettaglioLinee1.setDescrizione("Bene cod. X");
        dettaglioLinee1.setQuantita("25.00");
        dettaglioLinee1.setUnitaMisura("Pezzo");
        dettaglioLinee1.setPrezzoUnitario("150.00");
        dettaglioLinee1.setPrezzoTotale("3750.00");
        dettaglioLinee1.setAliquotaIVA("21.00");

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee();
        dettaglioLinee2.setNumeroLinea("2");
        dettaglioLinee2.setTipoCessionePrestazione(TipoCessionePrestazione.AC);
        dettaglioLinee2.setDescrizione("Materiale da imballaggio");
        dettaglioLinee2.setPrezzoUnitario("50.00");
        dettaglioLinee2.setPrezzoTotale("50.00");
        dettaglioLinee2.setAliquotaIVA("21.00");

        testObj.setDettaglioLinee(asList(dettaglioLinee1, dettaglioLinee2));

        testObj.setDatiRiepilogo(emptyList()); // this is not semantically correct!!
        // DatiRiepilogo should always be evaluated in production code

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDettaglioLinee_2() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DettaglioLinee_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiBeniServizi testObj = new DatiBeniServizi();

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee();
        dettaglioLinee1.setNumeroLinea("1");
        dettaglioLinee1.setDescrizione("Servizio abcde");
        dettaglioLinee1.setDataInizioPeriodo("2012-01-01");
        dettaglioLinee1.setDataFinePeriodo("2012-03-31");
        dettaglioLinee1.setPrezzoUnitario("5500.00");
        dettaglioLinee1.setPrezzoTotale("5500.00");
        dettaglioLinee1.setAliquotaIVA("10.00");
        dettaglioLinee1.setRitenuta(Ritenuta.SI);

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee();
        dettaglioLinee2.setNumeroLinea("2");
        dettaglioLinee2.setTipoCessionePrestazione(TipoCessionePrestazione.SC);
        dettaglioLinee2.setDescrizione("Sconto su Servizio abcde");
        dettaglioLinee2.setPrezzoUnitario("-275.00");
        dettaglioLinee2.setPrezzoTotale("-275.00");
        dettaglioLinee2.setAliquotaIVA("10.00");
        dettaglioLinee2.setRitenuta(Ritenuta.SI);

        testObj.setDettaglioLinee(asList(dettaglioLinee1, dettaglioLinee2));

        testObj.setDatiRiepilogo(emptyList()); // this is not semantically correct!!
        // DatiRiepilogo should always be evaluated in production code

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
