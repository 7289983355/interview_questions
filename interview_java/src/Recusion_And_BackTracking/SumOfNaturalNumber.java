package Recusion_And_BackTracking;

public class SumOfNaturalNumber {

	public static void main(String[] args) {

		System.out.println(printSum(1));

	}

	private static int printSum(int number) {

		if (number == 10) {

			return number;
		}

		return number + printSum(number + 1);

	}

}