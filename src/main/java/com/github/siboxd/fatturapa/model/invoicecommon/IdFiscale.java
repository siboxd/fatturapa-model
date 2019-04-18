package com.github.siboxd.fatturapa.model.invoicecommon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.regex.Pattern;

import static com.github.siboxd.fatturapa.model.StandardPattern.ISO_3166_1_ALPHA_2;
import static com.github.siboxd.fatturapa.model.utils.Patterns.matchAgainstPatternOrThrow;


/**
 * It is used to identify the subject that interacts with the Interchange System.
 */
@Root(name = "IdFiscale")
@Order(elements = {"IdPaese", "IdCodice"})
public final class IdFiscale {

    private static final Pattern ID_CODICE_PATTERN = Pattern.compile(".{1,28}");

    @Element(name = "IdPaese")
    private final String idPaese;

    @Element(name = "IdCodice")
    private final String idCodice;

    /**
     * @param idPaese  The field must contain, according to the ISO 3166-1 alpha-2 code standard (two capital letters),
     *                 the country code that assigned the tax identification to the subject.
     * @param idCodice In the event that IdPaese = "IT" (subject resident in Italy), the field
     *                 must contain the tax code of the transmitter;<br>
     *                 in all other cases (subject resident abroad) must contain the tax
     *                 identification that the transmitter was assigned by the country of origin.
     */
    public IdFiscale(@Element(name = "IdPaese") @NonNull final String idPaese,
                     @Element(name = "IdCodice") @NonNull final String idCodice) {

        matchAgainstPatternOrThrow(idPaese, ISO_3166_1_ALPHA_2.pattern());
        matchAgainstPatternOrThrow(idCodice, ID_CODICE_PATTERN);

        this.idPaese = idPaese;
        this.idCodice = idCodice;
    }

    @NonNull
    public String getIdPaese() {
        return idPaese;
    }

    @NonNull
    public String getIdCodice() {
        return idCodice;
    }

}
