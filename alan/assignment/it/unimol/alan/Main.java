package it.unimol.alan;

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
      Lexer lexer = new AlanLexer(charStream);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      AlanParser parser = new AlanParser(tokens);
      parser.removeErrorListeners();
      parser.addErrorListener(new BaseErrorListener() {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
            int charPositionInLine, String msg, RecognitionException e) {
          throw new RuntimeException("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
        }
      });
      parser.source();
      System.out.println("success");
    } catch (Exception e) {
      System.out.println("fail");
    }
  }
}