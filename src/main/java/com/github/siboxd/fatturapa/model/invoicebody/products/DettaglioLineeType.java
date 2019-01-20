package com.github.siboxd.fatturapa.model.invoicebody.products;

import com.github.siboxd.fatturapa.model.invoicebody.NaturaType;
import com.github.siboxd.fatturapa.model.invoicebody.RitenutaType;
import com.github.siboxd.fatturapa.model.invoicebody.ScontoMaggiorazioneType;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Denotes a detail line of the document
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DettaglioLineeType")
public class DettaglioLineeType {

    @Element(name = "NumeroLinea")
    private String numeroLinea;

    @Element(name = "TipoCessionePrestazione", required = false)
    private TipoCessionePrestazioneType tipoCessionePrestazione;

    @ElementList(name = "CodiceArticolo", entry = "CodiceArticolo", inline = true, required = false)
    private List<CodiceArticoloType> codiceArticolo;

    @Element(name = "Descrizione")
    private String descrizione;

    @Element(name = "Quantita", required = false)
    private String quantita;

    @Element(name = "UnitaMisura", required = false)
    private String unitaMisura;

    @Element(name = "DataInizioPeriodo", required = false)
    private String dataInizioPeriodo;

    @Element(name = "DataFinePeriodo", required = false)
    private String dataFinePeriodo;

    @Element(name = "PrezzoUnitario")
    private String prezzoUnitario;

    @ElementList(name = "ScontoMaggiorazione", entry = "ScontoMaggiorazione", inline = true, required = false)
    private List<ScontoMaggiorazioneType> scontoMaggiorazione;

    @Element(name = "PrezzoTotale")
    private String prezzoTotale;

    @Element(name = "AliquotaIVA")
    private String aliquotaIVA;

    @Element(name = "Ritenuta", required = false)
    private RitenutaType ritenuta;

    @Element(name = "Natura", required = false)
    private NaturaType natura;

    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;

    @ElementList(name = "AltriDatiGestionali", entry = "AltriDatiGestionali", inline = true, required = false)
    private List<AltriDatiGestionaliType> altriDatiGestionali;

    public DettaglioLineeType() {
    }

    public String getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * It is used to sort the detail rows (as well as reference for other fields in the plot).
     *
     * @param numeroLinea The field must contain a numeric value starting from 1.
     */
    public void setNumeroLinea(final String numeroLinea) {
        this.numeroLinea = numeroLinea; // TODO: 20/01/2019 add checks
    }

    public TipoCessionePrestazioneType getTipoCessionePrestazione() {
        return tipoCessionePrestazione;
    }

    /**
     * <b>Note:</b> To be valued only if the line that is being valued is related to a discount,
     * premium or discount, or ancillary expense.
     */
    public void setTipoCessionePrestazione(final TipoCessionePrestazioneType tipoCessionePrestazione) {
        this.tipoCessionePrestazione = tipoCessionePrestazione;
    }

    public List<CodiceArticoloType> getCodiceArticolo() {
        return codiceArticolo;
    }

    /**
     * <b>Note:</b> To be valued only if you want to highlight the fact that the article described
     * in the detail line is among those coded according to known types of coding
     * (eg CPV, EAN, TARIC ...)
     */
    public void setCodiceArticolo(final List<CodiceArticoloType> codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    /**
     * This is required by law (Article 21, paragraph 2, letter b of Presidential Decree 633/1972).
     *
     * @param descrizione The field must contain the indication of the nature and quality of
     *                    the good/service object of the operation. It can also refer to a
     *                    previous document issued as an advance.
     */
    public void setDescrizione(final String descrizione) {
        this.descrizione = descrizione;
    }

    public String getQuantita() {
        return quantita;
    }

    /**
     * <b>Note:</b> To be valued only if the good/service is objectively quantifiable.
     *
     * @param quantita The field must contain a quantitative value, expressed according to the unit
     *                 of measure indicated in the UnitaMisura field, composed of an integer and
     *                 decimals ranging from a minimum of two to a maximum of eight digits.
     *                 The decimals, separated by the whole with the dot character ("."),
     *                 Must always be indicated even if zero (eg: 25.00).
     */
    public void setQuantita(final String quantita) {
        this.quantita = quantita;
    }

    public String getUnitaMisura() {
        return unitaMisura;
    }

    /**
     * <b>Note:</b> To be valued only if a quantity has been indicated.
     *
     * @param unitaMisura The field must contain the unit on which the quantification is expressed
     */
    public void setUnitaMisura(final String unitaMisura) {
        this.unitaMisura = unitaMisura;
    }

    public String getDataInizioPeriodo() {
        return dataInizioPeriodo;
    }

    /**
     * <b>Note:</b> To be valued only if the detail line refers to a service whose provision is
     * temporal and distinct for periods.
     *
     * @param dataInizioPeriodo The field must contain the reference period start date in
     *                          YYYY-MM-DD format (ISO 8601: 2004 standard).
     */
    public void setDataInizioPeriodo(final String dataInizioPeriodo) {
        this.dataInizioPeriodo = dataInizioPeriodo;
    }

    public String getDataFinePeriodo() {
        return dataFinePeriodo;
    }

    /**
     * <b>Note:</b> To be valued only if the detail line refers to a service whose provision is
     * temporal and distinct for periods.
     *
     * @param dataFinePeriodo The field must contain the reference period start date in
     *                        YYYY-MM-DD format (ISO 8601: 2004 standard).
     */
    public void setDataFinePeriodo(final String dataFinePeriodo) {
        this.dataFinePeriodo = dataFinePeriodo;
    }

    public String getPrezzoUnitario() {
        return prezzoUnitario;
    }

    /**
     * @param prezzoUnitario The field must contain the value of the unit price or the consideration
     *                       of the good/service. The value is represented by an integer and by
     *                       decimals ranging from a minimum of two to a maximum of eight digits.
     *                       The decimals, separated by the whole with the dot character ("."),
     *                       Must always be indicated even if zero (ex .: 175.00). In the case in which the value must be expressed in negative form (for example in the case in which it represents an advance or an advance), it must be preceded by the minus sign ("-").
     */
    public void setPrezzoUnitario(final String prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public List<ScontoMaggiorazioneType> getScontoMaggiorazione() {
        return scontoMaggiorazione;
    }

    /**
     * <b>Note:</b> To be valued only if the seller applies surcharges or discounts on the price
     * agreed for the good/service of the detail line.
     */
    public void setScontoMaggiorazione(final List<ScontoMaggiorazioneType> scontoMaggiorazione) {
        this.scontoMaggiorazione = scontoMaggiorazione;
    }

    public String getPrezzoTotale() {
        return prezzoTotale; // TODO: 20/01/2019 Calculated fields all over those classes should not be exposed as setters!
    }

    /**
     * It indicates the taxable amount represented by the base value of the transaction,
     * less any discounts and increased by any increase (Article 21, paragraph 2, letter c
     * of Presidential Decree 633/1972).
     *
     * @param prezzoTotale The field must contain the value of the total price (discounted/increased)
     *                     of the good / service. The system checks that this value corresponds to
     *                     the product of the Unit Price, decreased/increased by any discounts /
     *                     surcharges, for the quantity if present (for further details on the
     *                     calculation algorithm, see the Checklist version 1.4 file on the
     *                     www.fatturapa website. gov.it). <br><br>
     *                     The value is represented by an integer and by decimals ranging from a
     *                     minimum of two to a maximum of eight digits. The decimals, separated by
     *                     the whole with the dot character ("."), Must always be indicated even
     *                     if zero (eg: 1540.00).
     */
    public void setPrezzoTotale(final String prezzoTotale) {
        this.prezzoTotale = prezzoTotale;
    }

    public String getAliquotaIVA() {
        return aliquotaIVA;
    }

    /**
     * Indicates the value of the VAT rate (in percentage terms) to be applied to the taxable base
     * for determining the tax (Article 21, paragraph 2, letter c of Presidential Decree 633/1972).
     *
     * @param aliquotaIVA It assumes the values foreseen by the fiscal legislation.
     *                    The decimals, separated by the whole with the dot character ("."),
     *                    Must always be indicated even if zero (eg: 4.00); in the case of
     *                    non-applicability of the tax the field must be valued with zero (0.00).
     *                    The system verifies that the field is expressed in percentage terms (eg 22.00 and not 0.22).
     */
    public void setAliquotaIVA(final String aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;// TODO: 20/01/2019 add checks
    }

    public RitenutaType getRitenuta() {
        return ritenuta;
    }

    /**
     * <b>Note:</b> To be valued only if the transaction is subject to withholding
     */
    public void setRitenuta(final RitenutaType ritenuta) {
        this.ritenuta = ritenuta;
    }

    public NaturaType getNatura() {
        return natura;
    }

    /**
     * <b>Note:</b> To be valued only if the transaction is not included in the taxable "taxable"
     * transactions or in cases of reverse charge.
     */
    public void setNatura(final NaturaType natura) {
        this.natura = natura;
    }

    public String getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    /**
     * It serves to indicate any reference deemed useful for the recipient of the document for
     * administrative-accounting-management purposes in order to facilitate the automatic processing
     * of the invoice by the recipient (think for example, in the chapter of expenditure,
     * in the income statement, ...)
     *
     * @param riferimentoAmministrazione No particular criteria are established;
     *                                   <p>
     *                                   the modality of valorization of the field, with a view to
     *                                   use such as the one outlined above, is necessarily the result
     *                                   of an agreement between the parties
     */
    public void setRiferimentoAmministrazione(final String riferimentoAmministrazione) {
        this.riferimentoAmministrazione = riferimentoAmministrazione;
    }

    public List<AltriDatiGestionaliType> getAltriDatiGestionali() {
        return altriDatiGestionali;
    }

    /**
     * <b>Note:</b> To be valued only if you want to give evidence of additional information that the recipient
     * has requested to include in the document, to refer to each individual detail line of the
     * document itself, having managerial or other usefulness
     */
    public void setAltriDatiGestionali(final List<AltriDatiGestionaliType> altriDatiGestionali) {
        this.altriDatiGestionali = altriDatiGestionali;
    }

}
