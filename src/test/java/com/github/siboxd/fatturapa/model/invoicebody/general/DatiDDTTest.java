package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.testutils.AbstractXmlSerializationTest;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Files;

import static com.github.siboxd.fatturapa.testutils.ResourceResolver.resolveResourcePath;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * A test class for {@link DatiDDT}
 *
 * @author Enrico
 */
class DatiDDTTest extends AbstractXmlSerializationTest {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/general_data/transport_documents";

    @Test
    void exampleDatiDDT_1() throws URISyntaxException {
        final String testFileName = "DatiDDT_1.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiDDT testObj = new DatiDDT
                .Builder("1552012", "2012-06-04")
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

    @Test
    void exampleDatiDDT_2() throws URISyntaxException {
        final String testFileName = "DatiDDT_2.xml";
        assumeTrue(Files.exists(resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, testFileName)));

        final DatiDDT testObj = new DatiDDT
                .Builder("1552012", "2012-06-04")
                .riferimentoNumeroLinea(asList("1", "2", "3"))
                .build();

        persistAndCheck(testObj, EXAMPLES_RESOURCE_FOLDER, testFileName);
    }

}
