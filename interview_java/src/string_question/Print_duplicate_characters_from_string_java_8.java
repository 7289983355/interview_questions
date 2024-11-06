package string_question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Print_duplicate_characters_from_string_java_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Dharmesh kumar".replaceAll("//s+", "").toLowerCase();
		Set<String> uniqueChars = new HashSet<>();
		
		Set   data =Arrays.stream(name.split("")).filter(s -> uniqueChars.add(s)).collect(Collectors.toSet());
		
		System.out.println(data);
	    
	}
}
