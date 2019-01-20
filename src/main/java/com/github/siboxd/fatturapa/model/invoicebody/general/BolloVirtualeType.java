package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It serves to give evidence of the payment of stamp duty on the invoice in accordance with
 * Article 6, paragraph 2 of the Ministerial Decree of 17 June 2014.
 * <p>
 * The only admitted value is "SI"
 */
@Root(name = "BolloVirtualeType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum BolloVirtualeType {

    SI

}
