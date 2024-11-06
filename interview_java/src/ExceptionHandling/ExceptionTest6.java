package ExceptionHandling;

public class ExceptionTest6 {
	
	public static void main(String[] args) {
		try {
			
			int b=2+3;
			System.out.println(b);
			int a = 5 / 0;
			
			String s = null;
			
			System.out.println(s.length());
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Caught an exception: " + e);
		}
	}
}
