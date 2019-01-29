package com.github.siboxd.fatturapa.model.invoicebody;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains the information of the vehicles object of the invoice
 */
@Root(name = "DatiVeicoli")
public final class DatiVeicoli {

    @Element(name = "Data")
    private final String data;

    @Element(name = "TotalePercorso")
    private final String totalePercorso;

    /**
     * @param data           It is used to indicate the date of first registration or registration
     *                       in public registers, useful date to check whether the vehicle involved
     *                       in the operation is to be considered new or used and therefore to expose
     *                       it to its own different VAT regulations (Article 21, paragraph 2, lett.
     *                       g of Presidential Decree 633/1972).
     *                       <p>
     *                       The field must contain the date (first registration or registration in the
     *                       public registers) in the format YYYY-MM-DD (ISO 8601: 2004 standard).
     * @param totalePercorso It is used to indicate the total number of kilometers traveled, or
     *                       total hours sailed or transported by the means of transport
     *                       (Article 21, paragraph 2, letter g of Presidential Decree 633/1972).
     */
    public DatiVeicoli(@Element(name = "Data") @NonNull final String data,
                       @Element(name = "TotalePercorso") @NonNull final String totalePercorso) {
        this.data = data; // TODO: 20/01/2019 add checks ??
        this.totalePercorso = totalePercorso;
    }

    @NonNull
    public String getData() {
        return data;
    }

    @NonNull
    public String getTotalePercorso() {
        return totalePercorso;
    }

}
