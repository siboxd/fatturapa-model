package com.github.siboxd.fatturapa.model.invoicebody.payment;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * It contains information related to the payment in terms of conditions, methods and terms
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiPagamento")
public class DatiPagamento {

    @Element(name = "CondizioniPagamento")
    private CondizioniPagamento condizioniPagamento;

    @ElementList(name = "DettaglioPagamento", entry = "DettaglioPagamento", inline = true)
    private List<DettaglioPagamento> dettaglioPagamento;

    public DatiPagamento() {
    }

    public CondizioniPagamento getCondizioniPagamento() {
        return condizioniPagamento;
    }

    public void setCondizioniPagamento(final CondizioniPagamento condizioniPagamento) {
        this.condizioniPagamento = condizioniPagamento;
    }

    public List<DettaglioPagamento> getDettaglioPagamento() {
        return dettaglioPagamento;
    }

    public void setDettaglioPagamento(final List<DettaglioPagamento> dettaglioPagamento) {
        this.dettaglioPagamento = dettaglioPagamento;
    }

}
