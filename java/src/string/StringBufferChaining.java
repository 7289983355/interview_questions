package string;
public class StringBufferChaining {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Start");
        sb.append("  ").append("End").insert(6, "Middle");
        System.out.println(sb);
    }
}
