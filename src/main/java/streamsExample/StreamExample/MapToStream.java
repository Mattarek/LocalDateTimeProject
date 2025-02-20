package streamsExample.StreamExample;

import java.util.Map;
import java.util.stream.Collectors;

public class MapToStream {
	public static void main(final String[] args) {
		final Map<String, Integer> scores = Map.of(
				"Anna", 90,
				"Kamil", 85,
				"Tomek", 78
		);

		// 1. Stream kluczy
		scores.keySet().stream().forEach(System.out::println); // Anna, Kamil, Tomek

		// 2. Stream wartości
		scores.values().stream().forEach(System.out::println); // 90, 85, 78

		// 3. Stream wpisów (Map.Entry<K,V>
		scores.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

		final Map<String, Integer> filtered = scores.entrySet()
				.stream()
				.filter(entry -> entry.getValue() >= 85)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(filtered); // {Anna=90, Kamil=85}
	}
}
