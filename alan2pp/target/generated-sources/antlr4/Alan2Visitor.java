// Generated from Alan2.g4 by ANTLR 4.13.2

package it.unimol.alan2pp;

import it.unimol.alan2pp.TooLongIDException;

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
	 * Visit a parse tree produced by {@link Alan2Parser#param_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_comma(Alan2Parser.Param_commaContext ctx);
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
	 * Visit a parse tree produced by {@link Alan2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Alan2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#id_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_comma(Alan2Parser.Id_commaContext ctx);
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
	 * Visit a parse tree produced by {@link Alan2Parser#array_access_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access_begin(Alan2Parser.Array_access_beginContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(Alan2Parser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#array_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_simple(Alan2Parser.Array_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Alan2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#expr_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_comma(Alan2Parser.Expr_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#function_call_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_begin(Alan2Parser.Function_call_beginContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(Alan2Parser.Function_callContext ctx);
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
	 * Visit a parse tree produced by {@link Alan2Parser#put_expr_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_expr_dot(Alan2Parser.Put_expr_dotContext ctx);
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
	 * Visit a parse tree produced by {@link Alan2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Alan2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(Alan2Parser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Alan2Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Alan2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Alan2Parser.FactorContext ctx);
}