package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Example2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(final String[] args) {
		// Wyświetlanie i zwracanie nowej listy
		// Odfiltrowywanie po pierwszym elemencie.
		//		final List<String> stringList = List.of("v1", "v2", "v3");
		//
		//		final List<String> stream = stringList.stream()
		//				.peek(v -> System.out.println("Values: " + v))
		//				.toList();
		//
		//		System.out.println(stream.size());
		//
		//		// Odfiltowujemy tylko te które zaczynają się na litere "A"
		//		final Stream<String> q = Stream.of("Anna", "Anka", "Ola", "Dominik");
		//		q.filter(name -> name.startsWith("A")).forEach(System.out::println);
		//

		//		// count, findFirst | findAny
		//		final List<String> stringList = List.of("v1", "v2", "v3");
		//		final Optional<String> firstResultFirst = stringList.stream().findFirst();
		//		System.out.println(firstResultFirst);
		//
		//		final Optional<String> firstResultAny = stringList.stream().findAny();
		//		System.out.println(firstResultAny);
		//
		//		// Empty
		//		final Optional<String> firstResult = Stream.<String>empty().findAny();
		//		System.out.println(firstResult);
		//
		//		// min | max
		//		final Optional<String> max = stringList.stream().max(String::compareTo);
		//		System.out.println(max);
		//
		//		final Optional<String> min = stringList.stream().min(String::compareTo);
		//		System.out.println(min);
	}
}
