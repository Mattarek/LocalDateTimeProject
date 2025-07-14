package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Example4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<String> cities = Arrays.asList("Warszawa", "Gdańsk", "Łódź", "Wrocław", "Gdańsk", "Łódź");
		//1 
		final List<Integer> lengths = new ArrayList<>();
		for (final String city : cities) {
			lengths.add(city.length());
		}
		System.out.println("Step1: " + lengths);

		//2
		lengths.sort(Comparator.<Integer, Integer>comparing(a -> a).reversed());
		System.out.println("Step2: " + lengths);

		//3
		final List<Integer> overFive = new ArrayList<>();
		for (final Integer length : lengths) {
			if (length > 5) {
				overFive.add(length);
			}
		}

		System.out.println("Step3: " + overFive);

		//4
		System.out.println(overFive.get(1));
		System.out.println(overFive.get(2));
		System.out.println();

		cities.stream()
				.map(String::length)
				.peek(elem -> System.out.println("Step1: " + elem))
				.sorted(Comparator.<Integer, Integer>comparing(a -> a).reversed());
	}
}
