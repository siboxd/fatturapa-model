package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import com.github.siboxd.fatturapa.model.invoicecommon.Indirizzo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This block contains the data relating to the seller of the good / service being billed.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "CedentePrestatore")
public final class CedentePrestatore {

    @Element(name = "DatiAnagrafici")
    private DatiAnagraficiCedente datiAnagrafici;

    @Element(name = "Sede")
    private Indirizzo sede;

    @Element(name = "StabileOrganizzazione", required = false)
    private Indirizzo stabileOrganizzazione;

    @Element(name = "IscrizioneREA", required = false)
    private IscrizioneREA iscrizioneREA;

    @Element(name = "Contatti", required = false)
    private Contatti contatti;

    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;

    public CedentePrestatore() {
    }

    public DatiAnagraficiCedente getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(final DatiAnagraficiCedente datiAnagrafici) {
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
     * <b>Note:</b> To be valued only if the supplier is a person who does not reside in Italy
     * but who, in Italy, has a permanent establishment through which he carries out his business
     * (he makes sales of goods or services that are billed)
     */
    public void setStabileOrganizzazione(final Indirizzo stabileOrganizzazione) {
        this.stabileOrganizzazione = stabileOrganizzazione;
    }

    public IscrizioneREA getIscrizioneREA() {
        return iscrizioneREA;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is a company registered in the business register
     * and as such has the obligation to indicate in all the documents also the registration data
     * (Article 2250 of the Italian Civil Code)
     */
    public void setIscrizioneREA(final IscrizioneREA iscrizioneREA) {
        this.iscrizioneREA = iscrizioneREA;
    }

    public Contatti getContatti() {
        return contatti;
    }

    public void setContatti(final Contatti contatti) {
        this.contatti = contatti;
    }

    public String getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    /**
     * The field was designed to enter a value on the invoice, referred to the seller, which could
     * somehow facilitate the automatic processing of the invoice by the recipient.
     * Think, just by way of example:
     * <ul>
     * <li>the code with which the seller / lender is "known" in a supplier database managed
     * by the person receiving the invoice;</li>
     * <li>the code of an item present in the accounting system of the invoice recipient useful
     * for the automatic registration of transactions concerning that seller in accounting;</li>
     * <li>etc...</li>
     * </ul>
     *
     * @param riferimentoAmministrazione No particular valuation criteria are established; <br>
     *                                   <p>
     *                                   the method of exploiting the field, with a view to use such
     *                                   as the one above, is necessarily the result of an agreement
     *                                   between the parties, the recipient of the document on one
     *                                   hand and compiler of the document on the other
     */
    public void setRiferimentoAmministrazione(final String riferimentoAmministrazione) {
        this.riferimentoAmministrazione = riferimentoAmministrazione;
    }

}
