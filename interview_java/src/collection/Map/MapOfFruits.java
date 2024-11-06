package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapOfFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("banana", 7);

     // Use getOrDefault
        int appleCount = map.getOrDefault("apple", 0); // Returns 3
        int orangeCount = map.getOrDefault("orange", 0); // Returns 0 (default value)
        int banana = map.getOrDefault("banana", 0); // Returns 7

        System.out.println("Apple count: " + appleCount);   // Output: Apple count: 3
        System.out.println("banana count: " + banana); // Output: Orange count:7
	}

}
