package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.ZadanieFour;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	// 4. Znajdz drugi największy element na liście poniżej
	public static void main(final String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 5, 16, 18, 2, 5, 2, 6, 2, 1, 6, 1, 100, 23, 64, 34);
		final Integer num = numbers.stream()
				.distinct()
				.max(Comparator.naturalOrder())
				.orElseThrow();
		System.out.println(num);
	}
}
