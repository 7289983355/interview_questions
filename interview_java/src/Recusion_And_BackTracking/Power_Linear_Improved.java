package Recusion_And_BackTracking;

public class Power_Linear_Improved {

    public static void main(String[] args) {
        System.out.println(power(4, 2));  // Should print 16
        System.out.println(power(4, 3));  // Should print 64
        System.out.println(power(2, 5));  // Should print 32
        System.out.println(power(4, 0));  // Should print 1
    }

    public static int power(int x, int n) {
        // Base case: any number to the power of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: Calculate half power
        int halfPower = power(x, n / 2);
        int fullPower = halfPower * halfPower;

        // If n is odd, multiply by x once more
        if (n % 2 == 1) {
            return fullPower * x; // Adjust for odd exponent
        }

        return fullPower; // Return result for even exponent
    }
}
