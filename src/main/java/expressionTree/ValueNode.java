package expressionTree;

/**
 * This class represents ValueNode and inherits methods and attributes 
 * from TreeNode class
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class ValueNode extends TreeNode {
    private double value;

    /**
     * Constructor for ValueNode
     * @param value double value
     */
    public ValueNode(double value) {
        this.value = value;
    }

    /**
     * This method prints the value of ValueNode
     * and indents it based on the depth parameter
     * @param depth depth of a tree
     * @return void
     */
    public void print(int depth) {
        String result = "";

        //indentation for printing a tree
        for (int i = 0; i < depth; i++) {
            result += "\t\t";
        }

        result += String.valueOf(value);
        System.out.println(result);
    }

    /**
     * This method return a value of ValueNode
     * @return double value
     */
    public double evaluate() {
        return value;
    }  
}
