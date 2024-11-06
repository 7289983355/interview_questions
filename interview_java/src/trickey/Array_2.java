package trickey;

import java.util.Arrays;

public class Array_2 {
	
	static int[] arr;
	static int[] arr1= {4,5,6};

	public Array_2() {
		
		arr=arr1;
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array_2 array_2= new Array_2();
		System.out.println(Arrays.toString(array_2.arr));
	}

}
