package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RSAKeyValue<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "RSAKeyValue")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class RSAKeyValue {

    @Element(name = "Modulus", required = true)
    private String modulus;
    @Element(name = "Exponent", required = true)
    private String exponent;

    public RSAKeyValue() {
    }

    public String getModulus() {
        return modulus;
    }

    public void setModulus(String modulus) {
        this.modulus = modulus;
    }

    public String getExponent() {
        return exponent;
    }

    public void setExponent(String exponent) {
        this.exponent = exponent;
    }

}
