package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(final String[] args) {
		final List<String> cities = new ArrayList<>();
		cities.add("Szczecin");
		cities.add("Gdynia");
		cities.add("Zakopane");
		cities.add("Warszawa");

		final Predicate<String> predicate = v -> {
			System.out.println("Calling check for city: " + v);
			return v.contains("i");
		};
		//		print(cities, v -> v.contains("a"));
		print(cities, PredicateExample::stringTest);
	}

	private static boolean stringTest(final String input) {
		System.out.println("Calling check for city: " + input);

		return input.contains("i");
	}

	private static void print(final List<String> cities, final Predicate<String> checker) {
		for (final String city : cities) {
			if (checker.test(city)) { // wywołanie naszej lambdy
				System.out.println(city);
			}
		}
	}
}
