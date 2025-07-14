package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Example4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(final String[] args) {
		//		final List<String> cities = Arrays.asList("Warszawa", "Gdańsk", "Łódź", "Wrocław", "Gdańsk", "Łódź");
		//		//1
		//		final List<Integer> lengths = new ArrayList<>();
		//		for (final String city : cities) {
		//			lengths.add(city.length());
		//		}
		//		System.out.println("Step1: " + lengths);
		//
		//		//2
		//		lengths.sort(Comparator.<Integer, Integer>comparing(a -> a).reversed());
		//		System.out.println("Step2: " + lengths);
		//
		//		//3
		//		final List<Integer> overFive = new ArrayList<>();
		//		for (final Integer length : lengths) {
		//			if (length > 5) {
		//				overFive.add(length);
		//			}
		//		}
		//
		//		System.out.println("Step3: " + overFive);
		//
		//		//4
		//		System.out.println(overFive.get(1));
		//		System.out.println(overFive.get(2));
		//		System.out.println();
		//
		//		cities.stream()
		//				.map(String::length)
		//				.peek(elem -> System.out.println("Step1: " + elem))
		//				.sorted(Comparator.<Integer, Integer>comparing(a -> a).reversed());

		// ====================================================
		// Part.2
		final List<String> cities = Arrays.asList("Warszawa", "Gdańsk", "Łódź", "Wrocław", "Gdańsk", "Łódź");
		final List<String> citiesFiltered = cities.stream()
				.filter(element -> element.length() > 5)
				.sorted(Comparator.<String>naturalOrder().reversed())
				// czasm wynik sorted moze nas zdziwić ale
				// trzeba pamiętać, że sorted musi zebrać wszystkie elementy, więc dalsz limit(2)\
				// też został tu już zastosowany
				.limit(2)
				.toList();

		System.out.println(citiesFiltered);
	}
}
