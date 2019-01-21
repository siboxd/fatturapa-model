package com.github.siboxd.fatturapa.model.invoicebody.general;

import com.github.siboxd.fatturapa.testutils.AbstractTestWithTemporaryFiles;
import com.github.siboxd.fatturapa.testutils.ResourceResolver;
import com.google.common.io.Resources;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.github.siboxd.fatturapa.testutils.AssertionUtils.assertFileLinesTrimmedEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * @author Enrico
 */
@SuppressWarnings("UnstableApiUsage")
class DatiCassaPrevidenzialeTest extends AbstractTestWithTemporaryFiles implements ResourceResolver {

    private static final String EXAMPLES_RESOURCE_FOLDER = "partial_examples/invoice_body/document_general/pension_funds";

    private Serializer persister;

    @BeforeAll
    static void before() {
        try {
            final Path examplesFolderPath = Paths.get(Resources.getResource(EXAMPLES_RESOURCE_FOLDER).toURI());
            assumeTrue(Files.isDirectory(examplesFolderPath));
            assumeFalse(Files.list(examplesFolderPath).count() == 0);
        } catch (final URISyntaxException | IOException e) {
            fail(e);
        }
    }

    @BeforeEach
    protected void setUp() {
        super.setUp();

        persister = new Persister();
    }

    @Test
    void exampleDatiCassaPrevidenziale_1() {
        final DatiCassaPrevidenziale testDatiCassaPrevidanziale = new DatiCassaPrevidenziale();
        testDatiCassaPrevidanziale.setTipoCassa(TipoCassa.TC02);
        testDatiCassaPrevidanziale.setAlCassa("2.00");
        testDatiCassaPrevidanziale.setImportoContributoCassa("32.00");
        testDatiCassaPrevidanziale.setImponibileCassa("1600.00");
        testDatiCassaPrevidanziale.setAliquotaIVA("21.00");
        testDatiCassaPrevidanziale.setRiferimentoAmministrazione("ABCD");

        try {
            final Path expectedFilePath = resolveResourcePath(EXAMPLES_RESOURCE_FOLDER, "DatiCassaPrevidenziale_1.xml");
            final Path actualFilePath = createTempFilePath();
            persister.write(testDatiCassaPrevidanziale, actualFilePath.toFile());

            assertFileLinesTrimmedEquals(actualFilePath, expectedFilePath);
        } catch (final Exception e) {
            fail(e);
        }
    }

    @Test
    void exampleDatiCassaPrevidenziale_2() {
// TODO: 21/01/2019  
    }
}