package current_2025_maj.CollectionExample.Set;

//🔷 Set – zbiór (brak duplikatów)
//1. HashSet<E>
//✅ Używać: Tak, domyślna i najczęściej stosowana implementacja
//📌 Kiedy: Gdy chcesz unikalne elementy i nie zależy Ci na kolejności

//✅ Zalety:
//	- Bardzo szybki dostęp (O(1))
//	- Dobrze działa na dużych zbiorach

//⚠️ Wady:
//	- Brak gwarancji kolejności
//	- Wymaga poprawnego hashCode() i equals()

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(final String[] args) {
		final Set<String> strings = new HashSet<>();
		final Set<String> stringsTwo = new HashSet<>();
		stringsTwo.add("c");
		stringsTwo.add("z");
		stringsTwo.add("x");
		strings.add("B");
		strings.add("C");
		stringsTwo.remove("x");
		strings.addAll(stringsTwo);
		System.out.println(strings);
	}
}
