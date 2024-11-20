package set;

import java.util.HashSet;
import java.util.Set;

public class SeDemo {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Set.of(2, 3, 5));

		set1.retainAll(set2);
		System.out.println(set1);

	}

}
