package string;
public class StringFormat {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        String formatted = String.format("%s is %d years old.", name, age);
        System.out.println(formatted);
    }
}
