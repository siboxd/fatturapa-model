package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.invoicecommon.Indirizzo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This block contains the data relating to the transferee or customer of the good/service being billed.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "CessionarioCommittente")
public final class CessionarioCommittente {

    @Element(name = "DatiAnagrafici")
    private DatiAnagraficiCessionario datiAnagrafici;

    @Element(name = "Sede")
    private Indirizzo sede;

    @Element(name = "StabileOrganizzazione", required = false)
    private Indirizzo stabileOrganizzazione;

    @Element(name = "RappresentanteFiscale", required = false)
    private RappresentanteFiscaleCessionario rappresentanteFiscale;

    public CessionarioCommittente() {
    }

    public DatiAnagraficiCessionario getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(final DatiAnagraficiCessionario datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public Indirizzo getSede() {
        return sede;
    }

    public void setSede(final Indirizzo sede) {
        this.sede = sede;
    }

    public Indirizzo getStabileOrganizzazione() {
        return stabileOrganizzazione;
    }

    /**
     * <b>Note:</b> To be valued only if the buyer is a person who does not reside in Italy
     * but who, in Italy, has a permanent establishment through which he carries out his business
     * (he makes sales of goods or services that are billed)
     */
    public void setStabileOrganizzazione(final Indirizzo stabileOrganizzazione) {
        this.stabileOrganizzazione = stabileOrganizzazione;
    }

    public RappresentanteFiscaleCessionario getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is configured as a non-resident entity that
     * carries out operations relevant to VAT in Italy, and which makes use of a tax representative
     * in Italy.
     */
    public void setRappresentanteFiscale(final RappresentanteFiscaleCessionario rappresentanteFiscale) {
        this.rappresentanteFiscale = rappresentanteFiscale;
    }

}
