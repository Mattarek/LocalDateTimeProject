package current_2025.CollectionExample.Queue;

import java.util.LinkedList;
import java.util.Queue;
//2. LinkedList<E> jako Queue
//🟡 Używać: Czasami, ale są lepsze opcje (ArrayDeque)
//📌 Kiedy: Gdy potrzebujesz prostoty i działania jako lista + kolejka
//
//✅ Zalety:
//	- Wszechstronna: działa jako lista i kolejka
//
//⚠️ Wady:
//	- Wolniejsza niż ArrayDeque
//	- Nieefektywna w środowiskach wielowątkowych

public class LinkedListAsQueue {
	public static void main(final String[] args) {
		final Queue<String> queue = new LinkedList<>();
		queue.add("X");
		queue.add("Y");
		queue.add("C");
		queue.poll();
		System.out.println(queue);
	}
}
