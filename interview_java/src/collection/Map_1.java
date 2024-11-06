package collection;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String ,Integer> map =new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("A", 4);
		
		System.out.println(map.get("A"));

	}

}
