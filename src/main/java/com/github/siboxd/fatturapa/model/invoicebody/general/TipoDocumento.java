package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It is used to identify the type of document.
 */
@Root(name = "TipoDocumento")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum TipoDocumento {
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
    TD06,


    // v1.2.1

    /**
     * Internal reverse charge invoice integration
     */
    TD16,
    /**
     * Integration / self-invoice for the purchase of services from abroad
     */
    TD17,
    /**
     * Integration for the purchase of intra-community goods
     */
    TD18,
    /**
     * Integration / self-invoice for the purchase of goods pursuant to Article 17 paragraph 2 of Presidential Decree 633/72
     */
    TD19,
    /**
     * Self-invoice for regularization and integration of invoices (pursuant to Article 6 paragraph 8 of Legislative Decree 471/97 or Article 46 paragraph 5 of Legislative Decree 331/93
     */
    TD20,
    /**
     * Self-invoice for detachment
     */
    TD21,
    /**
     * Extraction of goods from the VAT warehouse
     */
    TD22,
    /**
     * Extraction of goods from VAT warehouse with payment of VAT
     */
    TD23,
    /**
     * Deferred invoice as per article 21, paragraph 4, lett. to)
     */
    TD24,
    /**
     * Deferred invoice pursuant to article 21, paragraph 4, third period lett. b)
     */
    TD25,
    /**
     * Sale of depreciable assets and for internal transfers (pursuant to Article 36 of Presidential Decree 633/72)
     */
    TD26,
    /**
     * Invoice for self-consumption or for free transfers without compensation
     */
    TD27,

}
