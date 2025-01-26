package org.Collections.courseList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapCourse {
	public static void main(final String[] args) {
		// Przykład tablicy asocjacyjnej, słownik, tavlica skojarzeniowa lub najkrócej mapa
		// W mapach mamy unikalny klucz i wartość
		// HashMapa ma zaimplementowaną metodę toString, więc od razu otrzymujemy spodziewany efekt:
		// {1=Norbert, 2=Adam, 4=Cecylia}
		// HashTable to starsze rozwiązanie z przed wprowadzenia HashMapy, nie używa się go bo jest
		// wolniejszy, bo posiada mechanizmy przed dostępem wielowątkowym a hashMapa nie.

		// Klucze nie mogą być w kolejności, mogą być Integerem, Stringiem etc
		final Map<String, String> people = new HashMap<>();
		people.put("1", "Norbert");
		people.put("2", "Adam");
		people.put("3", "Cecylia");
		System.out.println(people);

		final Map<Integer, String> anotherPeople = new HashMap<>();
		anotherPeople.put(1, "Marcin");
		anotherPeople.put(2, "Arek");
		anotherPeople.put(9, "Paweł");
		anotherPeople.put(null, "Null");

		// ## Metody setów ##
		// Szukamy element po kluczu
		System.out.println("get " + anotherPeople.get(9));

		// Dodajemy nowy element
		System.out.println("put " + anotherPeople.put(4, "Andrzej"));

		// Jesteśmy w stanie nadpisać wcześniejszy element o takim samym kluczu
		System.out.println("overwrite " + anotherPeople.put(null, "Naspisane"));

		// {null=Naspisane, 1=Marcin, 2=Arek, 4=Andrzej, 9=Paweł}
		System.out.println(anotherPeople);

		// Usuwamy element o kluzcu 2:
		System.out.println("remove " + anotherPeople.remove(2));

		// {null=Naspisane, 1=Marcin, 4=Andrzej, 9=Paweł}
		System.out.println(anotherPeople);

		// Długość mapa
		System.out.println(anotherPeople.size());

		// Czy zbiór zawiera klcz 9:
		System.out.println(anotherPeople.containsKey(9));

		// Czy zbiór zawiera wartość o nazwie "Paweł"
		System.out.println(anotherPeople.containsValue("Paweł"));

		final Map<Integer, List<String>> mapAndListValue = new HashMap<>();
		// Tworzymy jakąś Liste i Java ma to ogarnać
		mapAndListValue.put(1, List.of("Rafał", "Marcin", "Patryk"));
		// Tworzymy pustą listę
		mapAndListValue.put(2, Collections.emptyList());
		// Lista z 1 elementem
		mapAndListValue.put(3, Collections.singletonList("Mar Bar"));

		// Wyczyść mape
		// mapAndListValue.clear();
		System.out.println(mapAndListValue);

		// Pobranie entrySet(), to co w JS: Object.entries(a)
		// Zbieramy wszystkie elementy w tablice:
		final Set<Map.Entry<Integer, List<String>>> entries = mapAndListValue.entrySet();
		System.out.println(entries); // 1=[Rafał, Marcin, Patryk], 2=[], 3=[Mar Bar]]

		// Zbieramy klucze i zamieniamy w tablice Integerow
		System.out.println(mapAndListValue.keySet()); // [1, 2, 3]

		// Zbieramy wartości i zamieniamy w tablice List
		System.out.println(mapAndListValue.values()); // [[Rafał, Marcin, Patryk], [], [Mar Bar]]
	}
}
