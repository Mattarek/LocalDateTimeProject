package streamsExample.StreamExample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(final String[] args) {
		final List<String> names = List.of("Anna", "Andrzej", "Kamil", "Karol", "Ola");

		// groupingBy – grupowanie elementów według określonego kryterium
		final Map<Character, List<String>> groupedByFirstLetter =
				names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));

		System.out.println(groupedByFirstLetter); // {A=[Anna, Andrzej], K=[Kamil, Karol], O=[Ola]}
	}
}
