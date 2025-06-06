package old_2024.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
	Zachowuje kolejność dodawania elementów.
	Idealny, gdy wymagana jest spójna kolejność elementów.
*/
public class LinkedHashSetExample {
	public static void main(final String[] args) {
		final Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("Jabłko");
		linkedHashSet.add("Banan");
		linkedHashSet.add("Wiśnia");

		for (final String fruit : linkedHashSet) {
			System.out.println(fruit);
		}
	}
}
