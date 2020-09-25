package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicebody.ScontoMaggiorazione;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.Collections;
import java.util.List;

import static com.github.siboxd.fatturapa.model.utils.Lists.defensiveCopy;


/**
 * This block contains the general data of the invoice document.
 */
@Root(name = "DatiGeneraliDocumento")
@Order(elements = {"TipoDocumento", "Divisa", "Data", "Numero", "DatiRitenuta", "DatiBollo",
        "DatiCassaPrevidenziale", "ScontoMaggiorazione", "ImportoTotaleDocumento", "Arrotondamento",
        "Causale", "Art73"})
public final class DatiGeneraliDocumento {

    @Element(name = "TipoDocumento")
    private TipoDocumento tipoDocumento;

    @Element(name = "Divisa")
    private String divisa;

    @Element(name = "Data")
    private String data;

    @Element(name = "Numero")
    private String numero;

    @ElementList(name = "DatiRitenuta", entry = "DatiRitenuta", inline = true, required = false, empty = false)
    private List<DatiRitenuta> datiRitenuta;

    @Element(name = "DatiBollo", required = false)
    private DatiBollo datiBollo;

    @ElementList(name = "DatiCassaPrevidenziale", entry = "DatiCassaPrevidenziale", inline = true, required = false, empty = false)
    private List<DatiCassaPrevidenziale> datiCassaPrevidenziale;

    @ElementList(name = "ScontoMaggiorazione", entry = "ScontoMaggiorazione", inline = true, required = false, empty = false)
    private List<ScontoMaggiorazione> scontoMaggiorazione;

    @Element(name = "ImportoTotaleDocumento", required = false)
    private String importoTotaleDocumento;

    @Element(name = "Arrotondamento", required = false)
    private String arrotondamento;

    @ElementList(name = "Causale", entry = "Causale", inline = true, required = false, empty = false)
    private List<String> causale;

    @Element(name = "Art73", required = false)
    private Art73 art73;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiGeneraliDocumento() {
    }

    private DatiGeneraliDocumento(@NonNull final Builder builder) {
        tipoDocumento = builder.tipoDocumento;
        divisa = builder.divisa;
        data = builder.data;
        numero = builder.numero;
        datiRitenuta = builder.datiRitenuta;
        datiBollo = builder.datiBollo;
        datiCassaPrevidenziale = builder.datiCassaPrevidenziale;
        scontoMaggiorazione = builder.scontoMaggiorazione;
        importoTotaleDocumento = builder.importoTotaleDocumento;
        arrotondamento = builder.arrotondamento;
        causale = builder.causale;
        art73 = builder.art73;
    }

    @NonNull
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    @NonNull
    public String getDivisa() {
        return divisa;
    }

    @NonNull
    public String getData() {
        return data;
    }

    @NonNull
    public String getNumero() {
        return numero;
    }

    @NonNull
    public List<DatiRitenuta> getDatiRitenuta() {
        return Collections.unmodifiableList(datiRitenuta);
    }

    @Nullable
    public DatiBollo getDatiBollo() {
        return datiBollo;
    }

    @NonNull
    public List<DatiCassaPrevidenziale> getDatiCassaPrevidenziale() {
        return Collections.unmodifiableList(datiCassaPrevidenziale);
    }

    @NonNull
    public List<ScontoMaggiorazione> getScontoMaggiorazione() {
        return Collections.unmodifiableList(scontoMaggiorazione);
    }

    @Nullable
    public String getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    @Nullable
    public String getArrotondamento() {
        return arrotondamento;
    }

    @NonNull
    public List<String> getCausale() {
        return Collections.unmodifiableList(causale);
    }

    @Nullable
    public Art73 getArt73() {
        return art73;
    }

    /**
     * {@code DatiGeneraliDocumento} builder static inner class.
     */
    public static final class Builder {
        private TipoDocumento tipoDocumento;
        private String divisa;
        private String data;
        private String numero;
        private List<DatiRitenuta> datiRitenuta;
        private DatiBollo datiBollo;
        private List<DatiCassaPrevidenziale> datiCassaPrevidenziale;
        private List<ScontoMaggiorazione> scontoMaggiorazione;
        private String importoTotaleDocumento;
        private String arrotondamento;
        private List<String> causale;
        private Art73 art73;

        /**
         * Requires non-optional fields
         *
         * @param tipoDocumento the document type
         * @param divisa        this identifies the currency, according to <em>ISO 4217 alpha-3: 2001</em>
         * @param data          the date of issue of the document
         * @param numero        the document number
         */
        public Builder(@NonNull final TipoDocumento tipoDocumento,
                       @NonNull final String divisa,
                       @NonNull final String data,
                       @NonNull final String numero) {
            this.tipoDocumento = tipoDocumento;
            this.divisa = divisa;
            this.data = data;
            this.numero = numero;
        }

        public Builder(@NonNull final DatiGeneraliDocumento copy) {
            this(copy.getTipoDocumento(), copy.getDivisa(), copy.getData(), copy.getNumero());
            this.datiRitenuta = copy.getDatiRitenuta();
            this.datiBollo = copy.getDatiBollo();
            this.datiCassaPrevidenziale = copy.getDatiCassaPrevidenziale();
            this.scontoMaggiorazione = copy.getScontoMaggiorazione();
            this.importoTotaleDocumento = copy.getImportoTotaleDocumento();
            this.arrotondamento = copy.getArrotondamento();
            this.causale = copy.getCausale();
            this.art73 = copy.getArt73();
        }

        public Builder tipoDocumento(@NonNull final TipoDocumento tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
            return this;
        }

        /**
         * It is used to identify the account currency.
         *
         * @param divisa The field must contain the currency code used, according to
         *               <em>ISO 4217 alpha-3: 2001</em> (eg "EUR" in the case of euros).
         */
        public Builder divisa(@NonNull final String divisa) {
            this.divisa = divisa; // TODO: 20/01/2019 can be made checks??
            return this;
        }

        /**
         * It is a data required by the legislation and identifies the date of issue of the document.
         *
         * @param data The field contains the date of issue of the document in the format YYYY-MM-DD
         *             (ISO 8601: 2004 standard).
         */
        public Builder data(@NonNull final String data) {
            this.data = data; // TODO: 20/01/2019 add checks
            return this;
        }

        /**
         * @param numero The field contains the document number and allows entry of alphanumeric values.
         *               It must contain at least one numeric value (0-9).
         */
        public Builder numero(@NonNull final String numero) {
            this.numero = numero; // TODO: 20/01/2019 add checks
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the seller is subject to withholding tax or on a permanent basis
         */
        public Builder datiRitenuta(@Nullable final List<DatiRitenuta> datiRitenuta) {
            this.datiRitenuta = datiRitenuta;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the stamp duty is required on the type of document/transaction.
         */
        public Builder datiBollo(@Nullable final DatiBollo datiBollo) {
            this.datiBollo = datiBollo;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the seller is a party required to pay the social security
         * contribution to their category cash desk or to the INPS (National Social Security Institute)
         * (or both)
         */
        public Builder datiCassaPrevidenziale(@Nullable final List<DatiCassaPrevidenziale> datiCassaPrevidenziale) {
            this.datiCassaPrevidenziale = datiCassaPrevidenziale;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if you want to give evidence of the fact that on the total
         * amount of the document is applied by the seller a discount or a surcharge.
         */
        public Builder scontoMaggiorazione(@Nullable final List<ScontoMaggiorazione> scontoMaggiorazione) {
            this.scontoMaggiorazione = scontoMaggiorazione;
            return this;
        }

        /**
         * It is used to show the total amount of the document, less any discount or increase of any
         * increase and including the tax payable to the buyer.
         *
         * @param importoTotaleDocumento The field contains a numeric value consisting of an integer
         *                               and two decimal places. The decimals, separated by the whole
         *                               with the dot character ("."), Must always be indicated even
         *                               if zero (eg: 2500.00).
         */
        public Builder importoTotaleDocumento(@Nullable final String importoTotaleDocumento) {
            this.importoTotaleDocumento = importoTotaleDocumento;
            return this;
        }

        /**
         * It serves to highlight the eventual rounding applied to the total amount of the document.
         * The value of rounding must be indicated in the field and not the value of the total amount rounded.
         *
         * @param arrotondamento The field contains a numeric value consisting of an integer and two
         *                       decimal places. The decimals, separated by the whole with the dot
         *                       character ("."), Must always be indicated even if zero (eg: 1.00).
         *                       <br><br>
         *                       <em>In case of rounding down, it is preceded by the minus sign ("-")</em>.
         */
        public Builder arrotondamento(@Nullable final String arrotondamento) {
            this.arrotondamento = arrotondamento;
            return this;
        }

        /**
         * It is used to indicate the reason for the document
         *
         * @param causale No particular criteria are established; the modality of valorization of the
         *                field, foreseen to contain a description in alphanumeric format
         */
        public Builder causale(@Nullable final List<String> causale) {
            this.causale = causale;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the document has been issued in accordance with the terms
         * and conditions established by ministerial decree pursuant to article 73 of Presidential Decree
         * 633/72;<br>
         * <p>
         * This allows the seller to issue several documents having the same number in the same year.
         * <br><br>
         * If evaluated, the check is carried out not with reference to the year only contained in
         * the date field, but with reference to the entire date (day, month and year).
         */
        public Builder art73(@Nullable final Art73 art73) {
            this.art73 = art73;
            return this;
        }

        /**
         * Returns a {@code DatiGeneraliDocumento} built from the parameters previously set.
         *
         * @return a {@code DatiGeneraliDocumento} built with parameters of this {@code DatiGeneraliDocumento.Builder}
         */
        public DatiGeneraliDocumento build() {
            this.datiCassaPrevidenziale = defensiveCopy(this.datiCassaPrevidenziale);
            this.scontoMaggiorazione = defensiveCopy(this.scontoMaggiorazione);
            this.causale = defensiveCopy(this.causale);
            return new DatiGeneraliDocumento(this);
        }
    }

}
