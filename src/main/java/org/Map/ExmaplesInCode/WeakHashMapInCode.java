package org.Map.ExmaplesInCode;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapInCode {
	public static void main(final String[] args) {
		// Tworzymy WeakHashMap, która używa słabych refenrejcji do kluzca
		final Map<Integer, String> users = new WeakHashMap<>();

		// Tworzymy obiekt, który jest kluczem
		Integer keyOne = Integer.valueOf(1);
		users.put(keyOne, "Alice");

		// Sprawdzamy mape
		System.out.println("Before GC: " + users);

		// Ustawiamy klcz na nulla, więc powinien zostać usunięty przez GC
		keyOne = null;

		// Wywołanie garbage collectora, aby usunąć elementy, które nie mająsilnych referencji
		System.gc();

		// Sprawdzamy mapę po wywołaniu GC
		System.out.println("After GC: " + users);
	}
}
