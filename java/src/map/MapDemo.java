package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "Cherry");
		map.put("D", "Date");
		map.put("B", "Blueberry");
		
		map.remove("A");
		
		System.out.println(map);


	}

}
