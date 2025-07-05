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

	public void add(final T item) {
		queue.offer(item);
		System.out.println(queue);
	}

	public Integer getAndIncrementCounter(final String key) {
		Integer tempCounter = counterMap.getOrDefault(key, 0);
		counterMap.put(key, ++tempCounter);
		return tempCounter;
	}
}
