package Recusion_And_BackTracking;

public class Println_1_to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumber(10);

	}

	static void printNumber(int n) {
		if(n==0)return;
		printNumber(n - 1);
		System.out.println(n);

	}

}
