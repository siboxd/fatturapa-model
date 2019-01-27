package com.github.siboxd.fatturapa.model.invoiceheader.fiscalagent;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the identification data of the tax representative
*/
@Root(name = "RappresentanteFiscale")
public final class RappresentanteFiscale { // TODO maybe this class can be removed using Path directive in parent class

    @Element(name = "DatiAnagrafici")
    private final DatiAnagraficiRappresentante datiAnagrafici;

    public RappresentanteFiscale(@Element(name = "DatiAnagrafici") @NonNull final DatiAnagraficiRappresentante datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    @NonNull
    public DatiAnagraficiRappresentante getDatiAnagrafici() {
        return datiAnagrafici;
    }
}
