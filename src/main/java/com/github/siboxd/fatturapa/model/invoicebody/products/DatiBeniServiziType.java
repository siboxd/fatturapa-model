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
@Root(name = "DatiBeniServiziType")
public class DatiBeniServiziType {

    @ElementList(name = "DettaglioLinee", entry = "DettaglioLinee", inline = true)
    private List<DettaglioLineeType> dettaglioLinee;

    @ElementList(name = "DatiRiepilogo", entry = "DatiRiepilogo", inline = true)
    private List<DatiRiepilogoType> datiRiepilogo;

    public DatiBeniServiziType() {
    }

    public List<DettaglioLineeType> getDettaglioLinee() {
        return dettaglioLinee;
    }

    public void setDettaglioLinee(final List<DettaglioLineeType> dettaglioLinee) {
        this.dettaglioLinee = dettaglioLinee;
    }

    public List<DatiRiepilogoType> getDatiRiepilogo() {
        return datiRiepilogo;
    }

    public void setDatiRiepilogo(final List<DatiRiepilogoType> datiRiepilogo) {
        this.datiRiepilogo = datiRiepilogo;
    }

}
