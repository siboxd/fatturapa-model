package com.github.siboxd.fatturapa.model.invoicebody;

import com.github.siboxd.fatturapa.model.invoicebody.general.DatiGenerali;
import com.github.siboxd.fatturapa.model.invoicebody.payment.DatiPagamento;
import com.github.siboxd.fatturapa.model.invoicebody.products.DatiBeniServizi;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * This block - which constitutes the body of the invoice and represents its specific content -
 * must be present only once in the case of a single invoice, whereas in the case of a batch
 * of invoices the lot itself must be repeated for each invoice.
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "FatturaElettronicaBody")
public final class FatturaElettronicaBody {

    @Element(name = "DatiGenerali")
    private DatiGenerali datiGenerali;

    @Element(name = "DatiBeniServizi")
    private DatiBeniServizi datiBeniServizi;

    @Element(name = "DatiVeicoli", required = false)
    private DatiVeicoli datiVeicoli;

    @ElementList(name = "DatiPagamento", entry = "DatiPagamento", inline = true, required = false)
    private List<DatiPagamento> datiPagamento;

    @ElementList(name = "Allegati", entry = "Allegati", inline = true, required = false)
    private List<Allegati> allegati;

    public FatturaElettronicaBody() {
    }

    public DatiGenerali getDatiGenerali() {
        return datiGenerali;
    }

    public void setDatiGenerali(final DatiGenerali datiGenerali) {
        this.datiGenerali = datiGenerali;
    }

    public DatiBeniServizi getDatiBeniServizi() {
        return datiBeniServizi;
    }

    public void setDatiBeniServizi(final DatiBeniServizi datiBeniServizi) {
        this.datiBeniServizi = datiBeniServizi;
    }

    public DatiVeicoli getDatiVeicoli() {
        return datiVeicoli;
    }

    /**
     * <b>Note:</b> To be valued only if the document relates to an intra-community supply of new
     * means of transport, pursuant to art. 38, paragraph 4, Decree Law 331/1993, converted with
     * amendments by Law 427/1993
     */
    public void setDatiVeicoli(final DatiVeicoli datiVeicoli) {
        this.datiVeicoli = datiVeicoli;
    }

    public List<DatiPagamento> getDatiPagamento() {
        return datiPagamento;
    }

    /**
     * <b>Note:</b> To be valued only if you want to provide information on the payment in terms
     * of conditions, methods and terms
     */
    public void setDatiPagamento(final List<DatiPagamento> datiPagamento) {
        this.datiPagamento = datiPagamento;
    }

    public List<Allegati> getAllegati() {
        return allegati;
    }

    public void setAllegati(final List<Allegati> allegati) {
        this.allegati = allegati;
    }

}
