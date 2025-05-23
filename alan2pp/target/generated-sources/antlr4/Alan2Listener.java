// Generated from Alan2.g4 by ANTLR 4.13.2

package it.unimol.alan2pp;

import it.unimol.alan2pp.TooLongIDException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Alan2Parser}.
 */
public interface Alan2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(Alan2Parser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(Alan2Parser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Alan2Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Alan2Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#param_comma}.
	 * @param ctx the parse tree
	 */
	void enterParam_comma(Alan2Parser.Param_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#param_comma}.
	 * @param ctx the parse tree
	 */
	void exitParam_comma(Alan2Parser.Param_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Alan2Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Alan2Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(Alan2Parser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(Alan2Parser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(Alan2Parser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(Alan2Parser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(Alan2Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(Alan2Parser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Alan2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Alan2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#id_comma}.
	 * @param ctx the parse tree
	 */
	void enterId_comma(Alan2Parser.Id_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#id_comma}.
	 * @param ctx the parse tree
	 */
	void exitId_comma(Alan2Parser.Id_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(Alan2Parser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(Alan2Parser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(Alan2Parser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(Alan2Parser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Alan2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Alan2Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Alan2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Alan2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#array_access_begin}.
	 * @param ctx the parse tree
	 */
	void enterArray_access_begin(Alan2Parser.Array_access_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#array_access_begin}.
	 * @param ctx the parse tree
	 */
	void exitArray_access_begin(Alan2Parser.Array_access_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(Alan2Parser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(Alan2Parser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#array_simple}.
	 * @param ctx the parse tree
	 */
	void enterArray_simple(Alan2Parser.Array_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#array_simple}.
	 * @param ctx the parse tree
	 */
	void exitArray_simple(Alan2Parser.Array_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Alan2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Alan2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#expr_comma}.
	 * @param ctx the parse tree
	 */
	void enterExpr_comma(Alan2Parser.Expr_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#expr_comma}.
	 * @param ctx the parse tree
	 */
	void exitExpr_comma(Alan2Parser.Expr_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#function_call_begin}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_begin(Alan2Parser.Function_call_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#function_call_begin}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_begin(Alan2Parser.Function_call_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(Alan2Parser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(Alan2Parser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(Alan2Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(Alan2Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#elsif}.
	 * @param ctx the parse tree
	 */
	void enterElsif(Alan2Parser.ElsifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#elsif}.
	 * @param ctx the parse tree
	 */
	void exitElsif(Alan2Parser.ElsifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(Alan2Parser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(Alan2Parser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(Alan2Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(Alan2Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#leave}.
	 * @param ctx the parse tree
	 */
	void enterLeave(Alan2Parser.LeaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#leave}.
	 * @param ctx the parse tree
	 */
	void exitLeave(Alan2Parser.LeaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#put_expr_dot}.
	 * @param ctx the parse tree
	 */
	void enterPut_expr_dot(Alan2Parser.Put_expr_dotContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#put_expr_dot}.
	 * @param ctx the parse tree
	 */
	void exitPut_expr_dot(Alan2Parser.Put_expr_dotContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(Alan2Parser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(Alan2Parser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(Alan2Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(Alan2Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Alan2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Alan2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#simple}.
	 * @param ctx the parse tree
	 */
	void enterSimple(Alan2Parser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#simple}.
	 * @param ctx the parse tree
	 */
	void exitSimple(Alan2Parser.SimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Alan2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Alan2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Alan2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Alan2Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Alan2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Alan2Parser.FactorContext ctx);
}