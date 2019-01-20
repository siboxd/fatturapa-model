package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It is used to identify whether it is a discount or a surcharge.
 */
@Root(name = "TipoScontoMaggiorazioneType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum TipoScontoMaggiorazioneType {
    /**
     * Discount
     */
    SC,
    /**
     * Surcharge
     */
    MG

}
