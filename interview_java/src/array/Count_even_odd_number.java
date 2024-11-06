package array;

public class Count_even_odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 1};

		countEvenOdd(arr);

	}

	private static void countEvenOdd(int[] arr) {
		// TODO Auto-generated method stub
		int evenCount=0; int oddCount=0;
		
		for( int num :arr) {
			
			if(num%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
		}
		System.out.printf("Even Count : %d Odd Count : %d%n", evenCount ,oddCount);
		
	}

}
