package expressionTree;

/**
 * The abstract class TreeNode has 2 abstract methods that will be implemented in other classes
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public abstract class TreeNode {
    /**
     * abstract method 
     * @param depth
     */
    public abstract void print(int depth);

    /**
     * 
     * @return double, evaluated expression
     */
    public abstract double evaluate();
}
