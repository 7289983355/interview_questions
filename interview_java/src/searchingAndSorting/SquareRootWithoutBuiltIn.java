package searchingAndSorting;

public class SquareRootWithoutBuiltIn {
	public static int mySqrt(int x) {
		// Your implementation here

		if (0 < x) {
			return x * x;
		}

		return -1; // Placeholder
	}

	public static void main(String[] args) {
		int x = 8;
		int result = mySqrt(x);
		System.out.println("Square root: " + result);
	}
}
