package keyWords;
public class Example3 {
    static {
        System.out.println("Static block executing...");
        int x = 5 / 0; // Division by zero exception
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
