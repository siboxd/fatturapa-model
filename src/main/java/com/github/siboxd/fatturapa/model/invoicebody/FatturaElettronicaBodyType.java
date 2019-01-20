package com.github.siboxd.fatturapa.model.invoicebody;

import com.github.siboxd.fatturapa.model.AllegatiType;
import com.github.siboxd.fatturapa.model.invoicebody.products.DatiBeniServiziType;
import com.github.siboxd.fatturapa.model.DatiPagamentoType;
import com.github.siboxd.fatturapa.model.DatiVeicoliType;
import com.github.siboxd.fatturapa.model.invoicebody.general.DatiGeneraliType;

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
@Root(name = "FatturaElettronicaBodyType")
public class FatturaElettronicaBodyType {

    @Element(name = "DatiGenerali")
    private DatiGeneraliType datiGenerali;

    @Element(name = "DatiBeniServizi")
    private DatiBeniServiziType datiBeniServizi;

    @Element(name = "DatiVeicoli", required = false)
    private DatiVeicoliType datiVeicoli;

    @ElementList(name = "DatiPagamento", entry = "DatiPagamento", inline = true, required = false)
    private List<DatiPagamentoType> datiPagamento;

    @ElementList(name = "Allegati", entry = "Allegati", inline = true, required = false)
    private List<AllegatiType> allegati;

    public FatturaElettronicaBodyType() {
    }

    public DatiGeneraliType getDatiGenerali() {
        return datiGenerali;
    }

    public void setDatiGenerali(final DatiGeneraliType datiGenerali) {
        this.datiGenerali = datiGenerali;
    }

    public DatiBeniServiziType getDatiBeniServizi() {
        return datiBeniServizi;
    }

    public void setDatiBeniServizi(final DatiBeniServiziType datiBeniServizi) {
        this.datiBeniServizi = datiBeniServizi;
    }

    public DatiVeicoliType getDatiVeicoli() {
        return datiVeicoli;
    }

    public void setDatiVeicoli(final DatiVeicoliType datiVeicoli) {
        this.datiVeicoli = datiVeicoli;
    }

    public List<DatiPagamentoType> getDatiPagamento() {
        return datiPagamento;
    }

    public void setDatiPagamento(final List<DatiPagamentoType> datiPagamento) {
        this.datiPagamento = datiPagamento;
    }

    public List<AllegatiType> getAllegati() {
        return allegati;
    }

    public void setAllegati(final List<AllegatiType> allegati) {
        this.allegati = allegati;
    }

}
