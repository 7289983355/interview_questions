package greedyPattern;

import java.util.Arrays;

public class Shop_in_a_Candy_Store {

    public static void main(String[] args) {
        int[] candies = {3, 2, 1, 4};
        int k = 2; // Number of free candies per candy bought
        int n = candies.length; // Total number of candies in the store

        // Sort the candies in ascending order
        Arrays.sort(candies); // {1, 2, 3, 4}

        System.out.println("Minimum amount: " + minAmountToInvest(candies, k, n));
        System.out.println("Maximum amount: " + maxAmountToInvest(candies, k, n));
    }

    // Method to calculate the maximum amount to invest
    private static int maxAmountToInvest(int[] candies, int k, int n) {
        int start = n - 1; // Start from the most expensive candy
        int end = 0; // Track the free candies taken from the beginning
        int maxAmount = 0;

        while (start >= end) {
            maxAmount += candies[start]; // Buy the most expensive candy
            end += k; // Get 'k' cheapest candies for free
            start--; // Move to the next expensive candy
        }
        return maxAmount;
    }

    // Method to calculate the minimum amount to invest
    private static int minAmountToInvest(int[] candies, int k, int n) {
        int start = 0; // Start from the cheapest candy
        int end = n - 1; // Track the free candies taken from the end
        int minAmount = 0;

        while (start <= end) {
            minAmount += candies[start]; // Buy the cheapest candy
            end -= k; // Get 'k' most expensive candies for free
            start++; // Move to the next cheapest candy
        }
        return minAmount;
    }
}
