package list;

import java.util.*;

public class NullList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A", null, "B", null, "C"));
		System.out.println(list.indexOf(null));
	}
}
