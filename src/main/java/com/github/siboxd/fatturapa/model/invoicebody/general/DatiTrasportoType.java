package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicecommon.IndirizzoType;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Block of data describing the transport of the transferred goods
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiTrasportoType")
public class DatiTrasportoType {

    @Element(name = "DatiAnagraficiVettore", required = false)
    private DatiAnagraficiVettoreType datiAnagraficiVettore;

    @Element(name = "MezzoTrasporto", required = false)
    private String mezzoTrasporto;

    @Element(name = "CausaleTrasporto", required = false)
    private String causaleTrasporto;

    @Element(name = "NumeroColli", required = false)
    private String numeroColli;

    @Element(name = "Descrizione", required = false)
    private String descrizione;

    @Element(name = "UnitaMisuraPeso", required = false)
    private String unitaMisuraPeso;

    @Element(name = "PesoLordo", required = false)
    private String pesoLordo;

    @Element(name = "PesoNetto", required = false)
    private String pesoNetto;

    @Element(name = "DataOraRitiro", required = false)
    private String dataOraRitiro;

    @Element(name = "DataInizioTrasporto", required = false)
    private String dataInizioTrasporto;

    @Element(name = "TipoResa", required = false)
    private String tipoResa;

    @Element(name = "IndirizzoResa", required = false)
    private IndirizzoType indirizzoResa;

    @Element(name = "DataOraConsegna", required = false)
    private String dataOraConsegna;

    public DatiTrasportoType() {
    }

    public DatiAnagraficiVettoreType getDatiAnagraficiVettore() {
        return datiAnagraficiVettore;
    }

    public void setDatiAnagraficiVettore(final DatiAnagraficiVettoreType datiAnagraficiVettore) {
        this.datiAnagraficiVettore = datiAnagraficiVettore;
    }

    public String getMezzoTrasporto() {
        return mezzoTrasporto;
    }

    /**
     * It is used to identify the means by which the goods are transported.
     *
     * @param mezzoTrasporto no particular criteria is established
     */
    public void setMezzoTrasporto(final String mezzoTrasporto) {
        this.mezzoTrasporto = mezzoTrasporto;
    }

    public String getCausaleTrasporto() {
        return causaleTrasporto;
    }

    /**
     * It is used to identify the goods that are handled (for example, for purchase, sale,
     * processing, deposit or loan for use, vision, repair ...).
     *
     * @param causaleTrasporto no particular criteria is established
     */
    public void setCausaleTrasporto(final String causaleTrasporto) {
        this.causaleTrasporto = causaleTrasporto;
    }

    public String getNumeroColli() {
        return numeroColli;
    }

    /**
     * It is used to visually identify the number of packages containing the goods transported.
     *
     * @param numeroColli The field, if evaluated, must contain an integer value of up to 4 digits.
     */
    public void setNumeroColli(final String numeroColli) {
        this.numeroColli = numeroColli; // TODO: 20/01/2019 add checks
    }

    public String getDescrizione() {
        return descrizione;
    }

    /**
     * It is used to identify the nature, quality and quantity of the goods transported.
     *
     * @param descrizione no particular criteria is established
     */
    public void setDescrizione(final String descrizione) {
        this.descrizione = descrizione;
    }

    public String getUnitaMisuraPeso() {
        return unitaMisuraPeso;
    }

    /**
     * Used to indicate the unit of measurement referred to the weight of the goods transported.
     *
     * @param unitaMisuraPeso no particular criteria is established
     */
    public void setUnitaMisuraPeso(final String unitaMisuraPeso) {
        this.unitaMisuraPeso = unitaMisuraPeso;
    }

    public String getPesoLordo() {
        return pesoLordo;
    }

    /**
     * Used to indicate the gross weight of the goods transported
     *
     * @param pesoLordo The field, if valued, must contain a numerical value consisting of an
     *                  integer and two decimal places. The decimals, separated by the whole with
     *                  the dot character ("."), Must always be indicated even if zero (eg: 320.00).
     */
    public void setPesoLordo(final String pesoLordo) {
        this.pesoLordo = pesoLordo;
    }

    public String getPesoNetto() {
        return pesoNetto;
    }

    /**
     * Used to indicate the net weight of the goods transported
     *
     * @param pesoNetto The field, if valued, must contain a numerical value consisting of an
     *                  integer and two decimal places. The decimals, separated by the whole with
     *                  the dot character ("."), Must always be indicated even if zero (eg: 320.00).
     */
    public void setPesoNetto(final String pesoNetto) {
        this.pesoNetto = pesoNetto;
    }

    public String getDataOraRitiro() {
        return dataOraRitiro;
    }

    /**
     * It serves to indicate the date and time when the goods leave the site of the seller.
     *
     * @param dataOraRitiro The field, if evaluated, must contain a date-time value expressed in
     *                      the format YYYY-MM-DDTHH:MM:SS (ISO 8601: 2004 standard).
     */
    public void setDataOraRitiro(final String dataOraRitiro) {
        this.dataOraRitiro = dataOraRitiro; // TODO: 20/01/2019 add checks
    }

    public String getDataInizioTrasporto() {
        return dataInizioTrasporto;
    }

    /**
     * It is used to indicate the date when the transport of goods begins.
     *
     * @param dataInizioTrasporto The field, if evaluated, must contain the transport start date
     *                            in YYYY-MM-DD format (ISO 8601: 2004 standard).
     */
    public void setDataInizioTrasporto(final String dataInizioTrasporto) {
        this.dataInizioTrasporto = dataInizioTrasporto; // TODO: 20/01/2019 add checks
    }

    public String getTipoResa() {
        return tipoResa;
    }

    /**
     * It serves to highlight the commercial clause aimed at defining the delivery methods of the
     * goods agreed between the buyer and the seller. The International Chamber of Commerce (CCI)
     * has collected under the term "Incoterms" a set of rules, valid all over the world, which
     * allow a precise interpretation of the terms used in purchase and sale contracts.
     *
     * @param tipoResa The field, if evaluated, must contain the Incoterms code consisting of
     *                 3 characters.
     */
    public void setTipoResa(final String tipoResa) {
        this.tipoResa = tipoResa; // TODO: 20/01/2019 add checks
    }

    public IndirizzoType getIndirizzoResa() {
        return indirizzoResa;
    }

    public void setIndirizzoResa(final IndirizzoType indirizzoResa) {
        this.indirizzoResa = indirizzoResa;
    }

    public String getDataOraConsegna() {
        return dataOraConsegna;
    }

    /**
     * It serves to indicate the date and time when the goods were delivered to the recipient.
     * @param dataOraConsegna The field, if evaluated, must contain a given value expressed in the
     *                        format YYYY-MM-DDTHH:MM:SS (ISO 8601: 2004 standard).
     */
    public void setDataOraConsegna(final String dataOraConsegna) {
        this.dataOraConsegna = dataOraConsegna; // TODO: 20/01/2019 add checks
    }

}
