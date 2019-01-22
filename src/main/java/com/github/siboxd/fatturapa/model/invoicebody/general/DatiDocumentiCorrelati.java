package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Describes the possible documents related to an invoice
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiDocumentiCorrelati")
public class DatiDocumentiCorrelati {

    @ElementList(name = "RiferimentoNumeroLinea", entry = "RiferimentoNumeroLinea", inline = true, required = false)
    private List<String> riferimentoNumeroLinea;

    @Element(name = "IdDocumento")
    private String idDocumento;

    @Element(name = "Data", required = false)
    private String data;

    @Element(name = "NumItem", required = false)
    private String numItem;

    @Element(name = "CodiceCommessaConvenzione", required = false)
    private String codiceCommessaConvenzione;

    @Element(name = "CodiceCUP", required = false)
    private String codiceCUP;

    @Element(name = "CodiceCIG", required = false)
    private String codiceCIG;

    public DatiDocumentiCorrelati() {
    }

    public List<String> getRiferimentoNumeroLinea() {
        return riferimentoNumeroLinea;
    }

    /**
     * It is used to identify the detailed lines of the invoice to which the related document refers.
     * <br><br>
     * <b>Note:</b> If the related document refers to all the detail lines in the invoice,
     * the field may not be valued.
     */
    public void setRiferimentoNumeroLinea(final List<String> riferimentoNumeroLinea) {
        this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * @param idDocumento The field must contain the number of the linked document
     */
    public void setIdDocumento(final String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getData() {
        return data;
    }

    /**
     * @param data The field, if evaluated, must contain the date of the linked document in the
     *             format YYYY-MM-DD (ISO 8601: 2004 standard).
     */
    public void setData(final String data) {
        this.data = data; // TODO: 20/01/2019 add checks
    }

    public String getNumItem() {
        return numItem;
    }

    /**
     * It is used to identify the single entry in the linked document (the line number)
     *
     * @param numItem The field, if valued, must contain the value that identifies the line number
     *                of the connected document.
     */
    public void setNumItem(final String numItem) {
        this.numItem = numItem;
    }

    public String getCodiceCommessaConvenzione() {
        return codiceCommessaConvenzione;
    }

    /**
     * It serves to highlight the contract or convention referred to in the attached document.
     *
     * @param codiceCommessaConvenzione The field, if valued, must contain the code of the contract
     *                                  or agreement
     */
    public void setCodiceCommessaConvenzione(final String codiceCommessaConvenzione) {
        this.codiceCommessaConvenzione = codiceCommessaConvenzione;
    }

    public String getCodiceCUP() {
        return codiceCUP;
    }

    /**
     * It serves to highlight the code managed by the CIPE that characterizes each public investment
     * project (Unitary Project Code) and to ensure the effective traceability of payments by the
     * Public Administrations.
     * <br><br>
     * <b>Note:</b> To be valued only if you fall within the cases referred to in art. 25 DL 66/2014,
     * converted into Law June 23, 2014 n. 89.
     */
    public void setCodiceCUP(final String codiceCUP) {
        this.codiceCUP = codiceCUP;
    }

    public String getCodiceCIG() {
        return codiceCIG;
    }

    /**
     * It serves to highlight the identification code of the tender and to ensure the effective
     * traceability of payments by the Public Administrations.
     * <br><br>
     * <b>Note:</b> To be valued only if you fall within the cases referred to in art. 25 DL 66/2014,
     * converted into Law June 23, 2014 n. 89.
     */
    public void setCodiceCIG(final String codiceCIG) {
        this.codiceCIG = codiceCIG;
    }

}
