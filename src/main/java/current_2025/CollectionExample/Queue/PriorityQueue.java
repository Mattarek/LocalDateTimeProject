package current_2025.CollectionExample.Queue;

import java.util.Queue;

public class PriorityQueue {
	//✅ Używać: Gdy potrzebujesz kolejek z priorytetami
	//📌 Kiedy: Zadania z różnym priorytetem (np. system zadań)
	//✅ Zalety:
	//	- Automatyczne sortowanie elementów
	//
	//⚠️ Wady:
	//	- Brak gwarancji kolejności iteracji
	//	- Wymaga Comparable lub Comparator

	public static void main(final String[] args) {
		final Queue<Integer> pq = new java.util.PriorityQueue<>();
		pq.add(3);
		pq.add(1);
		pq.add(2);
	}
}
