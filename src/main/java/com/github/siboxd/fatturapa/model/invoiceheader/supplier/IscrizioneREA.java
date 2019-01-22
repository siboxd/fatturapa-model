package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the registration information to the REA (Administrative Economic Repertory)
 * at the company registry office
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "IscrizioneREA")
public class IscrizioneREA {

    @Element(name = "Ufficio")
    private String ufficio;

    @Element(name = "NumeroREA")
    private String numeroREA;

    @Element(name = "CapitaleSociale", required = false)
    private String capitaleSociale;

    @Element(name = "SocioUnico", required = false)
    private SocioUnico socioUnico;

    @Element(name = "StatoLiquidazione")
    private StatoLiquidazione statoLiquidazione;

    public IscrizioneREA() {
    }

    public String getUfficio() {
        return ufficio;
    }

    /**
     * Office's Province
     *
     * @param ufficio The field must contain the abbreviation of the province of the registry
     *                of companies with which the supplier is registered.
     */
    public void setUfficio(final String ufficio) {
        this.ufficio = ufficio;
    }

    public String getNumeroREA() {
        return numeroREA;
    }

    /**
     * REA number
     *
     * @param numeroREA The field must contain the number with which the seller is registered with
     *                  the business register.
     */
    public void setNumeroREA(final String numeroREA) {
        this.numeroREA = numeroREA;
    }

    public String getCapitaleSociale() {
        return capitaleSociale;
    }

    /**
     * Social capital amount
     * <br><br>
     * <b>Note:</b> must be valued only if seller is a capital company (SpA, SApA, Srl)
     *
     * @param capitaleSociale The field must contain the amount of the capital actually paid as
     *                        resulting from the last financial statements;<br>
     *                        it must be a numeric value composed of an integer and two decimals;<br>
     *                        the decimals, separated by the whole with the dot character ("."),
     *                        must always be indicated even if zero (eg: 28000000.00).
     */
    public void setCapitaleSociale(final String capitaleSociale) {
        this.capitaleSociale = capitaleSociale;
    }

    public SocioUnico getSocioUnico() {
        return socioUnico;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is a it is a limited liability company (Srl).
     */
    public void setSocioUnico(final SocioUnico socioUnico) {
        this.socioUnico = socioUnico;
    }

    public StatoLiquidazione getStatoLiquidazione() {
        return statoLiquidazione;
    }

    public void setStatoLiquidazione(final StatoLiquidazione statoLiquidazione) {
        this.statoLiquidazione = statoLiquidazione;
    }

}
