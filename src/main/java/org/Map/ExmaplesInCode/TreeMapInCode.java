package org.Map.ExmaplesInCode;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInCode {
	public static void main(final String[] args) {
		// Tworzymy TreeMap, która przechowuje lementy w posortowanej kolejności według klucza
		final Map<Integer, String> users = new TreeMap<>();

		// Dodajemy dane
		users.put(3, "Marcin");
		users.put(2, "Kamil");
		users.put(13, "Piotrek");
		users.put(100, "Andrzej");
		users.put(4, "Maciej");
		users.put(1, "Paweł");

		// Pobieramy dane w posorotwanej kolejności kluczy
		System.out.println("Users in sorted order: " + users);

		// Iteracja po elementach w posortowanej kolejności
		for (final Map.Entry<Integer, String> entry : users.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}
	}
}
