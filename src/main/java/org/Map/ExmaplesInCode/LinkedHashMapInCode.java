package org.Map.ExmaplesInCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInCode {
	public static void main(final String[] args) {
		// Tworzymy LinkedHashMap, która zachowuje kolejność wstawiania
		final Map<Integer, String> users = new LinkedHashMap<>();

		// Dodajemy dane
		users.put(1, "Alice");
		users.put(2, "Bob");
		users.put(3, "Charlie");
		users.put(null, "CharlieNull");

		// Pobieramy dane w tej samej kolejności, w jakiej zostały dodane
		System.out.println("Users in insertion order: " + users); // {1=Alice, 2=Bob, 3=Charlie}

		// Iteracja po elementach w kolejności dodania
		for (final Map.Entry<Integer, String> entry : users.entrySet()) {
			System.out.println(entry);
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}
	}
}
