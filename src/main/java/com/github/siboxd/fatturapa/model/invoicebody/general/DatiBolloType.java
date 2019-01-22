package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Describes stamp duty
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiBolloType")
public class DatiBolloType {

    @Element(name = "BolloVirtuale")
    private BolloVirtuale bolloVirtuale;

    @Element(name = "ImportoBollo")
    private String importoBollo;

    public DatiBolloType() {
    }

    public BolloVirtuale getBolloVirtuale() {
        return bolloVirtuale;
    }

    public void setBolloVirtuale(final BolloVirtuale bolloVirtuale) {
        this.bolloVirtuale = bolloVirtuale;
    }

    public String getImportoBollo() {
        return importoBollo;
    }

    /**
     * @param importoBollo The field contains a numeric value consisting of an integer and two
     *                     decimal places. The decimals, separated by the whole with the dot character
     *                     ("."), Must always be indicated even if zero (eg: 25.00).
     */
    public void setImportoBollo(final String importoBollo) {
        this.importoBollo = importoBollo;
    }

}
