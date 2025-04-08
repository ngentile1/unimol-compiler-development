package it.unimol.alan;

import java.io.File;
import java.util.stream.Stream;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AlanG4Test 
{
    /**
     * Rigorous Test :-)
     */

    public boolean testDataset(String datasetPath, boolean shouldPass) {
        boolean pass = shouldPass;
        boolean fail = !pass;
        return Stream.of(new File(datasetPath).listFiles())
                .filter(file -> file.getName().endsWith(".alan"))
                .map(file -> file.getAbsolutePath())
                .allMatch(path -> {
                    try {
                        CharStream input = CharStreams.fromFileName(path);
                        AlanLexer lexer = new AlanLexer(input);
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        AlanParser parser = new AlanParser(tokens);
                        parser.removeErrorListeners();
                        parser.addErrorListener(new BaseErrorListener() {
                            @Override
                            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                                throw new SyntaxErrorException("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
                            }
                        });

                        parser.source();
                        if(!shouldPass) {
                            System.err.println("Parsing expected to fail on " + path);
                        }
                        return pass;
                    } catch (SyntaxErrorException|TooLongIDException e) {
                        if(shouldPass) {
                            System.err.println("Error in file: " + path);
                            System.err.println(e.getMessage());
                        }
                        return fail;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return fail;
                    }
                });
    } 

    @Test
    public void testAlanPassingSourceCode()
    {
        assertTrue(testDataset("alan-src/alan-passing", true));
    }

    @Test
    public void testAlanFailingSourceCode()
    {
        assertTrue(testDataset("alan-src/alan-failing", false));
    }
}
