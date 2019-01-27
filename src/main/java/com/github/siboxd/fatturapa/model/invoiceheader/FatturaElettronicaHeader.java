package com.github.siboxd.fatturapa.model.invoiceheader;

import com.github.siboxd.fatturapa.model.invoiceheader.buyer.CessionarioCommittente;
import com.github.siboxd.fatturapa.model.invoiceheader.fiscalagent.RappresentanteFiscale;
import com.github.siboxd.fatturapa.model.invoiceheader.supplier.CedentePrestatore;
import com.github.siboxd.fatturapa.model.invoiceheader.thirdpartyintermediary.TerzoIntermediarioSoggettoEmittente;
import com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata.DatiTrasmissione;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Constitutes the header part of the invoice document and contains the data of the parties
 * involved in the operation of transfer of the goods or provision of the service, as well as
 * the data necessary to the <em>Interchange System</em> to identify the subject transmitting the file
 * electronically and the recipient to which the file must be delivered.<br><br>
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "FatturaElettronicaHeader")
public final class FatturaElettronicaHeader {

    @Element(name = "DatiTrasmissione")
    private DatiTrasmissione datiTrasmissione;

    @Element(name = "CedentePrestatore")
    private CedentePrestatore cedentePrestatore;

    @Element(name = "RappresentanteFiscale", required = false)
    private RappresentanteFiscale rappresentanteFiscale;

    @Element(name = "CessionarioCommittente")
    private CessionarioCommittente cessionarioCommittente;

    @Element(name = "TerzoIntermediarioOSoggettoEmittente", required = false)
    private TerzoIntermediarioSoggettoEmittente terzoIntermediarioOSoggettoEmittente;

    @Element(name = "SoggettoEmittente", required = false)
    private SoggettoEmittente soggettoEmittente;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private FatturaElettronicaHeader() {
    }

    private FatturaElettronicaHeader(@NonNull final Builder builder) {
        datiTrasmissione = builder.datiTrasmissione;
        cedentePrestatore = builder.cedentePrestatore;
        rappresentanteFiscale = builder.rappresentanteFiscale;
        cessionarioCommittente = builder.cessionarioCommittente;
        terzoIntermediarioOSoggettoEmittente = builder.terzoIntermediarioOSoggettoEmittente;
        soggettoEmittente = builder.soggettoEmittente;
    }

    @NonNull
    public DatiTrasmissione getDatiTrasmissione() {
        return datiTrasmissione;
    }

    @NonNull
    public CedentePrestatore getCedentePrestatore() {
        return cedentePrestatore;
    }

    @Nullable
    public RappresentanteFiscale getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    @NonNull
    public CessionarioCommittente getCessionarioCommittente() {
        return cessionarioCommittente;
    }

    @Nullable
    public TerzoIntermediarioSoggettoEmittente getTerzoIntermediarioOSoggettoEmittente() {
        return terzoIntermediarioOSoggettoEmittente;
    }

    @Nullable
    public SoggettoEmittente getSoggettoEmittente() {
        return soggettoEmittente;
    }

    /**
     * {@code FatturaElettronicaHeader} builder static inner class.
     */
    public static final class Builder {
        private DatiTrasmissione datiTrasmissione;
        private CedentePrestatore cedentePrestatore;
        private RappresentanteFiscale rappresentanteFiscale;
        private CessionarioCommittente cessionarioCommittente;
        private TerzoIntermediarioSoggettoEmittente terzoIntermediarioOSoggettoEmittente;
        private SoggettoEmittente soggettoEmittente;

        public Builder(@NonNull final DatiTrasmissione datiTrasmissione,
                       @NonNull final CedentePrestatore cedentePrestatore,
                       @NonNull final CessionarioCommittente cessionarioCommittente) {
            this.datiTrasmissione = datiTrasmissione;
            this.cedentePrestatore = cedentePrestatore;
            this.cessionarioCommittente = cessionarioCommittente;
        }

        public Builder(@NonNull final FatturaElettronicaHeader copy) {
            this(copy.getDatiTrasmissione(), copy.getCedentePrestatore(), copy.getCessionarioCommittente());
            this.rappresentanteFiscale = copy.getRappresentanteFiscale();
            this.terzoIntermediarioOSoggettoEmittente = copy.getTerzoIntermediarioOSoggettoEmittente();
            this.soggettoEmittente = copy.getSoggettoEmittente();
        }

        public Builder datiTrasmissione(@NonNull final DatiTrasmissione datiTrasmissione) {
            this.datiTrasmissione = datiTrasmissione;
            return this;
        }

        public Builder cedentePrestatore(@NonNull final CedentePrestatore cedentePrestatore) {
            this.cedentePrestatore = cedentePrestatore;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the seller is configured as a non-resident entity that
         * carries out operations relevant to VAT in Italy, and which makes use of a tax representative
         * in Italy.
         */
        public Builder rappresentanteFiscale(@Nullable final RappresentanteFiscale rappresentanteFiscale) {
            this.rappresentanteFiscale = rappresentanteFiscale;
            return this;
        }

        public Builder cessionarioCommittente(@NonNull final CessionarioCommittente cessionarioCommittente) {
            this.cessionarioCommittente = cessionarioCommittente;
            return this;
        }

        /**
         * To be valued only if the commitment to issue an electronic invoice on behalf of the seller
         * is taken by a third party on the basis of a prior agreement;
         * <p>
         * the seller remains responsible for the tax compliance.
         */
        public Builder terzoIntermediarioOSoggettoEmittente(@Nullable final TerzoIntermediarioSoggettoEmittente terzoIntermediarioOSoggettoEmittente) {
            this.terzoIntermediarioOSoggettoEmittente = terzoIntermediarioOSoggettoEmittente;
            return this;
        }

        /**
         * <b>Note:</b> To be valued only if the invoice is issued by a person other than the seller.
         */
        public Builder soggettoEmittente(@Nullable final SoggettoEmittente soggettoEmittente) {
            this.soggettoEmittente = soggettoEmittente;
            return this;
        }

        /**
         * Returns a {@code FatturaElettronicaHeader} built from the parameters previously set.
         *
         * @return a {@code FatturaElettronicaHeader} built with parameters of this {@code FatturaElettronicaHeader.Builder}
         */
        public FatturaElettronicaHeader build() {
            return new FatturaElettronicaHeader(this);
        }
    }

}
