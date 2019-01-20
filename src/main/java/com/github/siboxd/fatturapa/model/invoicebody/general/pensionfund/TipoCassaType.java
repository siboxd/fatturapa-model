package com.github.siboxd.fatturapa.model.invoicebody.general.pensionfund;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It is used to identify the pension fund for which the payment of the contribution is intended.
 */
@Root(name = "TipoCassaType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum TipoCassaType {
    /**
     * National pension fund and assistance for lawyers and solicitors
     */
    TC01,
    /**
     * Pension fund accountants
     */
    TC02,
    /**
     * Pension fund and assistance surveyors
     */
    TC03,
    /**
     * National pension fund and assistance for freelance engineers and architects
     */
    TC04,
    /**
     * National notary office
     */
    TC05,
    /**
     * National Fund for Provision and Assistance for Accountants and Commercial Experts
     */
    TC06,
    /**
     * National assistance agency for agents and sales representatives (ENASARCO)
     */
    TC07,
    /**
     * National Agency for the provision and assistance of labor consultants (ENPACL)
     */
    TC08,
    /**
     * National social security and assistance institution (ENPAM)
     */
    TC09,
    /**
     * National Agency for Occupational Pensions and Assistance (ENPAF)
     */
    TC10,
    /**
     * National Veterinary Welfare and Assistance Organization (ENPAV)
     */
    TC11,
    /**
     * National social security and assistance institution employed in agriculture (ENPAIA)
     */
    TC12,
    /**
     * Pension fund employed shipping companies and shipping agencies
     */
    TC13,
    /**
     * Italian National Insurance Agency for Italian Journalists (INPGI)
     */
    TC14,
    /**
     * National Assistance Italian Orphans Health Care Work (ONAOSI)
     */
    TC15,
    /**
     * Autonomous assistance supplementary Italian journalists (CASAGIT)
     */
    TC16,
    /**
     * Pension fund industrial experts and graduate industrial experts (EPPI)
     */
    TC17,
    /**
     * Social security and social security assistance (EPAP)
     */
    TC18,
    /**
     * National Social Security and Assistance Agency for Biologists (ENPAB)
     */
    TC19,
    /**
     * National Insurance and Nursing Care Agency (ENPAPI)
     */
    TC20,
    /**
     * National Social Security and Counseling Body (ENPAP)
     */
    TC21,
    /**
     * INPS (National Social Security Institute)
     */
    TC22

}
