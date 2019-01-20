package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * This block contains the general data of the invoice document and related documents.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiGeneraliType")
public class DatiGeneraliType {

    @Element(name = "DatiGeneraliDocumento")
    private DatiGeneraliDocumentoType datiGeneraliDocumento;

    @ElementList(name = "DatiOrdineAcquisto", entry = "DatiOrdineAcquisto", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiOrdineAcquisto;

    @ElementList(name = "DatiContratto", entry = "DatiContratto", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiContratto;

    @ElementList(name = "DatiConvenzione", entry = "DatiConvenzione", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiConvenzione;

    @ElementList(name = "DatiRicezione", entry = "DatiRicezione", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiRicezione;

    @ElementList(name = "DatiFattureCollegate", entry = "DatiFattureCollegate", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiFattureCollegate;

    @ElementList(name = "DatiSAL", entry = "DatiSAL", inline = true, required = false)
    private List<DatiSALType> datiSAL;

    @ElementList(name = "DatiDDT", entry = "DatiDDT", inline = true, required = false)
    private List<DatiDDTType> datiDDT;

    @Element(name = "DatiTrasporto", required = false)
    private DatiTrasportoType datiTrasporto;

    @Element(name = "FatturaPrincipale", required = false)
    private FatturaPrincipaleType fatturaPrincipale;

    public DatiGeneraliType() {
    }

    public DatiGeneraliDocumentoType getDatiGeneraliDocumento() {
        return datiGeneraliDocumento;
    }

    public void setDatiGeneraliDocumento(final DatiGeneraliDocumentoType datiGeneraliDocumento) {
        this.datiGeneraliDocumento = datiGeneraliDocumento;
    }

    public List<DatiDocumentiCorrelatiType> getDatiOrdineAcquisto() {
        return datiOrdineAcquisto;
    }

    /**
     * <b>Note:</b> To be valued only if you want to give evidence of the fact that the document
     * (invoice or similar) is issued against a purchase order to which it refers
     * <br><br>
     * The valuation takes place or at the request of the buyer who needs to 'bind' the invoice
     * to the purchase order previously issued, or when it is necessary to give evidence of the
     * CIG and CUP codes linked to a purchase order. In this regard, it must be considered,
     * for invoices to a Public Administrations, that Article 25 of Decree Law 66/2014,
     * converted into Law June 23, 2014 n. 89, provides in some cases the compulsory indication
     * of CIG and / or CUP on the invoice, the absence of which results in the non-payment
     * by the administration.
     */
    public void setDatiOrdineAcquisto(final List<DatiDocumentiCorrelatiType> datiOrdineAcquisto) {
        this.datiOrdineAcquisto = datiOrdineAcquisto;
    }

    public List<DatiDocumentiCorrelatiType> getDatiContratto() {
        return datiContratto;
    }

    /**
     * <b>Note:</b> To be valued only if you want to show the fact that the document (invoice or
     * similar) is issued against a supply/service regulated by a contract
     * <br><br>
     * The valuation takes place or at the request of the buyer who needs to 'bind' the invoice
     * to the reference contract, or when it is necessary to highlight the CIG and CUP codes linked
     * to a contract. In this regard, it is necessary to consider, for invoices for a public administration,
     * that Article 25 of Decree Law 66/2014, converted into Law June 23, 2014 n. 89, provides in some
     * cases the mandatory indication of CIG and / or CUP on the invoice, the absence of which results
     * in the non-payment by the administration.
     */
    public void setDatiContratto(final List<DatiDocumentiCorrelatiType> datiContratto) {
        this.datiContratto = datiContratto;
    }

    public List<DatiDocumentiCorrelatiType> getDatiConvenzione() {
        return datiConvenzione;
    }

    /**
     * <b>Note:</b> To be valued only if you want to show the fact that the document (invoice or
     * similar) is issued for a supply / service regulated by an agreement
     * <br><br>
     * The valuation usually takes place at the request of the transferee / client who needs to
     * 'bind' the invoice to the agreement.
     */
    public void setDatiConvenzione(final List<DatiDocumentiCorrelatiType> datiConvenzione) {
        this.datiConvenzione = datiConvenzione;
    }

    public List<DatiDocumentiCorrelatiType> getDatiRicezione() {
        return datiRicezione;
    }

    /**
     * <b>Note:</b> To be valued only if you want to give evidence of the fact that the document
     * (invoice or similar) is issued against a supply for which the recipient has provided for a
     * receipt procedure, identified and registered on their information systems.
     * <br><br>
     * Valuation usually takes place at the request of the transferee / buyer who needs to
     * 'bind' the invoice upon receipt.
     */
    public void setDatiRicezione(final List<DatiDocumentiCorrelatiType> datiRicezione) {
        this.datiRicezione = datiRicezione;
    }

    public List<DatiDocumentiCorrelatiType> getDatiFattureCollegate() {
        return datiFattureCollegate;
    }

    /**
     * <b>Note:</b> To be valued only if you want to highlight the fact that the document (invoice
     * or similar) is linked to an invoice previously issued (this is the case, for example, of
     * credit notes or adjustment invoices for previous down payment invoices)
     * <br><br>
     * The valuation usually takes place at the request of the buyer who needs to 'bind' the invoice
     * to the previously issued. If the Document Type field is set to 'TD04' (credit note), the
     * linked invoice date must not be later than the date of the credit note.
     */
    public void setDatiFattureCollegate(final List<DatiDocumentiCorrelatiType> datiFattureCollegate) {
        this.datiFattureCollegate = datiFattureCollegate;
    }

    public List<DatiSALType> getDatiSAL() {
        return datiSAL;
    }

    /**
     * <b>Note:</b> To be valued only if the document is in the case of billing methods in progress
     * (SAL) with defined phases.
     */
    public void setDatiSAL(final List<DatiSALType> datiSAL) {
        this.datiSAL = datiSAL;
    }

    public List<DatiDDTType> getDatiDDT() {
        return datiDDT;
    }

    /**
     * <b>Note:</b> To be valued only if there is a transport document (or, in cases where it is
     * still expected, an accompanying note) that certifies the transfer of the asset from the
     * assignor to the transferee and which must be reported in the deferred invoice
     */
    public void setDatiDDT(final List<DatiDDTType> datiDDT) {
        this.datiDDT = datiDDT;
    }

    public DatiTrasportoType getDatiTrasporto() {
        return datiTrasporto;
    }

    /**
     * <b>Note:</b> To be valued only if you want to give evidence of the data relating to the
     * transport of the transferred asset and the person who carried out the transport, in case of
     * deferred invoicing or invoice
     */
    public void setDatiTrasporto(final DatiTrasportoType datiTrasporto) {
        this.datiTrasporto = datiTrasporto;
    }

    public FatturaPrincipaleType getFatturaPrincipale() {
        return fatturaPrincipale;
    }

    /**
     * <b>Note:</b> To be valued only if there is a summary invoice for the accessory transactions
     * carried out in each calendar quarter by the hauliers on behalf of the same client pursuant
     * to art. 74, paragraph 4, Presidential Decree 633/72
     */
    public void setFatturaPrincipale(final FatturaPrincipaleType fatturaPrincipale) {
        this.fatturaPrincipale = fatturaPrincipale;
    }

}
