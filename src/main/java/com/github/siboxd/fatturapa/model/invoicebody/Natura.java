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
     *
     * <b>Will not be valid after 01/01/2021. Use the sub-codes</b>
     */
    @Deprecated
    N2,
    /**
     * Non-Taxable Operations
     *
     * <b>Will not be valid after 01/01/2021. Use the sub-codes</b>
     */
    @Deprecated
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
     *
     * <b>Will not be valid after 01/01/2021. Use the sub-codes</b>
     */
    @Deprecated
    N6,
    /**
     * VAT paid in other EU countries (distance sales pursuant to Article 40 paragraphs 3 and 4
     * and Article 41 paragraph 1 letter b, Decree 331/93, provision of telecommunications,
     * tele-broadcasting and electronic services pursuant to Article 7-sexies letter f, g,
     * presidential decree 633/72 and article 74 sexies, presidential decree 633/72)
     */
    N7,


    // v1.2.1

    /**
     * Not subject to VAT pursuant to art. 7 to 7-septies of Presidential Decree 633/72
     */
    N2_1,
    /**
     * Not subject - other cases
     */
    N2_2,

    /**
     * Non-taxable - exports
     */
    N3_1,
    /**
     * Non-taxable - intra-community transfers
     */
    N3_2,
    /**
     * Non-taxable - sales to San Marino
     */
    N3_3,
    /**
     * Non Taxable - transactions similar to export sales
     */
    N3_4,
    /**
     * Non Taxable - following declarations of intent
     */
    N3_5,
    /**
     * Non-taxable - other transactions that do not contribute to the formation of the ceiling
     */
    N3_6,

    /**
     * Reverse charge - disposal of scrap and other recycled materials
     */
    N6_1,
    /**
     * Reverse charge - sale of pure gold and silver
     */
    N6_2,
    /**
     * Reverse charge - subcontracting in the construction sector
     */
    N6_3,
    /**
     * Reverse charge - sale of buildings
     */
    N6_4,
    /**
     * Reverse charge - sale of mobile phones
     */
    N6_5,
    /**
     * Reverse charge - disposal of electronic products
     */
    N6_6,
    /**
     * Reverse charge - construction sector performance and related sectors
     */
    N6_7,
    /**
     * Reverse charge - energy sector operations
     */
    N6_8,
    /**
     * Reverse charge - other cases
     */
    N6_9;

    @Override
    public String toString() {
        final String s = super.toString();
        if (s.contains("_")) return s.replace("_", ".");
        else return s;
    }
}
