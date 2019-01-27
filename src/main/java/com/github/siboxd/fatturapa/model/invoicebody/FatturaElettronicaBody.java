package com.github.siboxd.fatturapa.model.invoicebody;

import com.github.siboxd.fatturapa.model.invoicebody.general.DatiGenerali;
import com.github.siboxd.fatturapa.model.invoicebody.payment.DatiPagamento;
import com.github.siboxd.fatturapa.model.invoicebody.products.DatiBeniServizi;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

import static com.github.siboxd.fatturapa.model.utils.Lists.defensiveCopy;


/**
 * This block - which constitutes the body of the invoice and represents its specific content -
 * must be present only once in the case of a single invoice, whereas in the case of a batch
 * of invoices the lot itself must be repeated for each invoice.
*/
@Root(name = "FatturaElettronicaBody")
public final class FatturaElettronicaBody {

    @Element(name = "DatiGenerali")
    private DatiGenerali datiGenerali;

    @Element(name = "DatiBeniServizi")
    private DatiBeniServizi datiBeniServizi;

    @Element(name = "DatiVeicoli", required = false)
    private DatiVeicoli datiVeicoli;

    @ElementList(name = "DatiPagamento", entry = "DatiPagamento", inline = true, required = false, empty = false)
    private List<DatiPagamento> datiPagamento;

    @ElementList(name = "Allegati", entry = "Allegati", inline = true, required = false, empty = false)
    private List<Allegati> allegati;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private FatturaElettronicaBody() {
    }

    private FatturaElettronicaBody(@NonNull final Builder builder) {
        datiGenerali = builder.datiGenerali;
        datiBeniServizi = builder.datiBeniServizi;
        datiVeicoli = builder.datiVeicoli;
        datiPagamento = builder.datiPagamento;
        allegati = builder.allegati;
    }

    @NonNull
    public DatiGenerali getDatiGenerali() {
        return datiGenerali;
    }

    @NonNull
    public DatiBeniServizi getDatiBeniServizi() {
        return datiBeniServizi;
    }

    @Nullable
    public DatiVeicoli getDatiVeicoli() {
        return datiVeicoli;
    }

    @NonNull
    public List<DatiPagamento> getDatiPagamento() {
        return datiPagamento;
    }

    @NonNull
    public List<Allegati> getAllegati() {
        return allegati;
    }

    /**
     * {@code FatturaElettronicaBody} builder static inner class.
     */
    public static final class Builder {
        private DatiGenerali datiGenerali;
        private DatiBeniServizi datiBeniServizi;
        private DatiVeicoli datiVeicoli;
        private List<DatiPagamento> datiPagamento;
        private List<Allegati> allegati;

        public Builder(@NonNull final DatiGenerali datiGenerali,
                       @NonNull final DatiBeniServizi datiBeniServizi) {
            this.datiGenerali = datiGenerali;
            this.datiBeniServizi = datiBeniServizi;
        }

        public Builder(@NonNull final FatturaElettronicaBody copy) {
            this(copy.getDatiGenerali(), copy.getDatiBeniServizi());
            this.datiVeicoli = copy.getDatiVeicoli();
            this.datiPagamento = copy.getDatiPagamento();
            this.allegati = copy.getAllegati();
        }

        public Builder datiGenerali(@NonNull final DatiGenerali datiGenerali) {
            this.datiGenerali = datiGenerali;
            return this;
        }

        public Builder datiBeniServizi(@NonNull final DatiBeniServizi datiBeniServizi) {
            this.datiBeniServizi = datiBeniServizi;
            return this;
        }

        public Builder datiVeicoli(@Nullable final DatiVeicoli datiVeicoli) {
            this.datiVeicoli = datiVeicoli;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the document relates to an intra-community supply of new
         * means of transport, pursuant to art. 38, paragraph 4, Decree Law 331/1993, converted with
         * amendments by Law 427/1993
         */
        public Builder datiPagamento(@Nullable final List<DatiPagamento> datiPagamento) {
            this.datiPagamento = datiPagamento;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if you want to provide information on the payment in terms
         * of conditions, methods and terms
         */
        public Builder allegati(@Nullable final List<Allegati> allegati) {
            this.allegati = allegati;
            return this;
        }

        /**
         * Returns a {@code FatturaElettronicaBody} built from the parameters previously set.
         *
         * @return a {@code FatturaElettronicaBody} built with parameters of this {@code FatturaElettronicaBody.Builder}
         */
        public FatturaElettronicaBody build() {
            this.datiPagamento = defensiveCopy(this.datiPagamento);
            this.allegati = defensiveCopy(this.allegati);
            return new FatturaElettronicaBody(this);
        }
    }

}
