package com.github.siboxd.fatturapa.model.invoicebody;

import com.github.siboxd.fatturapa.model.invoicebody.general.TipoScontoMaggiorazione;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Describes the discounts or surcharges applied on the total invoice
*/
@Root(name = "ScontoMaggiorazione")
public final class ScontoMaggiorazione {

    @Element(name = "Tipo")
    private TipoScontoMaggiorazione tipo;

    @Element(name = "Percentuale", required = false)
    private String percentuale;

    @Element(name = "Importo", required = false)
    private String importo;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private ScontoMaggiorazione() {
    }

    private ScontoMaggiorazione(@NonNull final Builder builder) {
        tipo = builder.tipo;
        percentuale = builder.percentuale;
        importo = builder.importo;
    }

    @NonNull
    public TipoScontoMaggiorazione getTipo() {
        return tipo;
    }

    @Nullable
    public String getPercentuale() {
        return percentuale;
    }

    @Nullable
    public String getImporto() {
        return importo;
    }

    /**
     * {@code ScontoMaggiorazione} builder static inner class.
     */
    public static final class Builder {
        private TipoScontoMaggiorazione tipo;
        private String percentuale;
        private String importo;

        /**
         * Requires non-optional fields
         *
         * @param tipo identifies a discount or surcharge
         */
        public Builder(@NonNull final TipoScontoMaggiorazione tipo) {
            this.tipo = tipo;
        }

        public Builder(@NonNull final ScontoMaggiorazione copy) {
            this(copy.getTipo());
            this.percentuale = copy.getPercentuale();
            this.importo = copy.getImporto();
        }

        public Builder tipo(@NonNull final TipoScontoMaggiorazione tipo) {
            this.tipo = tipo;
            return this;
        }

        /**
         * @param percentuale It must contain the percentage value of the discount / surcharge.
         *                    The decimals, separated by the whole with the dot character ("."),
         *                    Must always be indicated even if zero (eg: 5.00).
         */
        public Builder percentuale(@Nullable final String percentuale) {
            this.percentuale = percentuale;
            return this;
        }

        /**
         * <b>Note:</b> this fields takes precedence over the Percentuale field, in validating process
         *
         * @param importo The field contains a numeric value consisting of an integer and two decimal
         *                places. The decimals, separated by the whole with the dot character ("."),
         *                Must always be indicated even if zero (eg: 55.00).
         */
        public Builder importo(@Nullable final String importo) {
            this.importo = importo; // TODO: 27/01/2019 enforce valorization of at least one among "importo" and "percentuale"
            return this;
        }

        /**
         * Returns a {@code ScontoMaggiorazione} built from the parameters previously set.
         *
         * @return a {@code ScontoMaggiorazione} built with parameters of this {@code ScontoMaggiorazione.Builder}
         */
        public ScontoMaggiorazione build() {
            return new ScontoMaggiorazione(this);
        }
    }

}
