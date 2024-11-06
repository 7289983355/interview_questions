package array;
public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "  Hello World   ";

        // Remove leading and trailing spaces and ensure single spaces between words
        String result = removeExtraSpaces(str);
        
        System.out.println(result); // Output: "Hello World"
    }

    private static String removeExtraSpaces(String str) {
        // Trim leading and trailing spaces, split by whitespace, and join with a single space
        return String.join(" ", str.trim().split("\\s+"));
    }
}
