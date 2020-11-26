import java.util.Arrays;

public class BinarySearchComparison {
    public static void main(String[] args) {
        int[] randArray = new int[1000];
        for(int i = 0; i < 1000; i++){
            randArray[i] = (int)(Math.random()*350000);
        }
        Arrays.sort(randArray);
        int countComparisons = 0;
        for(int i = 0 ; i < 100 ; i++){
            int randomKey = (int)(Math.random()*350000);
            int left = 0, right = randArray.length - 1 ;
            while (left <= right){
                int mid = (left + right) / 2 ;
                if (randArray[mid] == randomKey)
                    break;
                if (randArray[mid] < randomKey)
                    left = mid + 1;
                else
                    right = mid - 1;
                countComparisons++;
            }
        }
        System.out.println("Number of comparisons: " + countComparisons);
    }
}
