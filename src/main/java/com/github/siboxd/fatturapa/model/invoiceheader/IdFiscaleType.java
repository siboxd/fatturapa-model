package com.github.siboxd.fatturapa.model.invoiceheader;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It is used to identify the subject that transmits the file to the Interchange System.<br><br>
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "IdFiscaleType")
public class IdFiscaleType {

    @Element(name = "IdPaese")
    private String idPaese;

    @Element(name = "IdCodice")
    private String idCodice;

    public IdFiscaleType() {
    }

    public String getIdPaese() {
        return idPaese;
    }

    /**
     * @param idPaese The field must contain, according to the ISO 3166-1 alpha-2 code standard,
     *                the country code that assigned the tax identification to the subject.
     */
    public void setIdPaese(final String idPaese) {
        this.idPaese = idPaese;
    }

    public String getIdCodice() {
        return idCodice;
    }

    /**
     * @param idCodice In the event that IdPaese = "IT" (subject resident in Italy), the field
     *                 must contain the tax code of the transmitter;<br>
     *                 in all other cases (subject resident abroad) must contain the tax
     *                 identification that the transmitter was assigned by the country of origin.
     */
    public void setIdCodice(final String idCodice) {
        this.idCodice = idCodice;
    }

}
