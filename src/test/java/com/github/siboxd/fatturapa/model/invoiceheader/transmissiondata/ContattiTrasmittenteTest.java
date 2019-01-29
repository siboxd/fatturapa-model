package com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A test class for {@link ContattiTrasmittente}
 *
 * @author Enrico
 */
class ContattiTrasmittenteTest {

    @Test
    void telefono() {
        assertThrows(IllegalArgumentException.class, () -> new ContattiTrasmittente
                .Builder().telefono("06123456715698301").build());
        assertThrows(IllegalArgumentException.class, () -> new ContattiTrasmittente
                .Builder().telefono("5005").build());

        new ContattiTrasmittente.Builder().telefono("+4608768706").build();
        new ContattiTrasmittente.Builder().telefono(null).build();
    }

    @Test
    void email() {
        assertThrows(IllegalArgumentException.class, () -> new ContattiTrasmittente
                .Builder().email("").build());
        assertThrows(IllegalArgumentException.class, () -> new ContattiTrasmittente
                .Builder().email("ciao").build());
        assertThrows(IllegalArgumentException.class, () -> new ContattiTrasmittente
                .Builder().email("aa@a.a").build());

        new ContattiTrasmittente.Builder().email("person@mail.com").build();
        new ContattiTrasmittente.Builder().email(null).build();
    }
}