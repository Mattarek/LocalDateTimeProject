package org.Map;

import java.util.Map;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
	public static void main(final String[] args) {
		final Map<String, String> map = new IdentityHashMap<>();
		final String key1 = "apple";
		final String key2 = "apple";

		map.put(key1, "fruit");
		map.put(key2, "fruit");

		System.out.println(map); // {apple=fruit, apple=fruit} - porównuje referencje, nie zawartość
	}
}
