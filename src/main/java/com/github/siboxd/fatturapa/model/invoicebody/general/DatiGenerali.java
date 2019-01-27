package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.Collections;
import java.util.List;

import static com.github.siboxd.fatturapa.model.utils.Lists.defensiveCopy;


/**
 * This block contains the general data of the invoice document and related documents.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiGenerali")
public final class DatiGenerali {

    @Element(name = "DatiGeneraliDocumento")
    private DatiGeneraliDocumento datiGeneraliDocumento;

    @ElementList(name = "DatiOrdineAcquisto", entry = "DatiOrdineAcquisto", inline = true, required = false, empty = false)
    private List<DatiDocumentiCorrelati> datiOrdineAcquisto;

    @ElementList(name = "DatiContratto", entry = "DatiContratto", inline = true, required = false, empty = false)
    private List<DatiDocumentiCorrelati> datiContratto;

    @ElementList(name = "DatiConvenzione", entry = "DatiConvenzione", inline = true, required = false, empty = false)
    private List<DatiDocumentiCorrelati> datiConvenzione;

    @ElementList(name = "DatiRicezione", entry = "DatiRicezione", inline = true, required = false, empty = false)
    private List<DatiDocumentiCorrelati> datiRicezione;

    @ElementList(name = "DatiFattureCollegate", entry = "DatiFattureCollegate", inline = true, required = false, empty = false)
    private List<DatiDocumentiCorrelati> datiFattureCollegate;

    @ElementList(name = "DatiSAL", entry = "DatiSAL", inline = true, required = false, empty = false)
    private List<DatiSAL> datiSAL;

    @ElementList(name = "DatiDDT", entry = "DatiDDT", inline = true, required = false, empty = false)
    private List<DatiDDT> datiDDT;

    @Element(name = "DatiTrasporto", required = false)
    private DatiTrasporto datiTrasporto;

    @Element(name = "FatturaPrincipale", required = false)
    private FatturaPrincipale fatturaPrincipale;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiGenerali() {
    }

    private DatiGenerali(@NonNull final Builder builder) {
        datiGeneraliDocumento = builder.datiGeneraliDocumento;
        datiOrdineAcquisto = builder.datiOrdineAcquisto;
        datiContratto = builder.datiContratto;
        datiConvenzione = builder.datiConvenzione;
        datiRicezione = builder.datiRicezione;
        datiFattureCollegate = builder.datiFattureCollegate;
        datiSAL = builder.datiSAL;
        datiDDT = builder.datiDDT;
        datiTrasporto = builder.datiTrasporto;
        fatturaPrincipale = builder.fatturaPrincipale;
    }

    @NonNull
    public DatiGeneraliDocumento getDatiGeneraliDocumento() {
        return datiGeneraliDocumento;
    }

    @NonNull
    public List<DatiDocumentiCorrelati> getDatiOrdineAcquisto() {
        return Collections.unmodifiableList(datiOrdineAcquisto);
    }

    @NonNull
    public List<DatiDocumentiCorrelati> getDatiContratto() {
        return Collections.unmodifiableList(datiContratto);
    }

    @NonNull
    public List<DatiDocumentiCorrelati> getDatiConvenzione() {
        return Collections.unmodifiableList(datiConvenzione);
    }

    @NonNull
    public List<DatiDocumentiCorrelati> getDatiRicezione() {
        return Collections.unmodifiableList(datiRicezione);
    }

    @NonNull
    public List<DatiDocumentiCorrelati> getDatiFattureCollegate() {
        return Collections.unmodifiableList(datiFattureCollegate);
    }

    @NonNull
    public List<DatiSAL> getDatiSAL() {
        return Collections.unmodifiableList(datiSAL);
    }

    @NonNull
    public List<DatiDDT> getDatiDDT() {
        return Collections.unmodifiableList(datiDDT);
    }

    @Nullable
    public DatiTrasporto getDatiTrasporto() {
        return datiTrasporto;
    }

    @Nullable
    public FatturaPrincipale getFatturaPrincipale() {
        return fatturaPrincipale;
    }

    /**
     * {@code DatiGenerali} builder static inner class.
     */
    public static final class Builder {
        private DatiGeneraliDocumento datiGeneraliDocumento;
        private List<DatiDocumentiCorrelati> datiOrdineAcquisto;
        private List<DatiDocumentiCorrelati> datiContratto;
        private List<DatiDocumentiCorrelati> datiConvenzione;
        private List<DatiDocumentiCorrelati> datiRicezione;
        private List<DatiDocumentiCorrelati> datiFattureCollegate;
        private List<DatiSAL> datiSAL;
        private List<DatiDDT> datiDDT;
        private DatiTrasporto datiTrasporto;
        private FatturaPrincipale fatturaPrincipale;

        public Builder(@NonNull final DatiGeneraliDocumento datiGeneraliDocumento) {
            this.datiGeneraliDocumento = datiGeneraliDocumento;
        }

        public Builder(@NonNull final DatiGenerali copy) {
            this(copy.getDatiGeneraliDocumento());
            this.datiOrdineAcquisto = copy.getDatiOrdineAcquisto();
            this.datiContratto = copy.getDatiContratto();
            this.datiConvenzione = copy.getDatiConvenzione();
            this.datiRicezione = copy.getDatiRicezione();
            this.datiFattureCollegate = copy.getDatiFattureCollegate();
            this.datiSAL = copy.getDatiSAL();
            this.datiDDT = copy.getDatiDDT();
            this.datiTrasporto = copy.getDatiTrasporto();
            this.fatturaPrincipale = copy.getFatturaPrincipale();
        }

        public Builder datiGeneraliDocumento(@NonNull final DatiGeneraliDocumento datiGeneraliDocumento) {
            this.datiGeneraliDocumento = datiGeneraliDocumento;
            return this;
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
        public Builder datiOrdineAcquisto(@Nullable final List<DatiDocumentiCorrelati> datiOrdineAcquisto) {
            this.datiOrdineAcquisto = datiOrdineAcquisto;
            return this;
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
        public Builder datiContratto(@Nullable final List<DatiDocumentiCorrelati> datiContratto) {
            this.datiContratto = datiContratto;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if you want to show the fact that the document (invoice or
         * similar) is issued for a supply / service regulated by an agreement
         * <br><br>
         * The valuation usually takes place at the request of the transferee / client who needs to
         * 'bind' the invoice to the agreement.
         */
        public Builder datiConvenzione(@Nullable final List<DatiDocumentiCorrelati> datiConvenzione) {
            this.datiConvenzione = datiConvenzione;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if you want to give evidence of the fact that the document
         * (invoice or similar) is issued against a supply for which the recipient has provided for a
         * receipt procedure, identified and registered on their information systems.
         * <br><br>
         * Valuation usually takes place at the request of the transferee / buyer who needs to
         * 'bind' the invoice upon receipt.
         */
        public Builder datiRicezione(@Nullable final List<DatiDocumentiCorrelati> datiRicezione) {
            this.datiRicezione = datiRicezione;
            return this;
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
        public Builder datiFattureCollegate(@Nullable final List<DatiDocumentiCorrelati> datiFattureCollegate) {
            this.datiFattureCollegate = datiFattureCollegate;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the document is in the case of billing methods in progress
         * (SAL -> Stato Avanzamento Lavori) with defined phases.
         */
        public Builder datiSAL(@Nullable final List<DatiSAL> datiSAL) {
            this.datiSAL = datiSAL;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if there is a transport document (or, in cases where it is
         * still expected, an accompanying note) that certifies the transfer of the asset from the
         * assignor to the transferee and which must be reported in the deferred invoice
         */
        public Builder datiDDT(@Nullable final List<DatiDDT> datiDDT) {
            this.datiDDT = datiDDT;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if you want to give evidence of the data relating to the
         * transport of the transferred asset and the person who carried out the transport, in case of
         * deferred invoicing or invoice
         */
        public Builder datiTrasporto(@Nullable final DatiTrasporto datiTrasporto) {
            this.datiTrasporto = datiTrasporto;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if there is a summary invoice for the accessory transactions
         * carried out in each calendar quarter by the hauliers on behalf of the same client pursuant
         * to art. 74, paragraph 4, Presidential Decree 633/72
         */
        public Builder fatturaPrincipale(@Nullable final FatturaPrincipale fatturaPrincipale) {
            this.fatturaPrincipale = fatturaPrincipale;
            return this;
        }

        /**
         * Returns a {@code DatiGenerali} built from the parameters previously set.
         *
         * @return a {@code DatiGenerali} built with parameters of this {@code DatiGenerali.Builder}
         */
        public DatiGenerali build() {
            this.datiOrdineAcquisto = defensiveCopy(this.datiOrdineAcquisto);
            this.datiContratto = defensiveCopy(this.datiContratto);
            this.datiConvenzione = defensiveCopy(this.datiConvenzione);
            this.datiRicezione = defensiveCopy(this.datiRicezione);
            this.datiFattureCollegate = defensiveCopy(this.datiFattureCollegate);
            this.datiSAL = defensiveCopy(this.datiSAL);
            this.datiDDT = defensiveCopy(this.datiDDT);
            return new DatiGenerali(this);
        }
    }

}
