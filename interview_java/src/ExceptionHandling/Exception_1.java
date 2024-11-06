package ExceptionHandling;

public class Exception_1 {

	public static void main(String[] args) {
		try {
			System.out.println("TRY");
			throw new RuntimeException("RuntimeException in Try");
		} catch (Exception e) {

		} finally {
			try {
			System.out.println("Finally");
			throw new RuntimeException("RuntimeException in Finally");
			} catch (Exception e) {

			}

		}

	}

}
