package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Reference<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Reference")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class Reference {

    @Element(name = "Transforms", required = false)
    private Transforms transforms;
    @Element(name = "DigestMethod", required = true)
    private DigestMethod digestMethod;
    @Element(name = "DigestValue", required = true)
    private String digestValue;
    @Attribute(name = "URI", required = false)
    private String uri;
    @Attribute(name = "Id", required = false)
    private String id;
    @Attribute(name = "Type", required = false)
    private String type;

    public Reference() {
    }

    public Transforms getTransforms() {
        return transforms;
    }

    public void setTransforms(Transforms transforms) {
        this.transforms = transforms;
    }

    public DigestMethod getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(DigestMethod digestMethod) {
        this.digestMethod = digestMethod;
    }

    public String getDigestValue() {
        return digestValue;
    }

    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
