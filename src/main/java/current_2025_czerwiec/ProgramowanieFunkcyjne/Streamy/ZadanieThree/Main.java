package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.ZadanieThree;

import java.util.Arrays;
import java.util.List;

public class Main {
	// 3.Znajdź drugi najmniejszy element na liście

	public static void main(final String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 5, 16, 18, 2, 5, 2, 6, 2, 1, 6, 1, 23, 64, 34);
		final Integer integer = numbers.stream()
				.sorted()
				.distinct()
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("There is no second element!"));

		System.out.println(integer);
	}
}
