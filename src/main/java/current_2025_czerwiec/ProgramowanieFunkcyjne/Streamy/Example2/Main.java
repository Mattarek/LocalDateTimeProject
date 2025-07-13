package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(final String[] args) {
		final List<String> stringList = List.of("v1", "v2", "v3");

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

		// // allMatch | anyMatch | noneMatch
		//		final boolean vContains = stringList.stream()
		//				.allMatch(element -> element.contains("v")); // Czy wszystkie elementy mają v?
		//		System.out.println(vContains);
		//
		//		final boolean vAnyMatch = stringList.stream()
		//				.anyMatch(element -> element.contains("v")); // Czy wszystkie elementy mają v?
		//		System.out.println(vAnyMatch);

		//		// noneMatch - true jeśli żadne z elementów ni epasuje
		//		final boolean result = stringList.stream()
		//				.noneMatch(element -> {
		//					System.out.println(element);
		//					return element.contains("1");
		//				});
		//		System.out.println(result);
		//
		//		// forEach - przechodzi po kazdym elemencie ale nie zwracamy nowe listy
		//		// forEach - nie gwarantuje nam kolejnosci
		//		final List<String> forEachArrayList = new ArrayList<>();
		//		stringList.forEach(el -> {
		//			forEachArrayList.add(el);
		//		});
		//		stringList.stream().forEachOrdered(e -> {
		//			System.out.println(e);
		//		});
		//		//		System.out.println("StringList: " + stringList);
		//		//		System.out.println("forEachArrayList: " + forEachArrayList);

		//		// reduce - redukuje cała listę do jednej wartosci
		//		final String[] someChars = {
		//				"z", "a", "k", " ", "a", "w", " ", "q", "e", "t", "u"
		//		};
		//
		//		//musi byc optional aby zapobieac NullPointerExceptions
		//		final String resultArr = Arrays.stream(someChars).reduce("start", (a, b) -> a + ":" + b);
		//		System.out.println(resultArr);

		// Collect
		final String[] someChars = {"z", "a", "k", " ", "a", "w", " ", "q", "e", "t", "u"};
		//		// z streama robimy kolekcje
		//		final List<String> collectList = Stream.of(someChars).collect(Collectors.toList());
		//		System.out.println(collectList);
		//
		//		// z streama robimy set ale
		//		// nie mamy gwarancji jakiego typu bedzie to set, jeśli chcemy to sprawdzić to użymy: collectSet.getClass()
		//		// Jeśli chcemy konkretną implementację, możemy to wymusić: .collect(Collectors.toCollection(() -> newTreeSet<>())
		//		//		final Set<String> collectSet = Stream.of(someChars).collect(Collectors.toSet());
		//		final Set<String> collectSet = Stream.of(someChars).collect(Collectors.toCollection(TreeSet::new));
		//		System.out.println(collectSet.getClass()); // HashSet

		final List<String> collect = Stream.of(someChars)
				.collect(() -> new ArrayList<>(),
						(existingList, nextElement) -> existingList.add(nextElement),
						(leftColl, rightColl) -> leftColl.addAll(rightColl)
				);
		
		System.out.println(collect);
	}
}
