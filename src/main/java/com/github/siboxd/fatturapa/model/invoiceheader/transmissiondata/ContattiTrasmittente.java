package com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It is used to provide additional information useful for contacting the transmitting subject.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "ContattiTrasmittente")
public class ContattiTrasmittente {

    @Element(name = "Telefono", required = false)
    private String telefono;

    @Element(name = "Email", required = false)
    private String email;

    public ContattiTrasmittente() {
    }

    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono The field, if evaluated, must contain a telephone number of the transmitting subject.
     */
    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    /**
     * @param email The field, if evaluated, must contain an e-mail address of the transmitting subject.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

}
