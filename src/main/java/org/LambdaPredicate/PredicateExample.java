package org.LambdaPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PredicateExample {
	public static void main(final String[] args) {
		final List<String> cities = new ArrayList<>();
		cities.add("Warsaw");
		cities.add("Lublin");
		cities.add("Szzczecin");
		cities.add("Rzeszów");

		cities.removeIf(city -> city.charAt(0) != 'S');
		System.out.println(cities);

		// Function - Przyjmuje jeden argument typu T, zwraca wynik typu R.
		// Posiada wbudowaną metodę apply:  R apply(T t);
		final Function<String, Integer> stringToLength = str -> str.length();
		System.out.println(stringToLength.apply("Lambda"));

		// Consumer - Przyjmuje jeden argument typu T, ale nie zwraca wartości (void).
		// Posiada wbudowaną metodę accept: void accept(T t);
		final Consumer<String> printer = message -> System.out.println("Wiadomość: " + message);
		printer.accept("Hello!");

		// Supplier - Nie przyjmuje argumentów, ale zwraca wartość typu T.
		final Supplier<Double> randomSupplier = () -> Math.random();
		System.out.println(randomSupplier.get());

		// Predicate - Przyjmuje jeden argument typu T i zwraca true/false.
		final Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println(isEven.test(4)); // true
		System.out.println(isEven.test(7)); // false

		// BiFunction - Przyjmuje dwa argumenty (T, U), zwraca wynik typu R.
		final BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(5, 3));

		// BiConsumer - Przyjmuje dwa argumenty, ale nie zwraca wartości (void).
		final BiConsumer<String, Integer> greet = (name, age) -> System.out.println("Cześć " + name + ", masz " + age + " lat!");
		greet.accept("Jan", 30); // Cześć Jan, masz 30 lat!

		// UnaryOperator - Jest specjalnym przypadkiem Function<T, T>, gdzie typ wejściowy i wyjściowy są takie same.
		final UnaryOperator<Integer> doubleIt = x -> x * 2;
		System.out.println(doubleIt.apply(5)); // 10

		// BinaryOperator - Jest specjalnym przypadkiem BiFunction<T, T, T>, gdzie wszystkie typy są takie same.
		final BinaryOperator<Integer> multiply = (a, b) -> a * b;
		System.out.println(multiply.apply(4, 5)); // 20
	}
}
