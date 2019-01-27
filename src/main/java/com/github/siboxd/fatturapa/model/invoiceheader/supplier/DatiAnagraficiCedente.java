package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import com.github.siboxd.fatturapa.model.invoicecommon.AbstractDatiAnagrafici;
import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * Contains data related to the supplier being billed.
*/
@Root(name = "DatiAnagraficiCedente")
@Order(elements = {"IdFiscaleIVA", "CodiceFiscale", "Anagrafica", "AlboProfessionale",
        "ProvinciaAlbo", "NumeroIscrizioneAlbo", "DataIscrizioneAlbo", "RegimeFiscale"})
public final class DatiAnagraficiCedente extends AbstractDatiAnagrafici {

    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    @Element(name = "AlboProfessionale", required = false)
    private String alboProfessionale;

    @Element(name = "ProvinciaAlbo", required = false)
    private String provinciaAlbo;

    @Element(name = "NumeroIscrizioneAlbo", required = false)
    private String numeroIscrizioneAlbo;

    @Element(name = "DataIscrizioneAlbo", required = false)
    private String dataIscrizioneAlbo;

    @Element(name = "RegimeFiscale")
    private RegimeFiscale regimeFiscale;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiAnagraficiCedente() {
    }

    private DatiAnagraficiCedente(@NonNull final Builder builder) {
        super(builder);
        idFiscaleIVA = builder.idFiscaleIVA;
        alboProfessionale = builder.alboProfessionale;
        provinciaAlbo = builder.provinciaAlbo;
        numeroIscrizioneAlbo = builder.numeroIscrizioneAlbo;
        dataIscrizioneAlbo = builder.dataIscrizioneAlbo;
        regimeFiscale = builder.regimeFiscale;
    }

    @NonNull
    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    @Nullable
    public String getAlboProfessionale() {
        return alboProfessionale;
    }

    @Nullable
    public String getProvinciaAlbo() {
        return provinciaAlbo;
    }

    @Nullable
    public String getNumeroIscrizioneAlbo() {
        return numeroIscrizioneAlbo;
    }

    @Nullable
    public String getDataIscrizioneAlbo() {
        return dataIscrizioneAlbo;
    }

    @NonNull
    public RegimeFiscale getRegimeFiscale() {
        return regimeFiscale;
    }

    /**
     * {@code DatiAnagraficiCedente} builder static inner class.
     */
    public static final class Builder extends AbstractDatiAnagrafici.Builder<Builder> {
        private IdFiscale idFiscaleIVA;
        private String alboProfessionale;
        private String provinciaAlbo;
        private String numeroIscrizioneAlbo;
        private String dataIscrizioneAlbo;
        private RegimeFiscale regimeFiscale;

        public Builder(@NonNull final IdFiscale idFiscaleIVA,
                       @NonNull final Anagrafica anagrafica,
                       @NonNull final RegimeFiscale regimeFiscale) {
            super(anagrafica);
            this.idFiscaleIVA = idFiscaleIVA;
            this.regimeFiscale = regimeFiscale;
        }

        public Builder(@NonNull final DatiAnagraficiCedente copy) {
            super(copy);
            this.idFiscaleIVA = copy.getIdFiscaleIVA();
            this.alboProfessionale = copy.getAlboProfessionale();
            this.provinciaAlbo = copy.getProvinciaAlbo();
            this.numeroIscrizioneAlbo = copy.getNumeroIscrizioneAlbo();
            this.dataIscrizioneAlbo = copy.getDataIscrizioneAlbo();
            this.regimeFiscale = copy.getRegimeFiscale();
        }

        public Builder idFiscaleIVA(@NonNull final IdFiscale idFiscaleIVA) {
            this.idFiscaleIVA = idFiscaleIVA;
            return this;
        }

        /**
         * It allows you to enter information relating to the professional register to which
         * the seller may belong.
         *
         * @param alboProfessionale The field, if valued, must contain the name of the professional register;
         *                          abbreviations are permitted (eg "Dottori" -> "Dott." and similar)
         *                          at the user's complete discretion.
         */
        public Builder alboProfessionale(@Nullable final String alboProfessionale) {
            this.alboProfessionale = alboProfessionale;
            return this;
        }

        /**
         * Allows you to enter information relating to the professional register to which the seller
         * may belong, in particular to the province of jurisdiction.
         *
         * @param provinciaAlbo The field, if valued, must contain the initials of the province of
         *                      competence with reference to the professional register to which the
         *                      seller belongs.
         */
        public Builder provinciaAlbo(@Nullable final String provinciaAlbo) {
            this.provinciaAlbo = provinciaAlbo;
            return this;
        }

        /**
         * Allows you to enter information relating to the professional register to which the seller
         * may belong, in particular to the registration number.
         *
         * @param numeroIscrizioneAlbo The field, if valued, must contain the number of professional
         *                             registration
         */
        public Builder numeroIscrizioneAlbo(@Nullable final String numeroIscrizioneAlbo) {
            this.numeroIscrizioneAlbo = numeroIscrizioneAlbo;
            return this;
        }

        /**
         * Allows you to enter information relating to the professional register to which the seller
         * may belong, in particular at the date of registration.
         *
         * @param dataIscrizioneAlbo The field, if evaluated, must contain the date of registration
         *                           in the register in the format YYYY-MM-DD (ISO 8601: 2004 standard).
         */
        // TODO: 19/01/2019 add checks
        public Builder dataIscrizioneAlbo(@Nullable final String dataIscrizioneAlbo) {
            this.dataIscrizioneAlbo = dataIscrizioneAlbo;
            return this;
        }

        public Builder regimeFiscale(@NonNull final RegimeFiscale regimeFiscale) {
            this.regimeFiscale = regimeFiscale;
            return this;
        }

        /**
         * Returns a {@code DatiAnagraficiCedente} built from the parameters previously set.
         *
         * @return a {@code DatiAnagraficiCedente} built with parameters of this {@code DatiAnagraficiCedente.Builder}
         */
        @Override
        public DatiAnagraficiCedente build() {
            return new DatiAnagraficiCedente(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
