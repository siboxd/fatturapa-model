package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the identification data of the tax representative of the buyer
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "RappresentanteFiscaleCessionario")
public class RappresentanteFiscaleCessionario {

    // FIXME: 16/01/2019 same problem as Anagrafica, Denominazione and (Nome, Cognome) mutually exclusive

    // TODO: 20/01/2019 can this be a subclass of some similar class??

    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    @Element(name = "Denominazione", required = false)
    private String denominazione;

    @Element(name = "Nome", required = false)
    private String nome;

    @Element(name = "Cognome", required = false)
    private String cognome;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private RappresentanteFiscaleCessionario() {
    }

    private RappresentanteFiscaleCessionario(@NonNull final Builder builder) {
        this.idFiscaleIVA = builder.idFiscaleIVA;
        denominazione = builder.denominazione;
        nome = builder.nome;
        cognome = builder.cognome;
    }

    @NonNull
    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    @Nullable
    public String getDenominazione() {
        return denominazione;
    }

    @Nullable
    public String getNome() {
        return nome;
    }

    @Nullable
    public String getCognome() {
        return cognome;
    }

    /**
     * {@code RappresentanteFiscaleCessionario} builder static inner class.
     */
    public static final class Builder {
        private IdFiscale idFiscaleIVA;
        private String denominazione;
        private String nome;
        private String cognome;

        public Builder(@NonNull final IdFiscale idFiscaleIVA) {
            this.idFiscaleIVA = idFiscaleIVA;
        }

        public Builder(@NonNull final RappresentanteFiscaleCessionario copy) {
            this.idFiscaleIVA = copy.getIdFiscaleIVA();
            this.denominazione = copy.getDenominazione();
            this.nome = copy.getNome();
            this.cognome = copy.getCognome();
        }

        public Builder idFiscaleIVA(@NonNull final IdFiscale idFiscaleIVA) {
            this.idFiscaleIVA = idFiscaleIVA;
            return this;
        }

        /**
         * Valued only if the tax representative is a legal entity; it is an alternative to the fields
         * <code>Nome</code> e <code>Cognome</code>
         *
         * @param denominazione The field must contain the name of the company or the name or company
         *                      name of the legal entity that represents the buyer;
         *                      <br><br>
         *                      <b>Note:</b> the simultaneous valorization of the field <code>Nome</code>
         *                      and/or <code>Cognome</code> is not allowed.
         */
        public Builder denominazione(@Nullable final String denominazione) {
            this.denominazione = denominazione;
            return this;
        }

        /**
         * Set only if the tax representative is a natural person; it is an alternative to the
         * <code>Denominazione</code> field.
         *
         * @param nome The field must contain the name of the natural person who represents the buyer;
         *             <br><br>
         *             <b>Note:</b> the simultaneous valorization of the <code>Denominazione</code> field
         *             is not permitted;
         *             <br><br>
         *             <b>Note 2:</b> vice versa, the simultaneous setting of the <code>Cognome</code>
         *             field is required.
         */
        public Builder nome(@Nullable final String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * Set only if the tax representative is a natural person; it is an alternative to the
         * <code>Denominazione</code> field.
         *
         * @param cognome The field must contain the surname of the natural person who represents the buyer;
         *                <br><br>
         *                <b>Note:</b> the simultaneous valorization of the <code>Denominazione</code> field
         *                is not permitted;
         *                <br><br>
         *                <b>Note 2:</b> vice versa, the simultaneous setting of the <code>Nome</code>
         *                field is required.
         */
        public Builder cognome(@Nullable final String cognome) {
            this.cognome = cognome;
            return this;
        }

        /**
         * Returns a {@code RappresentanteFiscaleCessionario} built from the parameters previously set.
         *
         * @return a {@code RappresentanteFiscaleCessionario} built with parameters of this {@code RappresentanteFiscaleCessionario.Builder}
         */
        public RappresentanteFiscaleCessionario build() {
            return new RappresentanteFiscaleCessionario(this);
        }
    }

}
