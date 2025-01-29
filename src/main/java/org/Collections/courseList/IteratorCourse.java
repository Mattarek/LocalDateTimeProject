package org.Collections.courseList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class IteratorCourse {
	public static void main(final String[] args) {
		//		final List<String> listWithCities = new ArrayList<>();
		//		listWithCities.add("Wraszawa");
		//		listWithCities.add("Gdańsk");
		//		listWithCities.add("Łódź");
		//		listWithCities.add("Wrocław");
		//
		//		// Pętle do iterowania
		//		//		for (final String listWithCity : listWithCities) {
		//		//			System.out.println(listWithCity);
		//		//		}
		//		//		System.out.println("====");
		//		//		for (int i = 0; i < listWithCities.size(); i++) {
		//		//			System.out.println(listWithCities.get(i));
		//		//		}
		//
		//		//		final Iterator<String> iterator = listWithCities.iterator();
		//		//		while (iterator.hasNext()) {
		//		//			System.out.println(iterator.next());
		//		//		}
		//		//
		//		//		final ListIterator<String> stringListIterator = listWithCities.listIterator();
		//		//		while (stringListIterator.hasPrevious()) {
		//		//			System.out.println(stringListIterator.next());
		//		//		}
		//
		//		final Set<String> citiesSet = new HashSet<>();
		//		citiesSet.add("Wraszawa");
		//		citiesSet.add("Gdańsk");
		//		citiesSet.add("Łódź");
		//		citiesSet.add("Wrocław");
		//
		//		// Pamiętajmy, ze w momencie inicjalizacji, dany set/list/map/queue jest zapisywany,
		//		// więć jeśli po inicjalizacji coś dodamy, to pojawi się wyjątek:
		//		// ConcurrentModificationException
		//		//		final Iterator<String> iterator = citiesSet.iterator();
		//		//		while (iterator.hasNext()) {
		//		//			System.out.println(iterator.next());
		//		//		}
		//
		//		final Map<String, String> citiesMap = new HashMap<>();
		//		citiesMap.put("Volvo", "XC60");
		//		citiesMap.put("Fiat", "Panda");
		//		citiesMap.put("Volkswagen", "Gold");
		//
		//		for (final String s : citiesMap.keySet()) {
		//			System.out.println(s);
		//		}
		//
		//		for (final String s : citiesMap.values()) {
		//			System.out.println(s);
		//		}
		//
		//		for (final Map.Entry<String, String> stringEntry : citiesMap.entrySet()) {
		//			System.out.println(stringEntry);
		//		}
		//
		//		// Map.Entry<String,String> wskazuje, że będzie jedna Mapa
		//		// citiesMap.entrySet().iterator(); tworzymy Set tylko z tym elementem
		//		// aby móc iterowac
		//		final Iterator<Map.Entry<String, String>> iterator = citiesMap.entrySet().iterator();
		//		while (iterator.hasNext()) {
		//			System.out.println(iterator.next());
		//		}
		//
		//		final Set<String> strings = citiesMap.keySet();
		//		for (final String str : strings) {
		//			System.out.println(citiesMap.get(str));
		//		}
		//==============================================================================================
		// Again
		final List<String> listWithCities = new ArrayList<>();
		listWithCities.add("Wraszawa");
		listWithCities.add("Gdańsk");
		listWithCities.add("Łódź");
		listWithCities.add("Wrocław");

		final ListIterator<String> iterator = listWithCities.listIterator();
		while (iterator.hasPrevious()) { // hasNext() sprawdza i zwraca boolean, czy mamy jeszcze jakiś element
			// 			W przypadku ListIterator, mamy też dostęp do sprawdzania, czy jest poprzedni: hasPrevious
			//			Metoda hasNext() w iteratorze jest kluczowa, ponieważ sprawdza, czy istnieje kolejny
			//			element w kolekcji przed jego pobraniem metodą next(). Jeśli nie użyjesz hasNext(),
			//					a iterator znajdzie się na końcu kolekcji, wywołanie next() spowoduje wyjątek
			//			NoSuchElementException.
			System.out.println(iterator.next());
		}
	}
}
