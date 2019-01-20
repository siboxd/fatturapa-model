package com.github.siboxd.fatturapa.model.invoicebody.products;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It is a functional data for the correct determination of the tax base (Article 13 of Presidential Decree 633/1972).
 */
@Root(name = "TipoCessionePrestazioneType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum TipoCessionePrestazioneType {
    /**
     * Discount
     */
    SC,
    /**
     * Award
     */
    PR,
    /**
     * Reduction
     */
    AB,
    /**
     * Accessory expenditure
     */
    AC

}
