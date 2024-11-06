package Recusion_And_BackTracking;

public class FactorialCal {

	public static void main(String[] args) {

		System.out.println(factorial(2));

	}

	private static int factorial(int number) {

		if (number == 0) {

			return 1;
		}

		return number * factorial(number - 1);

	}

}
