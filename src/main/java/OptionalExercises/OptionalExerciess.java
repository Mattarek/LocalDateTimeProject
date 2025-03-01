package OptionalExercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExerciess {
	private static final Optional<String> hello = Optional.of("Hello, World!");
	private static final Optional<String> helloEmpty = Optional.empty();

	//	Stwórz Optional<String>, ale przekazując null.
	private static final Optional<String> nullValue = Optional.ofNullable(null);

	public static void main(final String[] args) {
		//🔹 Zadanie 1: Podstawowe użycie Optional
		// Stwórz Optional<String> z wartością "Hello, World!" i wyświetl jego zawartość.
		//		hello.ifPresent(u -> System.out.println(u));
		//
		//		// Stwórz pusty Optional i sprawdź, czy jest pusty.
		//		System.out.println(helloEmpty.isEmpty());
		//
		//		//🔹 Zadanie 2: Obsługa wartości domyślnych
		//		//	Stwórz Optional<String>, ale przekazując null.
		//		//	private static final Optional<String> nullValue = Optional.ofNullable(null);
		//		//	Obsłuż wartość domyślną używając orElse("Domyślna") oraz orElseGet(() -> "Domyślna z funkcji").
		//		System.out.println(nullValue.orElse("Domyślna"));
		//		System.out.println(nullValue.orElseGet(() -> "Domyslna z funkcji"));

		//	Spróbuj użyć orElseThrow() i zwróć wyjątek, gdy Optional jest pusty.
		//	nullValue.orElseThrow(() -> new RuntimeException("Wartość to: null"));

		//🔹 Zadanie 3: Transformacja wartości (map() i flatMap())

		final List<Optional<String>> names = Arrays.asList(
				Optional.ofNullable("Marcin"),
				Optional.empty(),
				Optional.ofNullable("Andrzej")
		);

		final List<String> filteredNames = names.stream().flatMap(u -> u.stream()).collect(Collectors.toList());
		System.out.println(filteredNames);

		final List<String> filteredNamesTwo = names.stream().flatMap(Optional::stream).collect(Collectors.toList());
		System.out.println(filteredNamesTwo);
	}
}



