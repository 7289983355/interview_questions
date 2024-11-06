package trickey;

public class Sample_1 {

	public static void main(String args[]) {

		try {
			int a = 10 / 0; // This line throws ArithmeticException
			System.out.println(a); // This line is not executed
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught"); // This line is executed
		}

	}
}
