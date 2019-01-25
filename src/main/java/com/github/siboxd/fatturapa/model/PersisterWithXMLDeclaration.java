package com.github.siboxd.fatturapa.model;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

/**
 * A class that will persist and read files with standard XML header<br>
 * <br>
 * <code><?xml version="1.0" encoding="UTF-8"?></code>
 *
 * @author Enrico
 */
public final class PersisterWithXMLDeclaration extends Persister {

    private final static String XML_PROLOGUE_WITH_VERSION_AND_ENCODING = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

    /**
     * Constructs a {@link Persister} that will persist the XML default declaration
     */
    public PersisterWithXMLDeclaration() {
        super(new Format(XML_PROLOGUE_WITH_VERSION_AND_ENCODING));
    }
}
