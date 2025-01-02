package org.Map.ExmaplesInCode;

import java.util.HashMap;
import java.util.Map;

public class HashMapInCode {
	public static void main(final String[] args) {
		// Tworzymy HashMap, gdzie klucz to ID użytkownika, a wartość to imię
		final Map<Integer, String> users = new HashMap<>();

		// Dodajemy dane
		users.put(1, "Alice");
		users.put(2, "Bob");
		users.put(3, "Charlie");

		// CharlieNullTwo nadpisze nasz klucz null
		users.put(null, "CharlieNull");
		users.put(null, "CharlieNullTwo");

		// Pobieramy dane
		System.out.println("Users with ID 2: " + users.get(2));

		// Sprawdzamy, czy mapa zawiera określony klucz
		System.out.println("Contains ID 3: " + users.containsKey(3));
		System.out.println("Contains ID 3: " + users.containsKey(4));
		System.out.println("Contains ID 3: " + users.get(null));
		System.out.println("Contains ID 3: " + users.get(null));
	}
}
