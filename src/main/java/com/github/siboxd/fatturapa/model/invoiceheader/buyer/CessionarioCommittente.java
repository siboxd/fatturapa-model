package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.invoicecommon.Indirizzo;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This block contains the data relating to the transferee or customer of the good/service being billed.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "CessionarioCommittente")
public final class CessionarioCommittente {

    @Element(name = "DatiAnagrafici")
    private DatiAnagraficiCessionario datiAnagrafici;

    @Element(name = "Sede")
    private Indirizzo sede;

    @Element(name = "StabileOrganizzazione", required = false)
    private Indirizzo stabileOrganizzazione;

    @Element(name = "RappresentanteFiscale", required = false)
    private RappresentanteFiscaleCessionario rappresentanteFiscale;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private CessionarioCommittente() {
    }

    private CessionarioCommittente(@NonNull final Builder builder) {
        datiAnagrafici = builder.datiAnagrafici;
        sede = builder.sede;
        stabileOrganizzazione = builder.stabileOrganizzazione;
        rappresentanteFiscale = builder.rappresentanteFiscale;
    }

    @NonNull
    public DatiAnagraficiCessionario getDatiAnagrafici() {
        return datiAnagrafici;
    }

    @NonNull
    public Indirizzo getSede() {
        return sede;
    }

    @Nullable
    public Indirizzo getStabileOrganizzazione() {
        return stabileOrganizzazione;
    }

    @Nullable
    public RappresentanteFiscaleCessionario getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    /**
     * {@code CessionarioCommittente} builder static inner class.
     */
    public static final class Builder {
        private DatiAnagraficiCessionario datiAnagrafici;
        private Indirizzo sede;
        private Indirizzo stabileOrganizzazione;
        private RappresentanteFiscaleCessionario rappresentanteFiscale;

        public Builder(@NonNull final DatiAnagraficiCessionario datiAnagrafici,
                       @NonNull final Indirizzo sede) {
            this.datiAnagrafici = datiAnagrafici;
            this.sede = sede;
        }

        public Builder(@NonNull final CessionarioCommittente copy) {
            this(copy.getDatiAnagrafici(), copy.getSede());
            this.stabileOrganizzazione = copy.getStabileOrganizzazione();
            this.rappresentanteFiscale = copy.getRappresentanteFiscale();
        }

        public Builder datiAnagrafici(@NonNull final DatiAnagraficiCessionario datiAnagrafici) {
            this.datiAnagrafici = datiAnagrafici;
            return this;
        }

        public Builder sede(@NonNull final Indirizzo sede) {
            this.sede = sede;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the buyer is a person who does not reside in Italy
         * but who, in Italy, has a permanent establishment through which he carries out his business
         * (he makes sales of goods or services that are billed)
         */
        public Builder stabileOrganizzazione(@Nullable final Indirizzo stabileOrganizzazione) {
            this.stabileOrganizzazione = stabileOrganizzazione;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the seller is configured as a non-resident entity that
         * carries out operations relevant to VAT in Italy, and which makes use of a tax representative
         * in Italy.
         */
        public Builder rappresentanteFiscale(@Nullable final RappresentanteFiscaleCessionario rappresentanteFiscale) {
            this.rappresentanteFiscale = rappresentanteFiscale;
            return this;
        }

        /**
         * Returns a {@code CessionarioCommittente} built from the parameters previously set.
         *
         * @return a {@code CessionarioCommittente} built with parameters of this {@code CessionarioCommittente.Builder}
         */
        public CessionarioCommittente build() {
            return new CessionarioCommittente(this);
        }
    }

}
