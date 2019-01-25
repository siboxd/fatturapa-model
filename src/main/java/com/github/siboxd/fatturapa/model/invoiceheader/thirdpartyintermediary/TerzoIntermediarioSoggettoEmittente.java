package com.github.siboxd.fatturapa.model.invoiceheader.thirdpartyintermediary;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains data of a third party that issues the invoice on behalf of the seller
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "TerzoIntermediarioSoggettoEmittente")
public final class TerzoIntermediarioSoggettoEmittente {

    @Element(name = "DatiAnagrafici")
    private DatiAnagraficiTerzoIntermediario datiAnagrafici;

    public TerzoIntermediarioSoggettoEmittente() {
    }

    public DatiAnagraficiTerzoIntermediario getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(final DatiAnagraficiTerzoIntermediario datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

}
