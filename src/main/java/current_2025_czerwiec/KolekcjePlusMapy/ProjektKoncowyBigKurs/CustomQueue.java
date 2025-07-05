package current_2025_czerwiec.KolekcjePlusMapy.ProjektKoncowyBigKurs;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CustomQueue<T> {
	private final Deque<T> queue;
	private final Map<String, Integer> counterMap = new HashMap<>();

	public CustomQueue(final Deque<T> queue) {
		this.queue = queue;
	}

	public void add(final T item) { // W kursie jest welcome
		final boolean isAdded = queue.offer(item);
		System.out.printf("%s came to the queue: %s%n", item, isAdded);
		System.out.println(queue);
		System.out.println();
	}

	public Integer getAndIncrementCounter(final String key) {
		Integer tempCounter = counterMap.getOrDefault(key, 0);
		counterMap.put(key, ++tempCounter);
		return tempCounter;
	}

	public void enter() {
		if (queue.isEmpty()) {
			System.out.println("No items in the queue!");
			return;
		}
		final T itemEntered = queue.poll();
		System.out.printf("Processing queue: %s arrrived at the store%n", itemEntered);
		System.out.println(queue);
		System.out.println();
	}

	public void leave(final T item) {
		if (queue.contains(item)) {
			queue.remove(item);
			System.out.printf("Leaving queue: %s%n", item);
			System.out.println(queue);
			System.out.println();
		} else {
			System.out.println(item + " is not in the queue");
		}
	}
}
