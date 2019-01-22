package com.github.siboxd.fatturapa.model.invoiceheader.fiscalagent;

import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;
import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the personal data of the tax representative of a subject
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiRappresentante")
public class DatiAnagraficiRappresentante {
    // TODO: 19/01/2019 can be made a base class for "DatiAnagraficiXXX" classes???
    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;

    @Element(name = "Anagrafica")
    private Anagrafica anagrafica;

    public DatiAnagraficiRappresentante() {
    }

    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(final IdFiscale idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * It serves to provide an additional identification element
     *
     * @param codiceFiscale The field, if valued, must contain the tax code of the tax representative that
     *                      will be composed of <em>11 numeric characters</em>, if it is a legal person,
     *                      or <em>16 alphanumeric characters</em>, if it is a natural person.
     */
    public void setCodiceFiscale(final String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(final Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

}
