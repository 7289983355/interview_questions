package string_question;

import java.util.LinkedHashSet;

public class Remove_the_Duplicate_From_String_Maintaing_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "programming";
		String result = removeDuplicates(input);
		System.out.println("Original: " + input);
		System.out.println("Without duplicates: " + result);

	}

	private static String removeDuplicates(String input) {
		// TODO Auto-generated method stub
		// create a new Character LinkedHashSet

		LinkedHashSet<Character> charSet = new LinkedHashSet<>();

		for (int i = 0; i < input.length(); i++) {
			
			charSet.add(input.charAt(i));

		}
		
		StringBuilder s= new StringBuilder();
		
		for(Character c:charSet) {
			
			s.append(c);
		}
		

		return s.toString();
	}

}
