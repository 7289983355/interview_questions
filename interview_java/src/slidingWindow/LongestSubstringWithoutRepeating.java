package slidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }

    private static int lengthOfLongestSubstring(String input) {
        HashSet<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < input.length(); end++) {
            // If the character is already in the set, move the start pointer
            while (charSet.contains(input.charAt(end))) {
                charSet.remove(input.charAt(start));
                start++;
            }
            // Add the new character to the set
            charSet.add(input.charAt(end));
            // Update the max length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
