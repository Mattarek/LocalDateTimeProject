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
		linkedList.add("Trzeci");
		linkedList.add("Czwarty");

		linkedList.addLast("Ostatni");
		linkedList.add("Piąty");
		linkedList.addFirst("Zerowy"); // Dodawanie na początku

		/*
			# Kolejność
				Zerowy
				Pierwszy
				Drugi
				Trzeci
				Czwarty
				Ostatni
				Piąty
		 */

		for (final String item : linkedList) {
			System.out.println(item);
		}
	}
}
