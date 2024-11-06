package ExceptionHandling;
public class ExceptionTest9 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 1; // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Some other exception");
        }
        
        
    }
}
