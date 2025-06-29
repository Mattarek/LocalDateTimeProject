package current_2025_maj.CollectionExample.Set;

import java.util.Set;

//2. LinkedHashSet<E>
//✅ Używać: Tak, gdy zależy Ci na kolejności dodawania
//📌 Kiedy: Gdy chcesz zachować kolejność wstawiania, ale nadal unikalność

//✅ Zalety:
//	- Zachowuje kolejność
//	- Nadal szybki dostęp (O(1))

//⚠️ Wady:
//	- Trochę wolniejszy niż HashSet

public class LinkedHashSet {
	public static void main(final String[] args) {
		final Set<String> linkedSet = new java.util.LinkedHashSet<>();
	}
}
