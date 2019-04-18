package com.github.siboxd.fatturapa.model.invoicebody.payment;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * Contains the details to make the payment
 */
@Root(name = "DettaglioPagamento")
@Order(elements = {"Beneficiario", "ModalitaPagamento", "DataRiferimentoTerminiPagamento",
        "GiorniTerminiPagamento", "DataScadenzaPagamento", "ImportoPagamento", "CodUfficioPostale",
        "CognomeQuietanzante", "NomeQuietanzante", "CFQuietanzante", "TitoloQuietanzante",
        "IstitutoFinanziario", "IBAN", "ABI", "CAB", "BIC", "ScontoPagamentoAnticipato",
        "DataLimitePagamentoAnticipato", "PenalitaPagamentiRitardati", "DataDecorrenzaPenale",
        "CodicePagamento"})
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

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DettaglioPagamento() {
    }

    private DettaglioPagamento(@NonNull final Builder builder) {
        beneficiario = builder.beneficiario;
        modalitaPagamento = builder.modalitaPagamento;
        dataRiferimentoTerminiPagamento = builder.dataRiferimentoTerminiPagamento;
        giorniTerminiPagamento = builder.giorniTerminiPagamento;
        dataScadenzaPagamento = builder.dataScadenzaPagamento;
        importoPagamento = builder.importoPagamento;
        codUfficioPostale = builder.codUfficioPostale;
        cognomeQuietanzante = builder.cognomeQuietanzante;
        nomeQuietanzante = builder.nomeQuietanzante;
        cfQuietanzante = builder.cfQuietanzante;
        titoloQuietanzante = builder.titoloQuietanzante;
        istitutoFinanziario = builder.istitutoFinanziario;
        iban = builder.iban;
        abi = builder.abi;
        cab = builder.cab;
        bic = builder.bic;
        scontoPagamentoAnticipato = builder.scontoPagamentoAnticipato;
        dataLimitePagamentoAnticipato = builder.dataLimitePagamentoAnticipato;
        penalitaPagamentiRitardati = builder.penalitaPagamentiRitardati;
        dataDecorrenzaPenale = builder.dataDecorrenzaPenale;
        codicePagamento = builder.codicePagamento;
    }

    @Nullable
    public String getBeneficiario() {
        return beneficiario;
    }

    @NonNull
    public ModalitaPagamento getModalitaPagamento() {
        return modalitaPagamento;
    }

    @Nullable
    public String getDataRiferimentoTerminiPagamento() {
        return dataRiferimentoTerminiPagamento;
    }

    @Nullable
    public String getGiorniTerminiPagamento() {
        return giorniTerminiPagamento;
    }

    @Nullable
    public String getDataScadenzaPagamento() {
        return dataScadenzaPagamento;
    }

    @NonNull
    public String getImportoPagamento() {
        return importoPagamento;
    }

    @Nullable
    public String getCodUfficioPostale() {
        return codUfficioPostale;
    }

    @Nullable
    public String getCognomeQuietanzante() {
        return cognomeQuietanzante;
    }

    @Nullable
    public String getNomeQuietanzante() {
        return nomeQuietanzante;
    }

    @Nullable
    public String getCfQuietanzante() {
        return cfQuietanzante;
    }

    @Nullable
    public String getTitoloQuietanzante() {
        return titoloQuietanzante;
    }

    @Nullable
    public String getIstitutoFinanziario() {
        return istitutoFinanziario;
    }

    @Nullable
    public String getIban() {
        return iban;
    }

    @Nullable
    public String getAbi() {
        return abi;
    }

    @Nullable
    public String getCab() {
        return cab;
    }

    @Nullable
    public String getBic() {
        return bic;
    }

    @Nullable
    public String getScontoPagamentoAnticipato() {
        return scontoPagamentoAnticipato;
    }

    @Nullable
    public String getDataLimitePagamentoAnticipato() {
        return dataLimitePagamentoAnticipato;
    }

    @Nullable
    public String getPenalitaPagamentiRitardati() {
        return penalitaPagamentiRitardati;
    }

    @Nullable
    public String getDataDecorrenzaPenale() {
        return dataDecorrenzaPenale;
    }

    @Nullable
    public String getCodicePagamento() {
        return codicePagamento;
    }

    /**
     * {@code DettaglioPagamento} builder static inner class.
     */
    public static final class Builder {
        private String beneficiario;
        private ModalitaPagamento modalitaPagamento;
        private String dataRiferimentoTerminiPagamento;
        private String giorniTerminiPagamento;
        private String dataScadenzaPagamento;
        private String importoPagamento;
        private String codUfficioPostale;
        private String cognomeQuietanzante;
        private String nomeQuietanzante;
        private String cfQuietanzante;
        private String titoloQuietanzante;
        private String istitutoFinanziario;
        private String iban;
        private String abi;
        private String cab;
        private String bic;
        private String scontoPagamentoAnticipato;
        private String dataLimitePagamentoAnticipato;
        private String penalitaPagamentiRitardati;
        private String dataDecorrenzaPenale;
        private String codicePagamento;

        /**
         * Requires non-optional fields
         *
         * @param modalitaPagamento The payment method
         * @param importoPagamento  Used to indicate the amount of the payment.<p>
         *                          The field must contain a numeric value consisting of an integer
         *                          and two decimal places. The decimals, separated by the whole with
         *                          the dot character ("."), Must always be indicated even if zero
         *                          (eg: 2585.00).
         */
        public Builder(@NonNull final ModalitaPagamento modalitaPagamento,
                       @NonNull final String importoPagamento) {
            this.modalitaPagamento = modalitaPagamento;
            this.importoPagamento = importoPagamento;
        }

        public Builder(@NonNull final DettaglioPagamento copy) {
            this(copy.getModalitaPagamento(), copy.getImportoPagamento());
            this.beneficiario = copy.getBeneficiario();
            this.dataRiferimentoTerminiPagamento = copy.getDataRiferimentoTerminiPagamento();
            this.giorniTerminiPagamento = copy.getGiorniTerminiPagamento();
            this.dataScadenzaPagamento = copy.getDataScadenzaPagamento();
            this.codUfficioPostale = copy.getCodUfficioPostale();
            this.cognomeQuietanzante = copy.getCognomeQuietanzante();
            this.nomeQuietanzante = copy.getNomeQuietanzante();
            this.cfQuietanzante = copy.getCfQuietanzante();
            this.titoloQuietanzante = copy.getTitoloQuietanzante();
            this.istitutoFinanziario = copy.getIstitutoFinanziario();
            this.iban = copy.getIban();
            this.abi = copy.getAbi();
            this.cab = copy.getCab();
            this.bic = copy.getBic();
            this.scontoPagamentoAnticipato = copy.getScontoPagamentoAnticipato();
            this.dataLimitePagamentoAnticipato = copy.getDataLimitePagamentoAnticipato();
            this.penalitaPagamentiRitardati = copy.getPenalitaPagamentiRitardati();
            this.dataDecorrenzaPenale = copy.getDataDecorrenzaPenale();
            this.codicePagamento = copy.getCodicePagamento();
        }

        /**
         * It is used to indicate the personal details of the payee, if different from the seller.
         *
         * @param beneficiario no particular criteria is established
         */
        public Builder beneficiario(@Nullable final String beneficiario) {
            this.beneficiario = beneficiario;
            return this;
        }

        public Builder modalitaPagamento(@NonNull final ModalitaPagamento modalitaPagamento) {
            this.modalitaPagamento = modalitaPagamento;
            return this;
        }

        /**
         * It is used to indicate the date from which the payment terms start.
         *
         * @param dataRiferimentoTerminiPagamento The field must contain the start date of payment
         *                                        terms in YYYY-MM-DD format (ISO 8601: 2004 standard).
         */
        public Builder dataRiferimentoTerminiPagamento(@Nullable final String dataRiferimentoTerminiPagamento) {
            this.dataRiferimentoTerminiPagamento = dataRiferimentoTerminiPagamento;
            return this;
        }

        /**
         * It is used to indicate the starting date of the payment starting from the date indicated in
         * the DataRiferimentoTerminiPagamento field
         *
         * @param giorniTerminiPagamento The field must contain a numerical value and is 0 in the case
         *                               of immediate payments.
         */
        public Builder giorniTerminiPagamento(@Nullable final String giorniTerminiPagamento) {
            this.giorniTerminiPagamento = giorniTerminiPagamento;
            return this;
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
        public Builder dataScadenzaPagamento(@Nullable final String dataScadenzaPagamento) {
            this.dataScadenzaPagamento = dataScadenzaPagamento;
            return this;
        }

        /**
         * Used to indicate the amount of the payment.
         *
         * @param importoPagamento The field must contain a numeric value consisting of an integer
         *                         and two decimal places. The decimals, separated by the whole with
         *                         the dot character ("."), Must always be indicated even if zero
         *                         (eg: 2585.00).
         */
        public Builder importoPagamento(@NonNull final String importoPagamento) {
            this.importoPagamento = importoPagamento;
            return this;
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
        public Builder codUfficioPostale(@Nullable final String codUfficioPostale) {
            this.codUfficioPostale = codUfficioPostale;
            return this;
        }

        /**
         * It is used to indicate the surname of the receiving subject that must appear for the withdrawal of
         * the cash.
         * <br><br>
         * <b>Note:</b> To be valued only if the payment method is in cash or by bank transfer.
         *
         * @param cognomeQuietanzante The field must contain the surname of the receiving subject.
         */
        public Builder cognomeQuietanzante(@Nullable final String cognomeQuietanzante) {
            this.cognomeQuietanzante = cognomeQuietanzante;
            return this;
        }

        /**
         * It is used to indicate the name of the receiving subject that must appear for the withdrawal of
         * the cash.
         * <br><br>
         * <b>Note:</b> To be valued only if the payment method is in cash or by bank transfer.
         *
         * @param nomeQuietanzante The field must contain the name of the receiving subject.
         */
        public Builder nomeQuietanzante(@Nullable final String nomeQuietanzante) {
            this.nomeQuietanzante = nomeQuietanzante;
            return this;
        }

        /**
         * It is used to indicate the fiscal code of the receiving subject that must appear for the withdrawal of
         * the cash.
         * <br><br>
         * <b>Note:</b> To be valued only if the payment method is in cash or by bank transfer.
         *
         * @param cfQuietanzante The field must contain the fiscal code of the receiving subject.
         */
        public Builder cfQuietanzante(@Nullable final String cfQuietanzante) {
            this.cfQuietanzante = cfQuietanzante;
            return this;
        }

        /**
         * It constitutes a completion of the personal data concerning the receiving subject.
         *
         * @param titoloQuietanzante no particular criteria is established
         */
        public Builder titoloQuietanzante(@Nullable final String titoloQuietanzante) {
            this.titoloQuietanzante = titoloQuietanzante;
            return this;
        }

        /**
         * It is used to identify the credit institution that is the recipient of the payment, if one
         * of the methods of payment has been chosen that presupposes its indication.
         *
         * @param istitutoFinanziario The field must contain the name of the financial institution
         */
        public Builder istitutoFinanziario(@Nullable final String istitutoFinanziario) {
            this.istitutoFinanziario = istitutoFinanziario;
            return this;
        }

        /**
         * It is used to identify the International Bank Account Number, better known in the abbreviated
         * form IBAN, an international standard used to uniquely identify a bank user.
         * <br><br>
         * <b>Note:</b> To be valued only if the payment method requires an indication
         *
         * @param iban The field must contain an IBAN code.
         */
        public Builder iban(@Nullable final String iban) {
            this.iban = iban;
            return this;
        }

        /**
         * It is used to indicate the ABI (Italian Banking Association) code, which represents the bank.
         * <br><br>
         * <b>Note:</b> To be valued only if, in the presence of a payment method that requires the
         * indication of the bank, the IBAN code has not been indicated
         *
         * @param abi The field must contain a numeric value of 5 digits.
         */
        public Builder abi(@Nullable final String abi) {
            this.abi = abi;
            return this;
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
        public Builder cab(@Nullable final String cab) {
            this.cab = cab;
            return this;
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
        public Builder bic(@Nullable final String bic) {
            this.bic = bic;
            return this;
        }

        /**
         * It is used to indicate the amount of the discount applied in case of prepayment.
         *
         * @param scontoPagamentoAnticipato The field must contain a numeric value consisting of an
         *                                  integer and two decimal places. The decimals, separated by
         *                                  the whole with the dot character ("."), Must always be
         *                                  indicated even if zero (eg: 85.00).
         */
        public Builder scontoPagamentoAnticipato(@Nullable final String scontoPagamentoAnticipato) {
            this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
            return this;
        }

        /**
         * Indicates the deadline for making the prepayment.
         *
         * @param dataLimitePagamentoAnticipato The field must contain the pre-defined payment deadline
         *                                      in YYYY-MM-DD format (ISO 8601: 2004 standard).
         */
        public Builder dataLimitePagamentoAnticipato(@Nullable final String dataLimitePagamentoAnticipato) {
            this.dataLimitePagamentoAnticipato = dataLimitePagamentoAnticipato;
            return this;
        }

        /**
         * It is used to indicate the amount of the penalty due in case of late payment
         *
         * @param penalitaPagamentiRitardati The field must contain a numeric value consisting of an
         *                                   integer and two decimal places. The decimals, separated
         *                                   by the whole with the dot character ("."), Must always
         *                                   be indicated even if zero (eg: 45.00).
         */
        public Builder penalitaPagamentiRitardati(@Nullable final String penalitaPagamentiRitardati) {
            this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
            return this;
        }

        /**
         * It serves to indicate the starting date of the penalty.
         *
         * @param dataDecorrenzaPenale The field must contain the pre-defined payment deadline
         *                             in YYYY-MM-DD format (ISO 8601: 2004 standard).
         */
        public Builder dataDecorrenzaPenale(@Nullable final String dataDecorrenzaPenale) {
            this.dataDecorrenzaPenale = dataDecorrenzaPenale;
            return this;
        }

        /**
         * It is used to facilitate automatic reconciliation of collections by the seller if this
         * information is then reported, from the transferee / client, to the payment information.
         *
         * @param codicePagamento It can be enhanced with an alphanumeric code with a maximum length
         *                        of 60 characters.
         */
        public Builder codicePagamento(@Nullable final String codicePagamento) {
            this.codicePagamento = codicePagamento;
            return this;
        }

        /**
         * Returns a {@code DettaglioPagamento} built from the parameters previously set.
         *
         * @return a {@code DettaglioPagamento} built with parameters of this {@code DettaglioPagamento.Builder}
         */
        public DettaglioPagamento build() {
            return new DettaglioPagamento(this);
        }
    }

}
