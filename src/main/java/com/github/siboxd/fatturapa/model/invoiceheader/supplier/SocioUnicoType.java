package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Indicates the presence or absence of a single member in companies
 */
@Root(name = "SocioUnicoType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum SocioUnicoType {

    /**
     * Sole shareholder
     */
    SU,
    /**
     * More than one company member
     */
    SM

}
