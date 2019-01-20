package com.github.siboxd.fatturapa.model.invoiceheader;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Specifies who completed the electronic invoice
 */
@Root(name = "SoggettoEmittente")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum SoggettoEmittente {
    /**
     * Compiled by buyer
     */
    CC,
    /**
     * Compiled by third party
     */
    TZ

}
