package loop;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int[] numbers = { 4, 6, 7, 8, 9, 1, 2, 3 };
        isPrime(numbers);
    }

    private static void isPrime(int[] numbers) {
        for (int num : numbers) {
            if (num < 2) {
                System.out.println(num + " is NOT Prime");
                continue; // Skip numbers less than 2
            }

            boolean isPrime = true; // Assume the number is prime

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, so it's not prime
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is NOT Prime");
            }
        }
    }
}
