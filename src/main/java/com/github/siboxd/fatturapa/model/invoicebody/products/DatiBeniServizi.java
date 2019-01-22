package com.github.siboxd.fatturapa.model.invoicebody.products;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * This block contains the data relating to the transaction to which the invoice refers:
 * the transfer of goods or the provision of services.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "DatiBeniServizi")
public class DatiBeniServizi {

    @ElementList(name = "DettaglioLinee", entry = "DettaglioLinee", inline = true)
    private List<DettaglioLinee> dettaglioLinee;

    @ElementList(name = "DatiRiepilogo", entry = "DatiRiepilogo", inline = true)
    private List<DatiRiepilogo> datiRiepilogo;

    public DatiBeniServizi() {
    }

    public List<DettaglioLinee> getDettaglioLinee() {
        return dettaglioLinee;
    }

    public void setDettaglioLinee(final List<DettaglioLinee> dettaglioLinee) {
        this.dettaglioLinee = dettaglioLinee;
    }

    public List<DatiRiepilogo> getDatiRiepilogo() {
        return datiRiepilogo;
    }

    public void setDatiRiepilogo(final List<DatiRiepilogo> datiRiepilogo) {
        this.datiRiepilogo = datiRiepilogo;
    }

}
