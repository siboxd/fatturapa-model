package com.github.siboxd.fatturapa.model.invoiceheader.fiscalagent;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the identification data of the tax representative
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "RappresentanteFiscale")
public final class RappresentanteFiscale {

    @Element(name = "DatiAnagrafici")
    private DatiAnagraficiRappresentante datiAnagrafici;

    public RappresentanteFiscale() {
    }

    public DatiAnagraficiRappresentante getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(final DatiAnagraficiRappresentante datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

}
