package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(final String[] args) {
		final Stream<String> stringStream = Stream.of("1", "7", "10");
		final Stream<String> stringStreamFiltered = stringStream.filter(u -> !u.equals("7"));
		final List<String> result = stringStreamFiltered.collect(Collectors.toList());
		//		System.out.println(result);

		final Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9); // definiujemy stream
		// definiujemy krok pośredni i teraz aby go uruchomić,
		// potrzebujemy jeszcze krok terminujący, bo streamy są "Lazy"
		// Stream nie może zostać wykorzystany dwukrotnie, jeśli otworzymy go drugi raz, to
		// otrzymamy "Stream has already been operated upon or closed.
		//				.peek(element -> System.out.println(element));

		intStream.collect(Collectors.toList());

		// Na podstawie kolekcji możemy stworzyć tyle streamow ile chcemy.
		final List<String> stringList = List.of("1", "7", "3", "2", "9", "10", "12");
		//		final Stream<String> streamOne = stringList.stream().peek(e -> System.out.println("Element: " + e));
		final Stream<String> streamTwo = stringList.stream().peek(e -> System.out.println("Element: " + e));

		//		streamOne.collect(Collectors.toList());

		// Ten stream został już raz zamknięty, dlatego ten się nawet nie uruchomi i program się nie skompiluje
		// a z tego wynika, że nie mozemy wykonać więcej niż jednej operacji terminującej.
		//		streamOne.collect(Collectors.toList());

		System.out.println(streamTwo.collect(Collectors.toList())
				.stream().collect(Collectors.toList())
				.stream().collect(Collectors.toList())
		);

		//		streamTwo.collect(Collectors.toList());

		// Part nr.3 - nieskończone
		//		final List<Double> q = Stream.generate(Math::random) // Ciągłe generowanie losowych liczb
		//				.peek(System.out::println) // wyświetlanie losowych liczb
		//				.toList();

		Stream.iterate(0, prev -> prev + 1)
				.peek(System.out::println)
				.toList();
	}
}
