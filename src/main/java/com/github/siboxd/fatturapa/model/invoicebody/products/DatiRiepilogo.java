package com.github.siboxd.fatturapa.model.invoicebody.products;

import com.github.siboxd.fatturapa.model.invoicebody.Natura;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This block of data represents a summary of the invoice information for each rate and/or nature
 * present in the detail rows of the document. In the case of the same VAT rate, different methods
 * of payment of the tax depend on the application of the split of payments
 */
@Root(name = "DatiRiepilogo")
public final class DatiRiepilogo {

    @Element(name = "AliquotaIVA")
    private String aliquotaIVA;

    @Element(name = "Natura", required = false)
    private Natura natura;

    @Element(name = "SpeseAccessorie", required = false)
    private String speseAccessorie;

    @Element(name = "Arrotondamento", required = false)
    private String arrotondamento;

    @Element(name = "ImponibileImporto")
    private String imponibileImporto;

    @Element(name = "Imposta")
    private String imposta;

    @Element(name = "EsigibilitaIVA", required = false)
    private EsigibilitaIVA esigibilitaIVA;

    @Element(name = "RiferimentoNormativo", required = false)
    private String riferimentoNormativo;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiRiepilogo() {
    }

    private DatiRiepilogo(@NonNull final Builder builder) {
        aliquotaIVA = builder.aliquotaIVA;
        natura = builder.natura;
        speseAccessorie = builder.speseAccessorie;
        arrotondamento = builder.arrotondamento;
        imponibileImporto = builder.imponibileImporto;
        imposta = builder.imposta;
        esigibilitaIVA = builder.esigibilitaIVA;
        riferimentoNormativo = builder.riferimentoNormativo;
    }

    @NonNull
    public String getAliquotaIVA() {
        return aliquotaIVA;
    }

    @Nullable
    public Natura getNatura() {
        return natura;
    }

    @Nullable
    public String getSpeseAccessorie() {
        return speseAccessorie;
    }

    @Nullable
    public String getArrotondamento() {
        return arrotondamento;
    }

    @NonNull
    public String getImponibileImporto() {
        return imponibileImporto;
    }

    @NonNull
    public String getImposta() {
        return imposta;
    }

    @Nullable
    public EsigibilitaIVA getEsigibilitaIVA() {
        return esigibilitaIVA;
    }

    @Nullable
    public String getRiferimentoNormativo() {
        return riferimentoNormativo;
    }

    /**
     * {@code DatiRiepilogo} builder static inner class.
     */
    public static final class Builder {
        private String aliquotaIVA;
        private Natura natura;
        private String speseAccessorie;
        private String arrotondamento;
        private String imponibileImporto;
        private String imposta;
        private EsigibilitaIVA esigibilitaIVA;
        private String riferimentoNormativo;

        /**
         * Requires non-optional fields
         *
         * @param aliquotaIVA       The VAT rate as per tax legislation
         * @param imponibileImporto It represents the value of the tax base, in the case of
         *                          transactions subject to tax (VAT rate field different from 0.00),
         *                          or otherwise (Natura field set) the amount of the transaction
         * @param imposta           The value corresponding to the application of the VAT rate on
         *                          the relevant taxable income
         */
        public Builder(@NonNull final String aliquotaIVA,
                       @NonNull final String imponibileImporto,
                       @NonNull final String imposta) {
            this.aliquotaIVA = aliquotaIVA;
            this.imponibileImporto = imponibileImporto;
            this.imposta = imposta;
        }

        public Builder(@NonNull final DatiRiepilogo copy) {
            this(copy.getAliquotaIVA(), copy.getImponibileImporto(), copy.getImposta());
            this.natura = copy.getNatura();
            this.speseAccessorie = copy.getSpeseAccessorie();
            this.arrotondamento = copy.getArrotondamento();
            this.esigibilitaIVA = copy.getEsigibilitaIVA();
            this.riferimentoNormativo = copy.getRiferimentoNormativo();
        }

        /**
         * It is used to indicate to which VAT rate refer the data indicated in the other fields of these
         * data, including the zero rate (Article 21, paragraph 2, letter and of Presidential Decree 633/1972).
         *
         * @param aliquotaIVA It must contain a VAT rate value that is not different from those in the
         *                    VAT Rate field of the detail rows. Specifically, it assumes the values
         *                    required by tax legislation. The decimals, separated by the whole with
         *                    the dot character ("."), Must always be indicated even if zero (eg 22.00);
         *                    in the case of non-applicability of the tax the field must be valued with
         *                    "0.00". The system verifies that the valuation is in percentage terms
         *                    (eg 22.00 and not 0.22).
         */
        public Builder aliquotaIVA(@NonNull final String aliquotaIVA) {
            this.aliquotaIVA = aliquotaIVA;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if among the lines of detail there is at least one that has
         * the field Natura set.<br><br>
         * If present, the previous AliquotaIVA field must be "0.00". If valued with "N6" (reverse charge),
         * the field of EnigibilitaIVA can not be set to "S"
         */
        public Builder natura(@Nullable final Natura natura) {
            this.natura = natura; // TODO: 20/01/2019 add checks
            return this;
        }


        /**
         * It serves to highlight the part of the tax base attributable to ancillary operations
         * (Article 12 of Presidential Decree 633/1972).
         *
         * @param speseAccessorie The field must contain a numeric value consisting of an integer and
         *                        two decimal places. The decimals, separated by the whole with the dot
         *                        character ("."), Must always be indicated as zero (eg: 40.00).
         */
        public Builder speseAccessorie(@Nullable final String speseAccessorie) {
            this.speseAccessorie = speseAccessorie;
            return this;
        }

        /**
         * It serves to highlight the possible rounding made in the transition from a value with more
         * than two decimal places (the one deriving from the sum of the values of the PrezzoTotale field
         * of each line of detail united by the same VAT rate or by the same nature) to a value with two
         * only decimal digits (that of the ImportoImponibile field). The value of rounding must be
         * indicated in the field and not the value of the Rounded Amount.
         *
         * @param arrotondamento The field must contain a numeric value represented by an integer and a
         *                       maximum of eight decimal places. In case of rounding down, it is
         *                       preceded by a minus sign ("-")
         */
        public Builder arrotondamento(@Nullable final String arrotondamento) {
            this.arrotondamento = arrotondamento;
            return this;
        }

        /**
         * It represents the value of the tax base, in the case of transactions subject to tax
         * (VAT rate field different from 0.00), or otherwise (Natura field set) the amount of the
         * transaction (Article 21, paragraph 2, letter and of the Presidential Decree 633/1972)
         *
         * @param imponibileImporto The field must contain a numeric value consisting of an integer and
         *                          two decimal places. The decimals, separated by the whole with the
         *                          dot character ("."), Must always be indicated even if zero
         *                          (eg: 2585.00). On this value the system carries out a check to
         *                          verify the correctness of the calculation; for details on the
         *                          calculation algorithm, see the Checklist version 1.4 file on the
         *                          website www.fatturapa.gov.it.
         */
        public Builder imponibileImporto(@NonNull final String imponibileImporto) {
            this.imponibileImporto = imponibileImporto;
            return this;
        }

        /**
         * Indicates the value of VAT, corresponding to the application of the VAT rate on the relevant
         * taxable income (Article 21, paragraph 2, letter and of Presidential Decree 633/1972).
         *
         * @param imposta The field must contain a numeric value consisting of an integer and two decimal
         *                places. The decimals, separated by the whole with the dot character ("."),
         *                Must always be indicated even if zero (eg: 255.00). The system checks that
         *                the value corresponds to the result of the product between Tax Rate and
         *                Taxable Amount, divided by 100; therefore it is equal to 0.00 in cases where
         *                the Nature field is valued.
         */
        public Builder imposta(@NonNull final String imposta) {
            this.imposta = imposta; // TODO: 20/01/2019 implement these automatic checks
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if it is a taxable transaction.
         * <br><br>
         * If valued with "S", the Natura field can not be "N6"
         */
        public Builder esigibilitaIVA(@Nullable final EsigibilitaIVA esigibilitaIVA) {
            this.esigibilitaIVA = esigibilitaIVA;
            return this;
        }

        /**
         * Indicates the normative reason that excludes this operation from the application of the tax
         * (Article 21, paragraph 6 of Presidential Decree 633/1972).
         * <br><br>
         * <b>Note:</b> To be valued only if the Nature field is valued and therefore in the case of
         * transactions that do not fall between the taxable ones or in cases of inversion of accounts.
         *
         * @param riferimentoNormativo no particular criteria is established
         */
        public Builder riferimentoNormativo(@Nullable final String riferimentoNormativo) {
            this.riferimentoNormativo = riferimentoNormativo;
            return this;
        }

        /**
         * Returns a {@code DatiRiepilogo} built from the parameters previously set.
         *
         * @return a {@code DatiRiepilogo} built with parameters of this {@code DatiRiepilogo.Builder}
         */
        public DatiRiepilogo build() {
            return new DatiRiepilogo(this);
        }
    }

}
