package megaK.PodsumowanieWildcards.zadania;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class GenericsThree {
	public static void main(final String[] args) {
		final Set<Integer> set = new HashSet<>(List.of(1, 2, 3, 5, 6, 11, 12));
		final int result = collectionActionCounter(set, el -> el % 2 != 0);
		System.out.println(result);
	}

	// 3. Napisz metodę generyczną, która zliczy ilość element w kolekcji, które mają w sobie cś charakterystycznego,
	// np. liczby są nieparzyste, podane wyrazy sąpalindronami. Wykorzystaj predykat.
	// Kolekcja elementów E
	public static <T extends Collection<E>, E, F extends Predicate<E>> int collectionActionCounter(final T collection,
																								   final F predicate
	) {
		int counter = 0;
		// Skrót: iter
		for (final E e : collection) {
			if (predicate.test(e)) {
				counter++;
			}
		}
		return counter;
	}
}
