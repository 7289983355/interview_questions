package searchingAndSorting;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static int[] findFirstAndLast(int[] nums, int target) {
        // Initialize result array
        int[] result = {-1, -1};

        // Find the first position
        result[0] = findPosition(nums, target, true);
        // Find the last position
        result[1] = findPosition(nums, target, false);

        return result;
    }

    // Helper method to find the position
    private static int findPosition(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int position = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
 
            if (nums[mid] == target) {
                position = mid; // Found the target
                if (findFirst) {
                    end = mid - 1; // Search left for the first occurrence
                } else {
                    start = mid + 1; // Search right for the last occurrence
                }
            } else if (nums[mid] < target) {
                start = mid + 1; // Move right
            } else {
                end = mid - 1; // Move left
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = findFirstAndLast(nums, target);
        System.out.println("First and Last Position: " + Arrays.toString(result));
    }
}
