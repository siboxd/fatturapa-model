package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicecommon.AnagraficaType;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscaleType;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiVettoreType")
public class DatiAnagraficiVettoreType {
    // TODO: 20/01/2019 extend common class DatiAnagraficiXXX
    @Element(name = "IdFiscaleIVA")
    private IdFiscaleType idFiscaleIVA;

    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;

    @Element(name = "Anagrafica")
    private AnagraficaType anagrafica;

    @Element(name = "NumeroLicenzaGuida", required = false)
    private String numeroLicenzaGuida;

    public DatiAnagraficiVettoreType() {
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
     * It serves to provide an additional identification element of the carrier.
     *
     * @param codiceFiscale The field, if valued, must contain the tax code of the carrier that
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
