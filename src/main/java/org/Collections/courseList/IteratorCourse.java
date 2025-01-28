package org.Collections.courseList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorCourse {
	public static void main(final String[] args) {
		final List<String> listWithCities = new ArrayList<>();
		listWithCities.add("Wraszawa");
		listWithCities.add("Gdańsk");
		listWithCities.add("Łódź");
		listWithCities.add("Wrocław");

		// Pętle do iterowania
		//		for (final String listWithCity : listWithCities) {
		//			System.out.println(listWithCity);
		//		}
		//		System.out.println("====");
		//		for (int i = 0; i < listWithCities.size(); i++) {
		//			System.out.println(listWithCities.get(i));
		//		}

		//		final Iterator<String> iterator = listWithCities.iterator();
		//		while (iterator.hasNext()) {
		//			System.out.println(iterator.next());
		//		}
		//
		//		final ListIterator<String> stringListIterator = listWithCities.listIterator();
		//		while (stringListIterator.hasPrevious()) {
		//			System.out.println(stringListIterator.next());
		//		}

		final Set<String> citiesSet = new HashSet<>();
		citiesSet.add("Wraszawa");
		citiesSet.add("Gdańsk");
		citiesSet.add("Łódź");
		citiesSet.add("Wrocław");

		// Pamiętajmy, ze w momencie inicjalizacji, dany set/list/map/queue jest zapisywany,
		// więć jeśli po inicjalizacji coś dodamy, to pojawi się wyjątek:
		// ConcurrentModificationException
		final Iterator<String> iterator = citiesSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
