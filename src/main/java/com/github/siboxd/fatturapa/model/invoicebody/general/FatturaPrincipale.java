package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Description of the invoice summarizing ancillary operations carried out in each calendar quarter
 * by hauliers on behalf of the same client
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "FatturaPrincipale")
public class FatturaPrincipale {

    @Element(name = "NumeroFatturaPrincipale")
    private String numeroFatturaPrincipale;

    @Element(name = "DataFatturaPrincipale")
    private String dataFatturaPrincipale;

    public FatturaPrincipale() {
    }

    public String getNumeroFatturaPrincipale() {
        return numeroFatturaPrincipale;
    }

    /**
     * It is used to indicate the number of the main invoice issued by the hauliers to which the
     * ancillary services that are being invoiced refer.
     *
     * @param numeroFatturaPrincipale The field contains the document number that consists of
     *                                alphanumeric values.
     */
    public void setNumeroFatturaPrincipale(final String numeroFatturaPrincipale) {
        this.numeroFatturaPrincipale = numeroFatturaPrincipale;
    }

    public String getDataFatturaPrincipale() {
        return dataFatturaPrincipale;
    }

    /**
     * It is used to identify the date of issue of the document
     *
     * @param dataFatturaPrincipale The field must contain the date of issue in the format
     *                              YYYY-MM-DD (ISO 8601: 2004 standard).
     */
    public void setDataFatturaPrincipale(final String dataFatturaPrincipale) {
        this.dataFatturaPrincipale = dataFatturaPrincipale; // TODO: 20/01/2019 add checks
    }

}
