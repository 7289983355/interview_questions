package basicMath_problem;

public class Prime_Number_Generation {

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
        // Handle base cases
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (num == 2) {
            return true; // 2 is prime
        }
        if (num % 2 == 0) {
            return false; // Exclude even numbers greater than 2
        }

        // Check for factors from 3 to the square root of num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }
}
