package com.github.siboxd.fatturapa.model.invoicecommon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains physical addressing information
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Indirizzo")
public final class Indirizzo {

    @Element(name = "Indirizzo")
    private String indirizzo;

    @Element(name = "NumeroCivico", required = false)
    private String numeroCivico;

    @Element(name = "CAP")
    private String cap;

    @Element(name = "Comune")
    private String comune;

    @Element(name = "Provincia", required = false)
    private String provincia;

    @Element(name = "Nazione")
    private String nazione;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private Indirizzo() {
    }

    private Indirizzo(@NonNull final Builder builder) {
        indirizzo = builder.indirizzo;
        numeroCivico = builder.numeroCivico;
        cap = builder.cap;
        comune = builder.comune;
        provincia = builder.provincia;
        nazione = builder.nazione;
    }

    @NonNull
    public String getIndirizzo() {
        return indirizzo;
    }

    @Nullable
    public String getNumeroCivico() {
        return numeroCivico;
    }

    @NonNull
    public String getCap() {
        return cap;
    }

    @NonNull
    public String getComune() {
        return comune;
    }

    @Nullable
    public String getProvincia() {
        return provincia;
    }

    @NonNull
    public String getNazione() {
        return nazione;
    }

    /**
     * {@code Indirizzo} builder static inner class.
     */
    public static final class Builder {
        private String indirizzo;
        private String numeroCivico;
        private String cap;
        private String comune;
        private String provincia;
        private String nazione;

        /**
         * Requires non-optional fields
         *
         * @param indirizzo The field must contain the address (street, square, etc.)
         *                  <p>Here you can choose whether to specify the street number or not.</p>
         * @param cap       The field must contain the Postal Code
         * @param comune    The field must contain the full diction of the municipality (also abroad)
         * @param nazione   The field must contain, according to the ISO 3166-1 alpha-2 code, the code
         *                  of the country to which the municipality indicated in the Municipality field belongs.
         */
        public Builder(@NonNull final String indirizzo,
                       @NonNull final String cap,
                       @NonNull final String comune,
                       @NonNull final String nazione) {
            this.indirizzo = indirizzo;
            this.cap = cap;
            this.comune = comune;
            this.nazione = nazione;
        }

        public Builder(@NonNull final Indirizzo copy) {
            this(copy.getIndirizzo(), copy.getCap(), copy.getComune(), copy.getNazione());
            this.numeroCivico = copy.getNumeroCivico();
            this.provincia = copy.getProvincia();
        }

        /**
         * The Address
         * <p>
         * Here you can choose whether to specify the street number or not.
         *
         * @param indirizzo The field must contain the address (street, square, etc.)
         */
        public Builder indirizzo(@NonNull final String indirizzo) {
            this.indirizzo = indirizzo;
            return this;
        }

        /**
         * The Street Number
         * <p>
         * <b>Note:</b> To be specified only if the house number has not been entered in the address field
         *
         * @param numeroCivico The field must contain the street number of the address
         */
        public Builder numeroCivico(@Nullable final String numeroCivico) {
            this.numeroCivico = numeroCivico;
            return this;
        }

        /**
         * The Postal Code
         *
         * @param cap The field must contain the Postal Code
         */
        public Builder cap(@NonNull final String cap) {
            this.cap = cap;
            return this;
        }

        /**
         * The Municipality
         *
         * @param comune The field must contain the full diction of the municipality (also abroad)
         */
        public Builder comune(@NonNull final String comune) {
            this.comune = comune;
            return this;
        }

        /**
         * The Province
         * <br><br>
         * <b>Note:</b> Its valorization is not allowed if the Nation field contains a value
         * different from "IT". <br> Vice versa (field Country = "IT") must be present.
         *
         * @param provincia The field must contain the initials of the province in Italy to which
         *                  the municipality indicated in the municipality field belongs
         */
        // TODO: 19/01/2019 add checks and test
        public Builder provincia(@Nullable final String provincia) {
            this.provincia = provincia;
            return this;
        }

        /**
         * The Nation
         *
         * @param nazione The field must contain, according to the ISO 3166-1 alpha-2 code, the code
         *                of the country to which the municipality indicated in the Municipality field belongs.
         */
        public Builder nazione(@NonNull final String nazione) {
            this.nazione = nazione;
            return this;
        }

        /**
         * Returns a {@code Indirizzo} built from the parameters previously set.
         *
         * @return a {@code Indirizzo} built with parameters of this {@code Indirizzo.Builder}
         */
        public Indirizzo build() {
            return new Indirizzo(this);
        }
    }

}
