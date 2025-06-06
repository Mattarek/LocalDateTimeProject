package old_2024.Collections.courseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
		//		final List<String> listWithCities = new ArrayList<>();
		//		listWithCities.add("Wraszawa");
		//		listWithCities.add("Gdańsk");
		//		listWithCities.add("Łódź");
		//		listWithCities.add("Wrocław");

		//final ListIterator<String> iterator = listWithCities.listIterator();
		//while (iterator.hasNext()) { // hasNext() sprawdza i zwraca boolean, czy mamy jeszcze jakiś element
		//		 			W przypadku ListIterator, mamy też dostęp do sprawdzania, czy jest poprzedni: hasPrevious
		//					Metoda hasNext() w iteratorze jest kluczowa, ponieważ sprawdza, czy istnieje kolejny
		//					element w kolekcji przed jego pobraniem metodą next(). Jeśli nie użyjesz hasNext(),
		//							a iterator znajdzie się na końcu kolekcji, wywołanie next() spowoduje wyjątek
		//							NoSuchElementException czyli tak zwany fail fast.
		//	System.out.println(iterator.next());
		//}

		//		final ListIterator<String> previousIterator = listWithCities.listIterator(listWithCities.size());
		//		while (previousIterator.hasPrevious()) {
		//			System.out.println(previousIterator.previous());
		//		}
		//		final Set<String> setWithCities = new HashSet<>();
		//		setWithCities.add("Wraszawa");
		//		setWithCities.add("Gdańsk");
		//		setWithCities.add("Łódź");
		//		setWithCities.add("Wrocław");
		//
		//		final Iterator<String> iteratorSet = setWithCities.iterator();
		//		while (iteratorSet.hasNext()) {
		//			System.out.println(iteratorSet.next());
		//		}
		//
		//		for (final String setWithCity : setWithCities.k) {
		//			System.out.println(setWithCity);
		//		}

		// Lista z iteratorem
		final List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));
		final Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			final String element = iterator.next();
			System.out.println(element);
			if (element.equals("B")) {
				iterator.remove();
			}
		}
		System.out.println(lista);

		// set z iteratorem
		final Set<Integer> setInt = new HashSet<>(Set.of(1, 2, 3));
		final Iterator<Integer> setIterator = setInt.iterator();

		setInt.add(4); // ConcurrentModificationException - bo dodałem po utworzeniu iteratora
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}

		// Map
		final Map<String, String> cars = new HashMap<>();
		cars.put("Volvo", "XC60");
		cars.put("Fiat", "Panda");
		cars.put("Volkswagen", "Golf");

		final Iterator<Map.Entry<String, String>> iteratorMap = cars.entrySet().iterator();

		cars.values();
		while (iteratorMap.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
