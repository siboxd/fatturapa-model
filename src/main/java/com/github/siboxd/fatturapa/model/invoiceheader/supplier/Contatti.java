package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import com.github.siboxd.fatturapa.model.invoicecommon.AbstractContatti;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * Contains contact information for a subject.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Contatti")
@Order(elements = {"Telefono", "Fax", "Email"})
public final class Contatti extends AbstractContatti {

    @Element(name = "Fax", required = false)
    private String fax;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private Contatti() {
    }

    private Contatti(@NonNull final Builder builder) {
        super(builder);
        fax = builder.fax;
    }

    @Nullable
    public String getFax() {
        return fax;
    }

    /**
     * {@code Contatti} builder static inner class.
     */
    public static final class Builder extends AbstractContatti.Builder<Builder> {
        private String fax;

        public Builder() {
        }

        public Builder(@NonNull final Contatti copy) {
            super(copy);
            this.fax = copy.getFax();
        }

        /**
         * @param fax The field, if evaluated, must contain a fax number of the subject.
         */
        public Builder fax(@Nullable final String fax) {
            this.fax = fax;
            return this;
        }

        /**
         * Returns a {@code Contatti} built from the parameters previously set.
         *
         * @return a {@code Contatti} built with parameters of this {@code Contatti.Builder}
         */
        public Contatti build() {
            return new Contatti(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
