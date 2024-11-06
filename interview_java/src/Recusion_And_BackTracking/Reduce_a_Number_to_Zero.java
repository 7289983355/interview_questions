package Recusion_And_BackTracking;

public class Reduce_a_Number_to_Zero {

    public static void main(String[] args) {
        int number = 8;
        System.out.println("Steps to reduce " + number + " to zero: " + steps(number));
    }

    private static int steps(int number) {
        // Base case
        if (number == 0) {
            return 0; // Return 0 steps when number is zero
        }

        if (number % 2 == 0) {
            return 1 + steps(number / 2); // Increment step count and call with halved number
        } else {
            return 1 + steps(number - 1); // Increment step count and call with decremented number
        }
    }
}
