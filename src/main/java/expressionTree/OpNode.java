package expressionTree;

/**
 * This class represents OpNode and inherits methods and attributes 
 * from TreeNode class
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class OpNode extends TreeNode {
    private String operation;
    private TreeNode left;
    private TreeNode right;

    /**
     * Constructor for OpNode
     * @param left left node 
     * @param operation operator for an expression
     * @param right right node
     */
    public OpNode(TreeNode left, String operation, TreeNode right) {
        this.operation = operation;
        this.left = left;
        this.right = right;
    }

    /**
     * This method is the print function for the OpNode
     * @param depth the depth integer value
     * @return void
     */
    public void print(int depth) {
        if (this.right != null) {
            this.right.print(depth + 1); //recursive call
        }

        String result = "";

        //indentation for printing a tree
        for (int i = 0; i < depth; i++) {
            result += "\t\t";
        }

        result += operation;
        System.out.println(result);

        this.left.print(depth + 1); //recursive call
    }

    /**
     * This method evaluates an expression based on right node 
     * and left node values and an operation
     * @return double value, evaluated expression
     */
    public double evaluate() {

        //if statements to choose the correct operation
        if (operation == "+") {
            return left.evaluate() + right.evaluate();
        } else if (operation == "-") {
            return left.evaluate() - right.evaluate();
        } else if (operation == "*") {
            return left.evaluate() * right.evaluate();
        } else if (operation == "/") {
            return left.evaluate() / right.evaluate();
        } else {
            return 0.0;
        }
    }

}
