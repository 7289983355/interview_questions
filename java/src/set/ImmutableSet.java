package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {

	public static void main(String[] args) {
		Set<Integer> originalSet = new HashSet<>(Set.of(1, 2, 3, 4));

		 Collections.unmodifiableSet(originalSet);
		originalSet.remove(5);

	}

}
