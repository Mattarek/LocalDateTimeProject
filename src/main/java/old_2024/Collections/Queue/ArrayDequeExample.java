package old_2024.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
	Dwustronna kolejka, szybka dla operacji na obu końcach.
	Brak ograniczeń rozmiaru.
*/
public class ArrayDequeExample {
	public static void main(final String[] args) {
		final Deque<String> deque = new ArrayDeque<>();

		deque.addFirst("Pierwszy");
		deque.add("Srodek1");
		deque.add("Srodek2");
		deque.add("Srodek3");
		deque.add("Srodek4");

		deque.addLast("Ostatni");

		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
		System.out.println(deque);
	}
}