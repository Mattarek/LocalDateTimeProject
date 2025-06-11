package megaK.LowerBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {
	public static void main(final String[] args) {
		final List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());

		final List<Animal> animals = new ArrayList<>();
		animals.add(new Animal());
		flyingDog(dogs);
		flyingDog(animals);

		final List<? super Dog> listOne = dogs;
		final List<? super Dog> listTwo = animals;
		listOne.add(new Dog());
		listOne.add(new FlyingDog());
		// listOne.add(new Animal());   // Required type: capture of ? super Dog
		// Provided:Animal
	}

	private static void flyingDog(final List<? super Dog> list) {
		list.add(new FlyingDog());
	}

	static class Animal {
	}

	static class Dog extends Animal {
	}

	static class FlyingDog extends Dog {
	}
}
