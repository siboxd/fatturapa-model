package com.github.siboxd.fatturapa.model.invoicebody.payment;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.Collections;
import java.util.List;

import static com.github.siboxd.fatturapa.model.utils.Lists.defensiveCopy;


/**
 * It contains information related to the payment in terms of conditions, methods and terms
 */
@Root(name = "DatiPagamento")
@Order(elements = {"CondizioniPagamento","DettaglioPagamento"})
public final class DatiPagamento {

    @Element(name = "CondizioniPagamento")
    private final CondizioniPagamento condizioniPagamento;

    @ElementList(name = "DettaglioPagamento", entry = "DettaglioPagamento", inline = true)
    private final List<DettaglioPagamento> dettaglioPagamento;

    public DatiPagamento(@Element(name = "CondizioniPagamento") @NonNull final CondizioniPagamento condizioniPagamento,
                         @ElementList(name = "DettaglioPagamento") @NonNull final List<DettaglioPagamento> dettaglioPagamento) {

        this.condizioniPagamento = condizioniPagamento;
        this.dettaglioPagamento = defensiveCopy(dettaglioPagamento); // TODO: 27/01/2019 refuse constructing with null or empty list
    }

    @NonNull
    public CondizioniPagamento getCondizioniPagamento() {
        return condizioniPagamento;
    }

    @NonNull
    public List<DettaglioPagamento> getDettaglioPagamento() {
        return Collections.unmodifiableList(dettaglioPagamento);
    }

}
