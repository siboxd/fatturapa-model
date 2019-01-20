package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.AnagraficaType;
import com.github.siboxd.fatturapa.model.IdFiscaleType;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the buyer personal data
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiCessionarioType")
public class DatiAnagraficiCessionarioType {
    // TODO: 20/01/2019 make base class for all DatiAnagraficiXXX
    @Element(name = "IdFiscaleIVA", required = false)
    private IdFiscaleType idFiscaleIVA;

    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;

    @Element(name = "Anagrafica")
    private AnagraficaType anagrafica;

    public DatiAnagraficiCessionarioType() {
    }

    public IdFiscaleType getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(final IdFiscaleType idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * It serves to provide an additional identification element
     *
     * @param codiceFiscale The field, if valued, must contain the tax code of the buyer that
     *                      will be composed of <em>11 numeric characters</em>, if it is a legal person,
     *                      or <em>16 alphanumeric characters</em>, if it is a natural person.
     */
    public void setCodiceFiscale(final String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public AnagraficaType getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(final AnagraficaType anagrafica) {
        this.anagrafica = anagrafica;
    }

}
