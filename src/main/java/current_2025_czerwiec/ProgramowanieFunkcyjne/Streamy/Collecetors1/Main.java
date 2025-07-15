package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Collecetors1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
	public static void main(final String[] args) {
		final List<String> cities = Arrays.asList("Warszawa", "Lublin", "Wrocław", "Wrocław", "Kraków", "Poznań",
				"Łódź", "Krosno");

		// counting - zliczanie ilości elementó w tablicy
		final long countResult = cities.stream()
				.map(a -> a.length())
				.collect(Collectors.counting());
		System.out.println(countResult);

		// joining - łączenie stringow
		// joinging może być używany przy stremach ale możemy go też użyć do klas które używają CharSequence
		final String collect = cities.stream()
				.filter(v -> v.length() > 6)
				.collect(Collectors.joining("==-==", "start", "end")); // startWarszawa==-==Wrocław==-==Wrocławend
		System.out.println(collect);

		// toCollection
		final Set<String> collectToSet = cities.stream()
				.filter(v -> v.length() > 6)
				.collect(Collectors.toCollection(TreeSet::new)); // startWarszawa==-==Wrocław==-==Wrocławend
		System.out.println(collectToSet); // [Warszawa, Wrocław]

		// maxBy minBy - określamy sposób porównywania elementów
		final Optional<String> stringCollect =
				cities.stream().collect(Collectors.minBy(Comparator.<String>naturalOrder().reversed()));
		System.out.println(stringCollect); // Optional[Wrocław]

		// map -
		final Integer reduce = cities.stream()
				.map(String::length)
				.reduce(0, (a, b) -> a + b);
		System.out.println(reduce); // 40

		// mapp - pozwala nam na dodatkowy poziom mapowania, ten poniższy map robi dokładnie to samo co ten powyżej
		final Optional<Integer> reduce2 = cities.stream()
				.collect(Collectors.mapping(String::length, Collectors.reducing((a, b) -> a + b)));
		System.out.println(reduce2); // Optional[40]

		// toMap
		// final Map<String, Integer> q = cities.stream().collect(Collectors.toMap(key -> key, value -> value.length()));
		final Map<String, Integer> mapString = cities.stream()
				.collect(Collectors.toMap(String::toLowerCase, String::length, (_, replacement) -> replacement));
		mapString.forEach((k, v) -> System.out.println("k: " + k + " " + "v: " + v));

		//
		final Map<Integer, List<String>> result = cities.stream()
				.collect(Collectors.toMap(
						String::length,      // 1️⃣ Z każdego elementu strumienia (String z listy cities) pobieramy jego długość.
						List::of,            // 2️⃣ oznacza: utwórz jednoelementową listę z tego Stringa.
						Main::merge,         // 3️⃣ sposób łączenia wartości (merge)
						TreeMap::new         // 4️⃣ rodzaj mapy
				));
		System.out.println(result.getClass());

		// partitioningBy
		final Map<Boolean, Set<String>> resultMapPartitioningBy = cities.stream()
				.collect(Collectors.partitioningBy(city -> city.length() > 6, Collectors.toCollection(TreeSet::new))); // {false

		System.out.println(resultMapPartitioningBy);

		//		class java.util.TreeSet
		//		Key: false, value: [Kraków, Lublin, Poznań]
		//		class java.util.TreeSet
		//		Key: true, value: [Warszawa, Wrocław]
		resultMapPartitioningBy.forEach((k, v) -> {
			System.out.println(v.getClass());
			System.out.println("Key: " + k + ", value: " + v);
		});

		// groupiingBy
		// Przyklad 1
		final Map<Integer, Set<String>> intMap = cities.stream()
				.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toCollection(TreeSet::new)));
		System.out.println(intMap.getClass()); // {4=[Łódź], 6=[Lublin, Kraków, Poznań, Krosno], 7=[Wrocław, Wrocław],
		// 8=[Warszawa]}

		// Przyklad 2 .collect(Collectors.groupingBy(String::length, Collectors.joining()));
		// Stwórz klucze, które będągrupować nam elementy, według długosci, gdzie klucz to String::length
		// w drugim agrumencie wstawiamy, co chcemy zrobić z naszymi values, tutaj .joining, czyli je łączymy
		final Map<Integer, String> resultIntStr = cities.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.joining()));
		System.out.println(resultIntStr); // {4=Łódź, 6=LublinKrakówPoznańKrosno, 7=WrocławWrocław, 8=Warszawa}

		// Przykłąd 3
		final Map<Integer, Long> resultIntLong = cities.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(resultIntLong); // {4=1, 6=4, 7=2, 8=1}

		// Przykłąd 4 - mapping, dodatkowa warstwa na operacje
		final Map<Integer, Optional<String>> citiesStream = cities.stream()
				.collect(Collectors.groupingBy(
						String::length,
						Collectors.mapping(
								(String s) -> s.toUpperCase(),
								Collectors.maxBy(Comparator.naturalOrder())
						)
				));
		System.out.println(citiesStream);
	}

	private static List<String> merge(final List<String> left, final List<String> right) {
		final List<String> result = new ArrayList<>(left);
		result.addAll(right);
		return result;
	}
}
