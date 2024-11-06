package ExceptionHandling;

public class ExceptionTest3 {
	
	public static void main(String[] args) {
		try {
			System.out.println("Try block");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Catch block");
		} finally {
			System.out.println("Finally block");
		}
	}
}
