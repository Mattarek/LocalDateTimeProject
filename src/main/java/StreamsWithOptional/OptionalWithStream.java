package StreamsWithOptional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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

		//==============================================================================
		final Optional<List<String>> optionalList = Optional.of(List.of("A", "B", "C", "D"));

		// Bez flatMap
		//		final List<String> result = optionalList
		//				.map(List::stream)
		//				.orElseGet(Stream::empty) // rozpakowujemy nasz Optional<List<String>> do List<String>
		//				.collect(Collectors.toList());
		//		System.out.println(result); // [A, B, C, D]

		// Z flatMap: Używamy flatMap, aby uniknąć Optional<List<T>> -> Stream<List<T>>
		final List<String> result = optionalList.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(result); // [A, B, C, D]
	}
}
