package com.github.siboxd.fatturapa.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * AnagraficaType<br>
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

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCodEORI() {
        return codEORI;
    }

    public void setCodEORI(String codEORI) {
        this.codEORI = codEORI;
    }

}
