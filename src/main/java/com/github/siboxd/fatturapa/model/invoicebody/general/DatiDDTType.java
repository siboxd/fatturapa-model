package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Describes the data of the Transportation Documents linked to the invoice
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiDDTType")
public class DatiDDTType {

    @Element(name = "NumeroDDT")
    private String numeroDDT;

    @Element(name = "DataDDT")
    private String dataDDT;

    @ElementList(name = "RiferimentoNumeroLinea", entry = "RiferimentoNumeroLinea", inline = true, required = false)
    private List<String> riferimentoNumeroLinea;

    public DatiDDTType() {
    }

    public String getNumeroDDT() {
        return numeroDDT;
    }

    /**
     * @param numeroDDT The field must contain, in alphanumeric format, the sequence number
     *                  assigned by the transferor to the transport document at the time of issue.
     */
    public void setNumeroDDT(final String numeroDDT) {
        this.numeroDDT = numeroDDT;
    }

    public String getDataDDT() {
        return dataDDT;
    }

    /**
     * @param dataDDT The field must contain the date of issue of the transport document in the
     *                format YYYY-MM-DD (ISO 8601: 2004 standard)
     */
    public void setDataDDT(final String dataDDT) {
        this.dataDDT = dataDDT; // TODO: 20/01/2019 add checks
    }

    public List<String> getRiferimentoNumeroLinea() {
        return riferimentoNumeroLinea;
    }

    /**
     * It is used to identify the number of the detail line of the invoice to which the
     * transport document refers
     */
    public void setRiferimentoNumeroLinea(final List<String> riferimentoNumeroLinea) {
        this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    }

}
