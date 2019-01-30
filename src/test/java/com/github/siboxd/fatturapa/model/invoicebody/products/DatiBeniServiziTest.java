package com.github.siboxd.fatturapa.model.invoicebody.products;

import com.github.siboxd.fatturapa.model.invoicebody.Natura;
import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.Collections;

import static com.github.siboxd.fatturapa.testutils.ResourceResolver.resolveResourcePath;
import static java.util.Arrays.asList;
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


        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee
                .Builder("1", "Bene cod. X", "315.00", "3150.00", "21.00")
                .quantita("10.00")
                .unitaMisura("Pezzo")
                .build();

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee
                .Builder("2", "Bene cod. y", "75.00", "750.00", "21.00")
                .quantita("10.00")
                .unitaMisura("Pezzo")
                .build();

        final DatiRiepilogo datiRiepilogo = new DatiRiepilogo
                .Builder("21.00", "3900.00", "819.00")
                .speseAccessorie("50.00")
                .esigibilitaIVA(EsigibilitaIVA.S)
                .build();

        final DatiBeniServizi testObj =
                new DatiBeniServizi(
                        asList(dettaglioLinee1, dettaglioLinee2),
                        singletonList(datiRiepilogo)
                );

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_2() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));


        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee
                .Builder("1", "Bene cod. X", "500.00", "5000.00", "10.00")
                .quantita("10.00")
                .unitaMisura("Pezzo")
                .build();

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee
                .Builder("2", "Bene cod. y", "1000.00", "10000.00", "21.00")
                .quantita("10.00")
                .unitaMisura("Pezzo")
                .build();

        final DatiRiepilogo datiRiepilogo1 = new DatiRiepilogo
                .Builder("10.00", "5000.00", "500.00")
                .esigibilitaIVA(EsigibilitaIVA.S)
                .build();

        final DatiRiepilogo datiRiepilogo2 = new DatiRiepilogo
                .Builder("21.00", "10000.00", "2100.00")
                .esigibilitaIVA(EsigibilitaIVA.S)
                .build();

        final DatiBeniServizi testObj =
                new DatiBeniServizi(
                        asList(dettaglioLinee1, dettaglioLinee2),
                        asList(datiRiepilogo1, datiRiepilogo2)
                );

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_3() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_3.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee
                .Builder("1", "Bene cod. x", "315.00", "3150.00", "21.00")
                .quantita("10.00")
                .unitaMisura("Pezzo")
                .build();

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee
                .Builder("2", "Bene cod. y", "75.00", "750.00", "21.00")
                .quantita("10.00")
                .unitaMisura("Pezzo")
                .build();

        final DettaglioLinee dettaglioLinee3 = new DettaglioLinee
                .Builder("3", "Materiale da imballaggio", "50.00", "50.00", "21.00")
                .tipoCessionePrestazione(TipoCessionePrestazione.AC)
                .build();

        final DatiRiepilogo datiRiepilogo = new DatiRiepilogo
                .Builder("21.00", "3950.00", "829.50")
                .esigibilitaIVA(EsigibilitaIVA.S)
                .build();

        final DatiBeniServizi testObj =
                new DatiBeniServizi(
                        asList(dettaglioLinee1, dettaglioLinee2, dettaglioLinee3),
                        singletonList(datiRiepilogo)
                );

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_4() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_4.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee
                .Builder("1", "Servizio X", "3150.00", "3150.00", "21.00")
                .ritenuta(Ritenuta.SI)
                .build();

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee
                .Builder("2", "Servizio y", "750.00", "750.00", "21.00")
                .ritenuta(Ritenuta.SI)
                .build();

        final DatiRiepilogo datiRiepilogo = new DatiRiepilogo
                .Builder("21.00", "3900.00", "819.00")
                .esigibilitaIVA(EsigibilitaIVA.I)
                .build();

        final DatiBeniServizi testObj =
                new DatiBeniServizi(
                        asList(dettaglioLinee1, dettaglioLinee2),
                        singletonList(datiRiepilogo)
                );

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_5() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_5.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee
                .Builder("1", "Bene cod. X", "315.00", "3150.00", "21.00")
                .quantita("10.00")
                .unitaMisura("Pezzo")
                .build();

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee
                .Builder("2", "Bene cod. y", "75.00", "750.00", "21.00")
                .quantita("10.00")
                .unitaMisura("Pezzo")
                .build();

        final DettaglioLinee dettaglioLinee3 = new DettaglioLinee
                .Builder("3", "Prestazione zkw", "1600.50", "1600.50", "0.00")
                .natura(Natura.N4)
                .build();

        final DatiRiepilogo datiRiepilogo1 = new DatiRiepilogo
                .Builder("21.00", "3900.00", "819.00")
                .esigibilitaIVA(EsigibilitaIVA.S)
                .build();

        final DatiRiepilogo datiRiepilogo2 = new DatiRiepilogo
                .Builder("0.00", "1600.50", "0.00")
                .natura(Natura.N4)
                .riferimentoNormativo("Art. x Decreto y")
                .build();

        final DatiBeniServizi testObj =
                new DatiBeniServizi(
                        asList(dettaglioLinee1, dettaglioLinee2, dettaglioLinee3),
                        asList(datiRiepilogo1, datiRiepilogo2)
                );

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiRiepilogo_6() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DatiRiepilogo_6.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee
                .Builder("1", "Bene cod. X", "125.56432", "6278.216", "21.00")
                .quantita("50.00")
                .unitaMisura("Pezzo")
                .build();

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee
                .Builder("2", "Bene cod. y", "35.487643", "3548.7643", "21.00")
                .quantita("100.00")
                .unitaMisura("Pezzo")
                .build();

        final DatiRiepilogo datiRiepilogo = new DatiRiepilogo
                .Builder("21.00", "9826.98", "2063.67")
                .arrotondamento("-0.0003")
                .esigibilitaIVA(EsigibilitaIVA.S)
                .build();

        final DatiBeniServizi testObj =
                new DatiBeniServizi(
                        asList(dettaglioLinee1, dettaglioLinee2),
                        singletonList(datiRiepilogo)
                );

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDettaglioLinee_1() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DettaglioLinee_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee
                .Builder("1", "Bene cod. X", "150.00", "3750.00", "21.00")
                .quantita("25.00")
                .unitaMisura("Pezzo")
                .build();

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee
                .Builder("2", "Materiale da imballaggio", "50.00", "50.00", "21.00")
                .tipoCessionePrestazione(TipoCessionePrestazione.AC)
                .build();

        final DatiBeniServizi testObj =
                new DatiBeniServizi(
                        asList(dettaglioLinee1, dettaglioLinee2),
                        Collections.<DatiRiepilogo>emptyList()  // !! this is not semantically correct !!
                        // DatiRiepilogo should always be evaluated in production code
                );

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDettaglioLinee_2() throws URISyntaxException {
        final String testFileName = "DatiBeniServizi_DettaglioLinee_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DettaglioLinee dettaglioLinee1 = new DettaglioLinee
                .Builder("1", "Servizio abcde", "5500.00", "5500.00", "10.00")
                .dataInizioPeriodo("2012-01-01")
                .dataFinePeriodo("2012-03-31")
                .ritenuta(Ritenuta.SI)
                .build();

        final DettaglioLinee dettaglioLinee2 = new DettaglioLinee
                .Builder("2", "Sconto su Servizio abcde", "-275.00", "-275.00", "10.00")
                .tipoCessionePrestazione(TipoCessionePrestazione.SC)
                .ritenuta(Ritenuta.SI)
                .build();

        final DatiBeniServizi testObj =
                new DatiBeniServizi(
                        asList(dettaglioLinee1, dettaglioLinee2),
                        Collections.<DatiRiepilogo>emptyList()  // !! this is not semantically correct !!
                        // DatiRiepilogo should always be evaluated in production code
                );

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
