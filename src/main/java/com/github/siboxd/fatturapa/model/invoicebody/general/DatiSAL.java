package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Defines the progress of jobs (SAL).
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiSAL")
public class DatiSAL {

    @Element(name = "RiferimentoFase")
    private String riferimentoFase;

    public DatiSAL() {
    }

    public String getRiferimentoFase() {
        return riferimentoFase;
    }

    /**
     * It is used to identify the phase of work carried out as part of the work progress.
     *
     * @param riferimentoFase The field must contain the progressive number of the work progress
     *                        phase that is being invoiced.
     */
    public void setRiferimentoFase(final String riferimentoFase) {
        this.riferimentoFase = riferimentoFase;
    }

}
