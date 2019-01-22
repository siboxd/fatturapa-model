package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DigestMethod<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DigestMethod")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class DigestMethod {

    @Attribute(name = "Algorithm", required = true)
    private String algorithm;

    public DigestMethod() {
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
