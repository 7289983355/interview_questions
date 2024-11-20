package list;

import java.util.*;

public class ListTrick {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		
		for (String item : list) {
			if (item.equals("B")) {
				list.remove(item); // What will happen?
			}
		}
		System.out.println(list);
	}
}
