package com.github.siboxd.fatturapa.model.invoicebody.products;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.Collections;
import java.util.List;

import static com.github.siboxd.fatturapa.model.utils.Lists.defensiveCopy;


/**
 * This block contains the data relating to the transaction to which the invoice refers:
 * the transfer of goods or the provision of services.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiBeniServizi")
public final class DatiBeniServizi {

    @ElementList(name = "DettaglioLinee", entry = "DettaglioLinee", inline = true)
    private final List<DettaglioLinee> dettaglioLinee;

    @ElementList(name = "DatiRiepilogo", entry = "DatiRiepilogo", inline = true)
    private final List<DatiRiepilogo> datiRiepilogo;

    public DatiBeniServizi(@ElementList(name = "DettaglioLinee") @NonNull final List<DettaglioLinee> dettaglioLinee,
                           @ElementList(name = "DatiRiepilogo") @NonNull final List<DatiRiepilogo> datiRiepilogo) {
        // TODO: 27/01/2019 refuse constructing with null or empty lists
        this.dettaglioLinee = defensiveCopy(dettaglioLinee);
        this.datiRiepilogo = defensiveCopy(datiRiepilogo);
    }

    @NonNull
    public List<DettaglioLinee> getDettaglioLinee() {
        return Collections.unmodifiableList(dettaglioLinee);
    }

    @NonNull
    public List<DatiRiepilogo> getDatiRiepilogo() {
        return Collections.unmodifiableList(datiRiepilogo);
    }

}
