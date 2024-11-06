package greedyPattern;

import java.util.Arrays;

public class AssignMiceToHoles {

    public static void main(String[] args) {
        int[] mice = {4, -4, 2}; // Positions of mice
        int[] holes = {4, 0, 5}; // Positions of holes

        System.out.println("Minimum maximum time: " + minTimeToAssignHoles(mice, holes));
    }

    // Method to calculate the minimum maximum time to assign mice to holes
    private static int minTimeToAssignHoles(int[] mice, int[] holes) {

        Arrays.sort(mice);
        Arrays.sort(holes);

        int maxTime = 0;

        // Compare each mouse with the corresponding hole in sorted order
        for (int i = 0; i < mice.length; i++) {
            maxTime = Math.max(maxTime, Math.abs(mice[i] - holes[i]));
        }

        return maxTime;
    }
}
