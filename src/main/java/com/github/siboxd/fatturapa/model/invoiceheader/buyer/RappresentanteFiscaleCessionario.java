package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.invoicecommon.AbstractNaming;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * It contains the identification data of the tax representative of the buyer
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "RappresentanteFiscaleCessionario")
@Order(elements = {"IdFiscaleIVA", "Denominazione", "Nome", "Cognome"})
public class RappresentanteFiscaleCessionario extends AbstractNaming {

    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private RappresentanteFiscaleCessionario() {
    }

    private RappresentanteFiscaleCessionario(@NonNull final Builder builder) {
        super(builder);
        this.idFiscaleIVA = builder.idFiscaleIVA;
    }

    @NonNull
    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * {@code RappresentanteFiscaleCessionario} builder static inner class.
     */
    public static final class Builder extends AbstractNaming.Builder<Builder> {
        private IdFiscale idFiscaleIVA;

        public Builder(@NonNull final IdFiscale idFiscaleIVA) {
            super();
            this.idFiscaleIVA = idFiscaleIVA;
        }

        public Builder(@NonNull final RappresentanteFiscaleCessionario copy) {
            super(copy);
            this.idFiscaleIVA = copy.getIdFiscaleIVA();
        }

        public Builder idFiscaleIVA(@NonNull final IdFiscale idFiscaleIVA) {
            this.idFiscaleIVA = idFiscaleIVA;
            return this;
        }

        /**
         * Returns a {@code RappresentanteFiscaleCessionario} built from the parameters previously set.
         *
         * @return a {@code RappresentanteFiscaleCessionario} built with parameters of this {@code RappresentanteFiscaleCessionario.Builder}
         */
        @Override
        public RappresentanteFiscaleCessionario build() {
            return new RappresentanteFiscaleCessionario(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
