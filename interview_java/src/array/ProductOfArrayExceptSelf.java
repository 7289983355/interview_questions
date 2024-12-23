package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] result = productExceptSelf(nums);
		System.out.println(Arrays.toString(result)); // Output: [24, 12, 8, 6]
	}

	private static int[] productExceptSelf(int[] nums) {

		int[] output = new int[nums.length];
		
		int leftProduct=1;
		
		for (int i = 0; i < nums.length; i++) {  //4

			 output[i]=leftProduct;
			 
			 leftProduct=leftProduct*nums[i];
		
		}
		 int rightProduct=1;
		for (int j =nums.length-1 ; j >=0;j--) {  //4

			
			output[j]=output[j]*rightProduct;
			 
			rightProduct=rightProduct*nums[j];
		
		}
		return output;
		

	}
}
