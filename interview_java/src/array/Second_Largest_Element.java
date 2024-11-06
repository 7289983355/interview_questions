package array;

public class Second_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 1 };

		secondLargestNumber(arr);

	}

	private static void secondLargestNumber(int[] arr) {
		// TODO Auto-generated method stub

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > max) {
				secondMax = max;
				max = num;

			} else if (num > secondMax && num != max) {

				secondMax = num;
			}

		}

		System.out.println(max);
		System.out.println(secondMax);

	}

}
