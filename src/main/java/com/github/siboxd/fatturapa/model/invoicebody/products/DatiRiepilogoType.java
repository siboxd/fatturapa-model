package com.github.siboxd.fatturapa.model.invoicebody.products;

import com.github.siboxd.fatturapa.model.invoicebody.NaturaType;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This block of data represents a summary of the invoice information for each rate and/or nature
 * present in the detail rows of the document. In the case of the same VAT rate, different methods
 * of payment of the tax depend on the application of the split of payments
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiRiepilogoType")
public class DatiRiepilogoType {

    @Element(name = "AliquotaIVA")
    private String aliquotaIVA;

    @Element(name = "Natura", required = false)
    private NaturaType natura;

    @Element(name = "SpeseAccessorie", required = false)
    private String speseAccessorie;

    @Element(name = "Arrotondamento", required = false)
    private String arrotondamento;

    @Element(name = "ImponibileImporto")
    private String imponibileImporto;

    @Element(name = "Imposta")
    private String imposta;

    @Element(name = "EsigibilitaIVA", required = false)
    private EsigibilitaIVAType esigibilitaIVA;

    @Element(name = "RiferimentoNormativo", required = false)
    private String riferimentoNormativo;

    public DatiRiepilogoType() {
    }

    public String getAliquotaIVA() {
        return aliquotaIVA;
    }

    /**
     * It is used to indicate to which VAT rate refer the data indicated in the other fields of these
     * data, including the zero rate (Article 21, paragraph 2, letter and of Presidential Decree 633/1972).
     *
     * @param aliquotaIVA It must contain a VAT rate value that is not different from those in the
     *                    VAT Rate field of the detail rows. Specifically, it assumes the values
     *                    required by tax legislation. The decimals, separated by the whole with
     *                    the dot character ("."), Must always be indicated even if zero (eg 22.00);
     *                    in the case of non-applicability of the tax the field must be valued with
     *                    "0.00". The system verifies that the valuation is in percentage terms
     *                    (eg 22.00 and not 0.22).
     */
    public void setAliquotaIVA(final String aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;
    }

    public NaturaType getNatura() {
        return natura;
    }

    /**
     * <b>Note:</b> To be valued only if among the lines of detail there is at least one that has
     * the field Natura set.<br><br>
     * If present, the previous AliquotaIVA field must be "0.00". If valued with "N6" (reverse charge),
     * the field of EnigibilitaIVA can not be set to "S"
     */
    public void setNatura(final NaturaType natura) {
        this.natura = natura; // TODO: 20/01/2019 add checks
    }

    public String getSpeseAccessorie() {
        return speseAccessorie;
    }

    /**
     * It serves to highlight the part of the tax base attributable to ancillary operations
     * (Article 12 of Presidential Decree 633/1972).
     *
     * @param speseAccessorie The field must contain a numeric value consisting of an integer and
     *                        two decimal places. The decimals, separated by the whole with the dot
     *                        character ("."), Must always be indicated as zero (eg: 40.00).
     */
    public void setSpeseAccessorie(final String speseAccessorie) {
        this.speseAccessorie = speseAccessorie;
    }

    public String getArrotondamento() {
        return arrotondamento;
    }

    /**
     * It serves to highlight the possible rounding made in the transition from a value with more
     * than two decimal places (the one deriving from the sum of the values of the PrezzoTotale field
     * of each line of detail united by the same VAT rate or by the same nature) to a value with two
     * only decimal digits (that of the ImportoImponibile field). The value of rounding must be
     * indicated in the field and not the value of the Rounded Amount.
     *
     * @param arrotondamento The field must contain a numeric value represented by an integer and a
     *                       maximum of eight decimal places. In case of rounding down, it is
     *                       preceded by a minus sign ("-")
     */
    public void setArrotondamento(final String arrotondamento) {
        this.arrotondamento = arrotondamento;
    }

    public String getImponibileImporto() {
        return imponibileImporto;
    }

    /**
     * It represents the value of the tax base, in the case of transactions subject to tax
     * (VAT rate field different from 0.00), or otherwise (Natura field set) the amount of the
     * transaction (Article 21, paragraph 2, letter and of the Presidential Decree 633/1972)
     *
     * @param imponibileImporto The field must contain a numeric value consisting of an integer and
     *                          two decimal places. The decimals, separated by the whole with the
     *                          dot character ("."), Must always be indicated even if zero
     *                          (eg: 2585.00). On this value the system carries out a check to
     *                          verify the correctness of the calculation; for details on the
     *                          calculation algorithm, see the Checklist version 1.4 file on the
     *                          website www.fatturapa.gov.it.
     */
    public void setImponibileImporto(final String imponibileImporto) {
        this.imponibileImporto = imponibileImporto;
    }

    public String getImposta() {
        return imposta;
    }

    /**
     * Indicates the value of VAT, corresponding to the application of the VAT rate on the relevant
     * taxable income (Article 21, paragraph 2, letter and of Presidential Decree 633/1972).
     *
     * @param imposta The field must contain a numeric value consisting of an integer and two decimal
     *                places. The decimals, separated by the whole with the dot character ("."),
     *                Must always be indicated even if zero (eg: 255.00). The system checks that
     *                the value corresponds to the result of the product between Tax Rate and
     *                Taxable Amount, divided by 100; therefore it is equal to 0.00 in cases where
     *                the Nature field is valued.
     */
    public void setImposta(final String imposta) {
        this.imposta = imposta; // TODO: 20/01/2019 implement these automatic checks
    }

    public EsigibilitaIVAType getEsigibilitaIVA() {
        return esigibilitaIVA;
    }

    /**
     * <b>Note:</b> To be valued only if it is a taxable transaction.
     * <br><br>
     * If valued with "S", the Natura field can not be "N6"
     */
    public void setEsigibilitaIVA(final EsigibilitaIVAType esigibilitaIVA) {
        this.esigibilitaIVA = esigibilitaIVA; // TODO: 20/01/2019 add checks??
    }

    public String getRiferimentoNormativo() {
        return riferimentoNormativo;
    }

    /**
     * Indicates the normative reason that excludes this operation from the application of the tax
     * (Article 21, paragraph 6 of Presidential Decree 633/1972).
     * <br><br>
     * <b>Note:</b> To be valued only if the Nature field is valued and therefore in the case of
     * transactions that do not fall between the taxable ones or in cases of inversion of accounts.
     *
     * @param riferimentoNormativo no particular criteria is established
     */
    public void setRiferimentoNormativo(final String riferimentoNormativo) {
        this.riferimentoNormativo = riferimentoNormativo;
    }

}
