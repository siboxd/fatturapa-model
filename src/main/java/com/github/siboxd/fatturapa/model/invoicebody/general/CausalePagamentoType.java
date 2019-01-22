package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It serves to highlight the reason for payment.
 * <br><br>
 * These values are the coding of the reason for payment on the <em>Model 770S</em>.
 */
@Root(name = "CausalePagamentoType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum CausalePagamentoType {
    /**
     * Self-employment services included in the exercise of art or habitual profession.
     */
    A,
    /**
     * Economic use, by the author or inventor, of intellectual works, industrial patents and
     * processes, formulas or information related to experiences acquired in the industrial,
     * commercial or scientific fields.
     */
    B,
    /**
     * Profits deriving from participation contracts and economic partnership contracts, when the
     * contribution consists exclusively of the work service.
     */
    C,
    /**
     * Profits due to the promoting shareholders and the founding members of the joint-stock companies.
     */
    D,
    /**
     * Doffing of promissory notes' protests, by municipal secretaries.
     */
    E,
    /**
     * Compensation paid for the cessation of professional sporting activity.
     */
    G,
    /**
     * Compensation paid for the termination of agency relationships of natural persons and
     * partnerships, with the exclusion of sums accrued by December 31, 2003, already charged for
     * accruals and taxed as business income.
     */
    H,
    /**
     * Compensation paid for termination of notary functions.
     */
    I,
    /**
     * Economic use, by a subject different from the author or inventor, of intellectual works,
     * industrial patents and processes, formulas and information relating to experiences acquired
     * in the industrial, commercial or scientific fields.
     */
    L,
    /**
     * Self-employment services not normally exercised, obligations to do, not to do or allow.
     */
    M,
    /**
     * Travel allowance, flat-rate reimbursement of expenses, premiums and fees paid:
     * .. in the direct exercise of amateur sports activities
     */
    N,
    /**
     * Self-employment services not normally exercised, obligations to do, not to do or allow, for
     * which there is no obligation to register for separate management (Circular Inps 104/2001).
     */
    O,
    /**
     * Compensation paid to non-residents without a permanent establishment for the use or concession
     * in use of industrial, commercial or scientific equipment located in the territory of the State
     */
    P,
    /**
     * Commissions paid to agent or representative of single-agent trade.
     */
    Q,
    /**
     * Commissions paid to agent or representative of multi-firm trade.
     */
    R,
    /**
     * Commissions paid to commission agents.
     */
    S,
    /**
     * Commissions paid to mediator.
     */
    T,
    /**
     * Commissions paid to a business agent.
     */
    U,
    /**
     * Commissions paid to a person responsible for home sales and commissions paid to a person for
     * door-to-door sales and for the itinerant sale of daily and periodical newspapers (Law 25-02-1987, No. 67).
     */
    V,
    /**
     * Fees paid in 2013 for services relating to contracts for which the provisions contained in
     * article 25-ter of Presidential Decree 600/1973 have become applicable.
     */
    W,
    /**
     * Charges paid in 2004 by resident companies or entities, or by stable organizations of
     * foreign companies pursuant to art. 26-quater, paragraph 1, letters a) and b) of Presidential
     * Decree 600/1973, to companies or permanent organizations of companies, located in another
     * Member State of the European Union, in the presence of the relative requisites required,
     * for which the refund of the withholding tax pursuant to Article 4 of Legislative Decree No.
     * 143/2005.
     */
    X,
    /**
     * Charges paid from 1.01.2005 to 26.07.2005 by subjects referred to in the previous point: {@link #X}.
     */
    Y,
    /**
     * Title different from the previous ones.
     */
    Z,

    L1,
    M1,
    O1,
    V1

}
