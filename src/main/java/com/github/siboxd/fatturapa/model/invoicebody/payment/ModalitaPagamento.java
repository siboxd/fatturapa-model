package com.github.siboxd.fatturapa.model.invoicebody.payment;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It is used to indicate the payment methods
 */
@Root(name = "ModalitaPagamento")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum ModalitaPagamento {
    /**
     * Cash
     */
    MP01,
    /**
     * Bank check
     */
    MP02,
    /**
     * Circular Check
     */
    MP03,
    /**
     * Cash at treasury
     */
    MP04,
    /**
     * Wire transfer
     */
    MP05,
    /**
     * Promissory Note
     */
    MP06,
    /**
     * Bank bulletin
     */
    MP07,
    /**
     * Payment card
     */
    MP08,
    /**
     * RID (Direct inter-bank relationship)
     */
    MP09,
    /**
     * RID users
     */
    MP10,
    /**
     * Fast RID
     */
    MP11,
    /**
     * RIBA (Bank receipt)
     */
    MP12,
    /**
     * MAV (payment by notice)
     */
    MP13,
    /**
     * Receipts from the Treasury
     */
    MP14,
    /**
     * Transfer to special accounting accounts
     */
    MP15,
    /**
     * Bank domiciliation
     */
    MP16,
    /**
     * Payment with postal domiciliation
     */
    MP17,
    /**
     * Postal current account bulletin
     */
    MP18,
    /**
     * SEPA (Single Payments Euro Area) Direct Debit
     */
    MP19,
    /**
     * SEPA (Single Payments Euro Area) Direct Debit CORE
     */
    MP20,
    /**
     * SEPA (Single Payments Euro Area) Direct Debit B2B
     */
    MP21,
    /**
     * Deduction on sums already collected
     */
    MP22

}
