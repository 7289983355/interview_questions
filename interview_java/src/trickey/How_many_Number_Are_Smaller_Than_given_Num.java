package trickey;

import java.util.ArrayList;

public class How_many_Number_Are_Smaller_Than_given_Num {

    public static void main(String[] args) {

      //  int[] arr = { 3, 1, 4, 1, 5 }; // Expected output: [2, 0, 3, 0, 4]
       // int[] arr = {2, 2, 2, 2};
        int[] arr = {2, 2, 2, 2};
        
        System.out.println(smallerNumber(arr));
    }

    private static ArrayList<Integer> smallerNumber(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            int count = 0;  // Reset count for every element

            // Compare with every other element to count smaller numbers
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }

            // Add the count to the result list
            result.add(count);
        }

        return result;
    }
}
