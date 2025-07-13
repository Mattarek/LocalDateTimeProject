package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	public static void main(final String[] args) {
		final List<Person> people = Arrays.asList(
				new Person("Andrzej", new City("Warszawa")),
				new Person("Tomek", new City("Gdańsk")),
				new Person("Marek", new City("Łódź")),
				new Person("Arek", new City("Szczecin")),
				new Person("Olek", new City("Zakopane")),
				new Person("Dagmara", new City("Zawierciewa"))
		);

		final AtomicInteger counter = new AtomicInteger(0);// domyślnie 0

		final String collect = people.stream()
				.map(Person::getCity)
				.map(city -> city.getName() + counter.incrementAndGet())
				.map(String::toUpperCase)
				.reduce("", (a, b) -> String.format("%s-%s", a, b));
		System.out.println(collect);

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
	}

	static class Person {
		private final String name;
		private final City city;

		public Person(final String name, final City city) {
			this.name = name;
			this.city = city;
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

