package basicMath_problem;

public class CheckForPrime {

    public static void main(String[] args) {
        System.out.println(checkForPrime(99)); // Should print false
        System.out.println(checkForPrime(37)); // Should print true
        System.out.println(checkForPrime(2));  // Should print true
        System.out.println(checkForPrime(1));  // Should print false
    }

    private static boolean checkForPrime(int number) {
        // Base case
        if (number <= 1) {
            return false; // 1 and below are not prime
        }
        if (number == 2) {
            return true;  // 2 is prime
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }
}
