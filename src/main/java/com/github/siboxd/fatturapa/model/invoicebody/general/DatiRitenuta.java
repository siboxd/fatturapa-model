package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Describes the withholding tax as a down payment or on a permanent basis
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiRitenuta")
public class DatiRitenuta {

    @Element(name = "TipoRitenuta")
    private TipoRitenuta tipoRitenuta;

    @Element(name = "ImportoRitenuta")
    private String importoRitenuta;

    @Element(name = "AliquotaRitenuta")
    private String aliquotaRitenuta;

    @Element(name = "CausalePagamento")
    private CausalePagamento causalePagamento;

    public DatiRitenuta() {
    }

    public TipoRitenuta getTipoRitenuta() {
        return tipoRitenuta;
    }

    public void setTipoRitenuta(final TipoRitenuta tipoRitenuta) {
        this.tipoRitenuta = tipoRitenuta;
    }

    public String getImportoRitenuta() {
        return importoRitenuta;
    }

    /**
     * @param importoRitenuta The field contains a numeric value consisting of an integer and two
     *                        decimal places.<br>
     *                        The decimals, separated by the whole with the dot character ("."), Must
     *                        always be indicated even if zero (eg: 450.00).
     */
    public void setImportoRitenuta(final String importoRitenuta) {
        this.importoRitenuta = importoRitenuta;
    }

    public String getAliquotaRitenuta() {
        return aliquotaRitenuta;
    }

    /**
     * @param aliquotaRitenuta It assumes the values foreseen by the fiscal legislation.<br>
     *                         The decimals, separated by the whole with the dot character ("."),
     *                         Must always be indicated even if zero (eg: 4.00).
     */
    public void setAliquotaRitenuta(final String aliquotaRitenuta) {
        this.aliquotaRitenuta = aliquotaRitenuta;
    }

    public CausalePagamento getCausalePagamento() {
        return causalePagamento;
    }

    public void setCausalePagamento(final CausalePagamento causalePagamento) {
        this.causalePagamento = causalePagamento;
    }

}
