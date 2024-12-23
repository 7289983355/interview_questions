package loop;
public class DynamicIterations {
    public static void main(String[] args) {
        int iterations = 10; // Initial number of iterations

        for (int i = 0; i < iterations; i++) {
            System.out.println("Iteration: " + i);
            if (i == 5) {
                // Extend iterations when i reaches 5
                iterations += 5; // Increase total iterations by 5
            }
        }
    }
}
