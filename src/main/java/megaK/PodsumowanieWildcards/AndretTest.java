package megaK.PodsumowanieWildcards;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AndretTest {
	// DON'T TOUCH
	public static void main(final String[] args) {
		final List<Dog> listDog = Arrays.asList(new Dog(), new Dog());
		final List<Animal> listAnimal = Arrays.asList(new Dog(), new Dog());

		feedAnimals(listDog);
		feedAnimals(listAnimal);
	}

	// CREATE `feedAnimals`
	private static void feedAnimals(final List<? extends Animal> listAnimal) {
		for (final Animal a : listAnimal) {
			System.out.println(a);
		}
	}

	// DON'T TOUCH
	static class Animal {
		void feed() {

		}
	}

	// DON'T TOUCH
	static class Dog extends Animal {

	}
}