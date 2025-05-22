package it.unimol.alan2;

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
public class Main {
  public static void main(String[] args) {
    try {
        CharStream charStream = CharStreams.fromPath(Paths.get(args[0]));
        Lexer lexer = new Alan2Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Alan2Parser parser = new Alan2Parser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                int charPositionInLine, String msg, RecognitionException e) {
            throw new RuntimeException("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
            }
        });
        TypeScopeCheckerVisitor visitor = new TypeScopeCheckerVisitor();
        visitor.visit(parser.source());
        if(!visitor.getErrors().isEmpty()) {
            visitor.getErrors().stream()
                .forEach(error -> System.err.println(error.toString()));
            throw new RuntimeException("Compilation failed");
        }
            System.out.println("success");
        } catch (Exception e) {
            System.err.println("fail:" + e.getMessage());
        }
    }
}