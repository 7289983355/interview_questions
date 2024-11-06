package array;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result); // Output: 6
    }

    private static int maxSubArray(int[] nums) {
        int currentBest = 0; 
        int overAllBest = Integer.MIN_VALUE; // Initialize to the smallest possible integer

        for (int i = 0; i < nums.length; i++) {
            currentBest += nums[i]; // Add the current element

            // If currentBest drops below zero, start a new subarray
            if (currentBest < 0) {
                currentBest = 0;
            }
            
            // Update overall best if currentBest is greater
            if (currentBest > overAllBest) {
                overAllBest = currentBest;
            }
        }
        return overAllBest;
    }
}
