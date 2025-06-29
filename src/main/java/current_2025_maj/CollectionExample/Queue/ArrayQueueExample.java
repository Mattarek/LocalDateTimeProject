package current_2025_maj.CollectionExample.Queue;

//1. ArrayDeque<E>
//✅ Używać: Tak, najlepsza ogólna kolejka
//📌 Kiedy: Stos lub kolejka z szybkim dostępem

//✅ Zalety:
//	- Bardzo szybka (brak synchronizacji)
//	- Może działać jako stos lub kolejka (FIFO/LIFO)

//⚠️ Wady:
//	- Niebezpieczna w środowiskach wielowątkowych

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayQueueExample {
	public static void main(final String[] args) {
		final Deque<String> deque = new ArrayDeque<>();
		deque.add("A");
		deque.add("B");
		deque.poll();

		System.out.println(deque);
	}
}
