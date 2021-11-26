package sorting;

/**
 * This class represents InsertionSorter and inherits methods and attributes 
 * from Sorter class
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class InsertionSorter extends Sorter {
    /**
     * This method sorts an array using insertion sort algorithm
     * @param list a list of doubles
     */
    public void sort(double[] list) {
        int n = list.length;
        countOp();
        countOp();

        for (int i = 1; i < n; i++) {
            double key = list[i];
            countOp();
            
            int j = i - 1;
            countOp();

            //Move elements by index of 1 that are greater than key
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                countOp();
                j = j - 1;
                countOp();
            }

            list[j + 1] = key;
            countOp();
            countOp();
        }
    }
}
