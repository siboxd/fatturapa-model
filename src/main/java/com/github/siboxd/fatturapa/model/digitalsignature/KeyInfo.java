package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * KeyInfo<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "KeyInfo")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public final class KeyInfo {

    @Element(name = "KeyName", required = true)
    private String keyName;
    @Element(name = "KeyValue", required = true)
    private KeyValue keyValue;
    @Element(name = "RetrievalMethod", required = true)
    private RetrievalMethod retrievalMethod;
    @Element(name = "X509Data", required = true)
    private X509Data x509Data;
    @Element(name = "PGPData", required = true)
    private PGPData pgpData;
    @Element(name = "SPKIData", required = true)
    private SPKIData spkiData;
    @Element(name = "MgmtData", required = true)
    private String mgmtData;
    @Attribute(name = "Id", required = false)
    private String id;

    public KeyInfo() {
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public KeyValue getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(KeyValue keyValue) {
        this.keyValue = keyValue;
    }

    public RetrievalMethod getRetrievalMethod() {
        return retrievalMethod;
    }

    public void setRetrievalMethod(RetrievalMethod retrievalMethod) {
        this.retrievalMethod = retrievalMethod;
    }

    public X509Data getX509Data() {
        return x509Data;
    }

    public void setX509Data(X509Data x509Data) {
        this.x509Data = x509Data;
    }

    public PGPData getPgpData() {
        return pgpData;
    }

    public void setPgpData(PGPData pgpData) {
        this.pgpData = pgpData;
    }

    public SPKIData getSpkiData() {
        return spkiData;
    }

    public void setSpkiData(SPKIData spkiData) {
        this.spkiData = spkiData;
    }

    public String getMgmtData() {
        return mgmtData;
    }

    public void setMgmtData(String mgmtData) {
        this.mgmtData = mgmtData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
