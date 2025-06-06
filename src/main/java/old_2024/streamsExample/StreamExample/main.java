package old_2024.streamsExample.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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

		//======================================================================================================
		// Obliczamy wartość
		final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		final int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum: " + sum);

		//======================================================================================================
		// Liczymi ilośćelementów w tablicy
		final List<String> names = List.of("Anna", "Kamil", "Ola", "Kasia");
		final long count = names.stream().count();

		System.out.println("Cound: " + count);

		//======================================================================================================
		// max - znajduje największy element
		final List<Integer> numersMax = List.of(10, 12, 15, 22, 32);
		final Optional<Integer> max = numersMax.stream().max(Integer::compareTo);
		max.ifPresent(value -> System.out.println("[Max]: Największa liczba: " + value));
		//======================================================================================================
		// min
		final List<Integer> numbersMin = List.of(2, 3, 4, 5, 6);
		final Optional<Integer> min = numbersMin.stream().min(Integer::compareTo);
		System.out.println("[Min]: " + min);
	}
}
