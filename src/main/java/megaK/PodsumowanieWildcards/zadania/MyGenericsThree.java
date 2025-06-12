package megaK.PodsumowanieWildcards.zadania;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class MyGenericsThree {
	public static void main(final String[] args) {
		final Set<Integer> set = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
		final int result = collectionActionCounter(set, e -> e % 2 != 0);
		System.out.println(result);
	}

	public static <T extends Collection<E>, E, F extends Predicate<E>> int collectionActionCounter(final T collection
			, final F predicate) {
		int counter = 0;
		for (final E e : collection) {
			if (predicate.test(e)) {
				counter++;
			}
		}

		return counter;
	}
}
