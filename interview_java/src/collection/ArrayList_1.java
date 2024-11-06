package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {

	public static void main(String[] args) {
		// Create a List
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		for (int data : list) {

			if (data % 2 == 0) {

				list.remove(data);
			}
		}

	}

}
