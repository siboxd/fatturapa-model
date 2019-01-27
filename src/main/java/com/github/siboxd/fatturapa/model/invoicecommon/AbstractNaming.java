package com.github.siboxd.fatturapa.model.invoicecommon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;

/**
 * A class that contains common data and checks for naming a natural person or legal entity
 * <p>
 * It contains these data: "Denominazione", "Nome", "Cognome"
 *
 * @author Enrico
 */
public abstract class AbstractNaming {

    // FIXME: 16/01/2019 at the moment i've made required false the following fields because the semantic is a choice and cannot be captured by the required flag

    @Element(name = "Denominazione", required = false)
    private String denominazione;

    @Element(name = "Nome", required = false)
    private String nome;

    @Element(name = "Cognome", required = false)
    private String cognome;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     * <br><br>
     * Make private in extending classes.
     */
    protected AbstractNaming() {
    }

    protected AbstractNaming(@NonNull final Builder<?> builder) {
        this.denominazione = builder.denominazione;
        this.nome = builder.nome;
        this.cognome = builder.cognome;
    }

    @Nullable
    public final String getDenominazione() {
        return denominazione;
    }

    @Nullable
    public final String getNome() {
        return nome;
    }

    @Nullable
    public final String getCognome() {
        return cognome;
    }

    /**
     * {@code AbstractNaming} builder static inner class.
     */
    protected abstract static class Builder<T extends Builder<T>> {
        private String denominazione;
        private String nome;
        private String cognome;

        protected Builder() {
        }

        protected Builder(@NonNull final AbstractNaming copy) {
            this.denominazione = copy.getDenominazione();
            this.nome = copy.getNome();
            this.cognome = copy.getCognome();
        }

        /**
         * Valued only if the subject is a legal entity; it is an alternative to the fields
         * <code>Nome</code> e <code>Cognome</code>
         *
         * @param denominazione The field must contain the name of the company or the name or company
         *                      name of the legal entity that's named as subject;
         *                      <br><br>
         *                      <b>Note:</b> the simultaneous valorization of the field <code>Nome</code>
         *                      and/or <code>Cognome</code> is not allowed.
         */
        public final T denominazione(@Nullable final String denominazione) {
            this.denominazione = denominazione;
            return self();
        }

        /**
         * Set only if the subject is a natural person; it is an alternative to the <code>Denominazione</code> field.
         *
         * @param nome The field must contain the name of the natural person who's named as subject;
         *             <br><br>
         *             <b>Note:</b> the simultaneous valorization of the <code>Denominazione</code> field
         *             is not permitted;
         *             <br><br>
         *             <b>Note 2:</b> vice versa, the simultaneous setting of the <code>Cognome</code>
         *             field is required.
         */
        public final T nome(@Nullable final String nome) {
            this.nome = nome;
            return self();
        }

        /**
         * Set only if the seller is a natural person; it is an alternative to the <code>Denominazione</code> field.
         *
         * @param cognome The field must contain the surname of the natural person who's named as subject;
         *                <br><br>
         *                <b>Note:</b> the simultaneous valorization of the <code>Denominazione</code> field
         *                is not permitted;
         *                <br><br>
         *                <b>Note 2:</b> vice versa, the simultaneous setting of the <code>Nome</code>
         *                field is required.
         */
        public final T cognome(@Nullable final String cognome) {
            this.cognome = cognome;
            return self();
        }

        // FIXME at runtime this is a valid type if
        // 1) Denominazione is Set
        // FIXME --- OR ---
        // 2) Nome AND Cognome are Set

        /**
         * Should be overridden to build the subclass object
         *
         * @return the built object
         */
        protected abstract AbstractNaming build();

        /**
         * Subclasses must override this method to return "this"
         *
         * @return this
         */
        protected abstract T self();
    }
}
