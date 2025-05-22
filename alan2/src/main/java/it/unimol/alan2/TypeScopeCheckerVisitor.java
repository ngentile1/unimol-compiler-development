package it.unimol.alan2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.antlr.v4.runtime.tree.TerminalNode;

public class TypeScopeCheckerVisitor extends Alan2BaseVisitor<VisitorResult> {

    private final ScopeStack scopeStack = new ScopeStack();
    private final List<SyntaxError> errors = new ArrayList<>();
    private final Deque<Type> returnTypes = new ArrayDeque<>();
    private final Deque<Alan2Parser.FuncdefContext> currentFunctionContext = new ArrayDeque<>();

    public Collection<SyntaxError> getErrors() {
        return Collections.unmodifiableCollection(errors);
    }

    // private void addDuplicateIdInScopeError(TerminalNode symbol) {
    //     errors.add(SyntaxError.duplicateIdInScope(
    //         symbol.getText(), 
    //         symbol.getSymbol().getLine(),
    //         symbol.getSymbol().getCharPositionInLine()
    //     ));
    // }

    // private void addNoSymbolInScopeError(TerminalNode symbol) {
    //     errors.add(SyntaxError.noSymbolInScope(
    //         symbol.getText(), 
    //         symbol.getSymbol().getLine(),
    //         symbol.getSymbol().getCharPositionInLine()
    //     ));
    // }

    // private  void addNonArrayVariableIndexedError(TerminalNode symbol) {
    //     errors.add(SyntaxError.nonArrayVariableIndexed(
    //         symbol.getText(), 
    //         symbol.getSymbol().getLine(),
    //         symbol.getSymbol().getCharPositionInLine()
    //     ));
    // }

    // private void addNonVariableSymbolError(TerminalNode symbol) {
    //     errors.add(SyntaxError.nonVariableSymbol(
    //         symbol.getText(), 
    //         symbol.getSymbol().getLine(),
    //         symbol.getSymbol().getCharPositionInLine()
    //     ));
    // }
    
    // private void addNonCallableSymbolError(TerminalNode symbol) {
    //     errors.add(SyntaxError.nonCallableSymbol(
    //         symbol.getText(), 
    //         symbol.getSymbol().getLine(),
    //         symbol.getSymbol().getCharPositionInLine()
    //     ));
    // }

    // private void addArgsNumberMismatchError(TerminalNode symbol, int expectedArgs, int actualArgs) {
    //     errors.add(SyntaxError.argsNumberMismatch(
    //         symbol.getText(), 
    //         expectedArgs,
    //         actualArgs,
    //         symbol.getSymbol().getLine(),
    //         symbol.getSymbol().getCharPositionInLine()
    //     ));
    // }

    // private void addAssignmentTypeMismatchError(TerminalNode symbol, Type expectedType, Type actualType) {
    //     errors.add(SyntaxError.assignmentTypeMismatch(
    //         symbol.getText(), 
    //         expectedType, 
    //         actualType, 
    //         symbol.getSymbol().getLine(),
    //         symbol.getSymbol().getCharPositionInLine()
    //     ));
    // }

    // private void addLeaveTypeMismatchError(ParserRuleContext ctx, Type expectedType, Type actualType) {
    //     errors.add(SyntaxError.leaveTypeMismatch(
    //         ctx.getText(), 
    //         expectedType, 
    //         actualType, 
    //         ctx.getStart().getLine(),
    //         ctx.getStart().getCharPositionInLine()
    //     ));
    // }

    // private void addAssignmentTypeMismatchError(ParserRuleContext ctx, Type expectedType, Type actualType) {
    //     errors.add(SyntaxError.assignmentTypeMismatch(
    //         ctx.getText(), 
    //         expectedType, 
    //         actualType, 
    //         ctx.getStart().getLine(),
    //         ctx.getStart().getCharPositionInLine()
    //     ));
    // }

    // private void addTypeMismatchError(ParserRuleContext ctx, Type expectedType, Type actualType) {
    //     errors.add(SyntaxError.typeMismatch(
    //         ctx.getText(), 
    //         expectedType, 
    //         actualType, 
    //         ctx.getStart().getLine(),
    //         ctx.getStart().getCharPositionInLine()
    //     ));
    // }

    // private void addTypeMismatchError(TerminalNode symbol, Type expectedType, Type actualType) {
    //     errors.add(SyntaxError.typeMismatch(
    //         symbol.getText(), 
    //         expectedType, 
    //         actualType, 
    //         symbol.getSymbol().getLine(),
    //         symbol.getSymbol().getCharPositionInLine()
    //     ));
    // }

    // private void addEqOperandsTypeMismatch(ParserRuleContext ctx, Type leftType, Type rightType) {
    //     errors.add(SyntaxError.eqOperandsTypeMismatch(
    //         leftType, 
    //         rightType, 
    //         ctx.getStart().getLine(), 
    //         ctx.getStart().getCharPositionInLine()
    //     ));
    // } 

    // private void addDiseqOperandsTypeMismatch(ParserRuleContext ctx, Type leftType, Type rightType) {
    //     errors.add(SyntaxError.diseqOperandsTypeMismatch(
    //         leftType, 
    //         rightType, 
    //         ctx.getStart().getLine(), 
    //         ctx.getStart().getCharPositionInLine()
    //     ));
    // }

    // private void addMissingLeaveStatement(Alan2Parser.FuncdefContext ctx) {
    //     errors.add(SyntaxError.missingLeaveStatement(
    //         ctx.ID().getText(),
    //         ctx.body().getStart().getLine(), 
    //         ctx.body().getStart().getCharPositionInLine()
    //     ));
    // }

    private void addSymbol(TerminalNode node, Supplier<Optional<Symbol>> symbolSupplier) {
        scopeStack.getVisibleSymbleFromTopScope(node.getText())
            .ifPresentOrElse(
                __ -> errors.add(SyntaxError.multipleDefinition(
                    node.getText(), 
                    node.getSymbol().getLine(), 
                    node.getSymbol().getCharPositionInLine())),
                () -> {
                    symbolSupplier.get().ifPresent(symbol -> scopeStack.addSymbol(symbol));
                }
            );
    }

    @Override //ok
    public VisitorResult visitSource(Alan2Parser.SourceContext ctx) {
        scopeStack.clear();
        errors.clear();
        scopeStack.pushScope();
        TerminalNode id = ctx.ID();
        addSymbol(ctx.ID(), () -> Optional.of(Symbol.make_source(id.getText())));
        scopeStack.pushScope();
        returnTypes.push(Type.NONE);
        visit(ctx.body());
        returnTypes.pop();
        scopeStack.popScope();
        scopeStack.popScope();
        return VisitorResult.success(Type.NONE);
    }

    @Override //ok
    public VisitorResult visitFuncdef(Alan2Parser.FuncdefContext ctx) {
        addSymbol(ctx.ID(), () -> {
                scopeStack.pushScope();
                VisitorResult returnTypeResult = ctx.return_type() != null ? visit(ctx.return_type()) : VisitorResult.success(Type.NONE);
                VisitorResult[] paramsResult = ctx.params() != null ? 
                    ctx.params().param().stream()
                        .map(param -> visit(param))
                        .toArray(VisitorResult[]::new) :
                    new VisitorResult[] {};
                boolean paramsHasError = Arrays.stream(paramsResult)
                    .anyMatch(VisitorResult::hasError);
                if(!paramsHasError && !returnTypeResult.hasError()) {
                    Type argsType = new Type.Callable(
                        returnTypeResult.getType(), 
                        Arrays.stream(paramsResult)
                            .map(VisitorResult::getType)
                            .toArray(Type[]::new));
                    Symbol symbol = Symbol.make_callable(
                        ctx.ID().getText(),
                        argsType
                    ); 
                    currentFunctionContext.push(ctx);
                    returnTypes.push(returnTypeResult.getType());
                    visit(ctx.body());
                    returnTypes.pop();
                    currentFunctionContext.pop();
                    scopeStack.popScope();  
                    return Optional.of(symbol);
                }
                else {
                    return Optional.empty();
                }
            }
        );
        return VisitorResult.success(Type.NONE);
    }

    @Override //ok
    public VisitorResult visitNative_type(Alan2Parser.Native_typeContext ctx) {
        return ctx.INT() == null ?
            VisitorResult.success(Type.BOOL) :
            VisitorResult.success(Type.INTEGER);
    }

    @Override //ok
    public VisitorResult visitType(Alan2Parser.TypeContext ctx) {
        VisitorResult nativeTypeResult = visit(ctx.native_type());
        if(ctx.ARRAY() != null) {
            if(nativeTypeResult.getType().equals(Type.INTEGER)) {
                return VisitorResult.success(Type.ARRAY_INTEGER);
            }
            else {
                return VisitorResult.success(Type.ARRAY_BOOL);
            }
        }
        return VisitorResult.success(nativeTypeResult.getType());
    }

    @Override //ok
    public VisitorResult visitVardef(Alan2Parser.VardefContext ctx) {
        VisitorResult typeResult = visit(ctx.type());
        if(typeResult.hasError()) {
            return VisitorResult.failure();
        }
        ctx.ID().stream()
            .forEach(id -> {
                addSymbol(id, () -> Optional.of(
                Symbol.make_variable(id.getText(), typeResult.getType())));
            });
        return VisitorResult.success(Type.NONE);
    }
    
    @Override //ok
    public VisitorResult visitParam(Alan2Parser.ParamContext ctx) {
        VisitorResult typeResult = visit(ctx.type());
        if(typeResult.hasError()) {
            return VisitorResult.failure();
        }
        addSymbol(ctx.ID(), () -> Optional.of(
            Symbol.make_variable(ctx.ID().getText(), typeResult.getType())
        ));
        return VisitorResult.success(typeResult.getType());
    }
        
    @Override //ok
    public VisitorResult visitBody(Alan2Parser.BodyContext ctx) {
        ctx.def().stream()
            .forEach(defctx -> visit(defctx));
        // VisitorResult bodyResult = 
        visit(ctx.statements());
        // if(!bodyResult.hasLeave() && !returnTypes.peek().equals(Type.NONE)) {
        //     Alan2Parser.FuncdefContext funcctx = currentFunctionContext.peek();
        //     errors.add(SyntaxError.missingLeaveExpression(
        //         funcctx.ID().getText(), 
        //         line, column)(currentFunctionContext.peek());
        // }
        return VisitorResult.success(Type.NONE);
    }

    @Override //ok
    public VisitorResult visitStatements(Alan2Parser.StatementsContext ctx) {
        if(ctx.RELAX() != null) {
            return VisitorResult.success(Type.NONE);
        }
        boolean substmtsHaveLeave = ctx.statement().stream()
            .map(stmtctx -> visit(stmtctx))
            .anyMatch(VisitorResult::hasLeave);
        if(substmtsHaveLeave) {
            return VisitorResult.successWithLeave();
        }
        else {
            return VisitorResult.success(Type.NONE);
        }
    }

    @Override //ok
    public VisitorResult visitArray_simple(Alan2Parser.Array_simpleContext ctx) {
        VisitorResult simpleResult = visit(ctx.simple());
        if(!simpleResult.hasError()) {
            if(!simpleResult.getType().equals(Type.INTEGER)) {
                errors.add(SyntaxError.typeMismatchForArraySize(
                    ((Alan2Parser.AssignContext)ctx.getParent().getParent()).left_operand().getText(), 
                    Type.INTEGER, 
                    simpleResult.getType(), 
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine()));
                return VisitorResult.failure();
            }
            else {
                return VisitorResult.success(Type.INTEGER);
            }
        }
        else {
            return VisitorResult.failure();
        }
    }

    @Override //ok
    public VisitorResult visitAssign(Alan2Parser.AssignContext ctx) {
        VisitorResult leftResult = visit(ctx.left_operand());
        VisitorResult rightResult = visit(ctx.right_operand());
        if(!leftResult.hasError() && !rightResult.hasError()) {
            if(ctx.left_operand().array_access() != null && ctx.right_operand().array_simple() != null) {
                errors.add(SyntaxError.typeMismatchForArrayAllocation(
                    ctx.left_operand().array_access().ID().getText(),
                    leftResult.getType(), 
                    rightResult.getType(), 
                    ctx.right_operand().array_simple().ARRAY().getSymbol().getLine(), 
                    ctx.right_operand().array_simple().ARRAY().getSymbol().getCharPositionInLine()));
            }

            else if(!leftResult.getType().equals(rightResult.getType())) {
            errors.add(SyntaxError.typeMismatchForAssignment(
                ctx.left_operand().getText(), 
                leftResult.getType(), 
                rightResult.getType(), 
                ctx.right_operand().getStart().getLine(), 
                ctx.right_operand().getStart().getCharPositionInLine()));
            }
        }
        return VisitorResult.success(Type.NONE);
    }

    @Override //ok
    public VisitorResult visitReturn_type(Alan2Parser.Return_typeContext ctx) {
        return visit(ctx.type());
    }

    @Override //ok
    public VisitorResult visitCondition(Alan2Parser.ConditionContext ctx) {
        VisitorResult condResult = visit(ctx.expr());
        if(condResult.hasError()) {
            return VisitorResult.failure(); 
        }
        if(!condResult.getType().equals(Type.BOOL)) {
            errors.add(SyntaxError.typeMismatchForGuard(
                ctx.getText(), 
                Type.BOOL, 
                condResult.getType(), 
                ctx.getStart().getLine(), 
                ctx.getStart().getCharPositionInLine()));
        }
        return VisitorResult.success(Type.BOOL);
    }

    @Override //ok
    public VisitorResult visitEq_cmp_simples(Alan2Parser.Eq_cmp_simplesContext ctx) { //ok
        VisitorResult leftOpResult = visit(ctx.simple().get(0));
        VisitorResult rightOpResult = visit(ctx.simple().get(1));
        if(leftOpResult.hasError() || rightOpResult.hasError()) {
            return VisitorResult.failure();
        }
        if(!leftOpResult.getType().equals(rightOpResult.getType())) {
            errors.add(SyntaxError.typeMismatchForOp(
                ctx.eq_op().getText(), 
                leftOpResult.getType(), 
                rightOpResult.getType(),
                ctx.eq_op().getStart().getLine(),
                ctx.eq_op().getStart().getCharPositionInLine()));
        }
        return VisitorResult.success(Type.BOOL);
    }

    @Override //ok
    public VisitorResult visitDiseq_cmp_simples(Alan2Parser.Diseq_cmp_simplesContext ctx) { //ok
        VisitorResult leftOpResult = visit(ctx.simple().get(0));
        VisitorResult rightOpResult = visit(ctx.simple().get(1));
        if(leftOpResult.hasError() || rightOpResult.hasError()) {
            return VisitorResult.failure();
        }
        if(!leftOpResult.getType().equals(Type.INTEGER)) {
            errors.add(SyntaxError.typeMismatchForOp(
                ctx.diseq_op().getText(), 
                Type.INTEGER, 
                rightOpResult.getType(),
                ctx.diseq_op().getStart().getLine(),
                ctx.diseq_op().getStart().getCharPositionInLine()));
        }
        if(rightOpResult.getType().equals(Type.INTEGER)) {
            errors.add(SyntaxError.typeMismatchForOp(
                ctx.diseq_op().getText(), 
                leftOpResult.getType(), 
                rightOpResult.getType(),
                ctx.diseq_op().getStart().getLine(),
                ctx.diseq_op().getStart().getCharPositionInLine()));
            return VisitorResult.failure();
        }
        return VisitorResult.success(Type.BOOL);
    }

    @Override
    public VisitorResult visitSimple_or_tail(Alan2Parser.Simple_or_tailContext ctx) {

        VisitorResult termResult = visit(ctx.term());
        if(!termResult.hasError() && !termResult.getType().equals(Type.BOOL)) {
            errors.add(SyntaxError.typeMismatchForOp(
                ctx.OR().getText(), 
                Type.BOOL, 
                termResult.getType(), 
                ctx.OR().getSymbol().getLine(), 
                ctx.OR().getSymbol().getCharPositionInLine()));
        }
        return VisitorResult.success(Type.BOOL);
    }

    @Override
    public VisitorResult visitSimple_alg_tail(Alan2Parser.Simple_alg_tailContext ctx) {
        VisitorResult termResult = visit(ctx.term());
        if(!termResult.hasError() && !termResult.getType().equals(Type.INTEGER)) {
            errors.add(SyntaxError.typeMismatchForOp(
                ctx.simple_alg_op().getText(), 
                Type.INTEGER, 
                termResult.getType(), 
                ctx.simple_alg_op().getStart().getLine(), 
                ctx.simple_alg_op().getStart().getCharPositionInLine()));
        }
        return VisitorResult.success(Type.INTEGER);
    }

    @Override
    public VisitorResult visitSimple(Alan2Parser.SimpleContext ctx) {
        VisitorResult termResult = visit(ctx.term());
        if(termResult.hasError()) {
            return VisitorResult.failure();
        }
        if(ctx.MINUS() != null && !termResult.getType().equals(Type.INTEGER)) {
            errors.add(SyntaxError.typeMismatchForUnaryMinus(
                Type.INTEGER, 
                termResult.getType(), 
                ctx.MINUS().getSymbol().getLine(), 
                ctx.MINUS().getSymbol().getCharPositionInLine()));
            return VisitorResult.failure();
        }
        Type expectedType = termResult.getType();
        Type unexpectedType = expectedType.equals(Type.INTEGER) ? Type.BOOL : Type.INTEGER;
        return ctx.simple_tail().stream()
            .filter(simpleTail -> visit(simpleTail).getType().equals(unexpectedType))
            .findFirst() //if present is error
            .map(simpleTail -> {
                if(simpleTail.simple_alg_tail() != null) {
                    errors.add(SyntaxError.typeMismatchForOp(
                        simpleTail.simple_alg_tail().simple_alg_op().getText(), 
                        expectedType, 
                        unexpectedType, 
                        simpleTail.simple_alg_tail().simple_alg_op().getStart().getLine(), 
                        simpleTail.simple_alg_tail().simple_alg_op().getStart().getCharPositionInLine()));
                }
                else {
                    errors.add(SyntaxError.typeMismatchForOp(
                        simpleTail.simple_or_tail().OR().getText(), 
                        expectedType, 
                        unexpectedType, 
                        simpleTail.simple_or_tail().OR().getSymbol().getLine(), 
                        simpleTail.simple_or_tail().OR().getSymbol().getCharPositionInLine()));
                }
                return VisitorResult.failure();
            })
            .orElse(VisitorResult.success(expectedType));
    }

    @Override
    public VisitorResult visitTerm_and_tail(Alan2Parser.Term_and_tailContext ctx) {

        VisitorResult factorResult = visit(ctx.factor());
        System.out.println(ctx.factor().getText());
        if(!factorResult.hasError() && !factorResult.getType().equals(Type.BOOL)) {
            errors.add(SyntaxError.typeMismatchForOp(
                ctx.AND().getText(), 
                Type.BOOL, 
                factorResult.getType(), 
                ctx.AND().getSymbol().getLine(), 
                ctx.AND().getSymbol().getCharPositionInLine()));
        }
        return VisitorResult.success(Type.BOOL);
    }

    @Override
    public VisitorResult visitTerm_alg_tail(Alan2Parser.Term_alg_tailContext ctx) {
        VisitorResult factorResult = visit(ctx.factor());
        if(!factorResult.hasError() && !factorResult.getType().equals(Type.INTEGER)) {
            errors.add(SyntaxError.typeMismatchForOp(
                ctx.term_alg_op().getText(), 
                Type.INTEGER, 
                factorResult.getType(), 
                ctx.term_alg_op().getStart().getLine(), 
                ctx.term_alg_op().getStart().getCharPositionInLine()));
        }
        return VisitorResult.success(Type.INTEGER);
    }

    @Override //ok
    public VisitorResult visitTerm(Alan2Parser.TermContext ctx) {
        VisitorResult factorResult = visit(ctx.factor());
        if(factorResult.hasError()) {
            return VisitorResult.failure();
        }
        Type expectedType = factorResult.getType();
        Type unexpectedType = expectedType.equals(Type.INTEGER) ? Type.BOOL : Type.INTEGER;
        return ctx.term_tail().stream()
            .filter(simpleTail -> visit(simpleTail).getType().equals(unexpectedType))
            .findFirst() //if present is error
            .map(termTail -> {
                if(termTail.term_and_tail() != null) {
                    errors.add(SyntaxError.typeMismatchForOp(
                        termTail.term_and_tail().AND().getText(), 
                        Type.BOOL, 
                        factorResult.getType(), 
                        termTail.term_and_tail().AND().getSymbol().getLine(), 
                        termTail.term_and_tail().AND().getSymbol().getCharPositionInLine()));

                }
                else {
                    errors.add(SyntaxError.typeMismatchForOp(
                        termTail.term_alg_tail().term_alg_op().getText(), 
                        Type.BOOL, 
                        factorResult.getType(), 
                        termTail.term_alg_tail().term_alg_op().getStart().getLine(), 
                        termTail.term_alg_tail().term_alg_op().getStart().getCharPositionInLine()));
                }
                return VisitorResult.failure();
            })
            .orElse(VisitorResult.success(expectedType));
    }

    @Override //ok
    public VisitorResult visitFunction_call(Alan2Parser.Function_callContext ctx) {//ok
        scopeStack.getVisibleSymbol(ctx.ID().getText())
            .ifPresent(symbol -> {
                if(symbol.getFamily() != Symbol.SymbolFamily.CALLABLE) {
                    String funcId = ctx.ID().getText();
                    int line = ctx.ID().getSymbol().getLine();
                    int column = ctx.ID().getSymbol().getCharPositionInLine();
                    if(ctx.getParent() instanceof Alan2Parser.FactorContext) {
                        errors.add(SyntaxError.notAFunction(
                            funcId, 
                            line,
                            column));
                    }
                    else {
                        errors.add(SyntaxError.notAProcedure(
                            funcId, 
                            line,
                            column));
                    }
                    return;
                }
                Type.Callable callable = (Type.Callable) symbol.getType();
                VisitorResult[] paramTypes = ctx.expr().stream()
                    .map(param -> visit(param))
                    .toArray(VisitorResult[]::new);
                boolean paramsHasError = Arrays.stream(paramTypes)
                    .anyMatch(VisitorResult::hasError);
                if(paramsHasError) {
                    return;
                }
                Type[] expectedArgsType = callable.getArgs().toArray(Type[]::new);
                Type[] actualArgsType = Arrays.stream(paramTypes)
                    .map(VisitorResult::getType)
                    .toArray(Type[]::new);
                if(actualArgsType.length < expectedArgsType.length) {
                    errors.add(SyntaxError.tooFewArguments(
                        ctx.ID().getText(), 
                        ctx.getStop().getLine(), 
                        ctx.getStop().getCharPositionInLine() + ctx.getStop().getText().length()));
                    return;
                }
                else if (actualArgsType.length > expectedArgsType.length) {
                    errors.add(SyntaxError.tooManyArguments(
                        ctx.ID().getText(), 
                        ctx.expr(expectedArgsType.length).getStart().getLine(), 
                        ctx.expr(expectedArgsType.length).getStart().getCharPositionInLine()));
                    return;
                }
                for(int i = 0; i < expectedArgsType.length; i++) {
                    if(!expectedArgsType[i].equals(actualArgsType[i])) {
                        errors.add(SyntaxError.typeMismatchForParameter(
                            ctx.ID().getText(), 
                            i+1, 
                            expectedArgsType[i], 
                            actualArgsType[i], 
                            ctx.expr(i).getStart().getLine(), 
                            ctx.expr(i).getStart().getCharPositionInLine()));
                    }
                }
            });
            return VisitorResult.success(Type.NONE);
    }

/* check getVisibleSymbol */

    @Override //ok
    public VisitorResult visitArray_access(Alan2Parser.Array_accessContext ctx) {
        return scopeStack.getVisibleSymbol(ctx.ID().getText())
            .map(symbol -> {
                if(symbol.getFamily() != Symbol.SymbolFamily.VARIABLE || !symbol.getType().isArray()) {
                    errors.add(SyntaxError.notAnArray(
                        ctx.ID().getText(), 
                        ctx.getStart().getLine(),
                        ctx.getStart().getCharPositionInLine()));
                    return VisitorResult.failure();
                }
                VisitorResult indexResult = visit(ctx.simple());
                if(!indexResult.getType().equals(Type.INTEGER)) {
                    errors.add(SyntaxError.typeMismatchForArrayIndex(
                        ctx.simple().getText(), 
                        Type.INTEGER,
                        indexResult.getType(),
                        ctx.simple().getStart().getLine(),
                        ctx.simple().getStart().getCharPositionInLine()));
                }
                return VisitorResult.success(symbol.getType().isInteger() ? Type.INTEGER : Type.BOOL);
            }).orElseGet(() -> {
                errors.add(SyntaxError.unknownId(
                    ctx.ID().getText(), 
                    ctx.ID().getSymbol().getLine(), 
                    ctx.ID().getSymbol().getCharPositionInLine()));
                return VisitorResult.failure();
            });
    }

    @Override //ok
    public VisitorResult visitPar_expr(Alan2Parser.Par_exprContext ctx) {
        return visit(ctx.expr());
    }

    @Override //ok
    public VisitorResult visitNegate_factor(Alan2Parser.Negate_factorContext ctx) {
        VisitorResult factorResult = visit(ctx.factor());
        if(factorResult.hasError()) {
            return VisitorResult.failure();
        }
        if(!factorResult.getType().equals(Type.BOOL)) {
            errors.add(SyntaxError.typeMismatchForNot(
                Type.BOOL, 
                factorResult.getType(), 
                ctx.NOT().getSymbol().getLine(), 
                ctx.NOT().getSymbol().getCharPositionInLine()));
            return VisitorResult.failure();
        }
        return VisitorResult.success(Type.BOOL);
    }

    @Override //ok
    public VisitorResult visitId(Alan2Parser.IdContext ctx) { 
        return scopeStack.getVisibleSymbol(ctx.ID().getText())
            .filter(symbol -> symbol.getFamily().equals(Symbol.SymbolFamily.VARIABLE))
            .map(symbol -> {
                if(symbol.getType().isArray()) {
                    errors.add(SyntaxError.expectedScalarVariable(
                        ctx.ID().getText(),
                        ctx.ID().getSymbol().getLine(), 
                        ctx.ID().getSymbol().getCharPositionInLine()));
                    return VisitorResult.failure();
                }
                else {
                    return VisitorResult.success(symbol.getType());
                }
            })
            .orElseGet(() -> {
                errors.add(SyntaxError.notAVariable(
                    ctx.ID().getText(), 
                    ctx.ID().getSymbol().getLine(), 
                    ctx.ID().getSymbol().getCharPositionInLine()));
                return VisitorResult.failure();
            });
    }

    @Override //ok
    public VisitorResult visitNum(Alan2Parser.NumContext ctx) {
        return VisitorResult.success(Type.INTEGER);
    }

    @Override //ok
    public VisitorResult visitBool_const(Alan2Parser.Bool_constContext ctx) {
        return VisitorResult.success(Type.BOOL);
    }

    @Override //ok
    public VisitorResult visitLeave(Alan2Parser.LeaveContext ctx) { //ok
        Alan2Parser.FuncdefContext funcctx = currentFunctionContext.peek();
        if(ctx.expr() == null && funcctx.return_type() != null) {
            errors.add(SyntaxError.missingLeaveExpression(
                ctx.getText(), 
                ctx.getStart().getLine(), 
                ctx.getStart().getCharPositionInLine()));
            return VisitorResult.successWithLeave();
        }
        else {
            Type expectedType = returnTypes.peek();
            VisitorResult exprResult = visit(ctx.expr());
            if(!expectedType.equals(exprResult.getType())) {
                errors.add(SyntaxError.typeMismatchForLeave(
                    expectedType, 
                    exprResult.getType(),
                    ctx.getStart().getLine(), 
                    ctx.getStart().getCharPositionInLine()));
            }
            return VisitorResult.successWithLeave();
        }
    }

    @Override 
    public VisitorResult visitIf(Alan2Parser.IfContext ctx) { //ok
        visit(ctx.condition());
        if(ctx.else_() == null) {
            return VisitorResult.success(Type.NONE);
        }
        boolean ifHasLeave = visit(ctx.statements()).hasLeave();
        boolean allElsifHaveLeave = ctx.elsif().stream().allMatch(elsifctx -> visit(elsifctx).hasLeave());
        boolean elseHasLeave = visit(ctx.else_()).hasLeave();
        if(ifHasLeave && allElsifHaveLeave && elseHasLeave) {
            return VisitorResult.successWithLeave();
        }
        else {
            return VisitorResult.success(Type.NONE);
        }
    }

    @Override //ok
    public VisitorResult visitElsif(Alan2Parser.ElsifContext ctx) {
        visit(ctx.condition());
        return visit(ctx.statements());
    }

    @Override //ok
    public VisitorResult visitElse(Alan2Parser.ElseContext ctx) {
        return visit(ctx.statements());
    }

    @Override //ok
    public VisitorResult visitWhile(Alan2Parser.WhileContext ctx) {
        visit(ctx.condition());
        return visit(ctx.statements());
    }

}
