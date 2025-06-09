package megaK.noGeneric;

import java.util.ArrayList;
import java.util.List;

public class noGeneric {
	public static void main(final String[] args) {
		final List dogs = new ArrayList();
		dogs.add(new Dog());
		dogs.add(new Cat());
		print(dogs);
	}

	private static void print(final List<Dog> dogs) {
		for (final Object dog : dogs) {
			System.out.println(dog);
		}
	}

	static class Dog {

	}

	static class Cat {

	}
}
