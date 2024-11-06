package array;

import java.util.Arrays;

public class Reverse_An_Array {

	public static void main(String args[]) {

		int[] num = { 2, 3, 4, 5, 6, 7, 8 };

		reverse(num);
	}

	private static void  reverse(int[] num) {

		int start = 0;
		int end = num.length - 1;

		while (start < end) {

			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;

			start++;
			end--;

		}
		System.out.println(Arrays.toString(num));

	}

}
