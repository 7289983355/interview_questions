package Recusion_And_BackTracking;

public class Reverse_a_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseNumber(1234)); // 4321
		// 4

	}

	private static int reverseNumber(int num) {
		// TODO Auto-generated method 
		int reverseNum=0;
		
		return  processReverse(num ,reverseNum); //123
		
		
	}

	private static int processReverse(int num, int reverseNum) {
		// TODO Auto-generated method stub

		if(num==0) {
			return reverseNum;
		}
		int remainder =num%10; //4   //3
		reverseNum=reverseNum*10+remainder; //4  //4*10+3 ,43
		return processReverse(num/10 ,reverseNum);
		
	}

}
