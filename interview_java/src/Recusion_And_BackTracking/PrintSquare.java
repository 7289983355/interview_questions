package Recusion_And_BackTracking;

public class PrintSquare {

	public static void main(String[] args) {

		System.out.println(printSquare(5, 3));

	}

	private static int printSquare(int number, int power) {

		if (power == 0) {
			return 1;
		}

		return number * printSquare(number, power - 1);

	}

}