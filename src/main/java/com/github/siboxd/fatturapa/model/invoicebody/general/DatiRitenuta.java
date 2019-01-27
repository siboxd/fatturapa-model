package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.checkerframework.checker.nullness.qual.NonNull;
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
public final class DatiRitenuta {

    @Element(name = "TipoRitenuta")
    private final TipoRitenuta tipoRitenuta;

    @Element(name = "ImportoRitenuta")
    private final String importoRitenuta;

    @Element(name = "AliquotaRitenuta")
    private final String aliquotaRitenuta;

    @Element(name = "CausalePagamento")
    private final CausalePagamento causalePagamento;

    /**
     * @param tipoRitenuta     The type of withholding
     * @param importoRitenuta  The field contains a numeric value consisting of an integer and two
     *                         decimal places.<br>
     *                         The decimals, separated by the whole with the dot character ("."), Must
     *                         always be indicated even if zero (eg: 450.00).
     * @param aliquotaRitenuta It assumes the values foreseen by the fiscal legislation.<br>
     *                         The decimals, separated by the whole with the dot character ("."),
     *                         Must always be indicated even if zero (eg: 4.00).
     * @param causalePagamento The reason for payment
     */
    public DatiRitenuta(@Element(name = "TipoRitenuta") @NonNull final TipoRitenuta tipoRitenuta,
                        @Element(name = "ImportoRitenuta") @NonNull final String importoRitenuta,
                        @Element(name = "AliquotaRitenuta") @NonNull final String aliquotaRitenuta,
                        @Element(name = "CausalePagamento") @NonNull final CausalePagamento causalePagamento) {
        this.tipoRitenuta = tipoRitenuta;
        this.importoRitenuta = importoRitenuta;
        this.aliquotaRitenuta = aliquotaRitenuta;
        this.causalePagamento = causalePagamento;
    }

    public TipoRitenuta getTipoRitenuta() {
        return tipoRitenuta;
    }

    public String getImportoRitenuta() {
        return importoRitenuta;
    }

    public String getAliquotaRitenuta() {
        return aliquotaRitenuta;
    }

    public CausalePagamento getCausalePagamento() {
        return causalePagamento;
    }
}
