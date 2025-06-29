package current_2025_maj.CollectionExample.Queue;

//4. ConcurrentLinkedQueue<E>
//✅ Używać: W środowiskach wielowątkowych bez blokowania
//📌 Kiedy: Praca równoległa bez konieczności czekania
//
//✅ Zalety:
//	- Wysoka wydajność
//	- Brak blokad
//
//⚠️ Wady:
//	- Brak gwarancji pełnego porządku
//	- Brak kontroli nad pojemnością

import java.util.Queue;

public class ConcurrentLinkedQueue {
	public static void main(final String[] args) {
		final Queue<String> cql = new java.util.concurrent.ConcurrentLinkedQueue<>();
		cql.add("task1");
		cql.add("task2");
		cql.poll();
		System.out.println(cql);
	}
}
