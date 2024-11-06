package array;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7,8,9 };
        rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num + " "); // Output: 5 6 7 1 2 3 4 
        }
    }

    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Normalize k to avoid extra rotations

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap the elements
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            
        }
    }
}