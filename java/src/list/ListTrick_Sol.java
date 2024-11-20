package list;

import java.util.*;

public class ListTrick_Sol {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {

			String data = itr.next();

			if (data == "B") {
				itr.remove();
			}
		}
		System.out.println(list);
	}
}
