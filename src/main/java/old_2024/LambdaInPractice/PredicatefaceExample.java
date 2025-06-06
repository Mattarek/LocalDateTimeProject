package old_2024.LambdaInPractice;

import java.util.List;
import java.util.function.Predicate;

public class PredicatefaceExample {
	public static void main(final String[] args) {
		// Sprawdzanie czy liczba jest parzysta
		final Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(4));

		// Sprawdzanie czy string zaczyna sie na A
		final Predicate<String> testString = firstLetter -> firstLetter.startsWith("A");
		System.out.println(testString.test("Test"));

		// Sprawdzanie czy liczba jest większa od 50
		final Predicate<Integer> numTest = num -> num > 50;
		System.out.println(numTest.test(30));

		// Sprawdzanie czy lista jest pusta
		final Predicate<List<String>> listIsEmpty = list -> list.isEmpty();
		System.out.println(listIsEmpty.test(List.of()));

		// Sprawdzanie czy lista jest pierwszą
		final Predicate<Integer> isPrime = num -> {
			if (num < 2) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		};
		System.out.println(isPrime.test(17));
		System.out.println(isPrime.test(18));
	}
}
