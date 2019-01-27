package com.github.siboxd.fatturapa.model.invoicecommon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;

/**
 * A base class for common fields for personal data
 * <p>
 * It contains these data: "CodiceFiscale", "Anagrafica"
 *
 * @author Enrico
 */
public abstract class AbstractDatiAnagrafici {

    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;

    @Element(name = "Anagrafica")
    private Anagrafica anagrafica;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     * <br><br>
     * Make private in extending classes.
     */
    protected AbstractDatiAnagrafici() {
    }

    protected AbstractDatiAnagrafici(@NonNull final Builder<?> builder) {
        codiceFiscale = builder.codiceFiscale;
        anagrafica = builder.anagrafica;
    }

    @Nullable
    public final String getCodiceFiscale() {
        return codiceFiscale;
    }

    @NonNull
    public final Anagrafica getAnagrafica() {
        return anagrafica;
    }

    /**
     * {@code AbstractDatiAnagrafici} builder static inner class.
     */
    protected abstract static class Builder<T extends Builder<T>> {
        private String codiceFiscale;
        private Anagrafica anagrafica;

        protected Builder(@NonNull final Anagrafica anagrafica) {
            this.anagrafica = anagrafica;
        }

        protected Builder(@NonNull final AbstractDatiAnagrafici copy) {
            this.codiceFiscale = copy.getCodiceFiscale();
            this.anagrafica = copy.getAnagrafica();
        }

        /**
         * It serves to provide an additional identification element
         *
         * @param codiceFiscale The field, if valued, must contain the tax code of the subject that
         *                      will be composed of <em>11 numeric characters</em>, if it is a legal person,
         *                      or <em>16 alphanumeric characters</em>, if it is a natural person.
         */
        // TODO: 24/01/2019 add checks
        public final T codiceFiscale(@Nullable final String codiceFiscale) {
            this.codiceFiscale = codiceFiscale;
            return self();
        }

        public final T anagrafica(@NonNull final Anagrafica anagrafica) {
            this.anagrafica = anagrafica;
            return self();
        }

        /**
         * Should be overridden to build the subclass object
         *
         * @return the built object
         */
        protected abstract AbstractDatiAnagrafici build();

        /**
         * Subclasses must override this method to return "this"
         *
         * @return this
         */
        protected abstract T self();
    }

}
