package com.github.siboxd.fatturapa.model.invoiceheader.supplier;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * The tax regime is an indispensable information for calculating the tax base.
 * <p>
 * The code identifies, on the basis of the commercial sector or the income situation, the tax regime
 * in which the seller operates.
 */
@Root(name = "RegimeFiscale")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum RegimeFiscale {

    /**
     * Ordinary tax regime
     */
    RF01,
    /**
     * Minimum taxpayer regime (Article 1, paragraphs 9 to 11, Law 244/2007)
     */
    RF02,
    /**
     * Agriculture and related activities and fishing (articles 34 and 34-bis, Presidential Decree 633/1972)
     */
    RF04,
    /**
     * Sale of salts and tobaccos (Article 74, paragraph 1, Presidential Decree 633/1972)
     */
    RF05,
    /**
     * Trade in matches (Article 74, paragraph 1, Presidential Decree 633/1972)
     */
    RF06,
    /**
     * Publishing (Article 74, paragraph 1, Presidential Decree 633/1972)
     */
    RF07,
    /**
     * Management of public telephone services (Article 74, paragraph 1, Presidential Decree 633/1972)
     */
    RF08,
    /**
     * Resale of documents of public transport and parking
     * (Article 74, paragraph 1, Presidential Decree 633/1972)
     */
    RF09,
    /**
     * Entertainment, games and other activities as per the rate attached to the Legislative Decree 640/72
     * (Article 74, paragraph 6, Presidential Decree 633/1972)
     */
    RF10,
    /**
     * Travel and tourism agencies (Article 74 ter, Presidential Decree 633/1972)
     */
    RF11,
    /**
     * Farmhouse (Article 5, paragraph 2, Law 413/1991)
     */
    RF12,
    /**
     * Home sales (Article 25 bis, paragraph 6, Legislative Decree 600/1973)
     */
    RF13,
    /**
     * Resale of second-hand goods, objects of art, antiques or collectibles
     * (Article 36, Legislative Decree 41/1995)
     */
    RF14,
    /**
     * Auction sales agencies of art, antiques or collectibles
     * (Article 40 bis, Presidential Decree 41/1995)
     */
    RF15,
    /**
     * VAT for public administration cash (Article 6, paragraph 5, Presidential Decree 633/1972)
     */
    RF16,
    /**
     * VAT for cash (Article 32 bis, Legislative Decree 83/2012)
     */
    RF17,
    /**
     * Lump-sum scheme
     */
    RF19,
    /**
     * Other
     */
    RF18

}
