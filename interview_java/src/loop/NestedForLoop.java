package loop;
public class NestedForLoop {
    public static void main(String[] args) {
        // Creating a 3x3 matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Row: " + i + ", Column: " + j);
            }
        }
    }
}
