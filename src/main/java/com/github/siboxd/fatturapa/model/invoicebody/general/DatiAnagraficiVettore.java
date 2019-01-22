package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiVettore")
public class DatiAnagraficiVettore {
    // TODO: 20/01/2019 extend common class DatiAnagraficiXXX
    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;

    @Element(name = "Anagrafica")
    private Anagrafica anagrafica;

    @Element(name = "NumeroLicenzaGuida", required = false)
    private String numeroLicenzaGuida;

    public DatiAnagraficiVettore() {
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
     * It serves to provide an additional identification element of the carrier.
     *
     * @param codiceFiscale The field, if valued, must contain the tax code of the carrier that
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

    public String getNumeroLicenzaGuida() {
        return numeroLicenzaGuida;
    }

    /**
     * It is used to uniquely identify the person driving the vehicle in which the goods to be
     * transported are contained (eg driving license number).
     *
     * @param numeroLicenzaGuida no particular criteria is established
     */
    public void setNumeroLicenzaGuida(final String numeroLicenzaGuida) {
        this.numeroLicenzaGuida = numeroLicenzaGuida;
    }

}
