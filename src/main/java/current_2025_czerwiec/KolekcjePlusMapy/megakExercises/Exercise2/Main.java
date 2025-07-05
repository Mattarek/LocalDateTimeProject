package current_2025_czerwiec.KolekcjePlusMapy.megakExercises.Exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	// Napisz imlementację książki telefonicznej, która umożliwi wprowadzenie przez użytkownika osoby
	// wraz znumerem telefonu, w sposób pokazany później:
	// - Jan Kowalski
	// - Stefan Nawrocki
	// - Anna TOmaszewska

	// Dodaj te osoby do Mapy w taki sposób, żeby kluczem było nazwisko, a wartością zbiór osób
	// występujących pod takim nazwiskiem posortowanych w kolejności nazwisko a potem imię.
	// Po każdej dodanej osobie, wyświetl zawartość mapy na ekranie. Spraw, żeby osoby były posortowane
	// w książce po nazwisku. Dla uproszczenia złóż, że osoby mogą miećtylko jedno imię i tylko jedno nazwisko.
	public static void main(final String[] args) {
		final List<String> stringsList = List.of(
				"Jan Kowalski +48000192871",
				"Stefan Nawrocki +48000125847",
				"Anna Tomaszewska +48000421458",
				"Edyta Tomaszewska +48000421632",
				"Jerzy Kowalski +48000192843",
				"Testowy Kowalski +48000192843"
		);

		final List<Person> peopleList = new ArrayList<>();
		for (final String person : stringsList) {
			peopleList.add(new Person(person));
		}

		final Map<String, List<Person>> personMap = new TreeMap<>();

		for (final Person person : peopleList) {
			addPersonToPeopleMap(person, personMap);
		}
	}

	private static void addPersonToPeopleMap(final Person person, final Map<String, List<Person>> personMap) {
		final List<Person> bySurnameList = personMap.containsKey(person.getSurname()) ?
				personMap.get(person.getSurname())
				: new ArrayList<>();

		bySurnameList.add(person);
		bySurnameList.sort(Comparator.comparing(Person::getSurname));
		personMap.put(person.getSurname(), bySurnameList);

		System.out.println(personMap);

		for (final Map.Entry<String, List<Person>> entry : personMap.entrySet()) {
			System.out.println(entry);
		}
	}
}
