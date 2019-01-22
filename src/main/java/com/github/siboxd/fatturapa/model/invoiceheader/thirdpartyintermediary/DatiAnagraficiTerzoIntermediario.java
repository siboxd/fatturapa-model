package com.github.siboxd.fatturapa.model.invoiceheader.thirdpartyintermediary;

import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the third party intermediary personal data
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiTerzoIntermediario")
public class DatiAnagraficiTerzoIntermediario {
    // TODO: 20/01/2019 make common class for DatiAnagraficiXXX
    @Element(name = "IdFiscaleIVA", required = false)
    private IdFiscale idFiscaleIVA;
    // FIXME: 20/01/2019 IdFiscaleIVA and CodiceFiscale are mutually exclusive, but one must be evaluated
    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;

    @Element(name = "Anagrafica")
    private Anagrafica anagrafica;

    public DatiAnagraficiTerzoIntermediario() {
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
     * It serves to provide an additional identification element of the third party intermediary.
     *
     * @param codiceFiscale The field, if valued, must contain the tax code of the third party intermediary that
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
