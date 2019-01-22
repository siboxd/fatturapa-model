package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains contact information for a subject.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Contatti")
public class Contatti {
    // TODO: 19/01/2019 is that class the same as ContattiTrasmittente???
    // ...maybe it could be an extension...

    @Element(name = "Telefono", required = false)
    private String telefono;

    @Element(name = "Fax", required = false)
    private String fax;

    @Element(name = "Email", required = false)
    private String email;

    public Contatti() {
    }

    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono The field, if evaluated, must contain a telephone number of the subject.
     */
    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    /**
     * @param fax The field, if evaluated, must contain a fax number of the subject.
     */
    public void setFax(final String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    /**
     * @param email The field, if evaluated, must contain an e-mail address of the subject.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

}
