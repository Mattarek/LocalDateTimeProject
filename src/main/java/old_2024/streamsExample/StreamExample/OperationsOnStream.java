package old_2024.streamsExample.StreamExample;

import java.util.List;
import java.util.stream.Collectors;

public class OperationsOnStream {
	public static void main(final String[] args) {
		final List<String> names = List.of("Anna", "Jan", "Paweł", "Anna");

		final List<String> filteredNames = names.stream()
				.distinct() // usuwamy duplikaty
				.filter(name -> name.length() > 3) // Filtruje po długości
				.map(String::toUpperCase) // Zmienia na wielkie litey
				.sorted() // Sotrujemy alfabetycznie
				.collect(Collectors.toList()); // Konwertuje do listy

		System.out.println(filteredNames);
	}
}
