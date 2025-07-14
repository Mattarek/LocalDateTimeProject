package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Practice3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public class Main {
	public static void main(final String[] args) {
		Arrays.asList(1, 2, 3).stream()
				.filter(i -> i % 2 == 0)
				.map(i -> "Item: " + i)
				.map(i -> BigDecimal.valueOf(i.length()))
				.forEach(System.out::println);

		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16).stream()
				.map(i -> i * 2)
				.skip(3)
				.map(i -> i * 2)
				.skip(2)
				.forEach(System.out::println);
	}
}
