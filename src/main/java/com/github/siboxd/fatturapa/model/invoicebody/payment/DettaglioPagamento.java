package com.github.siboxd.fatturapa.model.invoicebody.payment;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains the details to make the payment
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DettaglioPagamento")
public final class DettaglioPagamento {

    @Element(name = "Beneficiario", required = false)
    private String beneficiario;

    @Element(name = "ModalitaPagamento")
    private ModalitaPagamento modalitaPagamento;

    @Element(name = "DataRiferimentoTerminiPagamento", required = false)
    private String dataRiferimentoTerminiPagamento;

    @Element(name = "GiorniTerminiPagamento", required = false)
    private String giorniTerminiPagamento;

    @Element(name = "DataScadenzaPagamento", required = false)
    private String dataScadenzaPagamento;

    @Element(name = "ImportoPagamento")
    private String importoPagamento;

    @Element(name = "CodUfficioPostale", required = false)
    private String codUfficioPostale;

    @Element(name = "CognomeQuietanzante", required = false)
    private String cognomeQuietanzante;

    @Element(name = "NomeQuietanzante", required = false)
    private String nomeQuietanzante;

    @Element(name = "CFQuietanzante", required = false)
    private String cfQuietanzante;

    @Element(name = "TitoloQuietanzante", required = false)
    private String titoloQuietanzante;

    @Element(name = "IstitutoFinanziario", required = false)
    private String istitutoFinanziario;

    @Element(name = "IBAN", required = false)
    private String iban;

    @Element(name = "ABI", required = false)
    private String abi;

    @Element(name = "CAB", required = false)
    private String cab;

    @Element(name = "BIC", required = false)
    private String bic;

    @Element(name = "ScontoPagamentoAnticipato", required = false)
    private String scontoPagamentoAnticipato;

    @Element(name = "DataLimitePagamentoAnticipato", required = false)
    private String dataLimitePagamentoAnticipato;

    @Element(name = "PenalitaPagamentiRitardati", required = false)
    private String penalitaPagamentiRitardati;

    @Element(name = "DataDecorrenzaPenale", required = false)
    private String dataDecorrenzaPenale;

    @Element(name = "CodicePagamento", required = false)
    private String codicePagamento;

    public DettaglioPagamento() {
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    /**
     * It is used to indicate the personal details of the payee, if different from the seller.
     *
     * @param beneficiario no particular criteria is established
     */
    public void setBeneficiario(final String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public ModalitaPagamento getModalitaPagamento() {
        return modalitaPagamento;
    }

    public void setModalitaPagamento(final ModalitaPagamento modalitaPagamento) {
        this.modalitaPagamento = modalitaPagamento;
    }

    public String getDataRiferimentoTerminiPagamento() {
        return dataRiferimentoTerminiPagamento;
    }

    /**
     * It is used to indicate the date from which the payment terms start.
     *
     * @param dataRiferimentoTerminiPagamento The field must contain the start date of payment
     *                                        terms in YYYY-MM-DD format (ISO 8601: 2004 standard).
     */
    public void setDataRiferimentoTerminiPagamento(final String dataRiferimentoTerminiPagamento) {
        this.dataRiferimentoTerminiPagamento = dataRiferimentoTerminiPagamento;
    }

    public String getGiorniTerminiPagamento() {
        return giorniTerminiPagamento;
    }

    /**
     * It is used to indicate the starting date of the payment starting from the date indicated in
     * the DataRiferimentoTerminiPagamento field
     *
     * @param giorniTerminiPagamento The field must contain a numerical value and is 0 in the case
     *                               of immediate payments.
     */
    public void setGiorniTerminiPagamento(final String giorniTerminiPagamento) {
        this.giorniTerminiPagamento = giorniTerminiPagamento;
    }

    public String getDataScadenzaPagamento() {
        return dataScadenzaPagamento;
    }

    /**
     * Used to indicate the payment due date.
     * <br><br>
     * <b>Note:</b> To be valued only if it is payment in installments
     * (field CondizioniPagamento = "TP01").
     *
     * @param dataScadenzaPagamento The field must contain the payment due date in YYYY-MM-DD
     *                              format (ISO 8601: 2004 standard).
     */
    public void setDataScadenzaPagamento(final String dataScadenzaPagamento) {
        this.dataScadenzaPagamento = dataScadenzaPagamento;
    }

    public String getImportoPagamento() {
        return importoPagamento;
    }

    /**
     * Used to indicate the amount of the payment.
     *
     * @param importoPagamento The field must contain a numeric value consisting of an integer
     *                         and two decimal places. The decimals, separated by the whole with
     *                         the dot character ("."), Must always be indicated even if zero
     *                         (eg: 2585.00).
     */
    public void setImportoPagamento(final String importoPagamento) {
        this.importoPagamento = importoPagamento;
    }

    public String getCodUfficioPostale() {
        return codUfficioPostale;
    }

    /**
     * It is used to indicate the code of the post office that is the recipient of the payment if,
     * as a method of payment, one has been chosen that requires knowledge of it.
     * <br><br>
     * <b>Note:</b> To be valued only if the method of payment requires the indication of the
     * post office
     *
     * @param codUfficioPostale no particular criteria is established
     */
    public void setCodUfficioPostale(final String codUfficioPostale) {
        this.codUfficioPostale = codUfficioPostale;
    }

    public String getCognomeQuietanzante() {
        return cognomeQuietanzante;
    }

    /**
     * It is used to indicate the surname of the receiving subject that must appear for the withdrawal of
     * the cash.
     * <br><br>
     * <b>Note:</b> To be valued only if the payment method is in cash or by bank transfer.
     *
     * @param cognomeQuietanzante The field must contain the surname of the receiving subject.
     */
    public void setCognomeQuietanzante(final String cognomeQuietanzante) {
        this.cognomeQuietanzante = cognomeQuietanzante;
    }

    public String getNomeQuietanzante() {
        return nomeQuietanzante;
    }

    /**
     * It is used to indicate the name of the receiving subject that must appear for the withdrawal of
     * the cash.
     * <br><br>
     * <b>Note:</b> To be valued only if the payment method is in cash or by bank transfer.
     *
     * @param nomeQuietanzante The field must contain the name of the receiving subject.
     */
    public void setNomeQuietanzante(final String nomeQuietanzante) {
        this.nomeQuietanzante = nomeQuietanzante;
    }

    public String getCfQuietanzante() {
        return cfQuietanzante;
    }

    /**
     * It is used to indicate the fiscal code of the receiving subject that must appear for the withdrawal of
     * the cash.
     * <br><br>
     * <b>Note:</b> To be valued only if the payment method is in cash or by bank transfer.
     *
     * @param cfQuietanzante The field must contain the fiscal code of the receiving subject.
     */
    public void setCfQuietanzante(final String cfQuietanzante) {
        this.cfQuietanzante = cfQuietanzante;
    }

    public String getTitoloQuietanzante() {
        return titoloQuietanzante;
    }

    /**
     * It constitutes a completion of the personal data concerning the receiving subject.
     *
     * @param titoloQuietanzante no particular criteria is established
     */
    public void setTitoloQuietanzante(final String titoloQuietanzante) {
        this.titoloQuietanzante = titoloQuietanzante;
    }

    public String getIstitutoFinanziario() {
        return istitutoFinanziario;
    }

    /**
     * It is used to identify the credit institution that is the recipient of the payment, if one
     * of the methods of payment has been chosen that presupposes its indication.
     *
     * @param istitutoFinanziario The field must contain the name of the financial institution
     */
    public void setIstitutoFinanziario(final String istitutoFinanziario) {
        this.istitutoFinanziario = istitutoFinanziario;
    }

    public String getIban() {
        return iban;
    }

    /**
     * It is used to identify the International Bank Account Number, better known in the abbreviated
     * form IBAN, an international standard used to uniquely identify a bank user.
     * <br><br>
     * <b>Note:</b> To be valued only if the payment method requires an indication
     *
     * @param iban The field must contain an IBAN code.
     */
    public void setIban(final String iban) {
        this.iban = iban;
    }

    public String getAbi() {
        return abi;
    }

    /**
     * It is used to indicate the ABI (Italian Banking Association) code, which represents the bank.
     * <br><br>
     * <b>Note:</b> To be valued only if, in the presence of a payment method that requires the
     * indication of the bank, the IBAN code has not been indicated
     *
     * @param abi The field must contain a numeric value of 5 digits.
     */
    public void setAbi(final String abi) {
        this.abi = abi;
    }

    public String getCab() {
        return cab;
    }

    /**
     * It is used to indicate the CAB code (Bank Start Code), the number representing the agency/branch
     * of the credit institution identified by the ABI code.
     * <br><br>
     * <b>Note:</b> To be valued only if, in the presence of a payment method that requires the
     * indication of the bank, the IBAN code has not been indicated.
     *
     * @param cab The field must contain a numeric value of 5 digits.
     */
    public void setCab(final String cab) {
        this.cab = cab;
    }

    public String getBic() {
        return bic;
    }

    /**
     * It is used to indicate the BIC (Bank Identifier Code) or SWIFT, a code that identifies the
     * bank of the beneficiary and is used in international payments by almost all the banks in
     * the world
     * <br><br>
     * <b>Note:</b> To be valued only if the payment method requires an indication.
     *
     * @param bic The field must contain a minimum of 8 and a maximum of 11 alphanumeric characters.
     */
    public void setBic(final String bic) {
        this.bic = bic;
    }

    public String getScontoPagamentoAnticipato() {
        return scontoPagamentoAnticipato;
    }

    /**
     * It is used to indicate the amount of the discount applied in case of prepayment.
     *
     * @param scontoPagamentoAnticipato The field must contain a numeric value consisting of an
     *                                  integer and two decimal places. The decimals, separated by
     *                                  the whole with the dot character ("."), Must always be
     *                                  indicated even if zero (eg: 85.00).
     */
    public void setScontoPagamentoAnticipato(final String scontoPagamentoAnticipato) {
        this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
    }

    public String getDataLimitePagamentoAnticipato() {
        return dataLimitePagamentoAnticipato;
    }

    /**
     * Indicates the deadline for making the prepayment.
     *
     * @param dataLimitePagamentoAnticipato The field must contain the pre-defined payment deadline
     *                                      in YYYY-MM-DD format (ISO 8601: 2004 standard).
     */
    public void setDataLimitePagamentoAnticipato(final String dataLimitePagamentoAnticipato) {
        this.dataLimitePagamentoAnticipato = dataLimitePagamentoAnticipato;
    }

    public String getPenalitaPagamentiRitardati() {
        return penalitaPagamentiRitardati;
    }

    /**
     * It is used to indicate the amount of the penalty due in case of late payment
     *
     * @param penalitaPagamentiRitardati The field must contain a numeric value consisting of an
     *                                   integer and two decimal places. The decimals, separated
     *                                   by the whole with the dot character ("."), Must always
     *                                   be indicated even if zero (eg: 45.00).
     */
    public void setPenalitaPagamentiRitardati(final String penalitaPagamentiRitardati) {
        this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
    }

    public String getDataDecorrenzaPenale() {
        return dataDecorrenzaPenale;
    }

    /**
     * It serves to indicate the starting date of the penalty.
     *
     * @param dataDecorrenzaPenale The field must contain the pre-defined payment deadline
     *                             in YYYY-MM-DD format (ISO 8601: 2004 standard).
     */
    public void setDataDecorrenzaPenale(final String dataDecorrenzaPenale) {
        this.dataDecorrenzaPenale = dataDecorrenzaPenale;
    }

    public String getCodicePagamento() {
        return codicePagamento;
    }

    /**
     * It is used to facilitate automatic reconciliation of collections by the seller if this
     * information is then reported, from the transferee / client, to the payment information.
     *
     * @param codicePagamento It can be enhanced with an alphanumeric code with a maximum length
     *                        of 60 characters.
     */
    public void setCodicePagamento(final String codicePagamento) {
        this.codicePagamento = codicePagamento;
    }

}
