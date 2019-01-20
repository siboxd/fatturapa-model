package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It is used to identify the type of document.
 */
@Root(name = "TipoDocumentoType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum TipoDocumentoType {
    /**
     * Invoice
     */
    TD01,
    /**
     * Advance on invoice
     */
    TD02,
    /**
     * Advance on fee
     */
    TD03,
    /**
     * Credit Note
     */
    TD04,
    /**
     * Debit Note
     */
    TD05,
    /**
     * Fee
     */
    TD06

}
