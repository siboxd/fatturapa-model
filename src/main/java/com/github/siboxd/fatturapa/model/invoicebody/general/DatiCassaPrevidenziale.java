package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.model.invoicebody.Natura;
import com.github.siboxd.fatturapa.model.invoicebody.Ritenuta;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Describes the social security contribution to be paid
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiCassaPrevidenziale")
public final class DatiCassaPrevidenziale {

    @Element(name = "TipoCassa")
    private TipoCassa tipoCassa;

    @Element(name = "AlCassa")
    private String alCassa;

    @Element(name = "ImportoContributoCassa")
    private String importoContributoCassa;

    @Element(name = "ImponibileCassa", required = false)
    private String imponibileCassa;

    @Element(name = "AliquotaIVA")
    private String aliquotaIVA;

    @Element(name = "Ritenuta", required = false)
    private Ritenuta ritenuta;

    @Element(name = "Natura", required = false)
    private Natura natura;

    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;

    public DatiCassaPrevidenziale() {
    }

    public TipoCassa getTipoCassa() {
        return tipoCassa;
    }

    public void setTipoCassa(final TipoCassa tipoCassa) {
        this.tipoCassa = tipoCassa;
    }

    public String getAlCassa() {
        return alCassa;
    }

    /**
     * @param alCassa It must contain the value of the contribution rate (in percentage) envisaged
     *                for the pension fund. The decimals, separated by the whole with the dot
     *                character ("."), Must always be indicated even if zero (eg: 4.00).
     */
    public void setAlCassa(final String alCassa) {
        this.alCassa = alCassa;
    }

    public String getImportoContributoCassa() {
        return importoContributoCassa;
    }

    /**
     * @param importoContributoCassa The field contains a numeric value consisting of an integer
     *                               and two decimal places. The decimals, separated by the whole
     *                               with the dot character ("."), Must always be indicated even
     *                               if zero (eg: 250.00).
     */
    public void setImportoContributoCassa(final String importoContributoCassa) {
        this.importoContributoCassa = importoContributoCassa;
    }

    public String getImponibileCassa() {
        return imponibileCassa;
    }

    /**
     * @param imponibileCassa The field, if evaluated, contains a numerical value composed of an
     *                        integer and two decimal places. The decimals, separated by the whole
     *                        with the dot character ("."), Must always be indicated even if zero
     *                        (eg: 340.00).
     */
    public void setImponibileCassa(final String imponibileCassa) {
        this.imponibileCassa = imponibileCassa;
    }

    public String getAliquotaIVA() {
        return aliquotaIVA;
    }

    /**
     * @param aliquotaIVA It must contain the value of the VAT rate (in percentage) to be applied
     *                    to the contribution amount. The decimals, separated by the whole with the
     *                    dot character ("."), Must always be indicated even if zero (eg: 4.00).<br><br>
     *                    The field must also be valued at a rate equal to zero (0.00).
     */
    public void setAliquotaIVA(final String aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;
    }

    public Ritenuta getRitenuta() {
        return ritenuta;
    }

    /**
     * <b>Note:</b> To be valued only if the contribution to the pension fund is subject to withholding.
     */
    public void setRitenuta(final Ritenuta ritenuta) {
        this.ritenuta = ritenuta;
    }

    public Natura getNatura() {
        return natura;
    }

    /**
     * <b>Note:</b> To be valued only if the applied VAT rate is zero.
     */
    public void setNatura(final Natura natura) {
        this.natura = natura;
    }

    public String getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    /**
     * It serves to give evidence of a possible reference (code or other) useful to the recipient
     * of the document; the latter can ask the seller to enter in this field a certain value
     * which he can use to facilitate the automatic processing of the invoice.
     *
     * @param riferimentoAmministrazione No particular criteria are established; the modality of
     *                                   valorization of the field, with a view to use such as the
     *                                   one above, is necessarily the result of an agreement
     *                                   between the parties
     */
    public void setRiferimentoAmministrazione(final String riferimentoAmministrazione) {
        this.riferimentoAmministrazione = riferimentoAmministrazione;
    }

}
