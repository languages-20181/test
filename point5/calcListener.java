// Generated from calc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#ecuacion}.
	 * @param ctx the parse tree
	 */
	void enterEcuacion(calcParser.EcuacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#ecuacion}.
	 * @param ctx the parse tree
	 */
	void exitEcuacion(calcParser.EcuacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(calcParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(calcParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#multiplyingexpresion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingexpresion(calcParser.MultiplyingexpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#multiplyingexpresion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingexpresion(calcParser.MultiplyingexpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#powexpresion}.
	 * @param ctx the parse tree
	 */
	void enterPowexpresion(calcParser.PowexpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#powexpresion}.
	 * @param ctx the parse tree
	 */
	void exitPowexpresion(calcParser.PowexpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(calcParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(calcParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(calcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(calcParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(calcParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(calcParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(calcParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(calcParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(calcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(calcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(calcParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(calcParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#func_nombre}.
	 * @param ctx the parse tree
	 */
	void enterFunc_nombre(calcParser.Func_nombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#func_nombre}.
	 * @param ctx the parse tree
	 */
	void exitFunc_nombre(calcParser.Func_nombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(calcParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(calcParser.RelopContext ctx);
}