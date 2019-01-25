package com.github.siboxd.fatturapa.model.invoicebody.products;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Describes the identification of a product based on a standard
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "CodiceArticolo")
public final class CodiceArticolo {

    @Element(name = "CodiceTipo")
    private String codiceTipo;

    @Element(name = "CodiceValore")
    private String codiceValore;

    public CodiceArticolo() {
    }

    public String getCodiceTipo() {
        return codiceTipo;
    }

    /**
     * It is used to identify the coding standard of the product.
     *
     * @param codiceTipo The field must contain an indication of the type of coding of the item
     *                   expressed in the CodeValue field (eg "EAN", "SSC", "TARIC", "CPV", or
     *                   "Supplier Code", "Code Art. customer ".......).
     */
    public void setCodiceTipo(final String codiceTipo) {
        this.codiceTipo = codiceTipo;
    }

    public String getCodiceValore() {
        return codiceValore;
    }

    /**
     * It serves to give the possibility of unique identification of a product in relation to
     * the type of code.
     *
     * @param codiceValore The field must contain the indication of the value of the article
     *                     code corresponding to the type of coding of the article.
     */
    public void setCodiceValore(final String codiceValore) {
        this.codiceValore = codiceValore;
    }

}
