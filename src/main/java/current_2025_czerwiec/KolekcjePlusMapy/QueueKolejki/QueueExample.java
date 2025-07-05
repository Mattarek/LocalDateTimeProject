package current_2025_czerwiec.KolekcjePlusMapy.QueueKolejki;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class QueueExample {
	public static void main(final String[] args) {
		final List<String> ints = new ArrayList<>();
		final Queue<String> arrayDeque = new ArrayDeque<>();

		ints.add("1");
		ints.add("2");
		ints.add("3");
		ints.add("4");

		for (final String i : ints) {
			arrayDeque.add(i);
		}

		System.out.println(arrayDeque);

		for (int s = 0; s < ints.size(); s++) {
			System.out.println("Queue.peek: " + arrayDeque.poll());
			System.out.println(arrayDeque);
		}
		System.out.println(arrayDeque);
	}
}
