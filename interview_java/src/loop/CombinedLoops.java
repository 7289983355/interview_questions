package loop;

public class CombinedLoops {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Outer Loop Iteration: " + i);
			for (int j = 0; j < 3; j++) {
				System.out.println("  Inner Loop Iteration: " + j);
			}
		}
	}
}
