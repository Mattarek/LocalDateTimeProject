package megaK.UpperBoundWildcard;

import old_2024.staticInheritence.A.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UpperBoundWildcard {
	public static void main(final String[] args) {
		final List<Animal> animals = new ArrayList<>();
		final List<Dog> dogs = new ArrayList<>();
		final List<Monkey> monkeys = new ArrayList<>();
		final List<String> strings = new ArrayList<>();
		final List<ImplementingVoiceable> implementingVoiceables = new ArrayList<>();

		print(animals);
		print(dogs);
		print(monkeys);
		//		print(strings);
		//		print(implementingVoiceables);
	}

	private static void print(final List<? extends Animal> list) { // możemy tylko Animal, ale nie typy dziedziczące
		// z niego
		for (final Object o : list) {
			System.out.println(o);
		}
	}

	interface Voicable {
	}

	static class ImplementingVoiceable {
	}

	static class Dog extends Animal {
	}

	static class Monkey extends Animal {
	}

	static class Animal implements Voicable {
	}
}
