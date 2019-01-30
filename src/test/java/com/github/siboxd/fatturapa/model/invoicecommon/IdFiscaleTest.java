package com.github.siboxd.fatturapa.model.invoicecommon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A test class for {@link IdFiscale}
 *
 * @author Enrico
 */
public class IdFiscaleTest {

    /**
     * A correct instance of {@link IdFiscale}; to be used for testing purposes.
     */
    public static final IdFiscale ID_FISCALE_CORRECT = new IdFiscale("IT", "12345678901");

    @Test
    void idPaese() {
        assertThrows(IllegalArgumentException.class, () ->
                new IdFiscale("ITT", ID_FISCALE_CORRECT.getIdCodice()));
        assertThrows(IllegalArgumentException.class, () ->
                new IdFiscale("I", ID_FISCALE_CORRECT.getIdCodice()));
        assertThrows(IllegalArgumentException.class, () ->
                new IdFiscale("I2", ID_FISCALE_CORRECT.getIdCodice()));
    }

    @Test
    void idCodice() {
        assertThrows(IllegalArgumentException.class, () ->
                new IdFiscale(ID_FISCALE_CORRECT.getIdPaese(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        assertThrows(IllegalArgumentException.class, () ->
                new IdFiscale(ID_FISCALE_CORRECT.getIdPaese(), ""));
    }
}