package basicMath_problem;

import java.util.Arrays;

public class OptimizedSieveOfEratosthenes {

    public static void main(String[] args) {
        int n = 30; // Find all primes up to n
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p starting from p^2
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
