/* Generated By:JJTree: Do not edit this line. ASTType.java */

public class ASTType extends SimpleNode {
	ASTReferenceType referenceType;
	ASTPrimitiveType primitiveType;
	String typeName;
  public ASTType(int id) {
    super(id);
  }

  public ASTType(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
