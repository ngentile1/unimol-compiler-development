package it.unimol.draco;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Hello world!
 *
 */
public class Draco {


    public void parse(Path file_path) throws RuntimeException, Exception{
        CharStream charStream = CharStreams.fromPath(file_path);
        Lexer lexer = new DracoLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DracoParser parser = new DracoParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                int charPositionInLine, String msg, RecognitionException e) {
            throw new RuntimeException("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
            }
        });
        parser.program();
    }

    public boolean accepts(Path file_path) {
        try {
            parse(file_path);
            return true;
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path.");
            return;
        }

        String file_path = args[0];
        Draco main = new Draco();
        boolean result = main.accepts(Paths.get(file_path));
        System.out.println("File " + file_path + " is " + (result ? "valid" : "invalid"));
    }
        
}