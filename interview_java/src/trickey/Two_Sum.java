package trickey;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {

		int[] num = { 2, 7, 11, 15 };
		int target = 9;
		int [] arr=two_Sum(num, target);
		
		System.out.printf("{%d, %d}\n", arr[0], arr[1]);


	}

	private static int [] two_Sum(int[] num, int target) {
		
		Map<Integer ,Integer>  map=new HashMap<>();
		
		for(int i=0 ;i<num.length ;i++) {
			
			int complement=target-num[i];
			
			if(map.containsKey(complement)) {
				
				return new int[] {map.get(complement), i};

			
			}
			map.put(num[i], i);
	
		}
		return num;

	}

}
