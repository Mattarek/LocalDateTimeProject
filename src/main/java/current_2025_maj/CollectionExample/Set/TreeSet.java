package current_2025_maj.CollectionExample.Set;

//3. TreeSet<E>
//✅ Używać: Tak, gdy potrzebne jest automatyczne sortowanie
//📌 Kiedy: Potrzebujesz posortowanego zbioru (np. listy użytkowników według ID)

//✅ Zalety:
//	- Utrzymuje porządek rosnący
//	- Wspiera operacje zakresowe (np. subSet)

//⚠️ Wady:
//	- Wolniejszy niż HashSet (O(log n))
//	- Wymaga Comparable lub Comparator

import java.util.Set;

public class TreeSet {
	public static void main(final String[] args) {
		final Set<Integer> sortedSet = new java.util.TreeSet<>();
		sortedSet.add(4);
		sortedSet.add(9);
		sortedSet.add(8);
		sortedSet.add(7);
		sortedSet.add(1);
		sortedSet.add(2);
		System.out.println(sortedSet);
	}
}
