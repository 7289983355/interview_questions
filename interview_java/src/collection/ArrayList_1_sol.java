package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList_1_sol {

	public static void main(String[] args) {
		// Create a List
		List<Integer> list = new CopyOnWriteArrayList();
		//List<Integer> list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {

			Integer i = itr.next();

			if (i % 2 == 0) {

				list.remove(i);
			}
		}

		System.out.println(list);
	}

}
