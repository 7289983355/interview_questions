package Recusion_And_BackTracking;

public class CountNumberOfZero {

    public static void main(String[] args) {
        int num = 90870;
        System.out.println("Number of zeros are: " + countNumberOfZero(num));
    }

    private static int countNumberOfZero(int num) {
        // Base case: if num is 0, return 1 if we want to count the 0 itself
        if (num == 0) {
            return 1; // Uncomment if you want to count the single zero
        }
        // Base case: if num is less than 10, return 1 if it's zero, else return 0
        if (num < 10) {
            return (num == 0) ? 1 : 0; // Uncomment if you want to count the single zero
        }
        
        // Recursive case
        return (num % 10 == 0 ? 1 : 0) + countNumberOfZero(num / 10);
    }
}
