package expressionTree;

/**
 * This class represents an expression tree
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class ExpressionTree {
    private OpNode root;

    /**
     * This constructs an ExpressionTree with specified root
     * @param root root of a tree
     */
    public ExpressionTree(OpNode root) {
        this.root = root;
    }

    /**
     * This method calls evaluate function on a root
     * @return evaluated expression
     */
    public double evaluate() {
        return root.evaluate();
    }

    /**
     * This method calls print method on a root
     * @return void
     */
    public void print() {
        root.print(0);
    }
}
