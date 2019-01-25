package com.github.siboxd.fatturapa.model.invoicecommon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains personal data of a subject
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Anagrafica")
public final class Anagrafica extends AbstractNaming {

    @Element(name = "Titolo", required = false)
    private String titolo;

    @Element(name = "CodEORI", required = false)
    private String codEORI;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private Anagrafica() {
    }

    private Anagrafica(@NonNull final Builder builder) {
        super(builder);
        this.titolo = builder.titolo;
        this.codEORI = builder.codEORI;
    }

    @Nullable
    public String getTitolo() {
        return titolo;
    }

    @Nullable
    public String getCodEORI() {
        return codEORI;
    }

    /**
     * {@code Anagrafica} builder static inner class.
     */
    public static final class Builder extends AbstractNaming.Builder<Builder> {
        private String titolo;
        private String codEORI;

        public Builder() {
        }

        public Builder(@NonNull final Anagrafica copy) {
            super(copy);
            this.titolo = copy.getTitolo();
            this.codEORI = copy.getCodEORI();
        }

        /**
         * Constitutes a completion of the personal data concerning the seller.
         *
         * @param titolo no particular criteria is established for valorization
         */
        public Builder titolo(@Nullable final String titolo) {
            this.titolo = titolo;
            return this;
        }

        /**
         * It serves for the indication of the code eventually assigned to the seller according to
         * the <em>European Community Regulation n. 312 of 16 April 2009</em>.
         *
         * @param codEORI The field, if evaluated, must contain the <b>EORI</b> code number
         *                (<em>Economic Operator Registration and Identification</em>)
         */
        public Builder codEORI(@Nullable final String codEORI) {
            this.codEORI = codEORI;
            return this;
        }

        /**
         * Returns a {@code Anagrafica} built from the parameters previously set.
         *
         * @return a {@code Anagrafica} built with parameters of this {@code Anagrafica.Builder}
         */
        @Override
        public Anagrafica build() {
            return new Anagrafica(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
