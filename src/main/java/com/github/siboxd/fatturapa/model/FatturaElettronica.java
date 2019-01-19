package com.github.siboxd.fatturapa.model;

import com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata.FatturaElettronicaHeaderType;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * FatturaElettronica<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "FatturaElettronica")
@NamespaceList({
        @Namespace(prefix = "p", reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2"),
        @Namespace(prefix = "ds", reference = "http://www.w3.org/2000/09/xmldsig#"),
        @Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance")
})
@Namespace(prefix = "p", reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public class FatturaElettronica {

    @Element(name = "FatturaElettronicaHeader")
    private FatturaElettronicaHeaderType fatturaElettronicaHeader;

    @ElementList(name = "FatturaElettronicaBody", entry = "FatturaElettronicaBody", inline = true)
    private List<FatturaElettronicaBodyType> fatturaElettronicaBody;

    @Element(name = "Signature", required = false)
    @Namespace(prefix = "ds", reference = "http://www.w3.org/2000/09/xmldsig#")
    private SignatureType signature;

    @Attribute(name = "versione")
    private FormatoTrasmissioneType versione;

    @Attribute(name = "schemaLocation", required = false)
    @Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance")
    private String fatturaXsdUrl;


    public FatturaElettronica() {
    }

    public FatturaElettronicaHeaderType getFatturaElettronicaHeader() {
        return fatturaElettronicaHeader;
    }

    public void setFatturaElettronicaHeader(final FatturaElettronicaHeaderType fatturaElettronicaHeader) {
        this.fatturaElettronicaHeader = fatturaElettronicaHeader;
    }

    public List<FatturaElettronicaBodyType> getFatturaElettronicaBody() {
        return fatturaElettronicaBody;
    }

    public void setFatturaElettronicaBody(final List<FatturaElettronicaBodyType> fatturaElettronicaBody) {
        this.fatturaElettronicaBody = fatturaElettronicaBody;
    }

    public SignatureType getSignature() {
        return signature;
    }

    public void setSignature(final SignatureType signature) {
        this.signature = signature;
    }

    public FormatoTrasmissioneType getVersione() {
        return versione;
    }

    public void setVersione(final FormatoTrasmissioneType versione) {
        this.versione = versione;
    }

}
