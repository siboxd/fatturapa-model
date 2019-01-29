package com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata;

import com.github.siboxd.fatturapa.model.invoicecommon.AbstractContatti;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Root;


/**
 * It is used to provide additional information useful for contacting the transmitting subject.
 */
@Root(name = "ContattiTrasmittente")
public final class ContattiTrasmittente extends AbstractContatti {

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private ContattiTrasmittente() {
    }

    private ContattiTrasmittente(@NonNull final Builder builder) {
        super(builder);
    }

    /**
     * {@code ContattiTrasmittente} builder static inner class.
     */
    public static final class Builder extends AbstractContatti.Builder<Builder> {

        public Builder() {
        }

        public Builder(@NonNull final ContattiTrasmittente copy) {
            super(copy);
        }

        /**
         * Returns a {@code ContattiTrasmittente} built from the parameters previously set.
         *
         * @return a {@code ContattiTrasmittente} built with parameters of this {@code ContattiTrasmittente.Builder}
         */
        @Override
        public ContattiTrasmittente build() {
            return new ContattiTrasmittente(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
