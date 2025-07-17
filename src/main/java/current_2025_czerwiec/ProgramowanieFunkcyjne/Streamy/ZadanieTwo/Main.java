package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.ZadanieTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	// 2. Wykorzystująć Streamy, na podanej tablicy liter wykonaj następująće operacje (w podanej kolejnosci).
	//	- zamień wszystkie litery na wielką literę
	//	- pozbądź się litery 'X'
	//	- posortuj malejąco
	//	- zwróć wynik jako jeden String.
	public static void main(final String[] args) {
		final String[] letters = {"z", "x", "a", "j", "a", "v", "x", "k", "a", "x"};

		// Nie możemy nadpisać comparable w Stringu, dlatego korzystamy z naturalOrder
		final String example = Stream.of(letters).map(String::toUpperCase)
				.filter(letter -> !letter.equals("X"))
				.sorted(Comparator.<String>naturalOrder().reversed())
				.reduce("", (letterA, letterB) -> letterA + letterB);
		System.out.println(example);
	}
}
