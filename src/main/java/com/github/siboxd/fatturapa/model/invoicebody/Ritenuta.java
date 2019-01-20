package com.github.siboxd.fatturapa.model.invoicebody;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It serves to highlight the fact that the social security contribution is subject to withholding tax.
 */
@Root(name = "Ritenuta")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum Ritenuta {

    SI

}
