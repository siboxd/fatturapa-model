package com.github.siboxd.fatturapa.model.invoicebody;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It serves to highlight the nature of the operation for which VAT is not required.
 */
@Root(name = "Natura")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum Natura {
    /**
     * Operations Excluded with reference to Article 15 of Presidential Decree 633/1972
     */
    N1,
    /**
     * Operations Not subject
     */
    N2,
    /**
     * Non-Taxable Operations
     */
    N3,
    /**
     * Exempt Operations
     */
    N4,
    /**
     * Margin scheme
     */
    N5,
    /**
     * Reverse charge
     */
    N6,
    /**
     * VAT paid in other EU countries (distance sales pursuant to Article 40 paragraphs 3 and 4
     * and Article 41 paragraph 1 letter b, Decree 331/93, provision of telecommunications,
     * tele-broadcasting and electronic services pursuant to Article 7-sexies letter f, g,
     * presidential decree 633/72 and article 74 sexies, presidential decree 633/72)
     */
    N7

}
