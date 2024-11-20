package keyWords;
public class Example10 {
    static int staticField = initializeStaticField();

    static {
        System.out.println("Static block executed.");
    }

    public Example10() {
        System.out.println("Constructor executed.");
    }

    static int initializeStaticField() {
        System.out.println("Static field initialized.");
        return 42;
    }

    public static void main(String[] args) {
        Example10 obj = new Example10();
    }
}
