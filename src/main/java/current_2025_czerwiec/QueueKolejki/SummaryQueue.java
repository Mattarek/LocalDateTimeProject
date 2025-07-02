package current_2025_czerwiec.QueueKolejki;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class SummaryQueue {
	public static void main(final String[] args) {
		final Deque<String> deq = new ArrayDeque<>();
		deq.offer("Zabrze");
		deq.offer("Łęczna");
		deq.offer("Bytom");
		deq.offer("Płońsk");
		System.out.println(deq);

		final Queue<String> priorityDue = new PriorityQueue<>();
		priorityDue.offer("Zabrze");
		priorityDue.offer("Łęczna");
		priorityDue.offer("Bytom");
		priorityDue.offer("Płońsk");
		//[Bytom, Płońsk, Zabrze, Łęczna]
		// Domyślnie sortowane jest według ASCII
		// 1. cyfry
		// 2. duze litery
		// 3. małe litery
		// 4. znaki m.in polskie łążćź i tak dalej

		System.out.println(priorityDue);

		priorityDue.poll();
		priorityDue.poll();
		priorityDue.poll();
		System.out.println(priorityDue);
	}
}
