package interview_java_8;

import java.util.Arrays;


public class Sum_Array_2 {

	public static void main(String args[]) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

		System.out.println(sum);

	}

}
