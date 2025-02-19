package streamsExample.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
	public static void main(final String[] args) {
		final List<String> stringList = Arrays.asList("Anna", "Kamil", "Zosia", "Tomek", "Anna");
		// Filtrowanie
		final List<String> filteredStringList =
				stringList.stream().filter(name -> !name.endsWith("a")).collect(Collectors.toList());
		System.out.println(filteredStringList);

		final List<String> filteredStringListWithNotA =
				stringList.stream().filter(name -> !name.endsWith("a")).collect(Collectors.toList());
		System.out.println(filteredStringListWithNotA);
	}
}
