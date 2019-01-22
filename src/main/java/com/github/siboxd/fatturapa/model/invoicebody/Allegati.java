package com.github.siboxd.fatturapa.model.invoicebody;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * This is a block of data provided to allow the compiler, after agreement with the recipient of
 * the document, to integrate through a file of any format (Pdf, Jpeg, Doc, Txt, XML, TIFF .....)
 * the information content of the document itself.
 * <br><br>
 * The need, for example, may arise because data contained in the attached file:
 * <ul>
 * <li>cannot be located in the fields of the document</li>
 * <li>although they could be placed in the fields of the document, it is considered more useful
 * or convenient to transmit them through another file.</li>
 * </ul>
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Allegati")
public class Allegati {

    @Element(name = "NomeAttachment")
    private String nomeAttachment;

    @Element(name = "AlgoritmoCompressione", required = false)
    private String algoritmoCompressione;

    @Element(name = "FormatoAttachment", required = false)
    private String formatoAttachment;

    @Element(name = "DescrizioneAttachment", required = false)
    private String descrizioneAttachment;

    @Element(name = "Attachment")
    private String attachment;

    public Allegati() {
    }

    public String getNomeAttachment() {
        return nomeAttachment;
    }

    /**
     * <b>Note:</b> To be valued only if the attachment is a file
     *
     * @param nomeAttachment no particular criteria is established
     */
    public void setNomeAttachment(final String nomeAttachment) {
        this.nomeAttachment = nomeAttachment;
    }

    public String getAlgoritmoCompressione() {
        return algoritmoCompressione;
    }

    /**
     * It is used to indicate the algorithm used for compression (ZIP, RAR ....), in cases
     * where a file is attached in compressed format.
     * <br><br>
     * <b>Note:</b> To be valued only if the attached file is in a compressed format
     *
     * @param algoritmoCompressione no particular criteria is established
     */
    public void setAlgoritmoCompressione(final String algoritmoCompressione) {
        this.algoritmoCompressione = algoritmoCompressione;
    }

    public String getFormatoAttachment() {
        return formatoAttachment;
    }

    /**
     * Used to indicate the format of the attached file (TXT, XML, PDF, ....).
     *
     * @param formatoAttachment no particular criteria is established
     */
    public void setFormatoAttachment(final String formatoAttachment) {
        this.formatoAttachment = formatoAttachment;
    }

    public String getDescrizioneAttachment() {
        return descrizioneAttachment;
    }

    /**
     * It is used to provide a brief description of the contents of the attached file.
     *
     * @param descrizioneAttachment no particular criteria is established
     */
    public void setDescrizioneAttachment(final String descrizioneAttachment) {
        this.descrizioneAttachment = descrizioneAttachment;
    }

    public String getAttachment() {
        return attachment;
    }

    /**
     * Represents the actual file to be attached
     *
     * @param attachment The attached file must be encoded using the <b>Base64Binary</b> algorithm;
     *                   <p>
     *                   its maximum size is not fixed a priori, but must necessarily take into
     *                   account the dimensional constraints envisaged for the electronic invoice
     */
    public void setAttachment(final String attachment) {
        this.attachment = attachment;
    }

}
