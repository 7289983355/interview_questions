package interview_java_8;

import java.util.Arrays;

public class Array_min_Max {

	public static void main(String args[]) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9,8,6 };

	int max=numbers[0];
	
	int min=numbers[0];
	
	for(int i=1 ;i<numbers.length ;i++) {
		
		if(max<numbers[i]) {
			
			max=numbers[i];
			
		}else if (min>numbers[i]){
			
			min =numbers[i];
		}
		
	}
		
	System.out.println(max);	
	System.out.println(min);
	}

}
