package megaK.WeirdExample;

import java.util.ArrayList;
import java.util.List;

public class WeirdExample {
	public static void main(final String[] args) {
		final List<?> animals = new ArrayList<Animal>();
		final List<? extends Animal> animal2 = new ArrayList<Animal>();
		final List<? super Animal> animal3 = new ArrayList<Animal>();
		final List<? super Dog> animal4 = new ArrayList<Animal>();
		animal4.add(new Dog());
	}

	static <T extends Animal> T method(final List<T> element) {
		return element.get(0);
	}

	static class Animal {
	}

	static class Dog extends Animal {

	}

	static class FlyingDog extends Dog {
	}
}
