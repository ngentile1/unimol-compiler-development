package it.unimol.alan2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import it.unimol.alan2.Type.TypeFlag;

public class Type {
    
    static private final int NONE_FLAG=0, ARRAY_FLAG=1, BOOL_FLAG=2, INTEGER_FLAG=4, CALLABLE_FLAG=8;
    
    static public enum TypeFlag {
        
        None(NONE_FLAG), Array(ARRAY_FLAG), Bool(BOOL_FLAG), Integer(INTEGER_FLAG), Callable(CALLABLE_FLAG);
        
        public final int value;

        private TypeFlag(int value) {
            this.value = value;
        }

    }

    static public class Callable extends Type {
        Type returnType;
        List<Type> args;

        public Callable(Type returnType, Type ... args) {
            super(TypeFlag.Callable);
            this.returnType = returnType;
            this.args = Arrays.stream(args).toList();
        }

        public Type getReturnType() {
            return returnType;
        }
        
        public List<Type> getArgs() {
            return Collections.unmodifiableList(args);
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Callable)) {
                return false;
            }
            final Callable other = (Callable) obj;
            return this.returnType.equals(other.returnType) && this.args.equals(other.args);
        }
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Callable(");
            for (int i = 0; i < args.size(); i++) {
                sb.append(args.get(i).toString());
                if (i < args.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(")");
            sb.append(returnType.toString());
            return sb.toString();
        }
    }
    
    static final public Type NONE = new Type(TypeFlag.None);
    static final public Type INTEGER = new Type(TypeFlag.Integer);
    static final public Type BOOL = new Type(TypeFlag.Bool);
    static final public Type ARRAY_INTEGER = new Type(TypeFlag.Array, TypeFlag.Integer);
    static final public Type ARRAY_BOOL = new Type(TypeFlag.Array, TypeFlag.Bool);
    
    static private final Map<Integer, Type> native_types = Map.of(
        NONE.flags, NONE,
        INTEGER.flags, INTEGER,
        BOOL.flags, BOOL,
        ARRAY_INTEGER.flags, ARRAY_INTEGER,
        ARRAY_BOOL.flags, ARRAY_BOOL
    );

    private static int reduceFlags(TypeFlag ... flags) {
        return Arrays.stream(flags)
            .mapToInt(f -> f.value)
            .reduce(0, (f1, f2) -> f1 | f2);
    }

    public static Type getNativeType(TypeFlag ... flags) {
        int reduced_flags = reduceFlags(flags);
        return native_types.get(reduced_flags);
    }

    private int flags;

    private Type(TypeFlag ... flags) {
        this.flags = reduceFlags(flags);
        if (this.flags == TypeFlag.Array.value) {
            throw new RuntimeException("Array type cannot be used alone");
        }
    }

    public boolean isArray() {
        //return (flags & TypeFlag.Array.value) != 0;
        return this == ARRAY_INTEGER || this == ARRAY_BOOL;
    }

    public boolean isBool() {
        return (flags & TypeFlag.Bool.value) != 0;
    }

    public boolean isInteger() {
        return (flags & TypeFlag.Integer.value) != 0;
    }

    public boolean isCallable() {
        return (flags & TypeFlag.Callable.value) != 0;
    }

    public boolean isNone() {
        return (flags & TypeFlag.None.value) != 0;
    }   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        final Type other = (Type) obj;
        return this.flags == other.flags;
    }

    @Override
    public String toString() {
        switch (flags) {
            case NONE_FLAG:
                return "None";
            case ARRAY_FLAG|INTEGER_FLAG:
                return "array integer";
            case ARRAY_FLAG|BOOL_FLAG:
                return "array bool";
            case BOOL_FLAG:
                return "Bool";
            case INTEGER_FLAG:
                return "Integer";
            case CALLABLE_FLAG:
                return "Callable";
            default:
                return String.format("Unknown type: %d", flags);
        }
    }
    
}
