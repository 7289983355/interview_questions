package slidingWindow;

public class MaxVowelSubstring {

    public static void main(String[] args) {
        MaxVowelSubstring mvs = new MaxVowelSubstring();
        String s = "abciiidef";
        int k = 3;
        System.out.println("Maximum number of vowels in a substring of length " + k + ": " 
                           + mvs.maxVowels(s, k));  // Output: 3
    }

     int maxVowels(String s, int k) {
        int maxVowelCount = 0;
        int currentCount = 0;

        // Initialize the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
        }
        maxVowelCount = currentCount;

        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
          
        	  if (isVowel(s.charAt(i))) {
                  currentCount++;
              }
        	  
        	   
        	  
        System.out.println("i :" +i +" ====== " +"K " +k);
        	
        }

        return maxVowelCount;
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
