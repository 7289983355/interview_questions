package ExceptionHandling;

public class ExceptionTest4 {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception caught in main.");
		}
	}

	public static void method() throws Exception {
		throw new Exception();
	}
}
