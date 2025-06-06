package old_2024.Collections.courseList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCourse {
	public static void main(final String[] args) {
		// Dynamiczna lista która może może być rozszerzana i skracana
		// dynamicznie, a także zezwala na duplikaty, dodatkowo
		// gwaratnuje zachowanie kolejności elementow.

		// Domyślnie ArrayLista tworzy tablice 10 elementowa i gdy dodajemy 11 element
		// zwiększa ją o 50%, więc do 15, gdy dodajemy 16ty, zwiększa o kolejne 50%, do 22
		// i tak dalej.
		final List<Integer> intsList = new ArrayList<>();
		final List<String> stringsList = new ArrayList<>();

		intsList.add(1);
		intsList.add(2);
		intsList.add(3);
		intsList.add(4);
		intsList.add(5);

		stringsList.add("Warsaw");
		stringsList.add("Gdansk");
		stringsList.add("Krakow");
		stringsList.add("Rzeszow");
		stringsList.add("Poznan");

		System.out.println("=== intsList ===");
		System.out.println("intexOf: " + intsList.indexOf(3));
		System.out.println("contains: " + intsList.contains(2));
		System.out.println("remove: " + intsList.remove(4));
		System.out.println("isEmpty: " + intsList.isEmpty());
		System.out.println("===================");

		System.out.println("=== stringsList ===");
		System.out.println("size: " + stringsList.size());
		System.out.println("getFirst: " + stringsList.getFirst());
		System.out.println("getLast: " + stringsList.getLast());
		System.out.println("===================");
	}
}
