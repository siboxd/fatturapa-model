package com.github.siboxd.fatturapa.model.invoicebody.products;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It indicates the VAT (deferred or immediate) VAT payment regime or the possible subjection of
 * the transaction to the mechanism of the payment splitting (MEF decree 23 January 2015).
 */
@Root(name = "EsigibilitaIVA")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum EsigibilitaIVA {
    /**
     * Deferred repayment
     */
    D,
    /**
     * Immediate payment
     */
    I,
    /**
     * Splitting of payments
     */
    S

}
