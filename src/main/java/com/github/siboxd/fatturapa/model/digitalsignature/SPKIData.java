package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * SPKIData<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "SPKIData")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class SPKIData {

    @Element(name = "SPKISexp", required = true)
    private String spkiSexp;

    public SPKIData() {
    }

    public String getSpkiSexp() {
        return spkiSexp;
    }

    public void setSpkiSexp(String spkiSexp) {
        this.spkiSexp = spkiSexp;
    }

}
