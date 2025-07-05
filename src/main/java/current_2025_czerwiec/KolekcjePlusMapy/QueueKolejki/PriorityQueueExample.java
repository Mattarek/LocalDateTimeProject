package current_2025_czerwiec.KolekcjePlusMapy.QueueKolejki;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(final String[] args) {
		final List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 3, 2, 3, 42);
		final Queue<Integer> priorityQueue = new PriorityQueue<>();

		for (int i = 0; i < ints.size(); i++) {
			priorityQueue.offer(i);
			System.out.println(priorityQueue);
		}
	}
}
