package loop;

public class Printood {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue; // Skip even numbers
			}
			System.out.println(i); // Prints only odd numbers
		}

	}

}
