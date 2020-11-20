package tech.geekahmed;

public class Main {

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        selectionSort(arr);
        System.out.println("Sorted array");
        for (int element:arr) {
            System.out.print(element + " ");
        }
    }
    private static void selectionSort(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arrayOfNumbers.length; j++)
                if (arrayOfNumbers[j] < arrayOfNumbers[min_idx])
                    min_idx = j;
            int temp = arrayOfNumbers[min_idx];
            arrayOfNumbers[min_idx] = arrayOfNumbers[i];
            arrayOfNumbers[i] = temp;
        }
    }
}
