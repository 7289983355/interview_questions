package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(4, "Four");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			 System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}

}
