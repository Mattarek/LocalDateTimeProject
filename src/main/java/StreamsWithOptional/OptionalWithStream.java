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
		//				.map(List::stream) // Zwraca Optional<Stream<String>>
		//				.orElseGet(Stream::empty) // .orElseGet(Stream::empty) // Rozpakowanie Optional<List<String>> do List<String> lub pusty Stream
		//				.collect(Collectors.toList());
		//		System.out.println(result); // [A, B, C, D]

		//		🔥 Czy orElseGet() zawsze jest konieczne?
		//
		//				Tak, jeśli używasz map(), bo map() zwraca Optional<Stream<T>>, a nie Stream<T>.
		//		Nie, jeśli używasz flatMap(List::stream), bo flatMap() od razu zwraca Stream<T>

		// Z flatMap: Używamy flatMap, aby uniknąć Optional<List<T>> -> Stream<List<T>>

		final List<String> result = optionalList.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(result); // [A, B, C, D]
	}
}
