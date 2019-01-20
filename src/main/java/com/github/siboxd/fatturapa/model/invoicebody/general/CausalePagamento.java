package com.github.siboxd.fatturapa.model.invoicebody.general;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * It serves to highlight the reason for payment.
 * <br><br>
 * These values are the coding of the reason for payment on the <em>Model 770S</em>.
 */
@Root(name = "CausalePagamento")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum CausalePagamento {

    A,
    B,
    C,
    D,
    E,
    G,
    H,
    I,
    L,
    M,
    N,
    O,
    P,
    Q,
    R,
    S,
    T,
    U,
    V,
    W,
    X,
    Y,
    Z,
    L1,
    M1,
    O1,
    V1

}
