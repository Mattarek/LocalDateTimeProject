package org.Collections.courseList;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
	public static void main(final String[] args) {
		final Set<Integer> setOfIntegerFirst = new HashSet<>();
		final Set<Integer> setOfIntegerSecond = new HashSet<>();

		// books bo tak nazywamy zbiory jakichs obietkow
		final Set<Book> books = new HashSet<>();
		books.add(new Book("Java"));
		books.add(new Book("Struktury danych"));

		// set nie ma .get, bo umieszczane są w losowej kolejnosci
		setOfIntegerFirst.add(1);
		setOfIntegerFirst.add(10);
		setOfIntegerFirst.add(8);

		setOfIntegerSecond.add(1);
		setOfIntegerSecond.add(2);
		setOfIntegerSecond.add(3);
		setOfIntegerSecond.add(4);

		// Ile unikalnych wartości mamy
		System.out.println(setOfIntegerFirst.size());

		// Usuwamy konkretny efekt, zwraca boolean true jesli usuniete, false jesli nie
		// set nie ma indexu, tak więc nie mozemy też usuwać po indexie
		System.out.println(setOfIntegerFirst.remove(8));

		// Czy posiadamy dany obiekt w naszym secie?
		System.out.println(setOfIntegerFirst.contains(10));

		System.out.println(setOfIntegerFirst);

		// Dodajemy wszystkie wartości z setu A do setu B
		System.out.println(setOfIntegerSecond.addAll(setOfIntegerFirst));
		System.out.println(setOfIntegerSecond);

		// Możemy zainicjować z od razu dodanymi
		final Set<Integer> setOfIntegerThird = new HashSet<>(setOfIntegerSecond);
		setOfIntegerThird.add(11);
		System.out.println(setOfIntegerThird);
		System.out.println(books);
	}
}
