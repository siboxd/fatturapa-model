package com.github.siboxd.fatturapa.model.invoiceheader;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Contains personal data of a subject
 *
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "AnagraficaType")
public class AnagraficaType {

    // FIXME: 16/01/2019 same problem in RappresentanteFiscaleCessionarioType  ->

    // FIXME at runtime this is a valid type if
    // 1) Denominazione is Set
    // FIXME --- OR ---
    // 2) Nome AND Cognome are Set

    // FIXME: 16/01/2019 at the moment i've made required false the following fields because the semantic is a choice and cannot be captured by the required flag
    @Element(name = "Denominazione", required = false)
    private String denominazione;

    @Element(name = "Nome", required = false)
    private String nome;

    @Element(name = "Cognome", required = false)
    private String cognome;

    @Element(name = "Titolo", required = false)
    private String titolo;

    @Element(name = "CodEORI", required = false)
    private String codEORI;

    public AnagraficaType() {
    }

    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Valued only if the seller is a legal entity; it is an alternative to the fields
     * <code>Nome</code> e <code>Cognome</code>
     *
     * @param denominazione The field must contain the name of the company or the name or company
     *                      name of the legal entity that sold the asset or provided the service;
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
     * Set only if the seller is a natural person; it is an alternative to the <code>Denominazione</code> field.
     *
     * @param nome The field must contain the name of the natural person who sold the property
     *             or provided the service;
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
     * Set only if the seller is a natural person; it is an alternative to the <code>Denominazione</code> field.
     *
     * @param cognome The field must contain the surname of the natural person who sold the property
     *                or provided the service;
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

    public String getTitolo() {
        return titolo;
    }

    /**
     * Constitutes a completion of the personal data concerning the seller.
     *
     * @param titolo no particular criteria is established for valorization
     */
    public void setTitolo(final String titolo) {
        this.titolo = titolo;
    }

    public String getCodEORI() {
        return codEORI;
    }

    /**
     * It serves for the indication of the code eventually assigned to the seller according to
     * the <em>European Community Regulation n. 312 of 16 April 2009</em>.
     *
     * @param codEORI The field, if evaluated, must contain the <b>EORI</b> code number
     *                (<em>Economic Operator Registration and Identification</em>)
     */
    public void setCodEORI(final String codEORI) {
        this.codEORI = codEORI;
    }

}
