package slidingWindow;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anagrams {
	// Problem: Given two strings s1 and s2, return true if s2 contains a
	// permutation of s1.
	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		System.out.println(find_anagrams(p, s)); // Output: true
	}

	private static boolean find_anagrams(String p, String s) {
		// Prepare a frequency map for s1
		Map<Character, Integer> map = new HashMap<>();
		for (char character : p.toCharArray()) {
			map.put(character, map.getOrDefault(character, 0) + 1);
		}

		// Create a frequency map for the sliding window in s2
		Map<Character, Integer> windowMap = new HashMap<>();

		int count = 0;
		// Loop through s2 using a for loop
		for (int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

			// get the one one character and make map frequency to zero if character is
			// found in the map
			if (map.containsKey(c)) {
				map.put(c, 0);
			}

			if (end >= p.length() - 1) { // lenght =3 ,012
				// System.out.println("Window size is Hit do calculation:");

				// if size is hit check for the map frequency value if all are zero an anagram
				// is found
				// increase the count
				boolean b = checkAlltheValuinmapPareZero(map);
				if (b) {

					count++;
				}
				
				windowMap.remove(windowMap);
				
			


			}

		}
		return false;
	}

	private static boolean checkAlltheValuinmapPareZero(Map<Character, Integer> map) {
		// TODO Auto-generated method stub

		Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Character, Integer> c = itr.next();

			if (c.getValue() == 0) {

				return true;
			}
		}

		return false;
	}
}
