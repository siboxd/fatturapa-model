package com.github.siboxd.fatturapa.model.invoicecommon;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains physical addressing information
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Indirizzo")
public final class Indirizzo {

    @Element(name = "Indirizzo")
    private String indirizzo;

    @Element(name = "NumeroCivico", required = false)
    private String numeroCivico;

    @Element(name = "CAP")
    private String cap;

    @Element(name = "Comune")
    private String comune;

    @Element(name = "Provincia", required = false)
    private String provincia;

    @Element(name = "Nazione")
    private String nazione;

    public Indirizzo() {
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * The Address
     * <p>
     * Here you can choose whether to specify the street number or not.
     *
     * @param indirizzo The field must contain the address (street, square, etc.)
     */
    public void setIndirizzo(final String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNumeroCivico() {
        return numeroCivico;
    }

    /**
     * The Street Number
     * <p>
     * <b>Note:</b> To be specified only if the house number has not been entered in the address field
     *
     * @param numeroCivico The field must contain the street number of the address
     */
    public void setNumeroCivico(final String numeroCivico) {
        this.numeroCivico = numeroCivico;
    }

    public String getCap() {
        return cap;
    }

    /**
     * The Postal Code
     *
     * @param cap The field must contain the Postal Code
     */
    public void setCap(final String cap) {
        this.cap = cap;
    }

    public String getComune() {
        return comune;
    }

    /**
     * The Municipality
     *
     * @param comune The field must contain the full diction of the municipality (also abroad)
     */
    public void setComune(final String comune) {
        this.comune = comune;
    }

    public String getProvincia() {
        return provincia;
    }

    /**
     * The Province
     * <br><br>
     * <b>Note:</b> Its valorization is not allowed if the Nation field contains a value
     * different from "IT". <br> Vice versa (field Country = "IT") must be present.
     *
     * @param provincia The field must contain the initials of the province in Italy to which
     *                  the municipality indicated in the municipality field belongs
     */
    public void setProvincia(final String provincia) {
        this.provincia = provincia;
    } // TODO: 19/01/2019 add checks

    public String getNazione() {
        return nazione;
    }

    /**
     * The Nation
     *
     * @param nazione The field must contain, according to the ISO 3166-1 alpha-2 code, the code
     *                of the country to which the municipality indicated in the Municipality field belongs.
     */
    public void setNazione(final String nazione) {
        this.nazione = nazione;
    }

}
