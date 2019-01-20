package com.github.siboxd.fatturapa.model.invoicebody;

import com.github.siboxd.fatturapa.model.invoicebody.general.TipoScontoMaggiorazioneType;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Describes the discounts or surcharges applied on the total invoice
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "ScontoMaggiorazioneType")
public class ScontoMaggiorazioneType {

    @Element(name = "Tipo")
    private TipoScontoMaggiorazioneType tipo;

    @Element(name = "Percentuale", required = false)
    private String percentuale;

    @Element(name = "Importo", required = false)
    private String importo;

    public ScontoMaggiorazioneType() {
    }

    public TipoScontoMaggiorazioneType getTipo() {
        return tipo;
    }

    public void setTipo(final TipoScontoMaggiorazioneType tipo) {
        this.tipo = tipo;
    }

    public String getPercentuale() {
        return percentuale;
    }

    /**
     * @param percentuale It must contain the percentage value of the discount / surcharge.
     *                    The decimals, separated by the whole with the dot character ("."),
     *                    Must always be indicated even if zero (eg: 5.00).
     */
    public void setPercentuale(final String percentuale) {
        this.percentuale = percentuale;
    }

    public String getImporto() {
        return importo;
    }

    /**
     * <b>Note:</b> this fields takes precedence over the Percentuale field, in validating process
     *
     * @param importo The field contains a numeric value consisting of an integer and two decimal
     *                places. The decimals, separated by the whole with the dot character ("."),
     *                Must always be indicated even if zero (eg: 55.00).
     */
    public void setImporto(final String importo) {
        this.importo = importo;
    }

}
