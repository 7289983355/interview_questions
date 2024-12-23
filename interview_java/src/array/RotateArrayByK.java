package array;

import java.util.Arrays;

public class RotateArrayByK {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(Arrays.toString(rotateArrayByK(nums, 3)));

	}

	private static int[] rotateArrayByK(int[] nums, int k) {

		// rotate the P1 (1,2,3,4) =>0, and P2(5,6,7) ->array.length-K -array.length-1

		
		//The condition k = nums.length % k; should be k = k % nums.length;
		//to handle cases where k is greater than the length of the array.
	
		k = k % nums.length;

		rotate(nums, 0, nums.length - k - 1);
		rotate(nums, nums.length - k, nums.length - 1);
		rotate(nums, 0, nums.length - 1);

		return nums;

	}

	private static void rotate(int[] nums, int start, int end) {
		// TODO Auto-generated method stub

		while (start < end) {

			int temp = nums[start];

			nums[start] = nums[end];
			nums[end] = temp;
			
			end--;
			start++;
		}

	}

}
