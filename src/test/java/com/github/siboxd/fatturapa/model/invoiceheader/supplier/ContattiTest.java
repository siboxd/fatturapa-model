package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A test class for {@link Contatti}
 *
 * @author Enrico
 */
class ContattiTest {

    @Test
    void fax() {
        assertThrows(IllegalArgumentException.class, () -> new Contatti
                .Builder().fax("06123456715698301").build());
        assertThrows(IllegalArgumentException.class, () -> new Contatti
                .Builder().fax("5005").build());

        new Contatti.Builder().fax("+4608768706").build();
        new Contatti.Builder().fax(null).build();
    }
}