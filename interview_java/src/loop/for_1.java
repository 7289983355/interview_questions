package loop;

public class for_1 {

	public static void main(String[] args) {
		outerLoop: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break outerLoop; // Exits the outer loop
				}
				System.out.println("i: " + i + ", j: " + j);
			}
		}

	}

}
