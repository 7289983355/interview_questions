package stringCoding_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterOccurance {

    public static void main(String[] args) {
        String str = "dharmesh kumar";
        countOccurance(str);
    }

    private static void countOccurance(String str) {
        Map<Character, Integer> frequencyCount = new LinkedHashMap<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Use getOrDefault to handle characters not yet in the map
            frequencyCount.put(c, frequencyCount.getOrDefault(c, 0) + 1);
        }

        // Print the character counts
        frequencyCount.forEach((k, v) -> System.out.println("Key: " + k + " : Value: " + v));
    }
}
