package tech.geekahmed;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    static int[] exampleArray = new int[]{123, 322, 43, -25, 234,343, 5,665,22};
    public static void main(String[] args) {
	    System.out.println("Searching example array for 322 using linear search");
	    System.out.println("Index: " + linearSearch(exampleArray, 322));

        System.out.println("Searching example array for 2 using linear search");
        System.out.println("Index: " + linearSearch(exampleArray, 2));

        Arrays.sort(exampleArray);
        System.out.println("Searching example array for 322 using binary search iterative");
        System.out.println("Index: " + binarySearchIterative(exampleArray, 322));

        System.out.println("Searching example array for 2 using binary search iterative");
        System.out.println("Index: " + binarySearchIterative(exampleArray, 2));

        System.out.println("Searching example array for 322 using binary search recursive");
        System.out.println("Index: " + binarySearchRecursive(exampleArray, 322, exampleArray.length - 1, 0));

        System.out.println("Searching example array for 2 using binary search recursive");
        System.out.println("Index: " + binarySearchRecursive(exampleArray, 2, exampleArray.length - 1, 0));
    }
    private static int linearSearch(int[] array, int value){
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] == value)
                return i;
        }
        return -1;
    }
    private static int binarySearchIterative(int[] array, int value){
        int l = 0, r = array.length - 1;
        while (l <= r){
            int mid = (l+r) / 2 ;
            if (array[mid] == value)
                return mid;
            if (array[mid] < value)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
    private static int binarySearchRecursive(int[] array, int value,int right,int left){
        if (left <= right){
            int mid = (left + right) / 2 ;
            if (array[mid] == value)
                return mid;
            if (array[mid] > value)
                return binarySearchRecursive(array, value, mid - 1, left);
            return binarySearchRecursive(array, value, right, mid + 1);
        }
        return -1;
    }
}
