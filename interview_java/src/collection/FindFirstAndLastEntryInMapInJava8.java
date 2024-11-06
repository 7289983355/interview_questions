package collection;

import java.util.HashMap;
import java.util.Map;

public class FindFirstAndLastEntryInMapInJava8 {

	public static void main(String[] args) {

		// local variables
		Map.Entry<Integer, String> firstEntry = null,lastEntry = null;

		// create HashMap object
		Map<Integer, String> companies = new HashMap<>();

		// add entries to newly created HashMap
		companies.put(1, "Amazon");
		companies.put(2, "Microsoft");
		companies.put(3, "Google");
		companies.put(4, "Apple");
		companies.put(5, "Meta");

		firstEntry = companies.entrySet().stream().findFirst().get();
		
		System.out.println(firstEntry);
		
		lastEntry=companies.entrySet().stream().reduce((a,b) ->b).get();
		
		System.out.println(lastEntry);

	}
}
