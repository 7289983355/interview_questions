package ExceptionHandling;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception caught.");
		} catch (Exception e) {
			System.out.println("Exception caught.");
		}
	}
}