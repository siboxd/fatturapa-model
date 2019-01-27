package com.github.siboxd.fatturapa.model.invoicebody.products;

import org.checkerframework.checker.nullness.qual.NonNull;
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
    private final String codiceTipo;

    @Element(name = "CodiceValore")
    private final String codiceValore;

    /**
     * @param codiceTipo   It is used to identify the coding standard of the product.
     *                     <p>
     *                     The field must contain an indication of the type of coding of the item
     *                     expressed in the CodeValue field (eg "EAN", "SSC", "TARIC", "CPV", or
     *                     "Supplier Code", "Code Art. customer ".......).
     * @param codiceValore It serves to give the possibility of unique identification of a product in relation to
     *                     the type of code.
     *                     <p>
     *                     The field must contain the indication of the value of the article
     *                     code corresponding to the type of coding of the article.
     */
    public CodiceArticolo(@Element(name = "CodiceTipo") @NonNull final String codiceTipo,
                          @Element(name = "CodiceValore") @NonNull final String codiceValore) {

        this.codiceTipo = codiceTipo;
        this.codiceValore = codiceValore;
    }

    @NonNull
    public String getCodiceTipo() {
        return codiceTipo;
    }

    @NonNull
    public String getCodiceValore() {
        return codiceValore;
    }

}
