/* Generated By:JJTree: Do not edit this line. ASTcomp.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTcomp extends SimpleNode {
  public ASTcomp(int id) {
    super(id);
  }

  public ASTcomp(CCAL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CCALVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7e04e6168d97b04f4f4f0f3b78dc3960 (do not edit this line) */
