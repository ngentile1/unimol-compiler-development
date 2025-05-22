package it.unimol.alan2;

public class SyntaxError {

    private final int line;
    private final int column;
    private final String message;
    
    public static SyntaxError expectedScalarVariable(String id, int line, int column) {
        return new SyntaxError(String.format("expected scalar variable instead of %s", id), line, column);
    }

    public static SyntaxError illegalArrayOperation(String op, int line, int column) {
        return new SyntaxError(String.format("%s is an illegal array operation", op), line, column);
    }

    public static SyntaxError notAFunction(String id, int line, int column) {
        return new SyntaxError(String.format("%s is not a function", id), line, column);
    }

    public static SyntaxError notAProcedure(String id, int line, int column) {
        return new SyntaxError(String.format("%s is not a procedure", id), line, column);
    }

    public static SyntaxError notAVariable(String id, int line, int column) {
        return new SyntaxError(String.format("%s is not a variable", id), line, column);
    }

    public static SyntaxError notAnArray(String id, int line, int column) {
        return new SyntaxError(String.format("%s is not an array variable", id), line, column);
    }

    public static SyntaxError tooFewArguments(String id, int line, int column) {
        return new SyntaxError(String.format("too few arguments for call to", id), line, column);
    }

    public static SyntaxError tooManyArguments(String id, int line, int column) {
        return new SyntaxError(String.format("too many arguments for call to", id), line, column);
    }

    public static SyntaxError leaveExpressionNotAllowed(String id, int line, int column) {
        return new SyntaxError(String.format("leave expression not allowed for a procedure", id), line, column);
    }

    public static SyntaxError missingLeaveExpression(String id, int line, int column) {
        return new SyntaxError("missing leave expression for a function", line, column);
    }

    public static SyntaxError unknownId(String id, int line, int column) {
        return new SyntaxError(String.format("unknown identifier %s", id), line, column);
    }

    public static SyntaxError multipleDefinition(String id, int line, int column) {
        return new SyntaxError(String.format("multiple definition of %s", id), line, column);
    }

    private static SyntaxError typeMismatch(Type expectedType, Type actualType, int line, int column, String detail) {
        return new SyntaxError(String.format("incompatible types (expected %s, found %s) %s", expectedType.toString(), actualType.toString(), detail), line, column);
    }

    public static SyntaxError typeMismatchForArrayIndex(String id, Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, String.format("for array index of %s", id));
    }

    public static SyntaxError typeMismatchForArraySize(String id, Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, String.format("for array size of %s", id));
    }

    public static SyntaxError typeMismatchForAssignment(String id, Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, String.format("for assignment to %s", id));
    }

    public static SyntaxError typeMismatchForArrayAllocation(String id, Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, String.format("for allocation to indexed array"));
    }

    public static SyntaxError typeMismatchForLeave(Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, "for leave statement");
    }

    public static SyntaxError typeMismatchForParameter(String id, int position, Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, String.format("for parameter %d of call to %s", position, id));
    }

    public static SyntaxError typeMismatchForGuard(String condText, Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, String.format("for '%s' guard", condText));
    }
    
    public static SyntaxError typeMismatchForOp(String op, Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, String.format("for operator %s", op));
    }


    public static SyntaxError typeMismatchForUnaryMinus(Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, "for unary minus");
    }

    public static SyntaxError typeMismatchForNot(Type expecpetdType, Type actualType, int line, int column) {
        return typeMismatch(expecpetdType, actualType, line, column, "for not");
    }



/* 


    public static SyntaxError duplicateIdInScope(String id, int line, int column) {
        return new SyntaxError(String.format("%d, %d: \"%s\" duplicated in current scope", line, column, id), line, column);
    }

    public static SyntaxError noSymbolInScope(String id, int line, int column) {
        return new SyntaxError(String.format("%d, %d: \"%s\" not declared in current scope", line, column, id), line, column);
    }

    public static SyntaxError assignmentTypeMismatch(String id, Type expectedType, Type actualType, int line, int column) {
        return new SyntaxError(String.format("%d, %d: \"%s\" type mismatch in assignment: expected \"%s\", found \"%s\"", line, column, id, expectedType.toString(), actualType.toString()), line, column);
    }

    public static SyntaxError leaveTypeMismatch(String id, Type expectedType, Type actualType, int line, int column) {
        return new SyntaxError(String.format("%d, %d: \"%s\" type mismatch in leave statement: expected \"%s\", found \"%s\"", line, column, id, expectedType.toString(), actualType.toString()), line, column);
    }





    
    public static SyntaxError argsNumberMismatch(String id, int expectedArgs, int actualArgs, int line, int column) {
        return new SyntaxError(String.format("%d, %d: \"%s\" expects %d arguments, given %d", line, column, id, expectedArgs, actualArgs), line, column);
    }

    public static SyntaxError eqOperandsTypeMismatch(Type leftType, Type rightType, int line, int column) {
        return new SyntaxError(String.format("%d, %d: left and right operands' types must be the same, left operand type is %s, right operand type is %s", line, column, leftType.toString(), rightType.toString()), line, column);
    } 

    public static SyntaxError diseqOperandsTypeMismatch(Type leftType, Type rightType, int line, int column) {
        return new SyntaxError(String.format("%d, %d: left and right operands' types must be integers, left operand type is %s, right operand type is %s", line, column, leftType.toString(), rightType.toString()), line, column);
    } 

    public static SyntaxError missingLeaveStatement(String id, int line, int column) {
        return new SyntaxError(String.format("%d, %d: missing leave statement in body of \"%s\"", line, column, id), line, column);
    } */

    private SyntaxError(String message, int line, int column) {
        this.message = String.format("%d, %d: %s", line, column, message);
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return this.getMessage();
    }

}
