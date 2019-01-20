package com.github.siboxd.fatturapa.model.invoicebody.general.pensionfund;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It serves to highlight the fact that the social security contribution is subject to withholding tax.
 */
@Root(name = "RitenutaType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum RitenutaType {

    SI

}
