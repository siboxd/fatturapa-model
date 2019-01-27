package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the registration information to the REA (Administrative Economic Repertory)
 * at the company registry office
 */
@Root(name = "IscrizioneREA")
public final class IscrizioneREA {

    @Element(name = "Ufficio")
    private String ufficio;

    @Element(name = "NumeroREA")
    private String numeroREA;

    @Element(name = "CapitaleSociale", required = false)
    private String capitaleSociale;

    @Element(name = "SocioUnico", required = false)
    private SocioUnico socioUnico;

    @Element(name = "StatoLiquidazione")
    private StatoLiquidazione statoLiquidazione;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private IscrizioneREA() {
    }

    private IscrizioneREA(@NonNull final Builder builder) {
        ufficio = builder.ufficio;
        numeroREA = builder.numeroREA;
        capitaleSociale = builder.capitaleSociale;
        socioUnico = builder.socioUnico;
        statoLiquidazione = builder.statoLiquidazione;
    }

    @NonNull
    public String getUfficio() {
        return ufficio;
    }

    @NonNull
    public String getNumeroREA() {
        return numeroREA;
    }

    @Nullable
    public String getCapitaleSociale() {
        return capitaleSociale;
    }

    @Nullable
    public SocioUnico getSocioUnico() {
        return socioUnico;
    }

    @NonNull
    public StatoLiquidazione getStatoLiquidazione() {
        return statoLiquidazione;
    }

    /**
     * {@code IscrizioneREA} builder static inner class.
     */
    public static final class Builder {
        private String ufficio;
        private String numeroREA;
        private String capitaleSociale;
        private SocioUnico socioUnico;
        private StatoLiquidazione statoLiquidazione;

        /**
         * Requires non-optional fields
         *
         * @param ufficio           The field must contain the abbreviation of the province of the registry
         *                          of companies with which the supplier is registered.
         * @param numeroREA         The field must contain the number with which the seller is registered with
         *                          the business register.
         * @param statoLiquidazione Whether the company is in liquidation or not
         */
        public Builder(@NonNull final String ufficio,
                       @NonNull final String numeroREA,
                       @NonNull final StatoLiquidazione statoLiquidazione) {
            this.ufficio = ufficio;
            this.numeroREA = numeroREA;
            this.statoLiquidazione = statoLiquidazione;
        }

        public Builder(@NonNull final IscrizioneREA copy) {
            this(copy.getUfficio(), copy.getNumeroREA(), copy.getStatoLiquidazione());
            this.capitaleSociale = copy.getCapitaleSociale();
            this.socioUnico = copy.getSocioUnico();
        }

        /**
         * Office's Province
         *
         * @param ufficio The field must contain the abbreviation of the province of the registry
         *                of companies with which the supplier is registered.
         */
        public Builder ufficio(@NonNull final String ufficio) {
            this.ufficio = ufficio;
            return this;
        }

        /**
         * REA number
         *
         * @param numeroREA The field must contain the number with which the seller is registered with
         *                  the business register.
         */
        public Builder numeroREA(@NonNull final String numeroREA) {
            this.numeroREA = numeroREA;
            return this;
        }

        /**
         * Social capital amount
         * <br><br>
         * <b>Note:</b> must be valued only if seller is a capital company (SpA, SApA, Srl)
         *
         * @param capitaleSociale The field must contain the amount of the capital actually paid as
         *                        resulting from the last financial statements;<br>
         *                        it must be a numeric value composed of an integer and two decimals;<br>
         *                        the decimals, separated by the whole with the dot character ("."),
         *                        must always be indicated even if zero (eg: 28000000.00).
         */
        public Builder capitaleSociale(@Nullable final String capitaleSociale) {
            this.capitaleSociale = capitaleSociale;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the seller is a it is a limited liability company (Srl).
         */
        public Builder socioUnico(@Nullable final SocioUnico socioUnico) {
            this.socioUnico = socioUnico;
            return this;
        }

        public Builder statoLiquidazione(@NonNull final StatoLiquidazione statoLiquidazione) {
            this.statoLiquidazione = statoLiquidazione;
            return this;
        }

        /**
         * Returns a {@code IscrizioneREA} built from the parameters previously set.
         *
         * @return a {@code IscrizioneREA} built with parameters of this {@code IscrizioneREA.Builder}
         */
        public IscrizioneREA build() {
            return new IscrizioneREA(this);
        }
    }

}
