package com.github.siboxd.fatturapa.model.invoicebody.products;

import com.github.siboxd.fatturapa.model.invoicebody.Natura;
import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;
import com.github.siboxd.fatturapa.model.invoicebody.ScontoMaggiorazione;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.Collections;
import java.util.List;

import static com.github.siboxd.fatturapa.model.utils.Lists.defensiveCopy;


/**
 * Denotes a detail line of the document
*/
@Root(name = "DettaglioLinee")
public final class DettaglioLinee {

    @Element(name = "NumeroLinea")
    private String numeroLinea;

    @Element(name = "TipoCessionePrestazione", required = false)
    private TipoCessionePrestazione tipoCessionePrestazione;

    @ElementList(name = "CodiceArticolo", entry = "CodiceArticolo", inline = true, required = false, empty = false)
    private List<CodiceArticolo> codiceArticolo;

    @Element(name = "Descrizione")
    private String descrizione;

    @Element(name = "Quantita", required = false)
    private String quantita;

    @Element(name = "UnitaMisura", required = false)
    private String unitaMisura;

    @Element(name = "DataInizioPeriodo", required = false)
    private String dataInizioPeriodo;

    @Element(name = "DataFinePeriodo", required = false)
    private String dataFinePeriodo;

    @Element(name = "PrezzoUnitario")
    private String prezzoUnitario;

    @ElementList(name = "ScontoMaggiorazione", entry = "ScontoMaggiorazione", inline = true, required = false, empty = false)
    private List<ScontoMaggiorazione> scontoMaggiorazione;

    @Element(name = "PrezzoTotale")
    private String prezzoTotale;

    @Element(name = "AliquotaIVA")
    private String aliquotaIVA;

    @Element(name = "Ritenuta", required = false)
    private Ritenuta ritenuta;

    @Element(name = "Natura", required = false)
    private Natura natura;

    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;

    @ElementList(name = "AltriDatiGestionali", entry = "AltriDatiGestionali", inline = true, required = false, empty = false)
    private List<AltriDatiGestionali> altriDatiGestionali;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DettaglioLinee() {
    }

    private DettaglioLinee(@NonNull final Builder builder) {
        numeroLinea = builder.numeroLinea;
        tipoCessionePrestazione = builder.tipoCessionePrestazione;
        codiceArticolo = builder.codiceArticolo;
        descrizione = builder.descrizione;
        quantita = builder.quantita;
        unitaMisura = builder.unitaMisura;
        dataInizioPeriodo = builder.dataInizioPeriodo;
        dataFinePeriodo = builder.dataFinePeriodo;
        prezzoUnitario = builder.prezzoUnitario;
        scontoMaggiorazione = builder.scontoMaggiorazione;
        prezzoTotale = builder.prezzoTotale;
        aliquotaIVA = builder.aliquotaIVA;
        ritenuta = builder.ritenuta;
        natura = builder.natura;
        riferimentoAmministrazione = builder.riferimentoAmministrazione;
        altriDatiGestionali = builder.altriDatiGestionali;
    }

    @NonNull
    public String getNumeroLinea() {
        return numeroLinea;
    }

    @Nullable
    public TipoCessionePrestazione getTipoCessionePrestazione() {
        return tipoCessionePrestazione;
    }

    @NonNull
    public List<CodiceArticolo> getCodiceArticolo() {
        return Collections.unmodifiableList(codiceArticolo);
    }

    @NonNull
    public String getDescrizione() {
        return descrizione;
    }

    @Nullable
    public String getQuantita() {
        return quantita;
    }

    @Nullable
    public String getUnitaMisura() {
        return unitaMisura;
    }

    @Nullable
    public String getDataInizioPeriodo() {
        return dataInizioPeriodo;
    }

    @Nullable
    public String getDataFinePeriodo() {
        return dataFinePeriodo;
    }

    @NonNull
    public String getPrezzoUnitario() {
        return prezzoUnitario;
    }

    @NonNull
    public List<ScontoMaggiorazione> getScontoMaggiorazione() {
        return Collections.unmodifiableList(scontoMaggiorazione);
    }

    @NonNull
    public String getPrezzoTotale() {
        return prezzoTotale;
    }

    @NonNull
    public String getAliquotaIVA() {
        return aliquotaIVA;
    }

    @Nullable
    public Ritenuta getRitenuta() {
        return ritenuta;
    }

    @Nullable
    public Natura getNatura() {
        return natura;
    }

    @Nullable
    public String getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    @NonNull
    public List<AltriDatiGestionali> getAltriDatiGestionali() {
        return Collections.unmodifiableList(altriDatiGestionali);
    }

    /**
     * {@code DettaglioLinee} builder static inner class.
     */
    public static final class Builder {
        private String numeroLinea;
        private TipoCessionePrestazione tipoCessionePrestazione;
        private List<CodiceArticolo> codiceArticolo;
        private String descrizione;
        private String quantita;
        private String unitaMisura;
        private String dataInizioPeriodo;
        private String dataFinePeriodo;
        private String prezzoUnitario;
        private List<ScontoMaggiorazione> scontoMaggiorazione;
        private String prezzoTotale;
        private String aliquotaIVA;
        private Ritenuta ritenuta;
        private Natura natura;
        private String riferimentoAmministrazione;
        private List<AltriDatiGestionali> altriDatiGestionali;

        /**
         * Requires non-optional fields
         *
         * @param numeroLinea    It is used to sort the detail rows (as well as reference for other fields)
         * @param descrizione    The field must contain the indication of the nature and quality of
         *                       the good/service object of the operation. It can also refer to a
         *                       previous document issued as an advance.
         * @param prezzoUnitario The field must contain the value of the unit price or the consideration
         *                       of the good/service.
         * @param prezzoTotale   It indicates the taxable amount represented by the base value of
         *                       the transaction, less any discounts and increased by any increase
         * @param aliquotaIVA    Indicates the value of the VAT rate (in percentage terms
         *                       eg. 22.00 not 0.22)
         */
        public Builder(@NonNull final String numeroLinea,
                       @NonNull final String descrizione,
                       @NonNull final String prezzoUnitario,
                       @NonNull final String prezzoTotale,
                       @NonNull final String aliquotaIVA) {
            // TODO: 27/01/2019 remove prezzoTotoale when will be calculated internally
            this.numeroLinea = numeroLinea;
            this.descrizione = descrizione;
            this.prezzoUnitario = prezzoUnitario;
            this.prezzoTotale = prezzoTotale;
            this.aliquotaIVA = aliquotaIVA;
        }

        public Builder(@NonNull final DettaglioLinee copy) {
            this(copy.getNumeroLinea(), copy.getDescrizione(), copy.getPrezzoUnitario(),
                    copy.getPrezzoTotale(), copy.getAliquotaIVA());

            this.tipoCessionePrestazione = copy.getTipoCessionePrestazione();
            this.codiceArticolo = copy.getCodiceArticolo();
            this.quantita = copy.getQuantita();
            this.unitaMisura = copy.getUnitaMisura();
            this.dataInizioPeriodo = copy.getDataInizioPeriodo();
            this.dataFinePeriodo = copy.getDataFinePeriodo();
            this.scontoMaggiorazione = copy.getScontoMaggiorazione();
            this.ritenuta = copy.getRitenuta();
            this.natura = copy.getNatura();
            this.riferimentoAmministrazione = copy.getRiferimentoAmministrazione();
            this.altriDatiGestionali = copy.getAltriDatiGestionali();
        }

        /**
         * It is used to sort the detail rows (as well as reference for other fields in the plot).
         *
         * @param numeroLinea The field must contain a numeric value starting from 1.
         */
        public Builder numeroLinea(@NonNull final String numeroLinea) {
            this.numeroLinea = numeroLinea;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the line that is being valued is related to a discount,
         * premium or discount, or ancillary expense.
         */

        public Builder tipoCessionePrestazione(@Nullable final TipoCessionePrestazione tipoCessionePrestazione) {
            this.tipoCessionePrestazione = tipoCessionePrestazione;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if you want to highlight the fact that the article described
         * in the detail line is among those coded according to known types of coding
         * (eg CPV, EAN, TARIC ...)
         */
        public Builder codiceArticolo(@Nullable final List<CodiceArticolo> codiceArticolo) {
            this.codiceArticolo = codiceArticolo;
            return this;
        }

        /**
         * This is required by law (Article 21, paragraph 2, letter b of Presidential Decree 633/1972).
         *
         * @param descrizione The field must contain the indication of the nature and quality of
         *                    the good/service object of the operation. It can also refer to a
         *                    previous document issued as an advance.
         */
        public Builder descrizione(@NonNull final String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the good/service is objectively quantifiable.
         *
         * @param quantita The field must contain a quantitative value, expressed according to the unit
         *                 of measure indicated in the UnitaMisura field, composed of an integer and
         *                 decimals ranging from a minimum of two to a maximum of eight digits.
         *                 The decimals, separated by the whole with the dot character ("."),
         *                 Must always be indicated even if zero (eg: 25.00).
         */
        public Builder quantita(@Nullable final String quantita) {
            this.quantita = quantita;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if a quantity has been indicated.
         *
         * @param unitaMisura The field must contain the unit on which the quantification is expressed
         */
        public Builder unitaMisura(@Nullable final String unitaMisura) {
            this.unitaMisura = unitaMisura;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the detail line refers to a service whose provision is
         * temporal and distinct for periods.
         *
         * @param dataInizioPeriodo The field must contain the reference period start date in
         *                          YYYY-MM-DD format (ISO 8601: 2004 standard).
         */
        public Builder dataInizioPeriodo(@Nullable final String dataInizioPeriodo) {
            this.dataInizioPeriodo = dataInizioPeriodo;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the detail line refers to a service whose provision is
         * temporal and distinct for periods.
         *
         * @param dataFinePeriodo The field must contain the reference period start date in
         *                        YYYY-MM-DD format (ISO 8601: 2004 standard).
         */
        public Builder dataFinePeriodo(@Nullable final String dataFinePeriodo) {
            this.dataFinePeriodo = dataFinePeriodo;
            return this;
        }

        /**
         * @param prezzoUnitario The field must contain the value of the unit price or the consideration
         *                       of the good/service. The value is represented by an integer and by
         *                       decimals ranging from a minimum of two to a maximum of eight digits.
         *                       The decimals, separated by the whole with the dot character ("."),
         *                       Must always be indicated even if zero (ex .: 175.00). In the case in which the value must be expressed in negative form (for example in the case in which it represents an advance or an advance), it must be preceded by the minus sign ("-").
         */
        public Builder prezzoUnitario(@NonNull final String prezzoUnitario) {
            this.prezzoUnitario = prezzoUnitario;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the seller applies surcharges or discounts on the price
         * agreed for the good/service of the detail line.
         */
        public Builder scontoMaggiorazione(@Nullable final List<ScontoMaggiorazione> scontoMaggiorazione) {
            this.scontoMaggiorazione = scontoMaggiorazione;
            return this;
        }

        /**
         * It indicates the taxable amount represented by the base value of the transaction,
         * less any discounts and increased by any increase (Article 21, paragraph 2, letter c
         * of Presidential Decree 633/1972).
         *
         * @param prezzoTotale The field must contain the value of the total price (discounted/increased)
         *                     of the good / service. The system checks that this value corresponds to
         *                     the product of the Unit Price, decreased/increased by any discounts /
         *                     surcharges, for the quantity if present (for further details on the
         *                     calculation algorithm, see the Checklist version 1.4 file on the
         *                     www.fatturapa website. gov.it). <br><br>
         *                     The value is represented by an integer and by decimals ranging from a
         *                     minimum of two to a maximum of eight digits. The decimals, separated by
         *                     the whole with the dot character ("."), Must always be indicated even
         *                     if zero (eg: 1540.00).
         */
        public Builder prezzoTotale(@NonNull final String prezzoTotale) {
            // TODO: 20/01/2019 Calculated fields all over those classes should not be exposed as setters!
            this.prezzoTotale = prezzoTotale; // TODO: 27/01/2019 calculate calculated fields
            return this;
        }

        /**
         * Indicates the value of the VAT rate (in percentage terms) to be applied to the taxable base
         * for determining the tax (Article 21, paragraph 2, letter c of Presidential Decree 633/1972).
         *
         * @param aliquotaIVA It assumes the values foreseen by the fiscal legislation.
         *                    The decimals, separated by the whole with the dot character ("."),
         *                    Must always be indicated even if zero (eg: 4.00); in the case of
         *                    non-applicability of the tax the field must be valued with zero (0.00).
         *                    The system verifies that the field is expressed in percentage terms (eg 22.00 and not 0.22).
         */
        public Builder aliquotaIVA(@NonNull final String aliquotaIVA) {
            this.aliquotaIVA = aliquotaIVA;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the transaction is subject to withholding
         */
        public Builder ritenuta(@Nullable final Ritenuta ritenuta) {
            this.ritenuta = ritenuta;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the transaction is not included in the taxable "taxable"
         * transactions or in cases of reverse charge.
         */
        public Builder natura(@Nullable final Natura natura) {
            this.natura = natura;
            return this;
        }

        /**
         * It serves to indicate any reference deemed useful for the recipient of the document for
         * administrative-accounting-management purposes in order to facilitate the automatic processing
         * of the invoice by the recipient (think for example, in the chapter of expenditure,
         * in the income statement, ...)
         *
         * @param riferimentoAmministrazione No particular criteria are established;
         *                                   <p>
         *                                   the modality of valorization of the field, with a view to
         *                                   use such as the one outlined above, is necessarily the result
         *                                   of an agreement between the parties
         */
        public Builder riferimentoAmministrazione(@Nullable final String riferimentoAmministrazione) {
            this.riferimentoAmministrazione = riferimentoAmministrazione;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if you want to give evidence of additional information that the recipient
         * has requested to include in the document, to refer to each individual detail line of the
         * document itself, having managerial or other usefulness
         */
        public Builder altriDatiGestionali(@Nullable final List<AltriDatiGestionali> altriDatiGestionali) {
            this.altriDatiGestionali = altriDatiGestionali;
            return this;
        }

        /**
         * Returns a {@code DettaglioLinee} built from the parameters previously set.
         *
         * @return a {@code DettaglioLinee} built with parameters of this {@code DettaglioLinee.Builder}
         */
        public DettaglioLinee build() {
            this.codiceArticolo = defensiveCopy(this.codiceArticolo);
            this.scontoMaggiorazione = defensiveCopy(this.scontoMaggiorazione);
            this.altriDatiGestionali = defensiveCopy(this.altriDatiGestionali);
            return new DettaglioLinee(this);
        }
    }

}
