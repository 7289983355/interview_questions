package stringCoding_1;
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(input));  // Output: 3
    }

    // Naive approach to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Generate all substrings
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
            	System.out.println((char)s.charAt(start) + (char)s.charAt(end-1));
            }
        }

        return maxLength;
    }

    // Helper function to check if a string has all unique characters
    private static boolean hasUniqueCharacters(String s) {
        boolean[] seen = new boolean[256];  // Array to track characters (ASCII)
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen[c]) {
                return false;  // Repeating character found
            }
            seen[c] = true;
        }
        
        return true;
    }
}
