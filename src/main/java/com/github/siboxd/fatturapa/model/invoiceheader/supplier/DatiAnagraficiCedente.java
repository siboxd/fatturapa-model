package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains data related to the supplier being billed.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiCedente")
public class DatiAnagraficiCedente {

    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;

    @Element(name = "Anagrafica")
    private Anagrafica anagrafica;

    @Element(name = "AlboProfessionale", required = false)
    private String alboProfessionale;

    @Element(name = "ProvinciaAlbo", required = false)
    private String provinciaAlbo;

    @Element(name = "NumeroIscrizioneAlbo", required = false)
    private String numeroIscrizioneAlbo;

    @Element(name = "DataIscrizioneAlbo", required = false)
    private String dataIscrizioneAlbo;

    @Element(name = "RegimeFiscale")
    private RegimeFiscale regimeFiscale;

    public DatiAnagraficiCedente() {
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
     * It serves to provide an additional identification element of the seller,
     * often required for payment.
     *
     * @param codiceFiscale The field, if valued, must contain the tax code of the seller that
     *                      will be composed of <em>11 numeric characters</em>, if it is a legal person,
     *                      or <em>16 alphanumeric characters</em>, if it is a natural person.
     */
    public void setCodiceFiscale(final String codiceFiscale) {
        this.codiceFiscale = codiceFiscale; // TODO: 19/01/2019 add checks on given string
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(final Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    public String getAlboProfessionale() {
        return alboProfessionale;
    }

    /**
     * It allows you to enter information relating to the professional register to which
     * the seller may belong.
     *
     * @param alboProfessionale The field, if valued, must contain the name of the professional register;
     *                          abbreviations are permitted (eg "Dottori" -> "Dott." and similar)
     *                          at the user's complete discretion.
     */
    public void setAlboProfessionale(final String alboProfessionale) {
        this.alboProfessionale = alboProfessionale;
    }

    public String getProvinciaAlbo() {
        return provinciaAlbo;
    }

    /**
     * Allows you to enter information relating to the professional register to which the seller
     * may belong, in particular to the province of jurisdiction.
     *
     * @param provinciaAlbo The field, if valued, must contain the initials of the province of
     *                      competence with reference to the professional register to which the
     *                      seller belongs.
     */
    public void setProvinciaAlbo(final String provinciaAlbo) {
        this.provinciaAlbo = provinciaAlbo;
    }

    public String getNumeroIscrizioneAlbo() {
        return numeroIscrizioneAlbo;
    }

    /**
     * Allows you to enter information relating to the professional register to which the seller
     * may belong, in particular to the registration number.
     *
     * @param numeroIscrizioneAlbo The field, if valued, must contain the number of professional
     *                             registration
     */
    public void setNumeroIscrizioneAlbo(final String numeroIscrizioneAlbo) {
        this.numeroIscrizioneAlbo = numeroIscrizioneAlbo;
    }

    public String getDataIscrizioneAlbo() {
        return dataIscrizioneAlbo;
    }

    /**
     * Allows you to enter information relating to the professional register to which the seller
     * may belong, in particular at the date of registration.
     *
     * @param dataIscrizioneAlbo The field, if evaluated, must contain the date of registration
     *                           in the register in the format YYYY-MM-DD (ISO 8601: 2004 standard).
     */
    public void setDataIscrizioneAlbo(final String dataIscrizioneAlbo) {
        this.dataIscrizioneAlbo = dataIscrizioneAlbo; // TODO: 19/01/2019 add checks
    }

    public RegimeFiscale getRegimeFiscale() {
        return regimeFiscale;
    }

    public void setRegimeFiscale(final RegimeFiscale regimeFiscale) {
        this.regimeFiscale = regimeFiscale;
    }

}
