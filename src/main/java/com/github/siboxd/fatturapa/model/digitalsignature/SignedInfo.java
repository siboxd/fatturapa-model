package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * SignedInfo<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "SignedInfo")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class SignedInfo {

    @Element(name = "CanonicalizationMethod", required = true)
    private CanonicalizationMethod canonicalizationMethod;
    @Element(name = "SignatureMethod", required = true)
    private SignatureMethod signatureMethod;
    @ElementList(name = "Reference", entry = "Reference", inline = true, required = true)
    private List<Reference> reference;
    @Attribute(name = "Id", required = false)
    private String id;

    public SignedInfo() {
    }

    public CanonicalizationMethod getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    public void setCanonicalizationMethod(CanonicalizationMethod canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public SignatureMethod getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(SignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public List<Reference> getReference() {
        return reference;
    }

    public void setReference(List<Reference> reference) {
        this.reference = reference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
