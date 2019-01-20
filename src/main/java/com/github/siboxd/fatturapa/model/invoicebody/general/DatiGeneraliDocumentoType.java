package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.Art73Type;
import com.github.siboxd.fatturapa.model.ScontoMaggiorazioneType;
import com.github.siboxd.fatturapa.model.invoicebody.general.pensionfund.DatiCassaPrevidenzialeType;

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
@Root(name = "DatiGeneraliDocumentoType")
public class DatiGeneraliDocumentoType {

    @Element(name = "TipoDocumento")
    private TipoDocumentoType tipoDocumento;

    @Element(name = "Divisa")
    private String divisa;

    @Element(name = "Data")
    private String data;

    @Element(name = "Numero")
    private String numero;

    @Element(name = "DatiRitenuta", required = false)
    private DatiRitenutaType datiRitenuta;

    @Element(name = "DatiBollo", required = false)
    private DatiBolloType datiBollo;

    @ElementList(name = "DatiCassaPrevidenziale", entry = "DatiCassaPrevidenziale", inline = true, required = false)
    private List<DatiCassaPrevidenzialeType> datiCassaPrevidenziale;

    @ElementList(name = "ScontoMaggiorazione", entry = "ScontoMaggiorazione", inline = true, required = false)
    private List<ScontoMaggiorazioneType> scontoMaggiorazione;

    @Element(name = "ImportoTotaleDocumento", required = false)
    private String importoTotaleDocumento;

    @Element(name = "Arrotondamento", required = false)
    private String arrotondamento;

    @ElementList(name = "Causale", entry = "Causale", inline = true, required = false)
    private List<String> causale;

    @Element(name = "Art73", required = false)
    private Art73Type art73;

    public DatiGeneraliDocumentoType() {
    }

    public TipoDocumentoType getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(final TipoDocumentoType tipoDocumento) {
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

    public DatiRitenutaType getDatiRitenuta() {
        return datiRitenuta;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is subject to withholding tax or on a permanent basis
     */
    public void setDatiRitenuta(final DatiRitenutaType datiRitenuta) {
        this.datiRitenuta = datiRitenuta;
    }

    public DatiBolloType getDatiBollo() {
        return datiBollo;
    }

    /**
     * <b>Note:</b> To be valued only if the stamp duty is required on the type of document/transaction.
     */
    public void setDatiBollo(final DatiBolloType datiBollo) {
        this.datiBollo = datiBollo;
    }

    public List<DatiCassaPrevidenzialeType> getDatiCassaPrevidenziale() {
        return datiCassaPrevidenziale;
    }

    /**
     * <b>Note:</b> To be valued only if the seller is a party required to pay the social security
     * contribution to their category cash desk or to the INPS (National Social Security Institute)
     * (or both)
     */
    public void setDatiCassaPrevidenziale(final List<DatiCassaPrevidenzialeType> datiCassaPrevidenziale) {
        this.datiCassaPrevidenziale = datiCassaPrevidenziale;
    }

    public List<ScontoMaggiorazioneType> getScontoMaggiorazione() {
        return scontoMaggiorazione;
    }

    public void setScontoMaggiorazione(final List<ScontoMaggiorazioneType> scontoMaggiorazione) {
        this.scontoMaggiorazione = scontoMaggiorazione;
    }

    public String getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    public void setImportoTotaleDocumento(final String importoTotaleDocumento) {
        this.importoTotaleDocumento = importoTotaleDocumento;
    }

    public String getArrotondamento() {
        return arrotondamento;
    }

    public void setArrotondamento(final String arrotondamento) {
        this.arrotondamento = arrotondamento;
    }

    public List<String> getCausale() {
        return causale;
    }

    public void setCausale(final List<String> causale) {
        this.causale = causale;
    }

    public Art73Type getArt73() {
        return art73;
    }

    public void setArt73(final Art73Type art73) {
        this.art73 = art73;
    }

}
