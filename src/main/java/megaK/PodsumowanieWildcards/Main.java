package megaK.PodsumowanieWildcards;

import old_2024.staticInheritence.A.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<? extends Dog> dogList = Arrays.asList(new Dog(), new Dog());
		final List<Animal> stringList = Arrays.asList(new Dog(), new Animal());

		final List<Pigeon> pigeonList = Arrays.asList(new Pigeon(), new Pigeon());
		final List<? extends Animal> aList = pigeonList; // możemy zapisać listę do innej zmiennej i możemy odczytywać
		// ale nie mozemy dodawać nowych, czyli mamy listę do odczytywania
		// aList.add(new Animal());

		// Ale możemy to zrobić z ArrayLista
		final List<Animal> arrayListAnimal = new ArrayList<>();
		arrayListAnimal.add(new Pigeon());
		arrayListAnimal.add(new Dog());

		printSize(dogList);
		printSize(pigeonList);
		printSize(stringList);

		System.out.println("=== ArrayList ===");
		printSize(arrayListAnimal);
	}

	//	static void print(final List<?> list) { // przekazemy jakas liste, na ktorej mozemy wykonac metody Listy
	//		System.out.println(list);
	//	}
	static void printSize(final List<? extends Animal> list) {
		System.out.println(list.size());
	}

	static class Animal {
	}

	static class Pigeon extends Animal {
	}

	static class Dog extends Animal {
	}
}
