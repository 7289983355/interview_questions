package trickey;

public class NestedLoopTest {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (i == 1 && j == 1) {
					break;
				}
				System.out.print(i + j + " ");
			}
		}
	}
}
