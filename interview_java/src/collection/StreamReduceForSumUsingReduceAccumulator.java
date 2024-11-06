package collection;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamReduceForSumUsingReduceAccumulator {

	public static void main(String[] args) {

		// primitive int[] array
		int[] intArray = { 17, 23, 29, 31, 37, 41, 43, 47, 53, 58 };

	//	int sum = Arrays.stream(intArray).reduce((m, n) -> m + n).getAsInt();
		int sum = Arrays.stream(intArray).reduce(Integer::sum).getAsInt();
		int max = Arrays.stream(intArray).reduce(Integer::max).getAsInt();
		int min = Arrays.stream(intArray).reduce(Integer::min).getAsInt();

		System.out.println(sum);

	}
}