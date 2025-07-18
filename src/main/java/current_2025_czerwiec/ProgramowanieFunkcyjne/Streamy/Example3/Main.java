package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Example3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
	public static void main(final String[] args) {
		// Part.1
		//		final List<Person> people = Arrays.asList(
		//				new Person("Andrzej", new City("Warszawa")),
		//				new Person("Tomek", new City("Gdańsk")),
		//				new Person("Marek", new City("Łódź")),
		//				new Person("Arek", new City("Szczecin")),
		//				new Person("Olek", new City("Zakopane")),
		//				new Person("Dagmara", new City("Zawierciewa"))
		//		);
		//
		//		final AtomicInteger counter = new AtomicInteger(0);// domyślnie 0
		//
		//		final String collect = people.stream()
		//				.map(Person::getCity)
		//				.map(city -> city.getName() + counter.incrementAndGet())
		//				.map(String::toUpperCase)
		//				.reduce("", (a, b) -> String.format("%s-%s", a, b));
		//		System.out.println(collect);

		// Part.2
		//		final List<Person> strAO = strings.stream()
		//				.filter(city -> city.name.contains("a"))
		//				.filter(city -> city.name.contains("o"))
		//				.toList(); // lista która zawiera a i o
		//		System.out.println(strAO);
		//
		//		final List<Person> strAorO = strings.stream()
		//				.filter(city -> city.name.contains("a") || city.name.contains("o"))
		//				.toList();
		//		System.out.println(strAorO);

		//		// Part.3 - flatMap - spłaszczanie tablic
		//		final List<String> citiesOne = Arrays.asList("Warszawa", "Gdańsk", "Łódź", "Wrocław");
		//		final List<String> citiesTwo = Arrays.asList("Białystok", "Gdańsk", "Łódź", "Kraków");
		//		final List<String> citiesThree = Arrays.asList("Warszawa", "Rzeszów", "Szczecin", "Gdynia", "Grańsk");
		//		final List<List<String>> citiesList = List.of(citiesOne, citiesTwo, citiesThree);
		//		System.out.println(citiesList);
		//
		//		// Spłaszczamy [[],[],[]] do []
		//		final List<String> stream = citiesList.stream() //
		//				.flatMap(Collection::stream).toList();
		//
		//		System.out.println(stream);

		//		//		 Part.4 Peek -
		//				final List<Person> people = Arrays.asList(
		//						new Person("Andrzej", new City("Warszawa")),
		//						new Person("Tomek", new City("Gdańsk")),
		//						new Person("Marek", new City("Łódź")),
		//						new Person("Arek", new City("Szczecin")),
		//						new Person("Olek", new City("Zakopane")),
		//						new Person("Dagmara", new City("Zawierciewa"))
		//				);
		//				final List<Integer> collect = people.stream()
		//						.peek(el -> System.out.println("Step1: " + el))
		//						.map(Person::getCity)
		//						.peek(c -> System.out.println("Step2: " + c))
		//						.map(City::getName)
		//						.peek(el -> System.out.println("Step3: " + el))
		//						.map(String::length)
		//						.toList();
		//				System.out.println(collect);

		//		// Distinct - służy do odsiania duplikatów
		//		final List<City> cities = Arrays.asList(
		//				new City("Warszawa"),
		//				new City("Gdańsk"),
		//				new City("Łódź"),
		//				new City("Szczecin"),
		//				new City("Szczecin"),
		//				new City("Szczecin"),
		//				new City("Zakopane"),
		//				new City("Zawierciewa")
		//		);
		//
		//		final String collect = cities.stream()
		//				.distinct()
		//				// usuwa dupliakty, działa na typy proste ale w przypadku new City(), porównuje
		//				// referencje a te są różne, aby porównywac też typy złożone, musimy wygenerować equals i hashCode
		//				.map(City::getName)
		//				.collect(Collectors.joining(","));
		//
		//		System.out.println(collect);

		//		// Limit
		//		final List<String> cities = Arrays.asList(
		//				"Warszawa",
		//				"Gdańsk",
		//				"Łódź",
		//				"Szczecin",
		//				"Szczecin",
		//				"Szczecin",
		//				"Zakopane",
		//				"Zawierciewa"
		//		);
		//
		//		final Stream<String> citiesOne = Stream.iterate("Start:    ", a -> a + 1); // 10 liter więc a to 10
		//
		//		citiesOne
		//				.peek(element -> System.out.println(1 + element))
		//				.map(String::length)
		//				.peek(elem -> System.out.println("Step2: " + elem))
		//				.limit(3) // ograniczamy ilość elementów które przeprocesowywane
		//				.forEach(e -> System.out.println("Step3: " + e));
		//
		//		System.out.println(citiesOne);

		//	// Skip
		//		final List<String> cities = Arrays.asList(
		//				"Warszawa",
		//				"Gdańsk",
		//				"Łódź",
		//				"Szczecin",
		//				"Szczecin",
		//				"Szczecin",
		//				"Zakopane",
		//				"Zawierciewa"
		//		);
		//
		//		final Stream<String> citiesOne = Stream.iterate("Start", elem -> elem + ";");
		//
		//		citiesOne
		//				.peek(elem -> System.out.println("Step: " + elem))
		//				.map(String::length)
		//				.peek(elem -> System.out.println("Elem2: " + elem))
		//				.skip(2)
		//				// skipujemy pierwsze n (w tym przykladzie 2 elementy, czyli nie przechodzimy do kolejnych
		//				// kroków, a po prostu przechodzimy do kolejnego elementu
		//				.peek(elem -> System.out.println("Step3: " + elem))
		//				.forEach(elem -> System.out.println("Step4: " + elem));

		//		// sorted - sortowanie
		//		final List<String> cities = Arrays.asList(
		//				"Warszawa",
		//				"Gdańsk",
		//				"Łódź",
		//				"Szczecin",
		//				"Szczecin",
		//				"Szczecin",
		//				"Zakopane",
		//				"Zawierciewa"
		//		);
		//
		//		final Stream<String> citiesOne = Stream.iterate("Start", elem -> elem + ";");
		//
		//		citiesOne
		//				.peek(el -> System.out.println("Step1: " + el))
		//				.limit(10)
		//				.sorted() // domyślne sortowanie: cyfry, duże litery, małe litery, polskie znaki, operacja sorted
		//				// musi poczekać na wszystkie elementy w streamie, aby móc je zebrać w jednym miejscu
		//				// metoda sorted czeka, aż wszysatkie elementy do niej dotrą.
		//				// więc jeśli uzywamy go z stream.iterate, to musimy ograniczyć ten iterate, bo sorted nie wykona się
		//				// nigdy
		//				.forEach(elem -> System.out.println("Elem2: " + elem));

		// Sortowanie na liście obiektów
		final List<Person> people = Arrays.asList(
				new Person("Andrzej", new City("Warszawa")),
				new Person("Tomek", new City("Gdańsk")),
				new Person("Marek", new City("Łódź")),
				new Person("Arek", new City("Szczecin")),
				new Person("Olek", new City("Zakopane")),
				new Person("Dagmara", new City("Zawierciewa"))
		);
		people.stream()
				.sorted(Comparator.comparing(Person::getName))
				.toList();
	}

	static class Person {
		private final String name;
		private final City city;

		public Person(final String name, final City city) {
			this.name = name;
			this.city = city;
		}

		public String getName() {
			return name;
		}

		public City getCity() {
			return city;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", city=" + city +
					'}';
		}
	}

	static class City {
		private final String name;

		public City(final String name) {
			this.name = name;
		}

		@Override
		public boolean equals(final Object o) {
			if (!(o instanceof final City city)) {
				return false;
			}
			return Objects.equals(name, city.name);
		}

		@Override
		public int hashCode() {
			return Objects.hashCode(name);
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "City{" +
					"name='" + name + '\'' +
					'}';
		}
	}
}

