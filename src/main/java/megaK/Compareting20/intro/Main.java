package megaK.Compareting20.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
		final List<String> stringsSecond = new ArrayList<>(List.of("1", "2", "3", "4"));
		final List<String> stringsThree = new ArrayList<>();
		stringsThree.addAll(List.of("1", "2", "3", "4"));

		final List<String> stringsFour = new ArrayList<>();
		Collections.addAll(strings, "1", "2", "3", "4", "5");

		System.out.println(strings);

		final Comparator<String> comparator = Comparator.<String>naturalOrder().reversed(); // sposób domyślnego sortowania
		// Sposób nr.1
		// Collections.sort(strings, comparator); // po przecinku ctrl + p aby podpowiedzieć jak możemy przeciążyć
		// metode

		strings.sort(comparator);
		System.out.println(strings);
	}
}
