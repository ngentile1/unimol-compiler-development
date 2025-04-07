package it.unimol.alan;

public class SyntaxErrorException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public SyntaxErrorException(String message) {
        super(message);
    }

    public SyntaxErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public SyntaxErrorException(Throwable cause) {
        super(cause);
    }
    
}
