package basicMath_problem;

public class Prime_Number_Generation_practice {

	public static void main(String[] args) {
		prime_Number_Generation(10);
	}

	private static void prime_Number_Generation(int number) {
		// Base case: Check for primes up to the given number
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int num) {

		if (num <= 1) { // 0,1
			return false;
		}

		if (num == 2) { // 2
			return true;
		}
		 if (num % 2 == 0) { // Exclude even numbers greater than 2
	            return false;
	        }
		for (int i = 3; i <= Math.sqrt(num); i += 2) {

			if (num % i == 0) {
				return false;
			}

		}

		return true;

	}
}
