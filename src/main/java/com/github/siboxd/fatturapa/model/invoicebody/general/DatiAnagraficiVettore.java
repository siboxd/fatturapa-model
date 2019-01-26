package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicecommon.AbstractDatiAnagrafici;
import com.github.siboxd.fatturapa.model.invoicecommon.Anagrafica;
import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * It contains the carrier personal data
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiAnagraficiVettore")
@Order(elements = {"IdFiscaleIVA", "CodiceFiscale", "Anagrafica", "NumeroLicenzaGuida"})
public final class DatiAnagraficiVettore extends AbstractDatiAnagrafici {

    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    @Element(name = "NumeroLicenzaGuida", required = false)
    private String numeroLicenzaGuida;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiAnagraficiVettore() {
    }

    private DatiAnagraficiVettore(@NonNull final Builder builder) {
        super(builder);
        idFiscaleIVA = builder.idFiscaleIVA;
        numeroLicenzaGuida = builder.numeroLicenzaGuida;
    }

    @NonNull
    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    @Nullable
    public String getNumeroLicenzaGuida() {
        return numeroLicenzaGuida;
    }

    /**
     * {@code DatiAnagraficiVettore} builder static inner class.
     */
    public static final class Builder extends AbstractDatiAnagrafici.Builder<Builder> {
        private IdFiscale idFiscaleIVA;
        private String numeroLicenzaGuida;

        public Builder(@NonNull final IdFiscale idFiscaleIVA,
                       @NonNull final Anagrafica anagrafica) {
            super(anagrafica);
            this.idFiscaleIVA = idFiscaleIVA;
        }

        public Builder(@NonNull final DatiAnagraficiVettore copy) {
            super(copy);
            this.idFiscaleIVA = copy.getIdFiscaleIVA();
            this.numeroLicenzaGuida = copy.getNumeroLicenzaGuida();
        }

        public Builder idFiscaleIVA(@NonNull final IdFiscale idFiscaleIVA) {
            this.idFiscaleIVA = idFiscaleIVA;
            return this;
        }

        /**
         * It is used to uniquely identify the person driving the vehicle in which the goods to be
         * transported are contained (eg driving license number).
         *
         * @param numeroLicenzaGuida no particular criteria is established
         */
        public Builder numeroLicenzaGuida(@Nullable final String numeroLicenzaGuida) {
            this.numeroLicenzaGuida = numeroLicenzaGuida;
            return this;
        }

        /**
         * Returns a {@code DatiAnagraficiVettore} built from the parameters previously set.
         *
         * @return a {@code DatiAnagraficiVettore} built with parameters of this {@code DatiAnagraficiVettore.Builder}
         */
        public DatiAnagraficiVettore build() {
            return new DatiAnagraficiVettore(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
