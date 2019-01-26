package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Describes stamp duty
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiBollo")
public final class DatiBollo {

    @Element(name = "BolloVirtuale")
    private final BolloVirtuale bolloVirtuale;

    @Element(name = "ImportoBollo")
    private final String importoBollo;

    /**
     * @param bolloVirtuale Whether the duty is virtual
     * @param importoBollo  The field contains a numeric value consisting of an integer and two
     *                      decimal places. The decimals, separated by the whole with the dot character
     *                      ("."), Must always be indicated even if zero (eg: 25.00).
     */
    public DatiBollo(@Element(name = "BolloVirtuale") @NonNull final BolloVirtuale bolloVirtuale,
                     @Element(name = "ImportoBollo") @NonNull final String importoBollo) {
        this.bolloVirtuale = bolloVirtuale;
        this.importoBollo = importoBollo;
    }

    @NonNull
    public BolloVirtuale getBolloVirtuale() {
        return bolloVirtuale;
    }

    @NonNull
    public String getImportoBollo() {
        return importoBollo;
    }
}
