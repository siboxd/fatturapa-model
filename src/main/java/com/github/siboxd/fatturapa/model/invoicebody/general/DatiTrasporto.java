package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicecommon.Indirizzo;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * Block of data describing the transport of the transferred goods
 */
@Root(name = "DatiTrasporto")
@Order(elements = {"DatiAnagraficiVettore", "MezzoTrasporto", "CausaleTrasporto", "NumeroColli",
        "Descrizione", "UnitaMisuraPeso", "PesoLordo", "PesoNetto", "DataOraRitiro", "DataInizioTrasporto",
        "TipoResa", "IndirizzoResa", "DataOraConsegna"})
public final class DatiTrasporto {

    @Element(name = "DatiAnagraficiVettore", required = false)
    private DatiAnagraficiVettore datiAnagraficiVettore;

    @Element(name = "MezzoTrasporto", required = false)
    private String mezzoTrasporto;

    @Element(name = "CausaleTrasporto", required = false)
    private String causaleTrasporto;

    @Element(name = "NumeroColli", required = false)
    private String numeroColli;

    @Element(name = "Descrizione", required = false)
    private String descrizione;

    @Element(name = "UnitaMisuraPeso", required = false)
    private String unitaMisuraPeso;

    @Element(name = "PesoLordo", required = false)
    private String pesoLordo;

    @Element(name = "PesoNetto", required = false)
    private String pesoNetto;

    @Element(name = "DataOraRitiro", required = false)
    private String dataOraRitiro;

    @Element(name = "DataInizioTrasporto", required = false)
    private String dataInizioTrasporto;

    @Element(name = "TipoResa", required = false)
    private String tipoResa;

    @Element(name = "IndirizzoResa", required = false)
    private Indirizzo indirizzoResa;

    @Element(name = "DataOraConsegna", required = false)
    private String dataOraConsegna;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiTrasporto() {
    }

    private DatiTrasporto(@NonNull final Builder builder) {
        datiAnagraficiVettore = builder.datiAnagraficiVettore;
        mezzoTrasporto = builder.mezzoTrasporto;
        causaleTrasporto = builder.causaleTrasporto;
        numeroColli = builder.numeroColli;
        descrizione = builder.descrizione;
        unitaMisuraPeso = builder.unitaMisuraPeso;
        pesoLordo = builder.pesoLordo;
        pesoNetto = builder.pesoNetto;
        dataOraRitiro = builder.dataOraRitiro;
        dataInizioTrasporto = builder.dataInizioTrasporto;
        tipoResa = builder.tipoResa;
        indirizzoResa = builder.indirizzoResa;
        dataOraConsegna = builder.dataOraConsegna;
    }

    @Nullable
    public DatiAnagraficiVettore getDatiAnagraficiVettore() {
        return datiAnagraficiVettore;
    }

    @Nullable
    public String getMezzoTrasporto() {
        return mezzoTrasporto;
    }

    @Nullable
    public String getCausaleTrasporto() {
        return causaleTrasporto;
    }

    @Nullable
    public String getNumeroColli() {
        return numeroColli;
    }

    @Nullable
    public String getDescrizione() {
        return descrizione;
    }

    @Nullable
    public String getUnitaMisuraPeso() {
        return unitaMisuraPeso;
    }

    @Nullable
    public String getPesoLordo() {
        return pesoLordo;
    }

    @Nullable
    public String getPesoNetto() {
        return pesoNetto;
    }

    @Nullable
    public String getDataOraRitiro() {
        return dataOraRitiro;
    }

    @Nullable
    public String getDataInizioTrasporto() {
        return dataInizioTrasporto;
    }

    @Nullable
    public String getTipoResa() {
        return tipoResa;
    }

    @Nullable
    public Indirizzo getIndirizzoResa() {
        return indirizzoResa;
    }

    @Nullable
    public String getDataOraConsegna() {
        return dataOraConsegna;
    }

    /**
     * {@code DatiTrasporto} builder static inner class.
     */
    public static final class Builder {
        private DatiAnagraficiVettore datiAnagraficiVettore;
        private String mezzoTrasporto;
        private String causaleTrasporto;
        private String numeroColli;
        private String descrizione;
        private String unitaMisuraPeso;
        private String pesoLordo;
        private String pesoNetto;
        private String dataOraRitiro;
        private String dataInizioTrasporto;
        private String tipoResa;
        private Indirizzo indirizzoResa;
        private String dataOraConsegna;

        public Builder() {
        }

        public Builder(@NonNull final DatiTrasporto copy) {
            this.datiAnagraficiVettore = copy.getDatiAnagraficiVettore();
            this.mezzoTrasporto = copy.getMezzoTrasporto();
            this.causaleTrasporto = copy.getCausaleTrasporto();
            this.numeroColli = copy.getNumeroColli();
            this.descrizione = copy.getDescrizione();
            this.unitaMisuraPeso = copy.getUnitaMisuraPeso();
            this.pesoLordo = copy.getPesoLordo();
            this.pesoNetto = copy.getPesoNetto();
            this.dataOraRitiro = copy.getDataOraRitiro();
            this.dataInizioTrasporto = copy.getDataInizioTrasporto();
            this.tipoResa = copy.getTipoResa();
            this.indirizzoResa = copy.getIndirizzoResa();
            this.dataOraConsegna = copy.getDataOraConsegna();
        }

        public Builder datiAnagraficiVettore(@Nullable final DatiAnagraficiVettore datiAnagraficiVettore) {
            this.datiAnagraficiVettore = datiAnagraficiVettore;
            return this;
        }

        /**
         * It is used to identify the means by which the goods are transported.
         *
         * @param mezzoTrasporto no particular criteria is established
         */
        public Builder mezzoTrasporto(@Nullable final String mezzoTrasporto) {
            this.mezzoTrasporto = mezzoTrasporto;
            return this;
        }

        /**
         * It is used to identify the goods that are handled (for example, for purchase, sale,
         * processing, deposit or loan for use, vision, repair ...).
         *
         * @param causaleTrasporto no particular criteria is established
         */
        public Builder causaleTrasporto(@Nullable final String causaleTrasporto) {
            this.causaleTrasporto = causaleTrasporto;
            return this;
        }

        /**
         * It is used to visually identify the number of packages containing the goods transported.
         *
         * @param numeroColli The field, if evaluated, must contain an integer value of up to 4 digits.
         */
        public Builder numeroColli(@Nullable final String numeroColli) {
            this.numeroColli = numeroColli; // TODO: 20/01/2019 add checks
            return this;
        }

        /**
         * It is used to identify the nature, quality and quantity of the goods transported.
         *
         * @param descrizione no particular criteria is established
         */
        public Builder descrizione(@Nullable final String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        /**
         * Used to indicate the unit of measurement referred to the weight of the goods transported.
         *
         * @param unitaMisuraPeso no particular criteria is established
         */
        public Builder unitaMisuraPeso(@Nullable final String unitaMisuraPeso) {
            this.unitaMisuraPeso = unitaMisuraPeso;
            return this;
        }

        /**
         * Used to indicate the gross weight of the goods transported
         *
         * @param pesoLordo The field, if valued, must contain a numerical value consisting of an
         *                  integer and two decimal places. The decimals, separated by the whole with
         *                  the dot character ("."), Must always be indicated even if zero (eg: 320.00).
         */
        public Builder pesoLordo(@Nullable final String pesoLordo) {
            this.pesoLordo = pesoLordo;
            return this;
        }

        /**
         * Used to indicate the net weight of the goods transported
         *
         * @param pesoNetto The field, if valued, must contain a numerical value consisting of an
         *                  integer and two decimal places. The decimals, separated by the whole with
         *                  the dot character ("."), Must always be indicated even if zero (eg: 320.00).
         */
        public Builder pesoNetto(@Nullable final String pesoNetto) {
            this.pesoNetto = pesoNetto;
            return this;
        }

        /**
         * It serves to indicate the date and time when the goods leave the site of the seller.
         *
         * @param dataOraRitiro The field, if evaluated, must contain a date-time value expressed in
         *                      the format YYYY-MM-DDTHH:MM:SS (ISO 8601: 2004 standard).
         */
        public Builder dataOraRitiro(@Nullable final String dataOraRitiro) {
            this.dataOraRitiro = dataOraRitiro; // TODO: 20/01/2019 add checks
            return this;
        }

        /**
         * It is used to indicate the date when the transport of goods begins.
         *
         * @param dataInizioTrasporto The field, if evaluated, must contain the transport start date
         *                            in YYYY-MM-DD format (ISO 8601: 2004 standard).
         */
        public Builder dataInizioTrasporto(@Nullable final String dataInizioTrasporto) {
            this.dataInizioTrasporto = dataInizioTrasporto; // TODO: 20/01/2019 add checks
            return this;
        }

        /**
         * It serves to highlight the commercial clause aimed at defining the delivery methods of the
         * goods agreed between the buyer and the seller. The International Chamber of Commerce (CCI)
         * has collected under the term "Incoterms" a set of rules, valid all over the world, which
         * allow a precise interpretation of the terms used in purchase and sale contracts.
         *
         * @param tipoResa The field, if evaluated, must contain the Incoterms code consisting of
         *                 3 characters.
         */
        public Builder tipoResa(@Nullable final String tipoResa) {
            this.tipoResa = tipoResa; // TODO: 20/01/2019 add checks
            return this;
        }

        public Builder indirizzoResa(@Nullable final Indirizzo indirizzoResa) {
            this.indirizzoResa = indirizzoResa;
            return this;
        }

        /**
         * It serves to indicate the date and time when the goods were delivered to the recipient.
         *
         * @param dataOraConsegna The field, if evaluated, must contain a given value expressed in the
         *                        format YYYY-MM-DDTHH:MM:SS (ISO 8601: 2004 standard).
         */
        public Builder dataOraConsegna(@Nullable final String dataOraConsegna) {
            this.dataOraConsegna = dataOraConsegna; // TODO: 20/01/2019 add checks
            return this;
        }

        /**
         * Returns a {@code DatiTrasporto} built from the parameters previously set.
         *
         * @return a {@code DatiTrasporto} built with parameters of this {@code DatiTrasporto.Builder}
         */
        public DatiTrasporto build() {
            return new DatiTrasporto(this);
        }
    }

}
