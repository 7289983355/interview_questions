package string;

public class IsPalindrome {

    public static void main(String[] args) {
        String palindromeTest = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome: " + isPalindrome(palindromeTest)); // Output: true

        String nonPalindromeTest = "Hello, World!";
        System.out.println("Is Palindrome: " + isPalindrome(nonPalindromeTest)); // Output: false
    }

    public static boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
       
        // Filter out non-letter and non-digit characters
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c)); // Convert to lowercase
            }
        }
        
        String actual = filtered.toString();
        
        // Compare the filtered string with its reverse
        return actual.equals(filtered.reverse().toString());
    }
}
