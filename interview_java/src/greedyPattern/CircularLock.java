package greedyPattern;
public class CircularLock {

    public static void main(String[] args) {
        String initial = "123";
        String target = "321";

        System.out.println("Minimum rotations: " + minRotations(initial, target));
    }

    // Method to calculate the minimum total rotations to unlock the lock
    private static int minRotations(String initial, String target) {
        int totalRotations = 0;

        // Iterate over each dial position
        for (int i = 0; i < initial.length(); i++) {
            int startDigit = initial.charAt(i) - '0'; // Convert char to int
            int targetDigit = target.charAt(i) - '0'; // Convert char to int

            // Calculate the clockwise and counterclockwise distances
            int clockwise = Math.abs(targetDigit - startDigit);
            int counterclockwise = 10 - clockwise;

            // Add the minimum of the two distances to the total rotations
            totalRotations += Math.min(clockwise, counterclockwise);
        }

        return totalRotations;
    }
}
