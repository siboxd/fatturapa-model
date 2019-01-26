package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicebody.ScontoMaggiorazione;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * This block contains the general data of the invoice document.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiGeneraliDocumento")
public final class DatiGeneraliDocumento {

    @Element(name = "TipoDocumento")
    private TipoDocumento tipoDocumento;

    @Element(name = "Divisa")
    private String divisa;

    @Element(name = "Data")
    private String data;

    @Element(name = "Numero")
    private String numero;

    @Element(name = "DatiRitenuta", required = false)
    private DatiRitenuta datiRitenuta;

    @Element(name = "DatiBollo", required = false)
    private DatiBollo datiBollo;

    @ElementList(name = "DatiCassaPrevidenziale", entry = "DatiCassaPrevidenziale", inline = true, required = false)
    private List<DatiCassaPrevidenziale> datiCassaPrevidenziale;

    @ElementList(name = "ScontoMaggiorazione", entry = "ScontoMaggiorazione", inline = true, required = false)
    private List<ScontoMaggiorazione> scontoMaggiorazione;

    @Element(name = "ImportoTotaleDocumento", required = false)
    private String importoTotaleDocumento;

    @Element(name = "Arrotondamento", required = false)
    private String arrotondamento;

    @ElementList(name = "Causale", entry = "Causale", inline = true, required = false)
    private List<String> causale;

    @Element(name = "Art73", required = false)
    private Art73 art73;

    public DatiGeneraliDocumento() {
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(final TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDivisa() {
        return divisa;
    }

    /**
     * It is used to identify the account currency.
     *
     * @param divisa The field must contain the currency code used, according to
     *               <em>ISO 4217 alpha-3: 2001</em> (eg "EUR" in the case of euros).
     */
    public void setDivisa(final String divisa) {
        this.divisa = divisa;
    } // TODO: 20/01/2019 can be made checks??

    public String getData() {
        return data;
    }

    /**
     * It is a data required by the legislation and identifies the date of issue of the document.
     *
     * @param data The field contains the date of issue of the document in the format YYYY-MM-DD
     *             (ISO 8601: 2004 standard).
     */
    public void setData(final String data) {
        this.data = data;
    } // TODO: 20/01/2019 add checks

    public String getNumero() {
        return numero;
    }

    /**
     * @param numero The field contains the document number and allows entry of alphanumeric values.
     *               It must contain at least one numeric value (0-9).
     */
    public void setNumero(final String numero) {
        this.numero = numero;
    } // TODO: 20/01/2019 add checks

    public DatiRitenuta getDatiRitenuta() {
        return datiRitenuta;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is subject to withholding tax or on a permanent basis
     */
    public void setDatiRitenuta(final DatiRitenuta datiRitenuta) {
        this.datiRitenuta = datiRitenuta;
    }

    public DatiBollo getDatiBollo() {
        return datiBollo;
    }

    /**
     * <b>Note:</b> To be valued only if the stamp duty is required on the type of document/transaction.
     */
    public void setDatiBollo(final DatiBollo datiBollo) {
        this.datiBollo = datiBollo;
    }

    public List<DatiCassaPrevidenziale> getDatiCassaPrevidenziale() {
        return datiCassaPrevidenziale;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is a party required to pay the social security
     * contribution to their category cash desk or to the INPS (National Social Security Institute)
     * (or both)
     */
    public void setDatiCassaPrevidenziale(final List<DatiCassaPrevidenziale> datiCassaPrevidenziale) {
        this.datiCassaPrevidenziale = datiCassaPrevidenziale;
    }

    public List<ScontoMaggiorazione> getScontoMaggiorazione() {
        return scontoMaggiorazione;
    }

    /**
     * <b>Note:</b> To be valued only if you want to give evidence of the fact that on the total
     * amount of the document is applied by the seller a discount or a surcharge.
     */
    public void setScontoMaggiorazione(final List<ScontoMaggiorazione> scontoMaggiorazione) {
        this.scontoMaggiorazione = scontoMaggiorazione;
    }

    public String getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    /**
     * It is used to show the total amount of the document, less any discount or increase of any
     * increase and including the tax payable to the buyer.
     *
     * @param importoTotaleDocumento The field contains a numeric value consisting of an integer
     *                               and two decimal places. The decimals, separated by the whole
     *                               with the dot character ("."), Must always be indicated even
     *                               if zero (eg: 2500.00).
     */
    public void setImportoTotaleDocumento(final String importoTotaleDocumento) {
        this.importoTotaleDocumento = importoTotaleDocumento;
    }

    public String getArrotondamento() {
        return arrotondamento;
    }

    /**
     * It serves to highlight the eventual rounding applied to the total amount of the document.
     * The value of rounding must be indicated in the field and not the value of the total amount rounded.
     *
     * @param arrotondamento The field contains a numeric value consisting of an integer and two
     *                       decimal places. The decimals, separated by the whole with the dot
     *                       character ("."), Must always be indicated even if zero (eg: 1.00).
     *                       <br><br>
     *                       <em>In case of rounding down, it is preceded by the minus sign ("-")</em>.
     */
    public void setArrotondamento(final String arrotondamento) {
        this.arrotondamento = arrotondamento;
    }

    public List<String> getCausale() {
        return causale;
    }

    /**
     * It is used to indicate the reason for the document
     *
     * @param causale No particular criteria are established; the modality of valorization of the
     *                field, foreseen to contain a description in alphanumeric format
     */
    public void setCausale(final List<String> causale) {
        this.causale = causale;
    }

    public Art73 getArt73() {
        return art73;
    }

    /**
     * <b>Note:</b> To be valued only if the document has been issued in accordance with the terms
     * and conditions established by ministerial decree pursuant to article 73 of Presidential Decree
     * 633/72;<br>
     * <p>
     * This allows the seller to issue several documents having the same number in the same year.
     * <br><br>
     * If evaluated, the check is carried out not with reference to the year only contained in
     * the date field, but with reference to the entire date (day, month and year).
     */
    public void setArt73(final Art73 art73) {
        this.art73 = art73;
    }

}
