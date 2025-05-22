package it.unimol.alan2;

public class TooLongIDException extends RuntimeException {
    public TooLongIDException(String message) {
        super(message);
    }

    public TooLongIDException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooLongIDException(Throwable cause) {
        super(cause);
    }

    public TooLongIDException(String message, Throwable cause, boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public TooLongIDException() {
        super();
    }
    
}
