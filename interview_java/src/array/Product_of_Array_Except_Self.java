package array;

import java.util.Vector;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int product = 1;

		System.out.println(extracted(nums, product));

	}

	private static Vector<Integer> extracted(int[] nums, int product) {

		Vector<Integer> productArr = new Vector<Integer>();
		if (nums.length == 0) {
			return null;
		}

		for (int p : nums) {
			product *= p;
		}

		for (int p : nums) {

			productArr.add(product / p);
			
			//product=product*p;
		}
		return productArr;
	}

}
