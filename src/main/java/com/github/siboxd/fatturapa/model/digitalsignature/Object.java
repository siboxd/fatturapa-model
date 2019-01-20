package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Object<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Object")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class Object {

    @Attribute(name = "MimeType", required = false)
    private String mimeType;
    @Attribute(name = "Encoding", required = false)
    private String encoding;
    @Attribute(name = "Id", required = false)
    private String id;

    public Object() {
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
