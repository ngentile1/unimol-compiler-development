// Generated from Draco.g4 by ANTLR 4.13.2

package it.unimol.draco;

import it.unimol.draco.IncludeNotAtBeginOfLineException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DracoParser}.
 */
public interface DracoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DracoParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(DracoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(DracoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#proc_decl}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl(DracoParser.Proc_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#proc_decl}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl(DracoParser.Proc_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#procs_decl}.
	 * @param ctx the parse tree
	 */
	void enterProcs_decl(DracoParser.Procs_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#procs_decl}.
	 * @param ctx the parse tree
	 */
	void exitProcs_decl(DracoParser.Procs_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DracoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DracoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#types_decl}.
	 * @param ctx the parse tree
	 */
	void enterTypes_decl(DracoParser.Types_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#types_decl}.
	 * @param ctx the parse tree
	 */
	void exitTypes_decl(DracoParser.Types_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(DracoParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(DracoParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#vars_decl}.
	 * @param ctx the parse tree
	 */
	void enterVars_decl(DracoParser.Vars_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#vars_decl}.
	 * @param ctx the parse tree
	 */
	void exitVars_decl(DracoParser.Vars_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr(DracoParser.Const_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr(DracoParser.Const_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#base_expr}.
	 * @param ctx the parse tree
	 */
	void enterBase_expr(DracoParser.Base_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#base_expr}.
	 * @param ctx the parse tree
	 */
	void exitBase_expr(DracoParser.Base_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#fun_call}.
	 * @param ctx the parse tree
	 */
	void enterFun_call(DracoParser.Fun_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#fun_call}.
	 * @param ctx the parse tree
	 */
	void exitFun_call(DracoParser.Fun_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DracoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DracoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#postifix_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostifix_op_expr(DracoParser.Postifix_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#postifix_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostifix_op_expr(DracoParser.Postifix_op_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#postfix_op}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_op(DracoParser.Postfix_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#postfix_op}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_op(DracoParser.Postfix_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#deref_expr}.
	 * @param ctx the parse tree
	 */
	void enterDeref_expr(DracoParser.Deref_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#deref_expr}.
	 * @param ctx the parse tree
	 */
	void exitDeref_expr(DracoParser.Deref_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#field_expr}.
	 * @param ctx the parse tree
	 */
	void enterField_expr(DracoParser.Field_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#field_expr}.
	 * @param ctx the parse tree
	 */
	void exitField_expr(DracoParser.Field_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#postfix_int_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_int_op_expr(DracoParser.Postfix_int_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#postfix_int_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_int_op_expr(DracoParser.Postfix_int_op_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#bitbin_op}.
	 * @param ctx the parse tree
	 */
	void enterBitbin_op(DracoParser.Bitbin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#bitbin_op}.
	 * @param ctx the parse tree
	 */
	void exitBitbin_op(DracoParser.Bitbin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#bitwise_expr}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_expr(DracoParser.Bitwise_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#bitwise_expr}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_expr(DracoParser.Bitwise_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#alg1_expr}.
	 * @param ctx the parse tree
	 */
	void enterAlg1_expr(DracoParser.Alg1_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#alg1_expr}.
	 * @param ctx the parse tree
	 */
	void exitAlg1_expr(DracoParser.Alg1_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#alg2_expr}.
	 * @param ctx the parse tree
	 */
	void enterAlg2_expr(DracoParser.Alg2_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#alg2_expr}.
	 * @param ctx the parse tree
	 */
	void exitAlg2_expr(DracoParser.Alg2_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#cmp_expr}.
	 * @param ctx the parse tree
	 */
	void enterCmp_expr(DracoParser.Cmp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#cmp_expr}.
	 * @param ctx the parse tree
	 */
	void exitCmp_expr(DracoParser.Cmp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#neg_expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg_expr(DracoParser.Neg_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#neg_expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg_expr(DracoParser.Neg_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(DracoParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(DracoParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(DracoParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(DracoParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(DracoParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(DracoParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(DracoParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(DracoParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#ptr_type}.
	 * @param ctx the parse tree
	 */
	void enterPtr_type(DracoParser.Ptr_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#ptr_type}.
	 * @param ctx the parse tree
	 */
	void exitPtr_type(DracoParser.Ptr_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#fun_type}.
	 * @param ctx the parse tree
	 */
	void enterFun_type(DracoParser.Fun_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#fun_type}.
	 * @param ctx the parse tree
	 */
	void exitFun_type(DracoParser.Fun_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type(DracoParser.Struct_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type(DracoParser.Struct_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#union_type}.
	 * @param ctx the parse tree
	 */
	void enterUnion_type(DracoParser.Union_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#union_type}.
	 * @param ctx the parse tree
	 */
	void exitUnion_type(DracoParser.Union_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#enum_type}.
	 * @param ctx the parse tree
	 */
	void enterEnum_type(DracoParser.Enum_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#enum_type}.
	 * @param ctx the parse tree
	 */
	void exitEnum_type(DracoParser.Enum_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DracoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DracoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DracoParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DracoParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(DracoParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(DracoParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(DracoParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(DracoParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(DracoParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(DracoParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#left_hand_expr}.
	 * @param ctx the parse tree
	 */
	void enterLeft_hand_expr(DracoParser.Left_hand_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#left_hand_expr}.
	 * @param ctx the parse tree
	 */
	void exitLeft_hand_expr(DracoParser.Left_hand_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#assignemnt_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignemnt_expr(DracoParser.Assignemnt_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#assignemnt_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignemnt_expr(DracoParser.Assignemnt_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#assignemnt_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignemnt_stmt(DracoParser.Assignemnt_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#assignemnt_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignemnt_stmt(DracoParser.Assignemnt_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(DracoParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(DracoParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#if_expr_tail}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr_tail(DracoParser.If_expr_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#if_expr_tail}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr_tail(DracoParser.If_expr_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#if_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_body(DracoParser.If_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#if_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_body(DracoParser.If_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(DracoParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(DracoParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#if_stmt_tail}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_tail(DracoParser.If_stmt_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#if_stmt_tail}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_tail(DracoParser.If_stmt_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(DracoParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(DracoParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(DracoParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(DracoParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(DracoParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(DracoParser.Case_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#case_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt_body(DracoParser.Case_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#case_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt_body(DracoParser.Case_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(DracoParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(DracoParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(DracoParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(DracoParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(DracoParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(DracoParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterStmt_body(DracoParser.Stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitStmt_body(DracoParser.Stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(DracoParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(DracoParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#formatted_param}.
	 * @param ctx the parse tree
	 */
	void enterFormatted_param(DracoParser.Formatted_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#formatted_param}.
	 * @param ctx the parse tree
	 */
	void exitFormatted_param(DracoParser.Formatted_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#formatted_params}.
	 * @param ctx the parse tree
	 */
	void enterFormatted_params(DracoParser.Formatted_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#formatted_params}.
	 * @param ctx the parse tree
	 */
	void exitFormatted_params(DracoParser.Formatted_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#io_func_name}.
	 * @param ctx the parse tree
	 */
	void enterIo_func_name(DracoParser.Io_func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#io_func_name}.
	 * @param ctx the parse tree
	 */
	void exitIo_func_name(DracoParser.Io_func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DracoParser#io_expr}.
	 * @param ctx the parse tree
	 */
	void enterIo_expr(DracoParser.Io_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DracoParser#io_expr}.
	 * @param ctx the parse tree
	 */
	void exitIo_expr(DracoParser.Io_exprContext ctx);
}