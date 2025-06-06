package old_2024.Map.ExmaplesInCode;

import java.util.Hashtable;
import java.util.Map;

public class HashTableInCode {
	public static void main(final String[] args) {
		// Tworzymy HashTable, która jest synchroniczna
		// Używana w środowisko wielowątkowym, gdzie operacje muszą być synchronizowane
		final Map<Integer, String> users = new Hashtable<>();

		// Dodajemy dane
		users.put(1, "Marcin");
		users.put(3, "Zbyszek");
		users.put(2, "Anna");
		users.put(5, "Piotrek");
		users.put(7, "Andrzej");

		// Pobieramy dane
		System.out.println("User with ID 2: " + users.get(2));
	}
}
