package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharTest {

    public static void main(String[] args) {
        // Test cases
        String uniqueCharTest1 = "leetcode";
        System.out.println("First Unique Char Index: " + firstUniqChar(uniqueCharTest1)); // Output: 0

        String uniqueCharTest2 = "dharmeesh";
        System.out.println("First Unique Char Index: " + firstUniqChar(uniqueCharTest2)); // Output: 0

        String uniqueCharTest3 = "aabbcccddeer";
        System.out.println("First Unique Char Index: " + firstUniqChar(uniqueCharTest3)); // Output: -1

        String uniqueCharTest4 = ""; // Edge case: empty string
        System.out.println("First Unique Char Index: " + firstUniqChar(uniqueCharTest4)); // Output: -1
    }

    private static int firstUniqChar(String uniqueCharTest) {
        // Prepare a frequency map using LinkedHashMap to maintain order
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : uniqueCharTest.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (int i = 0; i < uniqueCharTest.length(); i++) {
            if (frequencyMap.get(uniqueCharTest.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }
}
