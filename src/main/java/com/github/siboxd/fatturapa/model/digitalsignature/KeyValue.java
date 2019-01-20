package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * KeyValue<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "KeyValue")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class KeyValue {

    @Element(name = "DSAKeyValue", required = true)
    private DSAKeyValue dsaKeyValue;
    @Element(name = "RSAKeyValue", required = true)
    private RSAKeyValue rsaKeyValue;

    public KeyValue() {
    }

    public DSAKeyValue getDsaKeyValue() {
        return dsaKeyValue;
    }

    public void setDsaKeyValue(DSAKeyValue dsaKeyValue) {
        this.dsaKeyValue = dsaKeyValue;
    }

    public RSAKeyValue getRsaKeyValue() {
        return rsaKeyValue;
    }

    public void setRsaKeyValue(RSAKeyValue rsaKeyValue) {
        this.rsaKeyValue = rsaKeyValue;
    }

}
