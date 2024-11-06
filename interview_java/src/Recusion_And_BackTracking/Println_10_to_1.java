package Recusion_And_BackTracking;

public class Println_10_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumber(10);

	}

	static void printNumber(int n) {
		if(n==0)return;
		System.out.println(n);
		printNumber(n - 1); 
	}

}
