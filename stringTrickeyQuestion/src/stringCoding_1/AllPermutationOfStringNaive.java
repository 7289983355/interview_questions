package stringCoding_1;

public class AllPermutationOfStringNaive {

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        System.out.println(compress(input));  // Output: a2b1c5a3
    }

    private static String compress(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;  // Start with 1 because we are counting the current character

        for (int i = 1; i < input.length(); i++) {
            // If current character is the same as the previous one, increase the count
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // Append the character and its count (if greater than 1)
                sb.append(input.charAt(i - 1));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;  // Reset count for the new character
            }
        }

        // Append the last character and its count (handle the last group)
        sb.append(input.charAt(input.length() - 1));
        if (count > 1) {
            sb.append(count);
        }

        return sb.toString();
    }
}
