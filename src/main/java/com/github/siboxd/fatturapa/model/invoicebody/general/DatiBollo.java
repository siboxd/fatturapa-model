package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * Describes stamp duty
 */
@Root(name = "DatiBollo")
@Order(elements = {"BolloVirtuale", "ImportoBollo"})
public final class DatiBollo {

    @Element(name = "BolloVirtuale")
    private final BolloVirtuale bolloVirtuale;

    @Element(name = "ImportoBollo", required = false)
    private final String importoBollo;

    /**
     * @param bolloVirtuale Whether the duty is virtual
     * @param importoBollo  The field contains a numeric value consisting of an integer and two
     *                      decimal places. The decimals, separated by the whole with the dot character
     *                      ("."), Must always be indicated even if zero (eg: 25.00).
     */
    public DatiBollo(@Element(name = "BolloVirtuale") @NonNull final BolloVirtuale bolloVirtuale,
                     @Element(name = "ImportoBollo") @Nullable final String importoBollo) {
        this.bolloVirtuale = bolloVirtuale;
        this.importoBollo = importoBollo;
    }

    @NonNull
    public BolloVirtuale getBolloVirtuale() {
        return bolloVirtuale;
    }

    @Nullable
    public String getImportoBollo() {
        return importoBollo;
    }
}
