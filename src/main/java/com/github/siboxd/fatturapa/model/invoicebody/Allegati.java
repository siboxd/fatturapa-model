package com.github.siboxd.fatturapa.model.invoicebody;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
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
 */
@Root(name = "Allegati")
@Order(elements = {"NomeAttachment", "AlgoritmoCompressione", "FormatoAttachment",
        "DescrizioneAttachment", "Attachment"})
public final class Allegati {

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

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private Allegati() {
    }

    private Allegati(@NonNull final Builder builder) {
        nomeAttachment = builder.nomeAttachment;
        algoritmoCompressione = builder.algoritmoCompressione;
        formatoAttachment = builder.formatoAttachment;
        descrizioneAttachment = builder.descrizioneAttachment;
        attachment = builder.attachment;
    }

    @NonNull
    public String getNomeAttachment() {
        return nomeAttachment;
    }

    @Nullable
    public String getAlgoritmoCompressione() {
        return algoritmoCompressione;
    }

    @Nullable
    public String getFormatoAttachment() {
        return formatoAttachment;
    }

    @Nullable
    public String getDescrizioneAttachment() {
        return descrizioneAttachment;
    }

    @NonNull
    public String getAttachment() {
        return attachment;
    }

    /**
     * {@code Allegati} builder static inner class.
     */
    public static final class Builder {
        private String nomeAttachment;
        private String algoritmoCompressione;
        private String formatoAttachment;
        private String descrizioneAttachment;
        private String attachment;

        /**
         * Requires non-optional fields
         *
         * @param nomeAttachment the file name
         * @param attachment     Represents the actual file to be attached. The attached file must
         *                       be encoded using the <b>Base64Binary</b> algorithm;
         *                       <p>
         *                       its maximum size is not fixed a priori, but must necessarily take into
         *                       account the dimensional constraints envisaged for the electronic invoice
         */
        public Builder(@NonNull final String nomeAttachment,
                       @NonNull final String attachment) {
            this.nomeAttachment = nomeAttachment;
            this.attachment = attachment;
        }

        public Builder(@NonNull final Allegati copy) {
            this(copy.getNomeAttachment(), copy.getAttachment());
            this.algoritmoCompressione = copy.getAlgoritmoCompressione();
            this.formatoAttachment = copy.getFormatoAttachment();
            this.descrizioneAttachment = copy.getDescrizioneAttachment();
        }

        /**
         * <b>Note:</b> To be valued only if the attachment is a file
         *
         * @param nomeAttachment no particular criteria is established
         */
        public Builder nomeAttachment(@NonNull final String nomeAttachment) {
            this.nomeAttachment = nomeAttachment;
            return this;
        }

        /**
         * It is used to indicate the algorithm used for compression (ZIP, RAR ....), in cases
         * where a file is attached in compressed format.
         * <br><br>
         * <b>Note:</b> To be valued only if the attached file is in a compressed format
         *
         * @param algoritmoCompressione no particular criteria is established
         */
        public Builder algoritmoCompressione(@Nullable final String algoritmoCompressione) {
            this.algoritmoCompressione = algoritmoCompressione;
            return this;
        }

        /**
         * Used to indicate the format of the attached file (TXT, XML, PDF, ....).
         *
         * @param formatoAttachment no particular criteria is established
         */
        public Builder formatoAttachment(@Nullable final String formatoAttachment) {
            this.formatoAttachment = formatoAttachment;
            return this;
        }

        /**
         * It is used to provide a brief description of the contents of the attached file.
         *
         * @param descrizioneAttachment no particular criteria is established
         */
        public Builder descrizioneAttachment(@Nullable final String descrizioneAttachment) {
            this.descrizioneAttachment = descrizioneAttachment;
            return this;
        }

        /**
         * Represents the actual file to be attached
         *
         * @param attachment The attached file must be encoded using the <b>Base64Binary</b> algorithm;
         *                   <p>
         *                   its maximum size is not fixed a priori, but must necessarily take into
         *                   account the dimensional constraints envisaged for the electronic invoice
         */
        public Builder attachment(@NonNull final String attachment) {
            this.attachment = attachment;
            return this;
        }

        /**
         * Returns a {@code Allegati} built from the parameters previously set.
         *
         * @return a {@code Allegati} built with parameters of this {@code Allegati.Builder}
         */
        public Allegati build() {
            return new Allegati(this);
        }
    }

}
