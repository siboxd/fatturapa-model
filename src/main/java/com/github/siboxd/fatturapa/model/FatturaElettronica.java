package com.github.siboxd.fatturapa.model;

import com.github.siboxd.fatturapa.model.digitalsignature.Signature;
import com.github.siboxd.fatturapa.model.invoicebody.FatturaElettronicaBody;
import com.github.siboxd.fatturapa.model.invoiceheader.FatturaElettronicaHeader;
import com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata.FormatoTrasmissione;

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
public final class FatturaElettronica {

    @Element(name = "FatturaElettronicaHeader")
    private FatturaElettronicaHeader fatturaElettronicaHeader;

    @ElementList(name = "FatturaElettronicaBody", entry = "FatturaElettronicaBody", inline = true)
    private List<FatturaElettronicaBody> fatturaElettronicaBody;

    @Element(name = "Signature", required = false)
    @Namespace(prefix = "ds", reference = "http://www.w3.org/2000/09/xmldsig#")
    private Signature signature;

    @Attribute(name = "versione")
    private FormatoTrasmissione versione;

    @Attribute(name = "schemaLocation", required = false)
    @Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance")
    private String fatturaXsdUrl;


    public FatturaElettronica() {
    }

    public FatturaElettronicaHeader getFatturaElettronicaHeader() {
        return fatturaElettronicaHeader;
    }

    public void setFatturaElettronicaHeader(final FatturaElettronicaHeader fatturaElettronicaHeader) {
        this.fatturaElettronicaHeader = fatturaElettronicaHeader;
    }

    public List<FatturaElettronicaBody> getFatturaElettronicaBody() {
        return fatturaElettronicaBody;
    }

    public void setFatturaElettronicaBody(final List<FatturaElettronicaBody> fatturaElettronicaBody) {
        this.fatturaElettronicaBody = fatturaElettronicaBody;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(final Signature signature) {
        this.signature = signature;
    }

    public FormatoTrasmissione getVersione() {
        return versione;
    }

    public void setVersione(final FormatoTrasmissione versione) {
        this.versione = versione;
    }

}
