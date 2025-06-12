package megaK.PodsumowanieWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysArrayList {
	public static void main(final String[] args) {
		final List<Animal> listOne = Arrays.asList(new Dog(), new Dog());
		final List<? extends Animal> superAnimal = Arrays.asList(new Dog(), new Animal());
		final List<? super Dog> superDogs = Arrays.asList(new Dog(), new Animal(), new Object(), new Burger());
		final List<Animal> listAnimal = List.of(new Dog(), new Animal());
		final List<Dog> listDog = List.of(new Dog());
	}

	static class Animal {
	}

	static class Dog extends Animal {
	}

	static class Burger extends Dog {
	}
}
