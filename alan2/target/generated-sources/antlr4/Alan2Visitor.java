// Generated from Alan2.g4 by ANTLR 4.13.2

package it.unimol.alan2;

import it.unimol.alan2.TooLongIDException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Alan2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Alan2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(Alan2Parser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Alan2Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Alan2Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(Alan2Parser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(Alan2Parser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Alan2Parser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#native_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNative_type(Alan2Parser.Native_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Alan2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(Alan2Parser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(Alan2Parser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(Alan2Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Alan2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(Alan2Parser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#left_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_operand(Alan2Parser.Left_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#array_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_simple(Alan2Parser.Array_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#right_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_operand(Alan2Parser.Right_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Alan2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(Alan2Parser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(Alan2Parser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Alan2Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Alan2Parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#elsif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif(Alan2Parser.ElsifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(Alan2Parser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(Alan2Parser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#leave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave(Alan2Parser.LeaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(Alan2Parser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Alan2Parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(Alan2Parser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#eq_cmp_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_cmp_simples(Alan2Parser.Eq_cmp_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#diseq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiseq_op(Alan2Parser.Diseq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#diseq_cmp_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiseq_cmp_simples(Alan2Parser.Diseq_cmp_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#cmp_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_simples(Alan2Parser.Cmp_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Alan2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#simple_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_tail(Alan2Parser.Simple_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#simple_or_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_or_tail(Alan2Parser.Simple_or_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#simple_alg_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_alg_op(Alan2Parser.Simple_alg_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#simple_alg_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_alg_tail(Alan2Parser.Simple_alg_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(Alan2Parser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#term_and_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_and_tail(Alan2Parser.Term_and_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#term_alg_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_alg_op(Alan2Parser.Term_alg_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#term_alg_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_alg_tail(Alan2Parser.Term_alg_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#term_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_tail(Alan2Parser.Term_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Alan2Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#par_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_expr(Alan2Parser.Par_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#negate_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate_factor(Alan2Parser.Negate_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Alan2Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(Alan2Parser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#bool_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_const(Alan2Parser.Bool_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Alan2Parser.FactorContext ctx);
}