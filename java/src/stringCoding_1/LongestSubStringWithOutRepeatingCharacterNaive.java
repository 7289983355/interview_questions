package stringCoding_1;

public class LongestSubStringWithOutRepeatingCharacterNaive {

	public static void main(String[] args) {
		String s = "abcabcbb";

		int n = s.length();

		// Generate all substrings
		for (int start = 0; start < n; start++) {
			System.out.println(s.charAt(start));
			for (int end = start + 1; end <= n-1; end++) {
              System.out.print(s.charAt(end));

			}
			 System.out.println();

		}
	}
}
