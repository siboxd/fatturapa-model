package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.invoicecommon.AbstractDatiAnagrafici;
import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * It contains the buyer personal data
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiCessionario")
@Order(elements = {"IdFiscaleIVA", "CodiceFiscale", "Anagrafica"})
public final class DatiAnagraficiCessionario extends AbstractDatiAnagrafici {
    @Element(name = "IdFiscaleIVA", required = false)
    private IdFiscale idFiscaleIVA;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiAnagraficiCessionario() {
    }

    private DatiAnagraficiCessionario(@NonNull final Builder builder) {
        super(builder);
        this.idFiscaleIVA = builder.idFiscaleIVA;
    }

    @Nullable
    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * {@code DatiAnagraficiCessionario} builder static inner class.
     */
    public static final class Builder extends AbstractDatiAnagrafici.Builder<Builder> {
        private IdFiscale idFiscaleIVA;

        public Builder(@NonNull final Anagrafica anagrafica) {
            super(anagrafica);
        }

        public Builder(@NonNull final DatiAnagraficiCessionario copy) {
            super(copy);
            this.idFiscaleIVA = copy.getIdFiscaleIVA();
        }

        /**
         * Sets the {@code idFiscaleIVA} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param idFiscaleIVA the {@code idFiscaleIVA} to set
         * @return a reference to this Builder
         */
        public Builder idFiscaleIVA(@Nullable final IdFiscale idFiscaleIVA) {
            this.idFiscaleIVA = idFiscaleIVA;
            return this;
        }

        /**
         * Returns a {@code DatiAnagraficiCessionario} built from the parameters previously set.
         *
         * @return a {@code DatiAnagraficiCessionario} built with parameters of this {@code DatiAnagraficiCessionario.Builder}
         */
        @Override
        public DatiAnagraficiCessionario build() {
            return new DatiAnagraficiCessionario(this);
        }

        @Override
        protected DatiAnagraficiCessionario.Builder self() {
            return this;
        }
    }
}
