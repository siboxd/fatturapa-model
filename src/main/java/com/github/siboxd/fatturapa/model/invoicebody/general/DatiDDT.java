package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.github.siboxd.fatturapa.model.utils.Lists.defensiveCopy;


/**
 * Describes the data of the Transportation Documents linked to the invoice
 */
@Root(name = "DatiDDT")
public final class DatiDDT {

    @Element(name = "NumeroDDT")
    private String numeroDDT;

    @Element(name = "DataDDT")
    private String dataDDT;

    @ElementList(name = "RiferimentoNumeroLinea", entry = "RiferimentoNumeroLinea", inline = true, required = false, empty = false)
    private List<String> riferimentoNumeroLinea;

    /**
     * NOTE: Left for reflective usage by SimpleXML framework!!
     */
    @SuppressWarnings("unused")
    private DatiDDT() {
    }

    private DatiDDT(@NonNull final Builder builder) {
        numeroDDT = builder.numeroDDT;
        dataDDT = builder.dataDDT;
        riferimentoNumeroLinea = builder.riferimentoNumeroLinea;
    }

    @NonNull
    public String getNumeroDDT() {
        return numeroDDT;
    }

    @NonNull
    public String getDataDDT() {
        return dataDDT;
    }

    @NonNull
    public List<String> getRiferimentoNumeroLinea() {
        return Collections.unmodifiableList(riferimentoNumeroLinea);
    }

    /**
     * {@code DatiDDT} builder static inner class.
     */
    public static final class Builder {
        private String numeroDDT;
        private String dataDDT;
        private List<String> riferimentoNumeroLinea = new ArrayList<>();

        public Builder(@NonNull final String numeroDDT,
                       @NonNull final String dataDDT) {
            this.numeroDDT = numeroDDT;
            this.dataDDT = dataDDT;
        }

        public Builder(@NonNull final DatiDDT copy) {
            this(copy.getNumeroDDT(), copy.getDataDDT());
            this.riferimentoNumeroLinea = copy.getRiferimentoNumeroLinea();
        }

        /**
         * @param numeroDDT The field must contain, in alphanumeric format, the sequence number
         *                  assigned by the transferor to the transport document at the time of issue.
         */
        public Builder numeroDDT(@NonNull final String numeroDDT) {
            this.numeroDDT = numeroDDT;
            return this;
        }

        /**
         * @param dataDDT The field must contain the date of issue of the transport document in the
         *                format YYYY-MM-DD (ISO 8601: 2004 standard)
         */
        // TODO: 26/01/2019 add checks
        public Builder dataDDT(@NonNull final String dataDDT) {
            this.dataDDT = dataDDT;
            return this;
        }

        /**
         * It is used to identify the number of the detail line of the invoice to which the
         * transport document refers
         */
        public Builder riferimentoNumeroLinea(@Nullable final List<String> riferimentoNumeroLinea) {
            this.riferimentoNumeroLinea = riferimentoNumeroLinea;
            return this;
        }

        /**
         * Returns a {@code DatiDDT} built from the parameters previously set.
         *
         * @return a {@code DatiDDT} built with parameters of this {@code DatiDDT.Builder}
         */
        public DatiDDT build() {
            this.riferimentoNumeroLinea = defensiveCopy(this.riferimentoNumeroLinea);
            return new DatiDDT(this);
        }
    }

}
