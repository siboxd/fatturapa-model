package com.github.siboxd.fatturapa.model.invoicecommon;

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
public class Anagrafica {

    // FIXME: 16/01/2019 same problem in RappresentanteFiscaleCessionario  ->

    // FIXME at runtime this is a valid type if
    // 1) Denominazione is Set
    // FIXME --- OR ---
    // 2) Nome AND Cognome are Set

    // FIXME: 16/01/2019 at the moment i've made required false the following fields because the semantic is a choice and cannot be captured by the required flag
    @Element(name = "Denominazione", required = false)
    private String denominazione;

    @Element(name = "Nome", required = false)
    private String nome;

    @Element(name = "Cognome", required = false)
    private String cognome;

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

    private Anagrafica(final Builder builder) {
        this.denominazione = builder.denominazione;
        this.nome = builder.nome;
        this.cognome = builder.cognome;
        this.titolo = builder.titolo;
        this.codEORI = builder.codEORI;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getCodEORI() {
        return codEORI;
    }

    /**
     * {@code Anagrafica} builder static inner class.
     */
    public static final class Builder {
        private String denominazione;
        private String nome;
        private String cognome;
        private String titolo;
        private String codEORI;

        public Builder() {
        }

        public Builder(final Anagrafica copy) {
            this.denominazione = copy.getDenominazione();
            this.nome = copy.getNome();
            this.cognome = copy.getCognome();
            this.titolo = copy.getTitolo();
            this.codEORI = copy.getCodEORI();
        }

        /**
         * Valued only if the seller is a legal entity; it is an alternative to the fields
         * <code>Nome</code> e <code>Cognome</code>
         *
         * @param denominazione The field must contain the name of the company or the name or company
         *                      name of the legal entity that sold the asset or provided the service;
         *                      <br><br>
         *                      <b>Note:</b> the simultaneous valorization of the field <code>Nome</code>
         *                      and/or <code>Cognome</code> is not allowed.
         */
        public Builder denominazione(final String denominazione) {
            this.denominazione = denominazione;
            return this;
        }

        /**
         * Set only if the seller is a natural person; it is an alternative to the <code>Denominazione</code> field.
         *
         * @param nome The field must contain the name of the natural person who sold the property
         *             or provided the service;
         *             <br><br>
         *             <b>Note:</b> the simultaneous valorization of the <code>Denominazione</code> field
         *             is not permitted;
         *             <br><br>
         *             <b>Note 2:</b> vice versa, the simultaneous setting of the <code>Cognome</code>
         *             field is required.
         */
        public Builder nome(final String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * Set only if the seller is a natural person; it is an alternative to the <code>Denominazione</code> field.
         *
         * @param cognome The field must contain the surname of the natural person who sold the property
         *                or provided the service;
         *                <br><br>
         *                <b>Note:</b> the simultaneous valorization of the <code>Denominazione</code> field
         *                is not permitted;
         *                <br><br>
         *                <b>Note 2:</b> vice versa, the simultaneous setting of the <code>Nome</code>
         *                field is required.
         */
        public Builder cognome(final String cognome) {
            this.cognome = cognome;
            return this;
        }

        /**
         * Constitutes a completion of the personal data concerning the seller.
         *
         * @param titolo no particular criteria is established for valorization
         */
        public Builder titolo(final String titolo) {
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
        public Builder codEORI(final String codEORI) {
            this.codEORI = codEORI;
            return this;
        }

        /**
         * Returns a {@code Anagrafica} built from the parameters previously set.
         *
         * @return a {@code Anagrafica} built with parameters of this {@code Anagrafica.Builder}
         */
        public Anagrafica build() {
            return new Anagrafica(this);
        }
    }
}
