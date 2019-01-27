package com.github.siboxd.fatturapa.model.invoiceheader.thirdpartyintermediary;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains data of a third party that issues the invoice on behalf of the seller
 */
@Root(name = "TerzoIntermediarioSoggettoEmittente")
public final class TerzoIntermediarioSoggettoEmittente { // TODO maybe this class can be removed using Path directive in parent class

    @Element(name = "DatiAnagrafici")
    private final DatiAnagraficiTerzoIntermediario datiAnagrafici;

    public TerzoIntermediarioSoggettoEmittente(@Element(name = "DatiAnagrafici") @NonNull final DatiAnagraficiTerzoIntermediario datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    @NonNull
    public DatiAnagraficiTerzoIntermediario getDatiAnagrafici() {
        return datiAnagrafici;
    }

}
