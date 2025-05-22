package it.unimol.alan2;

public class VisitorResult {

    private final Type type;
    private final Boolean hasError;
    private final Boolean hasLeave;

    private VisitorResult(Type type, Boolean hasError, Boolean hasLeave) {
        this.type = type;
        this.hasError = hasError;
        this.hasLeave = hasLeave;
    }

    public static VisitorResult success(Type type) {
        return new VisitorResult(type, false, false);
    }
    public static VisitorResult failure() {
        return new VisitorResult(Type.NONE, true, false);
    }

    public static VisitorResult successWithLeave() {
        return new VisitorResult(null, false, true);
    }

    public Type getType() {
        return type;
    }
    public Boolean hasError() {
        return hasError;
    }

    public Boolean hasLeave() {
        return hasLeave;
    }

    
}
