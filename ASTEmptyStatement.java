/* Generated By:JJTree: Do not edit this line. ASTEmptyStatement.java */

public class ASTEmptyStatement extends ParentStatement {
  public ASTEmptyStatement(int id) {
    super(id);
  }

  public ASTEmptyStatement(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}