package map;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(4, "Four");
		
		
		map.forEach((k,v) -> System.out.println(k +" => " +v));


	}

}
