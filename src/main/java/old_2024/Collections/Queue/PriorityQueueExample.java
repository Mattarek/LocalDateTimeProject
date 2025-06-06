package old_2024.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
	Kolejka sortowana według naturalnego porządku lub komparatora.
	Nie gwarantuje kolejności FIFO.
*/
public final class PriorityQueueExample {
	public static void main(final String[] args) {
		final Queue<Integer> priorityQueue = new PriorityQueue<>();

		priorityQueue.add(3);
		priorityQueue.add(1);
		priorityQueue.add(2);

		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	}
}
