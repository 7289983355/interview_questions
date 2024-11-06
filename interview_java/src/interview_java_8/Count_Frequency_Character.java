package interview_java_8;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_Character {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day";

		char[] character = inputString.toCharArray();

		Map<Character, Integer> frequeryMap = new HashMap<Character, Integer>();

		for (Character c : character) {

			if (!frequeryMap.containsKey(c)) {
				frequeryMap.put(c, 1);
			} else {
				frequeryMap.put(c, frequeryMap.get(c)+1);
			}

		}
		System.out.println(frequeryMap);
	}

}
