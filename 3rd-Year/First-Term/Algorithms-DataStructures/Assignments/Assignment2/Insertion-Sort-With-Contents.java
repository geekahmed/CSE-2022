package tech.geekahmed;


public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{31,41,59,26,41,58};
        inserstionSort(arr);
    }
    private static void inserstionSort(int[] numbersToSort){
        for (int i = 1 ; i < numbersToSort.length ; i++){
            System.out.print(i + " iteration: ");
            int key = numbersToSort[i];
            int j = i - 1;
            while (j >= 0 && numbersToSort[j] >= key){
                numbersToSort[j + 1] = numbersToSort[j];
                j--;
            }
            numbersToSort[j + 1] = key;
            printArrayElements(numbersToSort);
        }
    }
    private static void printArrayElements(int[] arrayToPrint){
        for (int element: arrayToPrint){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
