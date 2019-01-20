package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.IndirizzoType;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This block contains the data relating to the transferee or customer of the good/service being billed.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "CessionarioCommittenteType")
public class CessionarioCommittenteType {

    @Element(name = "DatiAnagrafici")
    private DatiAnagraficiCessionarioType datiAnagrafici;

    @Element(name = "Sede")
    private IndirizzoType sede;

    @Element(name = "StabileOrganizzazione", required = false)
    private IndirizzoType stabileOrganizzazione;

    @Element(name = "RappresentanteFiscale", required = false)
    private RappresentanteFiscaleCessionarioType rappresentanteFiscale;

    public CessionarioCommittenteType() {
    }

    public DatiAnagraficiCessionarioType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(final DatiAnagraficiCessionarioType datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public IndirizzoType getSede() {
        return sede;
    }

    public void setSede(final IndirizzoType sede) {
        this.sede = sede;
    }

    public IndirizzoType getStabileOrganizzazione() {
        return stabileOrganizzazione;
    }

    /**
     * <b>Note:</b> To be valued only if the buyer is a person who does not reside in Italy
     * but who, in Italy, has a permanent establishment through which he carries out his business
     * (he makes sales of goods or services that are billed)
     */
    public void setStabileOrganizzazione(final IndirizzoType stabileOrganizzazione) {
        this.stabileOrganizzazione = stabileOrganizzazione;
    }

    public RappresentanteFiscaleCessionarioType getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is configured as a non-resident entity that
     * carries out operations relevant to VAT in Italy, and which makes use of a tax representative
     * in Italy.
     */
    public void setRappresentanteFiscale(final RappresentanteFiscaleCessionarioType rappresentanteFiscale) {
        this.rappresentanteFiscale = rappresentanteFiscale;
    }

}
