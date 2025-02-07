package org.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExample {
	public static void main(final String[] args) {
		//		final Consumer<String> printMessage = message -> System.out.println("Wiadomość: " + message);
		//		printMessage.accept("Cześć!"); // Wyświetli: Wiadomość: Cześć!

		final List<Animal> animals = List.of(
				new Animal("Bird", true, false),
				new Animal("Dog", false, true),
				new Animal("Fish", false, false)
		);
		System.out.println(animals);
	}

	// Bez Lambdy
	public static void print(final List<Animal> animals, final Checkable checker) {
		for (final Animal animal : animals) {
			if (checker.test(animal)) {
				System.out.println(animal);
			}
		}
	}
}
