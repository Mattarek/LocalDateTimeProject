package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Practice1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
	public static void main(final String[] args) {
		final Set<String> stringSet = new HashSet<>();
		stringSet.add("First");
		stringSet.add("Two");
		stringSet.add("Three");
		final Stream<String> streamSetString = stringSet.stream();

		final Map<String, String> streamMapString = new HashMap<>();
		streamMapString.put("First", "1");
		streamMapString.put("Second", "2");
		streamMapString.put("Three", "3");

		// Jeśli chcemy używać streamy na Mapach stringowych
		final Stream<Map.Entry<String, String>> stringMapStream = streamMapString.entrySet().stream();
		Stream.of("First", "Second");
	}
}
