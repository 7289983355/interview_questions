package stringCoding_1;

public class CheckStringhasUniqueCharacters {

	public static void main(String[] args) {

		boolean[] seen = new boolean[256];

		System.out.println(hasUniqueCharacters("dharmes", seen));

	}

	private static boolean hasUniqueCharacters(String s, boolean[] seen) {

		for (int i = 0; i < s.length(); i++) {

			if (seen[s.charAt(i)]) {

				return false;
			}
			seen[s.charAt(i)] = true;
		}

		return true;

	}

}