package com.github.siboxd.fatturapa.model.invoiceheader;

import com.github.siboxd.fatturapa.model.invoiceheader.buyer.CessionarioCommittente;
import com.github.siboxd.fatturapa.model.invoiceheader.fiscalagent.RappresentanteFiscale;
import com.github.siboxd.fatturapa.model.invoiceheader.supplier.CedentePrestatore;
import com.github.siboxd.fatturapa.model.invoiceheader.thirdpartyintermediary.TerzoIntermediarioSoggettoEmittente;
import com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata.DatiTrasmissione;

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
public class FatturaElettronicaHeader {

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

    public FatturaElettronicaHeader() {
    }

    public DatiTrasmissione getDatiTrasmissione() {
        return datiTrasmissione;
    }

    public void setDatiTrasmissione(final DatiTrasmissione datiTrasmissione) {
        this.datiTrasmissione = datiTrasmissione;
    }

    public CedentePrestatore getCedentePrestatore() {
        return cedentePrestatore;
    }

    public void setCedentePrestatore(final CedentePrestatore cedentePrestatore) {
        this.cedentePrestatore = cedentePrestatore;
    }

    public RappresentanteFiscale getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is configured as a non-resident entity that
     * carries out operations relevant to VAT in Italy, and which makes use of a tax representative
     * in Italy.
     */
    public void setRappresentanteFiscale(final RappresentanteFiscale rappresentanteFiscale) {
        this.rappresentanteFiscale = rappresentanteFiscale;
    }

    public CessionarioCommittente getCessionarioCommittente() {
        return cessionarioCommittente;
    }

    public void setCessionarioCommittente(final CessionarioCommittente cessionarioCommittente) {
        this.cessionarioCommittente = cessionarioCommittente;
    }

    public TerzoIntermediarioSoggettoEmittente getTerzoIntermediarioOSoggettoEmittente() {
        return terzoIntermediarioOSoggettoEmittente;
    }

    /**
     * To be valued only if the commitment to issue an electronic invoice on behalf of the seller
     * is taken by a third party on the basis of a prior agreement;
     * <p>
     * the seller remains responsible for the tax compliance.
     */
    public void setTerzoIntermediarioOSoggettoEmittente(final TerzoIntermediarioSoggettoEmittente terzoIntermediarioOSoggettoEmittente) {
        this.terzoIntermediarioOSoggettoEmittente = terzoIntermediarioOSoggettoEmittente;
    }

    public SoggettoEmittente getSoggettoEmittente() {
        return soggettoEmittente;
    }

    /**
     * <b>Note:</b> To be valued only if the invoice is issued by a person other than the seller.
     */
    public void setSoggettoEmittente(final SoggettoEmittente soggettoEmittente) {
        this.soggettoEmittente = soggettoEmittente;
    }

}
