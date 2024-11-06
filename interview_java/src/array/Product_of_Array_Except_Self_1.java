package array;

import java.util.Vector;

public class Product_of_Array_Except_Self_1 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int product = 1;

		System.out.println(extracted(nums, product));

	}

	private static Vector<Integer> extracted(int[] nums, int product) {

		Vector<Integer> productArr = new Vector<Integer>();
		
		for(int i=0; i<nums.length;i++) {
			product=1;
			for(int j=0; j<nums.length;j++) {
				
				 if(i==j) {
					continue;
				}
				 
				 product=product*nums[j];
			}
			productArr.add(product);
		}
		return productArr;
		
	}

}
