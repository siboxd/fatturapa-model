package com.github.siboxd.fatturapa.model.invoicecommon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;

import static com.github.siboxd.fatturapa.model.StandardPattern.EMAIL_TYPE;
import static com.github.siboxd.fatturapa.model.StandardPattern.TEL_FAX_TYPE;
import static com.github.siboxd.fatturapa.model.utils.Patterns.matchAgainstPatternOrThrow;

/**
 * A base class for subjects' contacts
 * <p>
 * It contains these data: "Telefono", "Email"
 *
 * @author Enrico
 */
public abstract class AbstractContatti {

    @Element(name = "Telefono", required = false)
    private String telefono;

    @Element(name = "Email", required = false)
    private String email;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     * <br><br>
     * Make private in extending classes.
     */
    protected AbstractContatti() {
    }

    protected AbstractContatti(@NonNull final Builder<?> builder) {
        telefono = builder.telefono;
        email = builder.email;
    }

    @Nullable
    public final String getTelefono() {
        return telefono;
    }

    @Nullable
    public final String getEmail() {
        return email;
    }

    /**
     * {@code AbstractContatti} builder static inner class.
     */
    protected abstract static class Builder<T extends Builder<T>> {
        private String telefono;
        private String email;

        protected Builder() {
        }

        protected Builder(@NonNull final AbstractContatti copy) {
            this.telefono = copy.getTelefono();
            this.email = copy.getEmail();
        }

        /**
         * @param telefono The field, if evaluated, must contain a telephone number of the subject.
         */
        public final T telefono(@Nullable final String telefono) {
            if (telefono != null) {
                matchAgainstPatternOrThrow(telefono, TEL_FAX_TYPE.pattern());
            }
            this.telefono = telefono;
            return self();
        }

        /**
         * @param email The field, if evaluated, must contain an e-mail address of the subject.
         */
        public final T email(@Nullable final String email) {
            if (email != null) {
                matchAgainstPatternOrThrow(email, EMAIL_TYPE.pattern());
            }
            this.email = email;
            return self();
        }

        /**
         * Should be overridden to build the subclass object
         *
         * @return the built object
         */
        protected abstract AbstractContatti build();

        /**
         * Subclasses must override this method to return "this"
         *
         * @return this
         */
        protected abstract T self();
    }
}
