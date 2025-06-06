package old_2024.streamsExample.StreamExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyStreams {
	public static void main(final String[] args) {
		final List<String> names = List.of("Anna", "Kamil", "Zosia", "Tomek");

		final Stream<String> stream = names.stream()
				.filter(name -> {
					System.out.println("Sprawdzam: " + name);
					return name.startsWith("A");
				});

		System.out.println("Strumień jeszcze się nie wykonał!");

		// Teraz wykonujemy operację terminalną -> strumień się uruchamia
		final List<String> result = stream.collect(Collectors.toList());

		System.out.println("Wynik: " + result);
	}
}
