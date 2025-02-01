package org.Collections.ImmutableVsCollection;

import java.util.HashSet;
import java.util.Set;

public class ImmutableVsCollection {
	private final Set<String> someSet; // przez final, referencja nie może się zmienić ale może zmienić się zawartość

	public ImmutableVsCollection(final String someElement, final String someElementTwo) {
		final Set<String> objects = new HashSet<>();
		objects.add(someElement);
		objects.add(someElementTwo);
		someSet = objects;
	}

	public static void main(final String[] args) {
		// Tworzymy niemutowalna klase
		final ImmutableVsCollection obj = new ImmutableVsCollection("Element", "ElementTwo");

		// Przypisujemy ją do seta
		final Set<String> someSet = obj.getSomeSet();
		System.out.println(obj.getSomeSet());
		someSet.add("ElementThree");

		// Mimo to udaje się przypisac kolejny element, poniweaż z getSomeSet zwracaliśmy tylko return someSet,
		// Aby to rozwiązać, dodajemy new HashSet<>(someSet), teraz zwracana jest już poprawna wartość.
		System.out.println(obj.getSomeSet());

		// Teraz obj został taki sam, a zmodyfikowany został nasz nowy someSet:
		System.out.println(someSet); // [ElementThree, ElementTwo, Element]
		System.out.println(obj.getSomeSet()); // [ElementTwo, Element]
	}

	public final Set<String> getSomeSet() {
		return new HashSet<>(someSet); // tworzy nową kopie i ją zwraca, dzięki temu oryginalny set nie zostanie
		// zmodyfikowany bo ewentualne zmiany zostaną wykonane na kopii
	}
}
