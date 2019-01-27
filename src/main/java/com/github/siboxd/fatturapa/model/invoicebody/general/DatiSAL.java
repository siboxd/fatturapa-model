package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Defines the progress of jobs (SAL -> Stato Avanzamento Lavori).
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiSAL")
public final class DatiSAL {

    @Element(name = "RiferimentoFase")
    private final String riferimentoFase;

    /**
     * It is used to identify the phase of work carried out as part of the work progress.
     *
     * @param riferimentoFase The field must contain the progressive number of the work progress
     *                        phase that is being invoiced.
     */
    public DatiSAL(@Element(name = "RiferimentoFase") @NonNull final String riferimentoFase) {
        this.riferimentoFase = riferimentoFase;
    }
@NonNull
    public String getRiferimentoFase() {
        return riferimentoFase;
    }
}
