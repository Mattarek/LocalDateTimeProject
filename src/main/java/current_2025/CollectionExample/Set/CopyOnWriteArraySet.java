package current_2025.CollectionExample.Set;

import java.util.Set;

//4. CopyOnWriteArraySet<E>
//🟡 Używać: Tylko w środowiskach wielowątkowych z dużą liczbą odczytów
//📌 Kiedy: Lista subskrybentów, event listenerów itp.

//✅ Zalety:
//	- Bezpieczny dla wielu wątków bez synchronizacji
//	- Brak ryzyka ConcurrentModificationException

//⚠️ Wady:
//	- Bardzo kosztowne modyfikacje – kopiuje całą tablicę przy każdej zmianie

public class CopyOnWriteArraySet {
	public static void main(final String[] args) {
		final Set<String> cowSet = new java.util.concurrent.CopyOnWriteArraySet<>();
		cowSet.add("X");
		cowSet.add("V");
	}
}
