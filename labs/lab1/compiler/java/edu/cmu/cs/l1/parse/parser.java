
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sun Feb 08 00:07:22 HKT 2015
//----------------------------------------------------

package edu.cmu.cs.l1.parse;

import edu.cmu.cs.l1.absyn.*;
import edu.cmu.cs.l1.symbol.Symbol;
import edu.cmu.cs.l1.errormsg.*;

/** CUP v0.10k generated parser.
  * @version Sun Feb 08 00:07:22 HKT 2015
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\003\010\000\002\003" +
    "\007\000\002\004\003\000\002\004\004\000\002\005\004" +
    "\000\002\010\003\000\002\006\005\000\002\006\005\000" +
    "\002\006\005\000\002\006\005\000\002\006\005\000\002" +
    "\006\005\000\002\007\005\000\002\007\003\000\002\007" +
    "\003\000\002\007\004\000\002\007\005\000\002\007\005" +
    "\000\002\007\005\000\002\007\005\000\002\007\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\004\006\004\001\002\000\006\004\007\027" +
    "\012\001\002\000\004\002\006\001\002\000\004\002\001" +
    "\001\002\000\016\017\ufffb\022\ufffb\023\ufffb\024\ufffb\025" +
    "\ufffb\026\ufffb\001\002\000\004\012\062\001\002\000\004" +
    "\027\056\001\002\000\012\004\024\005\030\010\026\014" +
    "\025\001\002\000\016\017\023\022\021\023\020\024\017" +
    "\025\022\026\016\001\002\000\006\004\007\027\ufffe\001" +
    "\002\000\004\027\ufffd\001\002\000\012\004\024\005\030" +
    "\010\026\014\025\001\002\000\012\004\024\005\030\010" +
    "\026\014\025\001\002\000\012\004\024\005\030\010\026" +
    "\014\025\001\002\000\012\004\024\005\030\010\026\014" +
    "\025\001\002\000\012\004\024\005\030\010\026\014\025" +
    "\001\002\000\012\004\024\005\030\010\026\014\025\001" +
    "\002\000\020\011\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2" +
    "\016\ufff2\020\ufff2\001\002\000\012\004\024\005\030\010" +
    "\026\014\025\001\002\000\012\004\024\005\030\010\026" +
    "\014\025\001\002\000\016\012\ufffa\013\032\014\033\015" +
    "\035\016\034\020\031\001\002\000\020\011\ufff3\012\ufff3" +
    "\013\ufff3\014\ufff3\015\ufff3\016\ufff3\020\ufff3\001\002\000" +
    "\012\004\024\005\030\010\026\014\025\001\002\000\012" +
    "\004\024\005\030\010\026\014\025\001\002\000\012\004" +
    "\024\005\030\010\026\014\025\001\002\000\012\004\024" +
    "\005\030\010\026\014\025\001\002\000\012\004\024\005" +
    "\030\010\026\014\025\001\002\000\020\011\uffee\012\uffee" +
    "\013\uffee\014\uffee\015\uffee\016\uffee\020\uffee\001\002\000" +
    "\020\011\uffed\012\uffed\013\uffed\014\uffed\015\uffed\016\uffed" +
    "\020\uffed\001\002\000\020\011\uffef\012\uffef\013\uffef\014" +
    "\uffef\015\035\016\034\020\031\001\002\000\020\011\ufff0" +
    "\012\ufff0\013\ufff0\014\ufff0\015\035\016\034\020\031\001" +
    "\002\000\020\011\uffec\012\uffec\013\uffec\014\uffec\015\uffec" +
    "\016\uffec\020\uffec\001\002\000\016\011\044\013\032\014" +
    "\033\015\035\016\034\020\031\001\002\000\020\011\ufff4" +
    "\012\ufff4\013\ufff4\014\ufff4\015\ufff4\016\ufff4\020\ufff4\001" +
    "\002\000\020\011\ufff1\012\ufff1\013\ufff1\014\ufff1\015\ufff1" +
    "\016\ufff1\020\ufff1\001\002\000\016\012\ufff6\013\032\014" +
    "\033\015\035\016\034\020\031\001\002\000\016\012\ufff9" +
    "\013\032\014\033\015\035\016\034\020\031\001\002\000" +
    "\016\012\ufff8\013\032\014\033\015\035\016\034\020\031" +
    "\001\002\000\016\012\ufff7\013\032\014\033\015\035\016" +
    "\034\020\031\001\002\000\016\012\ufff5\013\032\014\033" +
    "\015\035\016\034\020\031\001\002\000\016\012\054\013" +
    "\032\014\033\015\035\016\034\020\031\001\002\000\004" +
    "\007\055\001\002\000\004\002\uffff\001\002\000\012\004" +
    "\024\005\030\010\026\014\025\001\002\000\016\012\060" +
    "\013\032\014\033\015\035\016\034\020\031\001\002\000" +
    "\004\007\061\001\002\000\004\002\000\001\002\000\006" +
    "\004\ufffc\027\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\004\003\004\001\001\000\012\004\010\005" +
    "\013\006\007\010\012\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\052\001\001\000\002\001\001\000\012" +
    "\004\014\005\013\006\007\010\012\001\001\000\002\001" +
    "\001\000\004\007\051\001\001\000\004\007\050\001\001" +
    "\000\004\007\047\001\001\000\004\007\046\001\001\000" +
    "\004\007\045\001\001\000\004\007\026\001\001\000\002" +
    "\001\001\000\004\007\044\001\001\000\004\007\042\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\041" +
    "\001\001\000\004\007\040\001\001\000\004\007\037\001" +
    "\001\000\004\007\036\001\001\000\004\007\035\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\056\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.nextToken(); 
    }


  public ASStatement parseResult;
  Lexer lexer;

  public void syntax_error(java_cup.runtime.Symbol current) {
   report_error("Syntax error (" + current.sym + ")", current);
  }

  ErrorMsg errorMsg;

  public void report_error(String message,
			   java_cup.runtime.Symbol info) {
      errorMsg.error(info.left, message);
  }

  public parser(Lexer l, ErrorMsg err) {
    this();
    errorMsg=err;
    lexer=l;
  }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

 static Symbol sym(String s) {
	         return Symbol.symbol(s);
	        }
	    
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= expr MOD expr 
            {
              Object RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASOpExpression(oleft, ASOpExpression.MOD, (ASExpression)e1, (ASExpression)e2); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= expr DIVIDE expr 
            {
              Object RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASOpExpression(oleft, ASOpExpression.DIV, (ASExpression)e1, (ASExpression)e2); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= expr TIMES expr 
            {
              Object RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASOpExpression(oleft, ASOpExpression.MUL, (ASExpression)e1, (ASExpression)e2); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= expr MINUS expr 
            {
              Object RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASOpExpression(oleft, ASOpExpression.MINUS, (ASExpression)e1, (ASExpression)e2); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr PLUS expr 
            {
              Object RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASOpExpression(oleft, ASOpExpression.PLUS, (ASExpression)e1, (ASExpression)e2); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= MINUS expr 
            {
              Object RESULT = null;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASOpExpression(oleft, ASOpExpression.NEG, (ASExpression)e, null); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= ID 
            {
              Object RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASLvalExpression(ileft, new ASSimpleLval(ileft, Symbol.symbol(i))); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= INT 
            {
              Object RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASIntConstant(nleft, Integer.parseInt(n)); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= LPAREN expr RPAREN 
            {
              Object RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // assgnstmt ::= lval MODASSIGN expr 
            {
              Object RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =
	   new ASAssignStatement(ileft,(ASLval)i, new ASOpExpression(oleft,ASOpExpression.MOD,
	       new ASLvalExpression(ileft, (ASLval)i), (ASExpression)e));
	
              CUP$parser$result = new java_cup.runtime.Symbol(4/*assgnstmt*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // assgnstmt ::= lval DIVIDEASSIGN expr 
            {
              Object RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =
	   new ASAssignStatement(ileft,(ASLval)i, new ASOpExpression(oleft,ASOpExpression.DIV,
	       new ASLvalExpression(ileft, (ASLval)i), (ASExpression)e));
	
              CUP$parser$result = new java_cup.runtime.Symbol(4/*assgnstmt*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // assgnstmt ::= lval TIMESASSIGN expr 
            {
              Object RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =
	   new ASAssignStatement(ileft,(ASLval)i, new ASOpExpression(oleft,ASOpExpression.MUL,
	       new ASLvalExpression(ileft, (ASLval)i), (ASExpression)e));
	
              CUP$parser$result = new java_cup.runtime.Symbol(4/*assgnstmt*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // assgnstmt ::= lval MINUSASSIGN expr 
            {
              Object RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =
	   new ASAssignStatement(ileft,(ASLval)i, new ASOpExpression(oleft,ASOpExpression.MINUS,
	       new ASLvalExpression(ileft, (ASLval)i), (ASExpression)e));
	
              CUP$parser$result = new java_cup.runtime.Symbol(4/*assgnstmt*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // assgnstmt ::= lval PLUSASSIGN expr 
            {
              Object RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =
	   new ASAssignStatement(ileft,(ASLval)i, new ASOpExpression(oleft,ASOpExpression.PLUS,
	       new ASLvalExpression(ileft, (ASLval)i), (ASExpression)e));
	
              CUP$parser$result = new java_cup.runtime.Symbol(4/*assgnstmt*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // assgnstmt ::= lval ASSIGN expr 
            {
              Object RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASAssignStatement(ileft, (ASLval)i, (ASExpression)e); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*assgnstmt*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // lval ::= ID 
            {
              Object RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASSimpleLval(ileft, Symbol.symbol(i)); 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*lval*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= assgnstmt SEMICOL 
            {
              Object RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = s; 
              CUP$parser$result = new java_cup.runtime.Symbol(3/*stmt*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmtseq ::= stmt stmtseq 
            {
              Object RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int ssleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object ss = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 ASStatementList tail = new ASStatementList(sleft, (ASStatement)ss);
           RESULT = tail.prepend((ASStatement)s); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*stmtseq*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmtseq ::= stmt 
            {
              Object RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ASStatementList(sleft, (ASStatement)s); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*stmtseq*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= LBRACE RETURN expr SEMICOL RBRACE 
            {
              Object RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 ASStatement retstm = new ASReturnStatement(rsleft, (ASExpression)e); 
	  parser.parseResult = new ASStatementList(lleft, retstm); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*program*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= LBRACE stmtseq RETURN expr SEMICOL RBRACE 
            {
              Object RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int ssleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object ss = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 ASStatement retstm = new ASReturnStatement(rsleft, (ASExpression)e);
	  parser.parseResult = ((ASStatementList)ss).append(retstm); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*program*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
