package com.github.siboxd.fatturapa.model.invoicebody.payment;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It serves to indicate the payment terms provided for the sale of the goods or the provision
 * of the service being billed.
 */
@Root(name = "CondizioniPagamentoType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum CondizioniPagamentoType {
    /**
     * Payment in installments
     */
    TP01,
    /**
     * Total payment in one solution
     */
    TP02,
    /**
     * Payment of an advance
     */
    TP03

}
