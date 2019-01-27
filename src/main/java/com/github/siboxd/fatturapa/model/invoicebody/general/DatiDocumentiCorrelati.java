package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Describes the possible documents related to an invoice
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiDocumentiCorrelati")
public final class DatiDocumentiCorrelati {

    @ElementList(name = "RiferimentoNumeroLinea", entry = "RiferimentoNumeroLinea", inline = true, required = false, empty = false)
    private List<String> riferimentoNumeroLinea;

    @Element(name = "IdDocumento")
    private String idDocumento;

    @Element(name = "Data", required = false)
    private String data;

    @Element(name = "NumItem", required = false)
    private String numItem;

    @Element(name = "CodiceCommessaConvenzione", required = false)
    private String codiceCommessaConvenzione;

    @Element(name = "CodiceCUP", required = false)
    private String codiceCUP;

    @Element(name = "CodiceCIG", required = false)
    private String codiceCIG;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiDocumentiCorrelati() {
    }

    private DatiDocumentiCorrelati(@NonNull final Builder builder) {
        riferimentoNumeroLinea = builder.riferimentoNumeroLinea;
        idDocumento = builder.idDocumento;
        data = builder.data;
        numItem = builder.numItem;
        codiceCommessaConvenzione = builder.codiceCommessaConvenzione;
        codiceCUP = builder.codiceCUP;
        codiceCIG = builder.codiceCIG;
    }

    @NonNull
    public List<String> getRiferimentoNumeroLinea() {
        return Collections.unmodifiableList(riferimentoNumeroLinea);
    }

    @NonNull
    public String getIdDocumento() {
        return idDocumento;
    }

    @Nullable
    public String getData() {
        return data;
    }

    @Nullable
    public String getNumItem() {
        return numItem;
    }

    @Nullable
    public String getCodiceCommessaConvenzione() {
        return codiceCommessaConvenzione;
    }

    @Nullable
    public String getCodiceCUP() {
        return codiceCUP;
    }

    @Nullable
    public String getCodiceCIG() {
        return codiceCIG;
    }

    /**
     * {@code DatiDocumentiCorrelati} builder static inner class.
     */
    public static final class Builder {
        private List<String> riferimentoNumeroLinea;
        private String idDocumento;
        private String data;
        private String numItem;
        private String codiceCommessaConvenzione;
        private String codiceCUP;
        private String codiceCIG;

        /**
         * Required non-optional fields
         *
         * @param idDocumento The field must contain the number of the linked document
         */
        public Builder(@NonNull final String idDocumento) {
            this.idDocumento = idDocumento;
        }

        public Builder(@NonNull final DatiDocumentiCorrelati copy) {
            this.riferimentoNumeroLinea = copy.getRiferimentoNumeroLinea();
            this.idDocumento = copy.getIdDocumento();
            this.data = copy.getData();
            this.numItem = copy.getNumItem();
            this.codiceCommessaConvenzione = copy.getCodiceCommessaConvenzione();
            this.codiceCUP = copy.getCodiceCUP();
            this.codiceCIG = copy.getCodiceCIG();
        }

        /**
         * It is used to identify the detailed lines of the invoice to which the related document refers.
         * <br><br>
         * <b>Note:</b> If the related document refers to all the detail lines in the invoice,
         * the field may not be valued.
         */
        public Builder riferimentoNumeroLinea(@Nullable final List<String> riferimentoNumeroLinea) {
            this.riferimentoNumeroLinea = riferimentoNumeroLinea;
            return this;
        }

        /**
         * @param idDocumento The field must contain the number of the linked document
         */
        public Builder idDocumento(@NonNull final String idDocumento) {
            this.idDocumento = idDocumento;
            return this;
        }

        /**
         * @param data The field, if evaluated, must contain the date of the linked document in the
         *             format YYYY-MM-DD (ISO 8601: 2004 standard).
         */
        public Builder data(@Nullable final String data) {
            this.data = data; // TODO: 20/01/2019 add checks
            return this;
        }

        /**
         * It is used to identify the single entry in the linked document (the line number)
         *
         * @param numItem The field, if valued, must contain the value that identifies the line number
         *                of the connected document.
         */
        public Builder numItem(@Nullable final String numItem) {
            this.numItem = numItem;
            return this;
        }

        /**
         * It serves to highlight the contract or convention referred to in the attached document.
         *
         * @param codiceCommessaConvenzione The field, if valued, must contain the code of the contract
         *                                  or agreement
         */
        public Builder codiceCommessaConvenzione(@Nullable final String codiceCommessaConvenzione) {
            this.codiceCommessaConvenzione = codiceCommessaConvenzione;
            return this;
        }

        /**
         * It serves to highlight the code managed by the CIPE that characterizes each public investment
         * project (Unitary Project Code) and to ensure the effective traceability of payments by the
         * Public Administrations.
         * <br><br>
         * <b>Note:</b> To be valued only if you fall within the cases referred to in art. 25 DL 66/2014,
         * converted into Law June 23, 2014 n. 89.
         */
        public Builder codiceCUP(@Nullable final String codiceCUP) {
            this.codiceCUP = codiceCUP;
            return this;
        }

        /**
         * It serves to highlight the identification code of the tender and to ensure the effective
         * traceability of payments by the Public Administrations.
         * <br><br>
         * <b>Note:</b> To be valued only if you fall within the cases referred to in art. 25 DL 66/2014,
         * converted into Law June 23, 2014 n. 89.
         */
        public Builder codiceCIG(@Nullable final String codiceCIG) {
            this.codiceCIG = codiceCIG;
            return this;
        }

        /**
         * Returns a {@code DatiDocumentiCorrelati} built from the parameters previously set.
         *
         * @return a {@code DatiDocumentiCorrelati} built with parameters of this {@code DatiDocumentiCorrelati.Builder}
         */
        public DatiDocumentiCorrelati build() {
            this.riferimentoNumeroLinea = this.riferimentoNumeroLinea != null
                    ? new ArrayList<>(riferimentoNumeroLinea)
                    : new ArrayList<>();

            return new DatiDocumentiCorrelati(this);
        }
    }

}
