package com.github.siboxd.fatturapa.model.invoiceheader.buyer;

import com.github.siboxd.fatturapa.model.invoicecommon.IdFiscale;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * It contains the identification data of the tax representative of the buyer
 * <p>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "RappresentanteFiscaleCessionario")
public final class RappresentanteFiscaleCessionario {

    // FIXME: 16/01/2019 same problem as Anagrafica, Denominazione and (Nome, Cognome) mutually exclusive

    // TODO: 20/01/2019 can this be a subclass of some similar class??

    @Element(name = "IdFiscaleIVA")
    private IdFiscale idFiscaleIVA;

    @Element(name = "Denominazione", required = false)
    private String denominazione;

    @Element(name = "Nome", required = false)
    private String nome;

    @Element(name = "Cognome", required = false)
    private String cognome;

    public RappresentanteFiscaleCessionario() {
    }

    public IdFiscale getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(final IdFiscale idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Valued only if the tax representative is a legal entity; it is an alternative to the fields
     * <code>Nome</code> e <code>Cognome</code>
     *
     * @param denominazione The field must contain the name of the company or the name or company
     *                      name of the legal entity that represents the buyer;
     *                      <br><br>
     *                      <b>Note:</b> the simultaneous valorization of the field <code>Nome</code>
     *                      and/or <code>Cognome</code> is not allowed.
     */
    public void setDenominazione(final String denominazione) {
        this.denominazione = denominazione;
    }

    public String getNome() {
        return nome;
    }

    /**
     * Set only if the tax representative is a natural person; it is an alternative to the
     * <code>Denominazione</code> field.
     *
     * @param nome The field must contain the name of the natural person who represents the buyer;
     *             <br><br>
     *             <b>Note:</b> the simultaneous valorization of the <code>Denominazione</code> field
     *             is not permitted;
     *             <br><br>
     *             <b>Note 2:</b> vice versa, the simultaneous setting of the <code>Cognome</code>
     *             field is required.
     */
    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    /**
     * Set only if the tax representative is a natural person; it is an alternative to the
     * <code>Denominazione</code> field.
     *
     * @param cognome The field must contain the surname of the natural person who represents the buyer;
     *                <br><br>
     *                <b>Note:</b> the simultaneous valorization of the <code>Denominazione</code> field
     *                is not permitted;
     *                <br><br>
     *                <b>Note 2:</b> vice versa, the simultaneous setting of the <code>Nome</code>
     *                field is required.
     */
    public void setCognome(final String cognome) {
        this.cognome = cognome;
    }

}
