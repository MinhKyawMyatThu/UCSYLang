/* Generated By:JJTree: Do not edit this line. ASTNullLiteral.java */

public class ASTNullLiteral extends ParentExpression {
	Token t;
  public ASTNullLiteral(int id) {
    super(id);
  }

  public ASTNullLiteral(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}