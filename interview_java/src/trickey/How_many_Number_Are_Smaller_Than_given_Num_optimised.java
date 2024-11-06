package trickey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class How_many_Number_Are_Smaller_Than_given_Num_optimised {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5 }; // Expected output: [2, 0, 3, 0, 4]
        System.out.println(smallerNumber(arr));
    }

    private static ArrayList<Integer> smallerNumber(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int i = 0; i < sortedArr.length; i++) {
            // Only put the count for the first occurrence
            if (!countMap.containsKey(sortedArr[i])) {
                countMap.put(sortedArr[i], i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
      
        for (int num : arr) {
            result.add(countMap.get(num));
        }

        return result;
    }
}
