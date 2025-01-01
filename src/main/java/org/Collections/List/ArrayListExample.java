package org.Collections.List;

import java.util.ArrayList;
import java.util.List;

	/*
	# Zalety
	Przechowuje elementy w dynamicznej tablicy.
	Szybki dostęp do elementów przez indeksy.
	Wolniejsze usuwanie i dodawanie elementów w środku listy.
	*/

public class ArrayListExample {
	// Tworzenie listy ArrayList
	private static final List<String> arrayListExample = new ArrayList<>();

	public static void main(final String[] args) {

		// Dodawanie elementów
		arrayListExample.add("Jabłko");
		arrayListExample.add("Banan");
		arrayListExample.add("Pomarańcza");

		// Dostęp przez indeks
		System.out.println("Pierwszy element: " + arrayListExample.get(0));

		// Iteracja
		for (final String fruit : arrayListExample) {
			System.out.println(fruit);
		}
	}
}
