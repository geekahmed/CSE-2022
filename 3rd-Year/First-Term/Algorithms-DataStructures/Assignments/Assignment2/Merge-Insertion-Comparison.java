package tech.geekahmed;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        long numberOfComparisonsMergeSort = 0, numberOfComparisonsInsertionSort = 0 ;
        for (int i = 0 ; i < 1000; i++){
            int[] tempArr = new int[1000];
            for (int j = 0 ; j < 1000 ; j++){
                tempArr[i] = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
            }
            numberOfComparisonsInsertionSort  += inserstionSort(tempArr);
            numberOfComparisonsMergeSort += mergeSort(tempArr, 0, tempArr.length -1 );
        }
        System.out.println("Average comparisons for insertion sort: " + numberOfComparisonsInsertionSort / 1000);
        System.out.println("Average comparisons for merge sort: " + numberOfComparisonsMergeSort / 1000);
    }
    public static int mergeSort(int[] arr, int l, int r) {
        int temp = -1;
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            temp = merge(arr, l, m, r);
        }
        return temp;
    }

    public static int merge(int[] arr, int l, int m, int r) {
        int noComparisons = 0 ;
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        if (n1 >= 0) System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
            noComparisons++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return noComparisons;
    }
    private static int inserstionSort(int[] numbersToSort){
        int noComparisons = 0 ;
        for (int i = 1 ; i < numbersToSort.length ; i++){
            int key = numbersToSort[i];
            int j = i - 1;
            while (j >= 0 && numbersToSort[j] >= key){
                numbersToSort[j + 1] = numbersToSort[j];
                j--;
                noComparisons++;
            }
            numbersToSort[j + 1] = key;
        }
        return noComparisons;
    }
}
