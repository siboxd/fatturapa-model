package com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata;

import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This data block allows the identification of the transmitting subject and the correct delivery
 * of the electronic document to the recipient.<br><br>
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiTrasmissione")
public final class DatiTrasmissione {

    @Element(name = "IdTrasmittente")
    private IdFiscale idTrasmittente;

    @Element(name = "ProgressivoInvio")
    private String progressivoInvio;

    @Element(name = "FormatoTrasmissione")
    private FormatoTrasmissione formatoTrasmissione;

    @Element(name = "CodiceDestinatario")
    private String codiceDestinatario;

    @Element(name = "ContattiTrasmittente", required = false)
    private ContattiTrasmittente contattiTrasmittente;

    @Element(name = "PECDestinatario", required = false)
    private String pecDestinatario; // TODO mandatory only if CodcieDestinatario is 0000000 (runtime check)

    public DatiTrasmissione() {
    }

    public IdFiscale getIdTrasmittente() {
        return idTrasmittente;
    }

    public void setIdTrasmittente(final IdFiscale idTrasmittente) {
        this.idTrasmittente = idTrasmittente;
    }

    public String getProgressivoInvio() {
        return progressivoInvio;
    }

    /**
     * It is a field for the exclusive use of the transmitting subject as an identifying element
     * of the transmitted file.
     *
     * @param progressivoInvio no specific criteria for the valorisation are established
     */
    public void setProgressivoInvio(final String progressivoInvio) {
        this.progressivoInvio = progressivoInvio;
    }

    public FormatoTrasmissione getFormatoTrasmissione() {
        return formatoTrasmissione;
    }

    public void setFormatoTrasmissione(final FormatoTrasmissione formatoTrasmissione) {
        this.formatoTrasmissione = formatoTrasmissione;
    }

    public String getCodiceDestinatario() {
        return codiceDestinatario;
    }

    /**
     * It is essential to the Interchange System to identify the elements necessary to correctly
     * deliver the file to the recipient.
     *
     * @param codiceDestinatario The type of recipient must be distinguished:<br><br>
     *                           <ul>
     *                           <li>If the invoice is destined for a <b>public administration</b>,
     *                           the field must contain the <em>6-character code</em>, present on
     *                           "<em>https://www.indicepa.gov.it</em>" between the information related
     *                           to the electronic invoicing service, associated with the office which,
     *                           within the receiving administration, performs the function reception
     *                           (and possibly processing) of the invoice;
     *                           <br><br>
     *                           Alternatively, it is possible to set the field with the "Central"
     *                           Office code or with the default value <code>999999</code>, when the conditions
     *                           provided for by the provisions of the <em>Interpretative Circular of the
     *                           Ministry of the Economy and Finance no. 1 of 31 March 2014</em>;</li>
     *
     *                           <li>If the invoice is addressed to a <b>private entity</b>, the field
     *                           must contain the <em>7-character code</em> that the <em>Interchange System</em>
     *                           has assigned to those who, as the owner of a transmission channel
     *                           other than the PEC enabled to receive electronic invoices, have made
     *                           request through the appropriate functionality on the site
     *                           <em>www.fatturapa.gov.it</em>;
     *                           <br><br>
     *                           If the invoice must be delivered to a subject wishing to receive
     *                           electronic invoices through the <em>PEC channel</em>, the field must
     *                           be valued with seven zeros <code>0000000</code> and the field
     *                           <b><code>PECDestinatario</code></b> must be valued.</li>
     *
     *                           </ul>
     */
    public void setCodiceDestinatario(final String codiceDestinatario) {
        this.codiceDestinatario = codiceDestinatario;
    }

    public ContattiTrasmittente getContattiTrasmittente() {
        return contattiTrasmittente;
    }

    public void setContattiTrasmittente(final ContattiTrasmittente contattiTrasmittente) {
        this.contattiTrasmittente = contattiTrasmittente;
    }

    public String getPecDestinatario() {
        return pecDestinatario;
    }

    /**
     * It allows to identify the address where to deliver the file.
     *
     * @param pecDestinatario It must contain a certified e-mail address.
     */
    public void setPecDestinatario(final String pecDestinatario) {
        this.pecDestinatario = pecDestinatario;
    }

}
