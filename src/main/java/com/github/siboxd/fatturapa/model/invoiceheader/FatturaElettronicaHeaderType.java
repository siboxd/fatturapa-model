package com.github.siboxd.fatturapa.model.invoiceheader;

import com.github.siboxd.fatturapa.model.invoiceheader.buyer.CessionarioCommittenteType;
import com.github.siboxd.fatturapa.model.invoiceheader.fiscalagent.RappresentanteFiscaleType;
import com.github.siboxd.fatturapa.model.invoiceheader.supplier.CedentePrestatoreType;
import com.github.siboxd.fatturapa.model.invoiceheader.thirdpartyintermediary.TerzoIntermediarioSoggettoEmittenteType;
import com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata.DatiTrasmissioneType;

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
@Root(name = "FatturaElettronicaHeaderType")
public class FatturaElettronicaHeaderType {

    @Element(name = "DatiTrasmissione")
    private DatiTrasmissioneType datiTrasmissione;

    @Element(name = "CedentePrestatore")
    private CedentePrestatoreType cedentePrestatore;

    @Element(name = "RappresentanteFiscale", required = false)
    private RappresentanteFiscaleType rappresentanteFiscale;

    @Element(name = "CessionarioCommittente")
    private CessionarioCommittenteType cessionarioCommittente;

    @Element(name = "TerzoIntermediarioOSoggettoEmittente", required = false)
    private TerzoIntermediarioSoggettoEmittenteType terzoIntermediarioOSoggettoEmittente;

    @Element(name = "SoggettoEmittente", required = false)
    private SoggettoEmittenteType soggettoEmittente;

    public FatturaElettronicaHeaderType() {
    }

    public DatiTrasmissioneType getDatiTrasmissione() {
        return datiTrasmissione;
    }

    public void setDatiTrasmissione(final DatiTrasmissioneType datiTrasmissione) {
        this.datiTrasmissione = datiTrasmissione;
    }

    public CedentePrestatoreType getCedentePrestatore() {
        return cedentePrestatore;
    }

    public void setCedentePrestatore(final CedentePrestatoreType cedentePrestatore) {
        this.cedentePrestatore = cedentePrestatore;
    }

    public RappresentanteFiscaleType getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is configured as a non-resident entity that
     * carries out operations relevant to VAT in Italy, and which makes use of a tax representative
     * in Italy.
     */
    public void setRappresentanteFiscale(final RappresentanteFiscaleType rappresentanteFiscale) {
        this.rappresentanteFiscale = rappresentanteFiscale;
    }

    public CessionarioCommittenteType getCessionarioCommittente() {
        return cessionarioCommittente;
    }

    public void setCessionarioCommittente(final CessionarioCommittenteType cessionarioCommittente) {
        this.cessionarioCommittente = cessionarioCommittente;
    }

    public TerzoIntermediarioSoggettoEmittenteType getTerzoIntermediarioOSoggettoEmittente() {
        return terzoIntermediarioOSoggettoEmittente;
    }

    /**
     * To be valued only if the commitment to issue an electronic invoice on behalf of the seller
     * is taken by a third party on the basis of a prior agreement;
     * <p>
     * the seller remains responsible for the tax compliance.
     */
    public void setTerzoIntermediarioOSoggettoEmittente(final TerzoIntermediarioSoggettoEmittenteType terzoIntermediarioOSoggettoEmittente) {
        this.terzoIntermediarioOSoggettoEmittente = terzoIntermediarioOSoggettoEmittente;
    }

    public SoggettoEmittenteType getSoggettoEmittente() {
        return soggettoEmittente;
    }

    /**
     * <b>Note:</b> To be valued only if the invoice is issued by a person other than the seller.
     */
    public void setSoggettoEmittente(final SoggettoEmittenteType soggettoEmittente) {
        this.soggettoEmittente = soggettoEmittente;
    }

}
