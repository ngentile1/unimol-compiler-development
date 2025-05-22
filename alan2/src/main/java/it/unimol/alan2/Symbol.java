package it.unimol.alan2;

import java.util.Objects;

public class Symbol {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Symbol{");
        sb.append("name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", family=").append(family);
        sb.append('}');
        return sb.toString();
    }

    static public enum SymbolFamily {
        VARIABLE, CALLABLE, TYPE, SOURCE
    }

    final String name;
    final Type type;
    final SymbolFamily family;

    private Symbol(String name, Type type, SymbolFamily family) {
        this.name = name;
        this.type = type;
        this.family = family;
    }

    public static Symbol make_variable(String name, Type type) {
        if (type instanceof Type.Callable) {
            throw new IllegalArgumentException("Cannot create a variable with a callable type");
        }
        return new Symbol(name, type, SymbolFamily.VARIABLE);
    }

    public static Symbol make_callable(String name, Type type) {
        if (!(type instanceof Type.Callable)) {
            throw new IllegalArgumentException("Cannot create a callable with a non-callable type");
        }
        return new Symbol(name, type, SymbolFamily.CALLABLE);
    }

    public static Symbol make_type(String name) {
        return new Symbol(name, null, SymbolFamily.TYPE);
    }

    public static Symbol make_source(String name) {
        return new Symbol(name, null, SymbolFamily.SOURCE);
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public SymbolFamily getFamily() {
        return family;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Symbol other = (Symbol) obj;
        return Objects.equals(this.name, other.name) &&
               Objects.equals(this.type, other.type) &&
               Objects.equals(this.family, other.family);
    }

    

    
    
}
