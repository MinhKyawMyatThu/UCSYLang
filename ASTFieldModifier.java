/* Generated By:JJTree: Do not edit this line. ASTFieldModifier.java */

public class ASTFieldModifier extends SimpleNode {
	int fieldModifier ;
  public ASTFieldModifier(int id) {
    super(id);
  }

  public ASTFieldModifier(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
