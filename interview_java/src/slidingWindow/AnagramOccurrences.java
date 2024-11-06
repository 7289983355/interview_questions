package slidingWindow;
import java.util.HashMap;
import java.util.Map;

public class AnagramOccurrences {

    public static void main(String[] args) {
        String str = "cbaebabacd";
        String pattern = "abc";
        System.out.println("Number of anagram occurrences: " + countAnagrams(str, pattern));
    }

    public static int countAnagrams(String str, String pattern) {
        int count = 0;
        int patternLength = pattern.length();
        int strLength = str.length();

        if (strLength < patternLength) {
            return count;
        }

        // Create frequency maps for the pattern and the first window of the string
        Map<Character, Integer> patternCount = new HashMap<>();
        Map<Character, Integer> windowCount = new HashMap<>();

        // Initialize the frequency map for the pattern
        for (char c : pattern.toCharArray()) {
            patternCount.put(c, patternCount.getOrDefault(c, 0) + 1);
        }

        // Initialize the first window
        for (int i = 0; i < patternLength; i++) {
            char c = str.charAt(i);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);
        }

        // Compare the frequency maps for the first window
        if (patternCount.equals(windowCount)) {
            count++;
        }

        // Slide the window across the string
        for (int i = patternLength; i < strLength; i++) { //patterLen
            char newChar = str.charAt(i);
            char oldChar = str.charAt(i - patternLength);

            // Add the new character to the window
            windowCount.put(newChar, windowCount.getOrDefault(newChar, 0) + 1);

            // Remove the old character from the window
            windowCount.put(oldChar, windowCount.get(oldChar) - 1);
            if (windowCount.get(oldChar) == 0) {
                windowCount.remove(oldChar);
            }

            // Compare the frequency maps
            if (patternCount.equals(windowCount)) {
                count++;
            }
        }

        return count;
    }
}
