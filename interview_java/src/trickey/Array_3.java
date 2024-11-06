package trickey;

import java.util.HashMap;
import java.util.Map;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = { 1, 2, 3, 4, 5,2, 3, 4, 5,2, 3, 4, 5};
		
		Map<Integer,Integer> countMap=new HashMap<Integer,Integer>();
		
		for( int number:numbers) {
			
			if(!countMap.containsKey(number)) {
				
				countMap.put(number, 1);
			}else {
				countMap.put(number,countMap.get(number)+1);
			}
			
		}
		countMap.forEach((k,v) ->System.out.println("Count of " +k+" is " +v));
	}

}
