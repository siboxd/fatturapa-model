package com.github.siboxd.fatturapa.model.invoiceheader.fiscalagent;

import com.github.siboxd.fatturapa.model.invoicecommon.AbstractDatiAnagrafici;
import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * It contains the personal data of the tax representative of a subject
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiRappresentante")
@Order(elements = {"IdFiscaleIVA", "CodiceFiscale", "Anagrafica"})
public final class DatiAnagraficiRappresentante extends AbstractDatiAnagrafici {
    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiAnagraficiRappresentante() {
    }

    private DatiAnagraficiRappresentante(@NonNull final Builder builder) {
        super(builder);
        idFiscaleIVA = builder.idFiscaleIVA;
    }

    @NonNull
    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * {@code DatiAnagraficiRappresentante} builder static inner class.
     */
    public static final class Builder extends AbstractDatiAnagrafici.Builder<Builder> {
        private IdFiscale idFiscaleIVA;

        public Builder(@NonNull final IdFiscale idFiscaleIVA,
                       @NonNull final Anagrafica anagrafica) {
            super(anagrafica);
            this.idFiscaleIVA = idFiscaleIVA;
        }

        public Builder(@NonNull final DatiAnagraficiRappresentante copy) {
            super(copy);
            this.idFiscaleIVA = copy.getIdFiscaleIVA();
        }

        public Builder idFiscaleIVA(@NonNull final IdFiscale idFiscaleIVA) {
            this.idFiscaleIVA = idFiscaleIVA;
            return this;
        }

        /**
         * Returns a {@code DatiAnagraficiRappresentante} built from the parameters previously set.
         *
         * @return a {@code DatiAnagraficiRappresentante} built with parameters of this {@code DatiAnagraficiRappresentante.Builder}
         */
        @Override
        public DatiAnagraficiRappresentante build() {
            return new DatiAnagraficiRappresentante(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
