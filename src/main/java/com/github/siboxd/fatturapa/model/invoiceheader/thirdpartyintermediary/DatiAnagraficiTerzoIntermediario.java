package com.github.siboxd.fatturapa.model.invoiceheader.thirdpartyintermediary;

import com.github.siboxd.fatturapa.model.invoicecommon.AbstractDatiAnagrafici;
import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * It contains the third party intermediary personal data
*/
@Root(name = "DatiAnagraficiTerzoIntermediario")
@Order(elements = {"IdFiscaleIVA", "CodiceFiscale", "Anagrafica"})
public final class DatiAnagraficiTerzoIntermediario extends AbstractDatiAnagrafici {

    @Element(name = "IdFiscaleIVA", required = false)
    private IdFiscale idFiscaleIVA;
    // FIXME: 20/01/2019 IdFiscaleIVA and CodiceFiscale are mutually exclusive, but one must be evaluated (see DatiAnagraficiCessionario)

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiAnagraficiTerzoIntermediario() {
    }

    private DatiAnagraficiTerzoIntermediario(@NonNull final Builder builder) {
        super(builder);
        idFiscaleIVA = builder.idFiscaleIVA;
    }

    @Nullable
    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * {@code DatiAnagraficiTerzoIntermediario} builder static inner class.
     */
    public static final class Builder extends AbstractDatiAnagrafici.Builder<Builder> {
        private IdFiscale idFiscaleIVA;

        public Builder(@NonNull final Anagrafica anagrafica) {
            super(anagrafica);
        }

        public Builder(@NonNull final DatiAnagraficiTerzoIntermediario copy) {
            super(copy);
            this.idFiscaleIVA = copy.getIdFiscaleIVA();
        }

        public Builder idFiscaleIVA(@Nullable final IdFiscale idFiscaleIVA) {
            this.idFiscaleIVA = idFiscaleIVA;
            return this;
        }

        /**
         * Returns a {@code DatiAnagraficiTerzoIntermediario} built from the parameters previously set.
         *
         * @return a {@code DatiAnagraficiTerzoIntermediario} built with parameters of this {@code DatiAnagraficiTerzoIntermediario.Builder}
         */
        public DatiAnagraficiTerzoIntermediario build() {
            return new DatiAnagraficiTerzoIntermediario(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
