package com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Is of a strictly technical nature.
 * <p>
 * It should be used a value equal to {@link FormatoTrasmissioneType#FPA12}, if the invoice is destined for a public administration,
 * or {@link FormatoTrasmissioneType#FPR12}, if the invoice is destined to a private entity.
 */
@Root(name = "FormatoTrasmissioneType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum FormatoTrasmissioneType {
    /**
     * Invoice to Public Administration transmission type
     */
    FPA12,
    /**
     * Invoice to private individuals transmission type
     */
    FPR12

}
