package com.github.siboxd.fatturapa.model.invoicebody;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains the information of the vehicles object of the invoice
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiVeicoliType")
public class DatiVeicoliType {

    @Element(name = "Data")
    private String data;

    @Element(name = "TotalePercorso")
    private String totalePercorso;

    public DatiVeicoliType() {
    }

    public String getData() {
        return data;
    }

    /**
     * It is used to indicate the date of first registration or registration in public registers,
     * useful date to check whether the vehicle involved in the operation is to be considered new
     * or used and therefore to expose it to its own different VAT regulations
     * (Article 21, paragraph 2, lett. g of Presidential Decree 633/1972).
     *
     * @param data The field must contain the date (first registration or registration in the
     *             public registers) in the format YYYY-MM-DD (ISO 8601: 2004 standard).
     */
    public void setData(final String data) {
        this.data = data; // TODO: 20/01/2019 add checks ??
    }

    public String getTotalePercorso() {
        return totalePercorso;
    }

    /**
     * It is used to indicate the total number of kilometers traveled, or total hours sailed or
     * transported by the means of transport (Article 21, paragraph 2, letter g
     * of Presidential Decree 633/1972).
     *
     * @param totalePercorso no particular criteria is established
     */
    public void setTotalePercorso(final String totalePercorso) {
        this.totalePercorso = totalePercorso;
    }

}
