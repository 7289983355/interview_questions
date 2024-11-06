package string;
public class StringImmutable {
    public static void main(String[] args) {
        String str = "abc";
        str.concat("def");
        System.out.println(str);
    }
}
