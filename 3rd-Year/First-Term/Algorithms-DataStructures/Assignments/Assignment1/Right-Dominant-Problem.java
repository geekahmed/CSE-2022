package tech.geekahmed;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
/*
    * Ahmed Moustafa
    * geekahmed1@gmail.com || ahmed.moustafa@ieee-zsb.org
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        int numbers[] = new int[]{10, 9, 5, 13, 2, 7, 1, 8, 4, 6, 3};
        System.out.println("**Basic Solutions**");
        Instant quadSolutionStart = Instant.now();
        System.out.println("Starting Time: " + formatDate(quadSolutionStart));
        System.out.println("Dominant Numbers are: ");
        basicSolution(numbers);
        Instant quadSolutionEnd = Instant.now();
        Duration quadSolutionTimeElapsed = Duration.between(quadSolutionStart, quadSolutionEnd);
        System.out.println("\nEnd Time: " + formatDate(quadSolutionEnd));
        System.out.println("Time of Execution: " + quadSolutionTimeElapsed.toString());
        System.out.println("----------------------------------------------------------");
        System.out.println("**Linear Solution**");
        Instant linearSolutionStart = Instant.now();
        System.out.println("Starting Time: " + formatDate(linearSolutionStart));
        System.out.println("Dominant Numbers are: ");
        linearSolution(numbers);
        Instant linearSolutionEnd = Instant.now();
        Duration linearSolutionTimeElapsed = Duration.between(linearSolutionStart, linearSolutionEnd);
        System.out.println("\nEnd Time: " + formatDate(linearSolutionEnd));
        System.out.println("Time of Execution: " + linearSolutionTimeElapsed);
        System.out.println("--------------------------Final Result-------------------------");
        System.out.println("Linear Time is faster than quadratic solution by: " + quadSolutionTimeElapsed.minus(linearSolutionTimeElapsed));

    }
    private static void basicSolution(int arr[]){
        for (int i = 0; i < arr.length; i++){
            int j;
            for (j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j])
                    break;
            }
            if (j == arr.length)
                System.out.print(arr[i] + " ");
        }
    }
    private static void linearSolution(int arr[]){
        ArrayList<Integer> tempList = new ArrayList<>();
        int maxFromRight =  arr[arr.length-1];
        tempList.add(maxFromRight);
        for (int i = arr.length-2; i >= 0; i--){
            if (maxFromRight <= arr[i]){
                maxFromRight = arr[i];
                tempList.add(maxFromRight);
            }
        }
        Collections.reverse(tempList);
        for(int i:tempList){
            System.out.print(i  + " ");
        }
    }
    private static String formatDate(Instant time) throws ParseException {
        return new SimpleDateFormat("HH:mm:ss.SSS").format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(time.toString()));
    }
}
