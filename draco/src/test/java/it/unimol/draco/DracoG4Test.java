package it.unimol.draco;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class DracoG4Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void acceptsAllExamplesTest()
    {
        String resourcesFoldeString = new File("dracoref/examples").getAbsolutePath();
        File[] dracoSrcFiles = new File(resourcesFoldeString).listFiles();
        Draco draco = new Draco();
        assertTrue(dracoSrcFiles != null);
        for (File file : dracoSrcFiles) {
            try {
                System.out.println("Parsing file: " + file.getName());
                draco.parse(file.toPath());
                assertTrue(true);
            } catch (Exception e) {
                System.out.println("Error message: " + e.getMessage());
                assertTrue(false);
            }
        }

    }

}
