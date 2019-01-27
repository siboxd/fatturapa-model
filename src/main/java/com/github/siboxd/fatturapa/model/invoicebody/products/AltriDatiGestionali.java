package com.github.siboxd.fatturapa.model.invoicebody.products;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Description of additional information that the recipient has requested to include in the document,
 * to refer to each individual detail line of the document itself, having managerial or other usefulness
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "AltriDatiGestionali")
public final class AltriDatiGestionali {

    @Element(name = "TipoDato")
    private String tipoDato;

    @Element(name = "RiferimentoTesto", required = false)
    private String riferimentoTesto;

    @Element(name = "RiferimentoNumero", required = false)
    private String riferimentoNumero;

    @Element(name = "RiferimentoData", required = false)
    private String riferimentoData;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private AltriDatiGestionali() {
    }

    private AltriDatiGestionali(@NonNull final Builder builder) {
        tipoDato = builder.tipoDato;
        riferimentoTesto = builder.riferimentoTesto;
        riferimentoNumero = builder.riferimentoNumero;
        riferimentoData = builder.riferimentoData;
    }

    @NonNull
    public String getTipoDato() {
        return tipoDato;
    }

    @Nullable
    public String getRiferimentoTesto() {
        return riferimentoTesto;
    }

    @Nullable
    public String getRiferimentoNumero() {
        return riferimentoNumero;
    }

    @Nullable
    public String getRiferimentoData() {
        return riferimentoData;
    }

    /**
     * {@code AltriDatiGestionali} builder static inner class.
     */
    public static final class Builder {
        private String tipoDato;
        private String riferimentoTesto;
        private String riferimentoNumero;
        private String riferimentoData;

        /**
         * Requires non-optional fields
         *
         * @param tipoDato It is used to identify the type of information.
         *                 <p>
         *                 The field must contain a presumably agreed value between the parts that
         *                 qualifies the data entered in the other fields of the block.
         */
        public Builder(@NonNull final String tipoDato) {
            this.tipoDato = tipoDato;
        }

        public Builder(@NonNull final AltriDatiGestionali copy) {
            this(copy.getTipoDato());
            this.riferimentoTesto = copy.getRiferimentoTesto();
            this.riferimentoNumero = copy.getRiferimentoNumero();
            this.riferimentoData = copy.getRiferimentoData();
        }

        /**
         * It is used to identify the type of information.
         *
         * @param tipoDato The field must contain a presumably agreed value between the parts that
         *                 qualifies the data entered in the other fields of the block.
         */
        public Builder tipoDato(@NonNull final String tipoDato) {
            this.tipoDato = tipoDato;
            return this;
        }

        /**
         * It is used to indicate the additional information when it can be represented in an
         * alphanumeric format.
         *
         * @param riferimentoTesto The field must contain an alphanumeric value
         */
        public Builder riferimentoTesto(@Nullable final String riferimentoTesto) {
            this.riferimentoTesto = riferimentoTesto;
            return this;
        }

        /**
         * It is used to indicate the additional information when it can be represented in a
         * numerical format.
         *
         * @param riferimentoNumero The field must contain a numeric value represented by an integer
         *                          and decimals ranging from a minimum of two to a maximum of eight
         *                          digits. The decimals, separated by the whole with the dot character
         *                          ("."), Must always be indicated even if zero (eg: 112233.00).
         */
        public Builder riferimentoNumero(@Nullable final String riferimentoNumero) {
            this.riferimentoNumero = riferimentoNumero;
            return this;
        }


        /**
         * It is used to indicate the additional information when it can be represented in a given format.
         *
         * @param riferimentoData The field must contain a date in the format
         *                        YYYY-MM-DD (ISO 8601: 2004 standard).
         */
        // TODO: 20/01/2019 add checks
        public Builder riferimentoData(@Nullable final String riferimentoData) {
            this.riferimentoData = riferimentoData;
            return this;
        }

        /**
         * Returns a {@code AltriDatiGestionali} built from the parameters previously set.
         *
         * @return a {@code AltriDatiGestionali} built with parameters of this {@code AltriDatiGestionali.Builder}
         */
        public AltriDatiGestionali build() {
            return new AltriDatiGestionali(this);
        }
    }

}
