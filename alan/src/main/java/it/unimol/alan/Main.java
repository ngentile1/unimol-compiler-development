package it.unimol.alan;

import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

/**
 * Hello world!
 *
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("Starting the lexer");
    try {
      CharStream charStream = CharStreams.fromPath(Paths.get(args[0]));
      Lexer lexer = new AlanLexer(charStream);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      tokens.fill();
      for (Token token : tokens.getTokens()) {
        String tokenTypeName = lexer.getVocabulary().getSymbolicName(token.getType());
        System.out.println("Got token: (" + tokenTypeName + ") " + token.toString());
      } 
    } catch (Exception e) {
      System.out.println("Error:" + e.getMessage());
    }

  }
}