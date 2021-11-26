package sorting;

/**
 * This class represents MergeSorter and inherits methods and attributes 
 * from Sorter class
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class MergeSorter extends Sorter {

    /**
     * This method merges 2 subarrays of list[]
     * @param list list of doubles
     * @param l start index of the first half of an array
     * @param m middle index
     * @param r end index of the second half of an array
     */
    void merge(double list[], int l, int m, int r)
    {

        //determine sizes of two sub arrays that will be merged
        int n1 = m - l + 1;
        countOp();
        int n2 = r - m;
        countOp();
  
        //temporary arrays of doubles
        double L[] = new double[n1];
        countOp();
        double R[] = new double[n2];
        countOp();
  
        countOp();
        //copy the data to the temproray array
        for (int i = 0; i < n1; ++i) {
            L[i] = list[l + i];
            countOp();
            countOp();
        }
            
        countOp();
        //copy the data to the temproray array
        for (int j = 0; j < n2; ++j) {
            R[j] = list[m + 1 + j];
            countOp();
            countOp();
        }
            

        //initial indexes for the first and second half of the array
        int i = 0;
        countOp();
        int j = 0;
        countOp();
  
        //Initial index of merged subarray array
        int k = l;
        countOp();


        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                countOp();
                i++;
                countOp();
            }
            else {
                list[k] = R[j];
                countOp();
                j++;
                countOp();
            }
            k++;
            countOp();
        }
  
        while (i < n1) {
            list[k] = L[i];
            countOp();
            i++;
            countOp();
            k++;
            countOp();
        }
  
        while (j < n2) {
            list[k] = R[j];
            countOp();
            j++;
            countOp();
            k++;
            countOp();
        }
    }
  
    public void sort(double list[], int l, int r)
    {
        if (l < r) {
            // Find the middle of an array
            int m = l + (r - l) / 2;
            countOp();
  
            // Sort first and second halves
            sort(list, l, m);
            sort(list, m + 1, r);
  
            // Merge the sorted halves
            merge(list, l, m, r);
        }
    }

    public void sort(double[] list) {
        sort(list, 0, list.length - 1);
    }
}
