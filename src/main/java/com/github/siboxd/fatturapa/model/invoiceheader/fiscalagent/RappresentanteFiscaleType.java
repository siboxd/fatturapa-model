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
@Root(name = "RappresentanteFiscaleType")
public class RappresentanteFiscaleType {

    @Element(name = "DatiAnagrafici")
    private DatiAnagraficiRappresentanteType datiAnagrafici;

    public RappresentanteFiscaleType() {
    }

    public DatiAnagraficiRappresentanteType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(final DatiAnagraficiRappresentanteType datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

}
