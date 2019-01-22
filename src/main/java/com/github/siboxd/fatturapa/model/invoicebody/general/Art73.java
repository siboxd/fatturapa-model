package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It serves to direct control over the uniqueness of the numbering of documents
 */
@Root(name = "Art73")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum Art73 {

    SI

}
