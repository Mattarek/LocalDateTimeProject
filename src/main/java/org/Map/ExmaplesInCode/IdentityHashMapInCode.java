package org.Map.ExmaplesInCode;

import java.util.Map;

public class IdentityHashMap {
	public static void main(final String[] args) {
		// Tworzymy IdentityHashMap, która porównuje klucze na podstawie referencji
		final Map<String, String> map = new IdentityHashMap<>();

		final String str1 = "Hello";
		final String str2 = "Hello";

		// Dodajemy obie instancje obiektu "Hello"
		map.put(str1, "World");
		map.put(str2, "Java");

		// Zwróci dwie różne pary, ponieważ porównanie kluczy odbywa się na poziomie referencji
		System.out.println(map); // {Hello=World, Hello=Java}
	}
}
