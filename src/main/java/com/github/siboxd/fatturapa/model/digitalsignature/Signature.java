package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Signature<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Signature")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class Signature {

    @Element(name = "SignedInfo", required = true)
    private SignedInfo signedInfo;
    @Element(name = "SignatureValue", required = true)
    private SignatureValue signatureValue;
    @Element(name = "KeyInfo", required = false)
    private KeyInfo keyInfo;
    @ElementList(name = "Object", entry = "Object", inline = true, required = false)
    private List<Object> object;
    @Attribute(name = "Id", required = false)
    private String id;

    public Signature() {
    }

    public SignedInfo getSignedInfo() {
        return signedInfo;
    }

    public void setSignedInfo(SignedInfo signedInfo) {
        this.signedInfo = signedInfo;
    }

    public SignatureValue getSignatureValue() {
        return signatureValue;
    }

    public void setSignatureValue(SignatureValue signatureValue) {
        this.signatureValue = signatureValue;
    }

    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }

    public List<Object> getObject() {
        return object;
    }

    public void setObject(List<Object> object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
