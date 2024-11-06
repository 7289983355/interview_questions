package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Permutation_in_String {
    // Problem: Given two strings s1 and s2, return true if s2 contains a permutation of s1.
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        boolean result = helper(s1, s2);
        System.out.println(result); // Output: true
    }

    private static boolean helper(String s1, String s2) {
        // Prepare a frequency map for s1
        Map<Character, Integer> map = new HashMap<>();
        for (char character : s1.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        int required = map.size(); // Number of unique characters in s1
        int formed = 0; // To track how many unique characters match

        // Create a frequency map for the sliding window in s2
        Map<Character, Integer> windowMap = new HashMap<>();

        // Loop through s2 using a for loop
        for (int end = 0; end < s2.length(); end++) {
            char c = s2.charAt(end);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            // Check if the character matches the required frequency
            if (map.containsKey(c) && windowMap.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }

            // When the window size matches the size of s1
            if (end >= s1.length() - 1) {
                // If all characters match, we found a permutation
                if (formed == required) {
                    return true;
                }

                // Move the start of the window
                char charToRemove = s2.charAt(end - (s1.length() - 1));
                windowMap.put(charToRemove, windowMap.get(charToRemove) - 1);
                
                // If the frequency goes to zero, we need to remove it from the map
                if (map.containsKey(charToRemove) && windowMap.get(charToRemove).intValue() < map.get(charToRemove).intValue()) {
                    formed--;
                }
            }
        }

        return false; // No permutation found
    }
}
