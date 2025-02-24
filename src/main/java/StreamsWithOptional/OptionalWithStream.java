package StreamsWithOptional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalWithStream {
	public static void main(final String[] args) {
		final Optional<String> optionalValue = Optional.of("Hello, World");
		final Optional<String> optionalEmptyValue = Optional.of("");

		// Zmiana Optional w Stream
		final Stream<String> stream = optionalValue.stream();
		final Stream<String> streamEmpty = optionalEmptyValue.stream();

		// Zwróci HELLO, WORLD
		stream.map(String::toUpperCase).forEach(System.out::println);

		// Zwróci pusty string
		streamEmpty.map(String::toUpperCase).forEach(System.out::println);
	}
}
