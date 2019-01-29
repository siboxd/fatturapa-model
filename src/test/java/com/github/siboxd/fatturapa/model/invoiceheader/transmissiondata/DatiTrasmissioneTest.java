package com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata;

import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;
import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static com.github.siboxd.fatturapa.model.invoicecommon.IdFiscaleTest.ID_FISCALE_CORRECT;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * A test class for {@link DatiTrasmissione}
 *
 * @author Enrico
 */
public class DatiTrasmissioneTest extends AbstractXmlSerializationTest {

    /**
     * A correct instance of {@link DatiTrasmissione}; to be used for testing purposes.
     */
    public static final DatiTrasmissione DATI_TRASMISSIONE_CORRECT = new DatiTrasmissione
            .Builder(ID_FISCALE_CORRECT, "AB001", FormatoTrasmissione.FPR12, "ABC1234")
            .build();

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

    @Nested
    class SyntacticChecks {

        private final IdFiscale correctIdTrasmittente = DATI_TRASMISSIONE_CORRECT.getIdTrasmittente();
        private final String correctProgressivoInvio = DATI_TRASMISSIONE_CORRECT.getProgressivoInvio();
        private final FormatoTrasmissione correctFormatoTrasmissione = DATI_TRASMISSIONE_CORRECT.getFormatoTrasmissione();
        private final String correctCodiceDestinatario = DATI_TRASMISSIONE_CORRECT.getCodiceDestinatario();

        @Test
        void progressivoInvio() {
            assertThrows(IllegalArgumentException.class, () -> new DatiTrasmissione
                    .Builder(correctIdTrasmittente, "", correctFormatoTrasmissione, correctCodiceDestinatario));
            assertThrows(IllegalArgumentException.class, () -> new DatiTrasmissione
                    .Builder(correctIdTrasmittente, "\u0644", correctFormatoTrasmissione, correctCodiceDestinatario));
        }

        @Test
        void codiceDestinatario() {
            assertThrows(IllegalArgumentException.class, () -> new DatiTrasmissione
                    .Builder(correctIdTrasmittente, correctProgressivoInvio, correctFormatoTrasmissione, "AAA"));
            assertThrows(IllegalArgumentException.class, () -> new DatiTrasmissione
                    .Builder(correctIdTrasmittente, correctProgressivoInvio, correctFormatoTrasmissione, "AAAAAAa"));
            assertThrows(IllegalArgumentException.class, () -> new DatiTrasmissione
                    .Builder(correctIdTrasmittente, correctProgressivoInvio, correctFormatoTrasmissione, "AAA2606566"));
        }

        @Test
        void pecDestinatario() {
            assertThrows(IllegalArgumentException.class,
                    () -> new DatiTrasmissione.Builder(DATI_TRASMISSIONE_CORRECT).pecDestinatario(""));
            assertThrows(IllegalArgumentException.class,
                    () -> new DatiTrasmissione.Builder(DATI_TRASMISSIONE_CORRECT).pecDestinatario("ciao"));
            assertThrows(IllegalArgumentException.class,
                    () -> new DatiTrasmissione.Builder(DATI_TRASMISSIONE_CORRECT).pecDestinatario("a@a.a"));

            new DatiTrasmissione.Builder(DATI_TRASMISSIONE_CORRECT).pecDestinatario("a@aaaa.aaaa");
            new DatiTrasmissione.Builder(DATI_TRASMISSIONE_CORRECT).pecDestinatario(null);
        }
    }
}
