package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Collecetors1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(final String[] args) {
		final List<String> cities = Arrays.asList("Warszawa", "Lublin", "Wrocław", "Wrocław", "Kraków", "Poznań");

		// counting - zliczanie ilości elementó w tablicy
		final long countResult = cities.stream()
				.map(a -> a.length())
				.collect(Collectors.counting());
		System.out.println(countResult);

		// joining - łączenie stringow
		// joinging może być używany przy stremach ale możemy go też użyć do klas które używają CharSequence
		final String collect = cities.stream()
				.filter(v -> v.length() > 6)
				.collect(Collectors.joining("==-==", "start", "end")); // startWarszawa==-==Wrocław==-==Wrocławend
		System.out.println(collect);
	}
}
