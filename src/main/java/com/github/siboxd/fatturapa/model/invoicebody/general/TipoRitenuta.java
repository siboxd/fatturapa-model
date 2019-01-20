package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It is used to identify the type of withholding indicated on the invoice.
 */
@Root(name = "TipoRitenuta")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum TipoRitenuta {
    /**
     * Withholding tax on natural persons
     */
    RT01,
    /**
     * Withholding tax on legal entities
     */
    RT02

}
