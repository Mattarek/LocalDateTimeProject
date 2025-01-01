package org.Collections.List;

import java.util.LinkedList;
import java.util.List;

/*
	# Zalety
	Lista dwukierunkowa.
	Szybkie dodawanie i usuwanie elementów na początku i końcu listy.
	Wolniejszy dostęp przez indeks.
 */
public class LinkedListExample {
	public static void main(final String[] args) {
		final List<String> linkedList = new LinkedList<>();

		linkedList.add("Pierwszy");
		linkedList.add("Drugi");
		linkedList.addFirst("Zerowy"); // Dodawanie na początku

		System.out.println("Pierwszy element: " + linkedList.get(0));

		for (final String item : linkedList) {
			System.out.println(item);
		}
	}
}
