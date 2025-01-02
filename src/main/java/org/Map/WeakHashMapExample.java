package org.Map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	public static void main(final String[] args) {
		final Map<String, String> map = new WeakHashMap<>();
		String key = "apple"; // weak reference
		map.put(key, "fruit");

		System.out.println(map); // {apple=fruit}

		key = null; // Usuwamy referencję do klucza
		System.gc(); // Uruchamiamy GC, który usunie obiekt klucza
		System.out.println(map); // Po GC klucz został usunięty z mapy
	}
}
