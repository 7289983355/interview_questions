package ExceptionHandling;

class MyException extends Exception {
	
	public MyException(String message) {
		super(message);
	}
}



public class ExceptionTest5 {
	
	public static void main(String[] args) {
		try {
			throw new MyException("Custom exception occurred");
		
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}