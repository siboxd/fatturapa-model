package com.github.siboxd.fatturapa.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "BolloVirtualeType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum BolloVirtualeType {

    SI

}
