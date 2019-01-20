package com.github.siboxd.fatturapa.model.invoicebody.products;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Description of additional information that the recipient has requested to include in the document,
 * to refer to each individual detail line of the document itself, having managerial or other usefulness
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "AltriDatiGestionaliType")
public class AltriDatiGestionaliType {

    @Element(name = "TipoDato")
    private String tipoDato;

    @Element(name = "RiferimentoTesto", required = false)
    private String riferimentoTesto;

    @Element(name = "RiferimentoNumero", required = false)
    private String riferimentoNumero;

    @Element(name = "RiferimentoData", required = false)
    private String riferimentoData;

    public AltriDatiGestionaliType() {
    }

    public String getTipoDato() {
        return tipoDato;
    }

    /**
     * It is used to identify the type of information.
     *
     * @param tipoDato The field must contain a presumably agreed value between the parts that
     *                 qualifies the data entered in the other fields of the block.
     */
    public void setTipoDato(final String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getRiferimentoTesto() {
        return riferimentoTesto;
    }

    /**
     * It is used to indicate the additional information when it can be represented in an
     * alphanumeric format.
     *
     * @param riferimentoTesto The field must contain an alphanumeric value
     */
    public void setRiferimentoTesto(final String riferimentoTesto) {
        this.riferimentoTesto = riferimentoTesto;
    }

    public String getRiferimentoNumero() {
        return riferimentoNumero;
    }

    /**
     * It is used to indicate the additional information when it can be represented in a
     * numerical format.
     *
     * @param riferimentoNumero The field must contain a numeric value represented by an integer
     *                          and decimals ranging from a minimum of two to a maximum of eight
     *                          digits. The decimals, separated by the whole with the dot character
     *                          ("."), Must always be indicated even if zero (eg: 112233.00).
     */
    public void setRiferimentoNumero(final String riferimentoNumero) {
        this.riferimentoNumero = riferimentoNumero;
    }

    public String getRiferimentoData() {
        return riferimentoData;
    }

    /**
     * It is used to indicate the additional information when it can be represented in a given format.
     *
     * @param riferimentoData The field must contain a date in the format
     *                        YYYY-MM-DD (ISO 8601: 2004 standard).
     */
    public void setRiferimentoData(final String riferimentoData) {
        this.riferimentoData = riferimentoData; // TODO: 20/01/2019 add checks
    }

}
