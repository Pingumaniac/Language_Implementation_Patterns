package tree_grammar;

public class PrintNode extends StatNode {
    ExprNode value;
    public PrintNode(Token token, ExprNode value) {
        super(token); this.value = value;
    }
    @Override
    public void visit(VecMathVisitor visitor) { visitor.visit(this); }
}
