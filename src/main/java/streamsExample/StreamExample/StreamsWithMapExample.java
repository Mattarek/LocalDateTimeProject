package streamsExample.StreamExample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsWithMapExample {
	public static void main(final String[] args) {
		// forEach
		final Map<String, Integer> ageMap = Map.of("Anna", 25, "Kamil", 30, "Ola", 22);
		ageMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " map " + entry.getValue()));
		//		Anna map 25
		//		Kamil map 30
		//		Ola map 22

		// Filtrowanie mapy
		final Map<String, Integer> ageMapToFilter = Map.of("Anna", 25, "Kamil", 30, "Ola", 22);
		final Map<String, Integer> filteredMap =
				ageMap.entrySet().stream().filter(entry -> entry.getValue() > 23).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(filteredMap); // {Kamil=30, Anna=25}

		// ParallelStream
		final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		final int sum = numbers.parallelStream().reduce(0, Integer::sum);
		// Suma: 55
		System.out.println("Suma: " + sum);

		// Debugowanie streamow (peek())
		final List<String> namesPeek = List.of("Anna", "Kamil", "Ola", "Kasia");
		namesPeek.stream()
				.filter(name -> name.length() > 3)
				.peek(name -> System.out.println("Po filtrze: " + name))
				.map(String::toUpperCase)
				.peek(name -> System.out.println("Po mapowaniu: " + name))
				.forEach(System.out::println);
		//		Po filtrze: Anna
		//		Po mapowaniu: ANNA
		//				ANNA
		//		Po filtrze: Kamil
		//		Po mapowaniu: KAMIL
		//				KAMIL
		//		Po filtrze: Kasia
		//		Po mapowaniu: KASIA
		//				KASIA
	}
}
