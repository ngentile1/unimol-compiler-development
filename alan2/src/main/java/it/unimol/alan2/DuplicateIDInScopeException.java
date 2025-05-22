package it.unimol.alan2;

public class DuplicateIDInScopeException extends Exception {

    public DuplicateIDInScopeException(String message) {
        super(message);
    }

    public DuplicateIDInScopeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateIDInScopeException(Throwable cause) {
        super(cause);
    }

    public DuplicateIDInScopeException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
