package tech.geekahmed;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> candidates = new ArrayList<>(Arrays.asList(2, 4, 6, 3, 9, 5, 7, 8));
        if(args == null){
            System.out.println("You didn't specify the list of candidates");
            return;
        }
        if (args.length != 0)
            for (String candidate: args)
                candidates.add(Integer.parseInt(candidate));
        System.out.printf("Rank order in which candidates come in: %s%n", candidates.toString());
        System.out.printf("Number of hired candidates: %d%n", hireAssistant(candidates));
    }
    /*
        * Start by dummy least qualified.
        * Loop over each candidate and interviewing them. ( We simulated the interview by the biggest number in the array )
        * If the Candidate is better than the current one, then hire him. ( Best metric is defined by the program scope, here we defined it to be bigger in number)
     */
    private static int hireAssistant(ArrayList<Integer> candidates) {
        int bestCandidate = 0;
        int numberOfHiredAssistants = 0;
        for (int candidate : candidates) {
            if (candidate > bestCandidate) {
                bestCandidate = candidate;
                numberOfHiredAssistants++;
            }
        }
        return numberOfHiredAssistants;
    }
}
