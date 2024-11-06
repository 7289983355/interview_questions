package Recusion_And_BackTracking;

public class PrintSquareOptimized {

    public static void main(String[] args) {
        System.out.println(printSquare(5, 4)); // Outputs 625
        System.out.println(printSquare(2, 10)); // Outputs 1024
        System.out.println(printSquare(3, 5)); // Outputs 243
    }

    private static int printSquare(int number, int power) {
        if (power == 0) {
            return 1; // Base case: any number raised to the power of 0 is 1
        }

        // Recursively calculate the half power
        int halfPower = printSquare(number, power / 2);
        int result = halfPower * halfPower; // Square the half power

        // If power is odd, multiply by the number one more time
        if (power % 2 != 0) {
            result *= number;
        }

        return result;
    }
}
