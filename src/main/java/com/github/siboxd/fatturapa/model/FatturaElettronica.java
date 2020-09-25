package com.github.siboxd.fatturapa.model;

import com.github.siboxd.fatturapa.model.digitalsignature.Signature;
import com.github.siboxd.fatturapa.model.invoicebody.FatturaElettronicaBody;
import com.github.siboxd.fatturapa.model.invoiceheader.FatturaElettronicaHeader;
import com.github.siboxd.fatturapa.model.invoiceheader.transmissiondata.FormatoTrasmissione;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.*;

import java.util.Collections;
import java.util.List;

import static com.github.siboxd.fatturapa.model.utils.Lists.defensiveCopy;


/**
 * A class representing the Italian Electronic Invoice; it's the starting point for its construction
 */
@Root(name = "FatturaElettronica")
@NamespaceList({
        @Namespace(prefix = "p", reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2"),
        @Namespace(prefix = "ds", reference = "http://www.w3.org/2000/09/xmldsig#"),
        @Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance")
})
@Namespace(prefix = "p", reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
@Order(elements = {"FatturaElettronicaHeader", "FatturaElettronicaBody", "Signature"},
        attributes = {"versione", "SistemaEmittente", "schemaLocation"})
public final class FatturaElettronica {

    @Attribute(name = "schemaLocation", required = false)
    @Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance")
    @SuppressWarnings("unused")
    private static final String FATTURA_XSD_SCHEMA_LOCATION = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2 http://www.fatturapa.gov.it/export/fatturazione/sdi/fatturapa/v1.2/Schema_del_file_xml_FatturaPA_versione_1.2.xsd";

    @Attribute(name = "versione")
    private FormatoTrasmissione versione;

    @Attribute(name = "SistemaEmittente", required = false)
    private String sistemaEmittente;

    @Element(name = "FatturaElettronicaHeader")
    private FatturaElettronicaHeader fatturaElettronicaHeader;

    @ElementList(name = "FatturaElettronicaBody", entry = "FatturaElettronicaBody", inline = true)
    private List<FatturaElettronicaBody> fatturaElettronicaBody;

    @Element(name = "Signature", required = false)
    @Namespace(prefix = "ds", reference = "http://www.w3.org/2000/09/xmldsig#")
    private Signature signature;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private FatturaElettronica() {
    }

    private FatturaElettronica(@NonNull final Builder builder) {
        versione = builder.versione;
        fatturaElettronicaHeader = builder.fatturaElettronicaHeader;
        fatturaElettronicaBody = builder.fatturaElettronicaBody;
        signature = builder.signature;
    }

    @NonNull
    public FormatoTrasmissione getVersione() {
        return versione;
    }

    @Nullable
    public String getSistemaEmittente() {
        return sistemaEmittente;
    }

    @NonNull
    public FatturaElettronicaHeader getFatturaElettronicaHeader() {
        return fatturaElettronicaHeader;
    }

    @NonNull
    public List<FatturaElettronicaBody> getFatturaElettronicaBody() {
        return Collections.unmodifiableList(fatturaElettronicaBody);
    }

    @Nullable
    public Signature getSignature() {
        return signature;
    }

    /**
     * {@code FatturaElettronica} builder static inner class.
     */
    public static final class Builder {
        private FormatoTrasmissione versione;
        private String sistemaEmittente;
        private FatturaElettronicaHeader fatturaElettronicaHeader;
        private List<FatturaElettronicaBody> fatturaElettronicaBody;
        private Signature signature;

        /**
         * Requires non-optional fields
         *
         * @param versione                 the transmission type (destined to PA or private entity)
         * @param fatturaElettronicaHeader the header part of electronic invoice
         * @param fatturaElettronicaBody   the electronic invoice body
         */
        public Builder(@NonNull final FormatoTrasmissione versione,
                       @NonNull final FatturaElettronicaHeader fatturaElettronicaHeader,
                       @NonNull final List<FatturaElettronicaBody> fatturaElettronicaBody) {
            this.versione = versione;
            this.fatturaElettronicaHeader = fatturaElettronicaHeader;
            this.fatturaElettronicaBody = fatturaElettronicaBody;
        }

        public Builder(@NonNull final FatturaElettronica copy) {
            this(copy.getVersione(), copy.getFatturaElettronicaHeader(), copy.getFatturaElettronicaBody());
            this.signature = copy.getSignature();
            this.sistemaEmittente = copy.getSistemaEmittente();
        }

        /**
         * Sets the {@code versione} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param versione the {@code versione} to set
         * @return a reference to this Builder
         */
        public Builder versione(@NonNull final FormatoTrasmissione versione) {
            this.versione = versione;
            return this;
        }

        /**
         * Sets the {@code sistemaEmittente} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param sistemaEmittente the {@code sistemaEmittente} to set
         * @return a reference to this Builder
         */
        public Builder sistemaEmittente(@Nullable final String sistemaEmittente) {
            this.sistemaEmittente = sistemaEmittente;
            return this;
        }

        /**
         * Sets the {@code fatturaElettronicaHeader} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param fatturaElettronicaHeader the {@code fatturaElettronicaHeader} to set
         * @return a reference to this Builder
         */
        public Builder fatturaElettronicaHeader(@NonNull final FatturaElettronicaHeader fatturaElettronicaHeader) {
            this.fatturaElettronicaHeader = fatturaElettronicaHeader;
            return this;
        }

        /**
         * Sets the {@code fatturaElettronicaBody} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param fatturaElettronicaBody the {@code fatturaElettronicaBody} to set
         * @return a reference to this Builder
         */
        public Builder fatturaElettronicaBody(@Nullable final List<FatturaElettronicaBody> fatturaElettronicaBody) {
            this.fatturaElettronicaBody = fatturaElettronicaBody;
            return this;
        }

        /**
         * Sets the {@code signature} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param signature the {@code signature} to set
         * @return a reference to this Builder
         */
        public Builder signature(@Nullable final Signature signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Returns a {@code FatturaElettronica} built from the parameters previously set.
         *
         * @return a {@code FatturaElettronica} built with parameters of this {@code FatturaElettronica.Builder}
         */
        public FatturaElettronica build() {
            this.fatturaElettronicaBody = defensiveCopy(this.fatturaElettronicaBody);
            return new FatturaElettronica(this);
        }
    }
}
