package string_question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Dharmesh";
		firstNonRepeatingChar(str);

	}

	private static void firstNonRepeatingChar(String str) {
		// TODO Auto-generated method stub
		
		Map<Character ,Long>  map =str.chars().mapToObj(c ->  (char)c)
		           .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()));
		
	Character c=	map.entrySet().stream()
		.filter(entry ->entry.getValue()>1).map(x ->x.getKey()).findFirst().get();
	
	System.out.println(c);
		           
		
	}

}
