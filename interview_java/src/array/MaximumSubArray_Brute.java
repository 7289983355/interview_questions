package array;

public class MaximumSubArray_Brute {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = maxSubArray(nums);
		System.out.println("Maximum Subarray Sum: " + result); // Output: 6
	}

	private static int maxSubArray(int[] nums) {

		int maxSum = Integer.MIN_VALUE;
		int currentmax = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			currentmax = 0;
			for (int j =i ; j < nums.length; j++) {

				currentmax =currentmax+nums[j];

				if (maxSum < currentmax) {
					maxSum = currentmax;
				}

			}
		}

		return maxSum;
	}

}
