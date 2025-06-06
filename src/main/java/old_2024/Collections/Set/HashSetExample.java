package old_2024.Collections.Set;

import java.util.HashSet;
import java.util.Set;

/*
	Przechowuje unikalne elementy.
	Kolejność elementów nie jest gwarantowana.
	Szybki dostęp do elementów.
 */
public class HashSetExample {
	public static void main(final String[] args) {
		final Set<String> hashSet = new HashSet<>();

		hashSet.add("Jabłko");
		hashSet.add("Banan");
		hashSet.add("Jabłko"); // Duplikat zostanie zignorowany

		for (final String fruit : hashSet) {
			System.out.println(fruit);
		}
	}
}
