package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import com.github.siboxd.fatturapa.model.invoicecommon.Indirizzo;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This block contains the data relating to the seller of the good / service being billed.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "CedentePrestatore")
public class CedentePrestatore {

    @Element(name = "DatiAnagrafici")
    private DatiAnagraficiCedente datiAnagrafici;

    @Element(name = "Sede")
    private Indirizzo sede;

    @Element(name = "StabileOrganizzazione", required = false)
    private Indirizzo stabileOrganizzazione;

    @Element(name = "IscrizioneREA", required = false)
    private IscrizioneREA iscrizioneREA;

    @Element(name = "Contatti", required = false)
    private Contatti contatti;

    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private CedentePrestatore() {
    }

    private CedentePrestatore(@NonNull final Builder builder) {
        datiAnagrafici = builder.datiAnagrafici;
        sede = builder.sede;
        stabileOrganizzazione = builder.stabileOrganizzazione;
        iscrizioneREA = builder.iscrizioneREA;
        contatti = builder.contatti;
        riferimentoAmministrazione = builder.riferimentoAmministrazione;
    }

    @NonNull
    public DatiAnagraficiCedente getDatiAnagrafici() {
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
    public IscrizioneREA getIscrizioneREA() {
        return iscrizioneREA;
    }

    @Nullable
    public Contatti getContatti() {
        return contatti;
    }

    @Nullable
    public String getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    /**
     * {@code CedentePrestatore} builder static inner class.
     */
    public static final class Builder {
        private DatiAnagraficiCedente datiAnagrafici;
        private Indirizzo sede;
        private Indirizzo stabileOrganizzazione;
        private IscrizioneREA iscrizioneREA;
        private Contatti contatti;
        private String riferimentoAmministrazione;

        public Builder(@NonNull final DatiAnagraficiCedente datiAnagrafici,
                       @NonNull final Indirizzo sede) {
            this.datiAnagrafici = datiAnagrafici;
            this.sede = sede;
        }

        public Builder(@NonNull final CedentePrestatore copy) {
            this.datiAnagrafici = copy.getDatiAnagrafici();
            this.sede = copy.getSede();
            this.stabileOrganizzazione = copy.getStabileOrganizzazione();
            this.iscrizioneREA = copy.getIscrizioneREA();
            this.contatti = copy.getContatti();
            this.riferimentoAmministrazione = copy.getRiferimentoAmministrazione();
        }

        public Builder datiAnagrafici(@NonNull final DatiAnagraficiCedente datiAnagrafici) {
            this.datiAnagrafici = datiAnagrafici;
            return this;
        }

        public Builder sede(@NonNull final Indirizzo sede) {
            this.sede = sede;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the supplier is a person who does not reside in Italy
         * but who, in Italy, has a permanent establishment through which he carries out his business
         * (he makes sales of goods or services that are billed)
         */
        public Builder stabileOrganizzazione(@Nullable final Indirizzo stabileOrganizzazione) {
            this.stabileOrganizzazione = stabileOrganizzazione;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the seller is a company registered in the business register
         * and as such has the obligation to indicate in all the documents also the registration data
         * (Article 2250 of the Italian Civil Code)
         */
        public Builder iscrizioneREA(@Nullable final IscrizioneREA iscrizioneREA) {
            this.iscrizioneREA = iscrizioneREA;
            return this;
        }

        public Builder contatti(@Nullable final Contatti contatti) {
            this.contatti = contatti;
            return this;
        }

        /**
         * The field was designed to enter a value on the invoice, referred to the seller, which could
         * somehow facilitate the automatic processing of the invoice by the recipient.
         * Think, just by way of example:
         * <ul>
         * <li>the code with which the seller / lender is "known" in a supplier database managed
         * by the person receiving the invoice;</li>
         * <li>the code of an item present in the accounting system of the invoice recipient useful
         * for the automatic registration of transactions concerning that seller in accounting;</li>
         * <li>etc...</li>
         * </ul>
         *
         * @param riferimentoAmministrazione No particular valuation criteria are established; <br>
         *                                   <p>
         *                                   the method of exploiting the field, with a view to use such
         *                                   as the one above, is necessarily the result of an agreement
         *                                   between the parties, the recipient of the document on one
         *                                   hand and compiler of the document on the other
         */
        public Builder riferimentoAmministrazione(@Nullable final String riferimentoAmministrazione) {
            this.riferimentoAmministrazione = riferimentoAmministrazione;
            return this;
        }

        /**
         * Returns a {@code CedentePrestatore} built from the parameters previously set.
         *
         * @return a {@code CedentePrestatore} built with parameters of this {@code CedentePrestatore.Builder}
         */
        public CedentePrestatore build() {
            return new CedentePrestatore(this);
        }
    }

}
