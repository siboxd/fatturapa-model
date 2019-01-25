package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * SignatureMethod<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "SignatureMethod")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public final class SignatureMethod {

    @Element(name = "HMACOutputLength", required = false)
    private String hmacOutputLength;
    @Attribute(name = "Algorithm", required = true)
    private String algorithm;

    public SignatureMethod() {
    }

    public String getHmacOutputLength() {
        return hmacOutputLength;
    }

    public void setHmacOutputLength(String hmacOutputLength) {
        this.hmacOutputLength = hmacOutputLength;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
