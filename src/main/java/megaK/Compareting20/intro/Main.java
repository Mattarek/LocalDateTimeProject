package megaK.Compareting20.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
	public static void main(final String[] args) {
		//		final List<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
		//		final List<String> stringsSecond = new ArrayList<>(List.of("1", "2", "3", "4"));
		//		final List<String> stringsThree = new ArrayList<>();
		//		stringsThree.addAll(List.of("1", "2", "3", "4"));
		//
		//		final List<String> stringsFour = new ArrayList<>();
		//		Collections.addAll(strings, "1", "2", "3", "4", "5");
		//
		//		System.out.println(strings);

		//		final List<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
		//		final Comparator<String> comparator = Comparator.<String>naturalOrder().reversed(); // sposób domyślnego sortowania
		//		// Sposób nr.1
		//		// Collections.sort(strings, comparator); // po przecinku ctrl + p aby podpowiedzieć jak możemy przeciążyć
		//		// metode
		//
		//		strings.sort(comparator);
		//		System.out.println(strings);
		final List<Cat> cats = new ArrayList<>();
		cats.add(new Cat(1, "Roman"));
		cats.add(new Cat(2, "Zbyszek"));
		cats.add(new Cat(3, "Rafał"));
		cats.add(new Cat(4, "Stefan"));
		cats.add(new Cat(5, "Roman"));
		cats.add(new Cat(3, "Roman"));
		cats.add(new Cat(7, "Roman"));
		cats.add(new Cat(6, "Karol"));
		System.out.println(cats);

		//		final Comparator<Cat> myFirstComparator = new Comparator<Cat>() {
		//			// Na numberach
		//			//			@Override
		//			//			public int compare(final Cat o1, final Cat o2) {
		//			//				// jeśli używamy compare, to ważne aby equals też zwracał ten sam wynik
		//			//				return o2.getId() - o1.getId();
		//			//			}
		//
		//			// Najpierw porównujemy nazwami, a zaraz potem porównujemy idkami
		//			@Override
		//			public int compare(final Cat o1, final Cat o2) {
		//				if (o1 == null) {
		//					return 1;
		//				}
		//				if (o2 == null) {
		//					return -1;
		//				}
		//
		//				final int result = o2.getName().compareTo(o1.getName());
		//				// jeśli używamy compare, to ważne aby equals też zwracał ten sam wynik
		//				if (result != 0) {
		//					return result;
		//				}
		//				return o1.getId() - o2.getId();
		//			}
		//		};

		final Comparator<Cat> mySecondComparator = Comparator.comparing(Cat::getName).reversed();
		mySecondComparator.thenComparing((o1, o2) -> o1.getId() - o2.getId());

		cats.sort(mySecondComparator);
		System.out.println(cats);
	}
}
