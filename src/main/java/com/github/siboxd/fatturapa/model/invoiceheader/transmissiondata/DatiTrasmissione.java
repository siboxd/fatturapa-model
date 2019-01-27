package com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata;

import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
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
    private String pecDestinatario;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiTrasmissione() {
    }

    private DatiTrasmissione(@NonNull final Builder builder) {
        idTrasmittente = builder.idTrasmittente;
        progressivoInvio = builder.progressivoInvio;
        formatoTrasmissione = builder.formatoTrasmissione;
        codiceDestinatario = builder.codiceDestinatario;
        contattiTrasmittente = builder.contattiTrasmittente;
        pecDestinatario = builder.pecDestinatario;
    }

    @NonNull
    public IdFiscale getIdTrasmittente() {
        return idTrasmittente;
    }

    @NonNull
    public String getProgressivoInvio() {
        return progressivoInvio;
    }

    @NonNull
    public FormatoTrasmissione getFormatoTrasmissione() {
        return formatoTrasmissione;
    }

    @NonNull
    public String getCodiceDestinatario() {
        return codiceDestinatario;
    }

    @Nullable
    public ContattiTrasmittente getContattiTrasmittente() {
        return contattiTrasmittente;
    }

    @Nullable
    public String getPecDestinatario() {
        return pecDestinatario;
    }

    /**
     * {@code DatiTrasmissione} builder static inner class.
     */
    public static final class Builder {
        private IdFiscale idTrasmittente;
        private String progressivoInvio;
        private FormatoTrasmissione formatoTrasmissione;
        private String codiceDestinatario;
        private ContattiTrasmittente contattiTrasmittente;
        private String pecDestinatario;

        /**
         * Requires non-optional fields
         *
         * @param idTrasmittente      transmitting subject id
         * @param progressivoInvio    It is a field for the exclusive use of the transmitting subject
         *                            as an identifying element of the transmitted file.
         * @param formatoTrasmissione Whether the invoice is destined to PA or private entity
         * @param codiceDestinatario  code to correctly deliver the file to the recipient.
         */
        public Builder(@NonNull final IdFiscale idTrasmittente,
                       @NonNull final String progressivoInvio,
                       @NonNull final FormatoTrasmissione formatoTrasmissione,
                       @NonNull final String codiceDestinatario) {
            this.idTrasmittente = idTrasmittente;
            this.progressivoInvio = progressivoInvio;
            this.formatoTrasmissione = formatoTrasmissione;
            this.codiceDestinatario = codiceDestinatario;
        }

        public Builder(@NonNull final DatiTrasmissione copy) {
            this(copy.getIdTrasmittente(), copy.getProgressivoInvio(), copy.getFormatoTrasmissione(),
                    copy.getCodiceDestinatario());

            this.contattiTrasmittente = copy.getContattiTrasmittente();
            this.pecDestinatario = copy.getPecDestinatario();
        }

        public Builder idTrasmittente(@NonNull final IdFiscale idTrasmittente) {
            this.idTrasmittente = idTrasmittente;
            return this;
        }

        /**
         * It is a field for the exclusive use of the transmitting subject as an identifying element
         * of the transmitted file.
         *
         * @param progressivoInvio no specific criteria for the valorisation are established
         */
        public Builder progressivoInvio(@NonNull final String progressivoInvio) {
            this.progressivoInvio = progressivoInvio;
            return this;
        }

        public Builder formatoTrasmissione(@NonNull final FormatoTrasmissione formatoTrasmissione) {
            this.formatoTrasmissione = formatoTrasmissione;
            return this;
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
        public Builder codiceDestinatario(@NonNull final String codiceDestinatario) {
            this.codiceDestinatario = codiceDestinatario;
            return this;
        }

        public Builder contattiTrasmittente(@Nullable final ContattiTrasmittente contattiTrasmittente) {
            this.contattiTrasmittente = contattiTrasmittente;
            return this;
        }

        /**
         * It allows to identify the address where to deliver the file.
         *
         * @param pecDestinatario It must contain a certified e-mail address.
         */
        // TODO mandatory only if CodcieDestinatario is 0000000 (runtime check)
        public Builder pecDestinatario(@Nullable final String pecDestinatario) {
            this.pecDestinatario = pecDestinatario;
            return this;
        }

        /**
         * Returns a {@code DatiTrasmissione} built from the parameters previously set.
         *
         * @return a {@code DatiTrasmissione} built with parameters of this {@code DatiTrasmissione.Builder}
         */
        public DatiTrasmissione build() {
            return new DatiTrasmissione(this);
        }
    }
}
