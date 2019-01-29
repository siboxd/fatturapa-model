package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * PGPData<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "PGPData")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public final class PGPData {

    @Element(name = "PGPKeyID", required = true)
    private String pgpKeyID;
    @Element(name = "PGPKeyPacket", required = false)
    private String pgpKeyPacket;

    public PGPData() {
    }

    public String getPgpKeyID() {
        return pgpKeyID;
    }

    public void setPgpKeyID(String pgpKeyID) {
        this.pgpKeyID = pgpKeyID;
    }

    public String getPgpKeyPacket() {
        return pgpKeyPacket;
    }

    public void setPgpKeyPacket(String pgpKeyPacket) {
        this.pgpKeyPacket = pgpKeyPacket;
    }

}
