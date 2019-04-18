package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * Description of the invoice summarizing ancillary operations carried out in each calendar quarter
 * by hauliers on behalf of the same client
 */
@Root(name = "FatturaPrincipale")
@Order(elements = {"NumeroFatturaPrincipale", "DataFatturaPrincipale"})
public final class FatturaPrincipale {

    @Element(name = "NumeroFatturaPrincipale")
    private final String numeroFatturaPrincipale;

    @Element(name = "DataFatturaPrincipale")
    private final String dataFatturaPrincipale;

    /**
     * @param numeroFatturaPrincipale It is used to indicate the number of the main invoice issued
     *                                by the hauliers to which the ancillary services that are being
     *                                invoiced refer.<p>
     *                                The field contains the document number that consists of
     *                                alphanumeric values.
     * @param dataFatturaPrincipale   It is used to identify the date of issue of the document.<p>
     *                                The field must contain the date of issue in the format
     *                                YYYY-MM-DD (ISO 8601: 2004 standard).
     */
    public FatturaPrincipale(@Element(name = "NumeroFatturaPrincipale") @NonNull final String numeroFatturaPrincipale,
                             @Element(name = "DataFatturaPrincipale") @NonNull final String dataFatturaPrincipale) {
        this.numeroFatturaPrincipale = numeroFatturaPrincipale;
        this.dataFatturaPrincipale = dataFatturaPrincipale; // TODO: 20/01/2019 add checks
    }

    @NonNull
    public String getNumeroFatturaPrincipale() {
        return numeroFatturaPrincipale;
    }

    @NonNull
    public String getDataFatturaPrincipale() {
        return dataFatturaPrincipale;
    }

}
