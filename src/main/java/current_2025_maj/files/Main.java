package current_2025_maj.files;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	public static void main(final String[] args) {
		//		final PersonLambda p = message -> System.out.println(message);
		//		p.print("Witaj");
		//
		//		final Adder adder = (a, b) -> a + b;
		//		System.out.println(adder.add(1, 2));

		final Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());

		final Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println(isEven.test(4));

		final Consumer<String> printer = msg -> System.out.println(msg.length());
		printer.accept("Helloo");

		final Function<String, Integer> stringToLenght = str -> str.length();
		System.out.println(stringToLenght.apply("tas"));
	}
}
