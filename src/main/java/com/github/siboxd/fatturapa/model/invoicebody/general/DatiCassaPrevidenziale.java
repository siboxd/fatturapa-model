package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicebody.Natura;
import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Describes the social security contribution to be paid
 */
@Root(name = "DatiCassaPrevidenziale")
public final class DatiCassaPrevidenziale {

    @Element(name = "TipoCassa")
    private TipoCassa tipoCassa;

    @Element(name = "AlCassa")
    private String alCassa;

    @Element(name = "ImportoContributoCassa")
    private String importoContributoCassa;

    @Element(name = "ImponibileCassa", required = false)
    private String imponibileCassa;

    @Element(name = "AliquotaIVA")
    private String aliquotaIVA;

    @Element(name = "Ritenuta", required = false)
    private Ritenuta ritenuta;

    @Element(name = "Natura", required = false)
    private Natura natura;

    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiCassaPrevidenziale() {
    }

    private DatiCassaPrevidenziale(@NonNull final Builder builder) {
        tipoCassa = builder.tipoCassa;
        alCassa = builder.alCassa;
        importoContributoCassa = builder.importoContributoCassa;
        imponibileCassa = builder.imponibileCassa;
        aliquotaIVA = builder.aliquotaIVA;
        ritenuta = builder.ritenuta;
        natura = builder.natura;
        riferimentoAmministrazione = builder.riferimentoAmministrazione;
    }

    @NonNull
    public TipoCassa getTipoCassa() {
        return tipoCassa;
    }

    @NonNull
    public String getAlCassa() {
        return alCassa;
    }

    @NonNull
    public String getImportoContributoCassa() {
        return importoContributoCassa;
    }

    @Nullable
    public String getImponibileCassa() {
        return imponibileCassa;
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

    /**
     * {@code DatiCassaPrevidenziale} builder static inner class.
     */
    public static final class Builder {
        private TipoCassa tipoCassa;
        private String alCassa;
        private String importoContributoCassa;
        private String imponibileCassa;
        private String aliquotaIVA;
        private Ritenuta ritenuta;
        private Natura natura;
        private String riferimentoAmministrazione;

        /**
         * Requires non-optional fields
         *
         * @param tipoCassa              identifies the pension fund
         * @param alCassa                It must contain the value of the contribution rate (in percentage) envisaged
         *                               for the pension fund. The decimals, separated by the whole with the dot
         *                               character ("."), Must always be indicated even if zero (eg: 4.00).
         * @param importoContributoCassa It serves to highlight the amount of the contribution
         * @param aliquotaIVA            It must contain the value of the VAT rate (in percentage) to be applied
         *                               to the contribution amount. The decimals, separated by the whole with the
         *                               dot character ("."), Must always be indicated even if zero (eg: 4.00).<br><br>
         *                               The field must also be valued at a rate equal to zero (0.00).
         */
        public Builder(@NonNull final TipoCassa tipoCassa,
                       @NonNull final String alCassa,
                       @NonNull final String importoContributoCassa,
                       @NonNull final String aliquotaIVA) {
            this.tipoCassa = tipoCassa;
            this.alCassa = alCassa;
            this.importoContributoCassa = importoContributoCassa;
            this.aliquotaIVA = aliquotaIVA;
        }

        public Builder(@NonNull final DatiCassaPrevidenziale copy) {
            this(copy.getTipoCassa(), copy.getAlCassa(), copy.getImportoContributoCassa(), copy.getAliquotaIVA());
            this.imponibileCassa = copy.getImponibileCassa();
            this.ritenuta = copy.getRitenuta();
            this.natura = copy.getNatura();
            this.riferimentoAmministrazione = copy.getRiferimentoAmministrazione();
        }

        public Builder tipoCassa(@NonNull final TipoCassa tipoCassa) {
            this.tipoCassa = tipoCassa;
            return this;
        }

        /**
         * @param alCassa It must contain the value of the contribution rate (in percentage) envisaged
         *                for the pension fund. The decimals, separated by the whole with the dot
         *                character ("."), Must always be indicated even if zero (eg: 4.00).
         */
        public Builder alCassa(@NonNull final String alCassa) {
            this.alCassa = alCassa;
            return this;
        }


        /**
         * It serves to highlight the amount of the contribution
         *
         * @param importoContributoCassa The field contains a numeric value consisting of an integer
         *                               and two decimal places. The decimals, separated by the whole
         *                               with the dot character ("."), Must always be indicated even
         *                               if zero (eg: 250.00).
         */
        public Builder importoContributoCassa(@NonNull final String importoContributoCassa) {
            this.importoContributoCassa = importoContributoCassa;
            return this;
        }

        /**
         * @param imponibileCassa The field, if evaluated, contains a numerical value composed of an
         *                        integer and two decimal places. The decimals, separated by the whole
         *                        with the dot character ("."), Must always be indicated even if zero
         *                        (eg: 340.00).
         */
        public Builder imponibileCassa(@Nullable final String imponibileCassa) {
            this.imponibileCassa = imponibileCassa;
            return this;
        }

        /**
         * @param aliquotaIVA It must contain the value of the VAT rate (in percentage) to be applied
         *                    to the contribution amount. The decimals, separated by the whole with the
         *                    dot character ("."), Must always be indicated even if zero (eg: 4.00).<br><br>
         *                    The field must also be valued at a rate equal to zero (0.00).
         */
        public Builder aliquotaIVA(@NonNull final String aliquotaIVA) {
            this.aliquotaIVA = aliquotaIVA;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the contribution to the pension fund is subject to withholding.
         */
        public Builder ritenuta(@Nullable final Ritenuta ritenuta) {
            this.ritenuta = ritenuta;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the applied VAT rate is zero.
         */
        public Builder natura(@Nullable final Natura natura) {
            this.natura = natura;
            return this;
        }

        /**
         * It serves to give evidence of a possible reference (code or other) useful to the recipient
         * of the document; the latter can ask the seller to enter in this field a certain value
         * which he can use to facilitate the automatic processing of the invoice.
         *
         * @param riferimentoAmministrazione No particular criteria are established; the modality of
         *                                   valorization of the field, with a view to use such as the
         *                                   one above, is necessarily the result of an agreement
         *                                   between the parties
         */
        public Builder riferimentoAmministrazione(@Nullable final String riferimentoAmministrazione) {
            this.riferimentoAmministrazione = riferimentoAmministrazione;
            return this;
        }

        /**
         * Returns a {@code DatiCassaPrevidenziale} built from the parameters previously set.
         *
         * @return a {@code DatiCassaPrevidenziale} built with parameters of this {@code DatiCassaPrevidenziale.Builder}
         */
        public DatiCassaPrevidenziale build() {
            return new DatiCassaPrevidenziale(this);
        }
    }

}
