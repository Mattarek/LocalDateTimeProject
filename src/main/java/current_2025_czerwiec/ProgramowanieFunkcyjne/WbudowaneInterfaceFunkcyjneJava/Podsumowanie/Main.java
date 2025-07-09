package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.Podsumowanie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
	public static void main(final String[] args) {
		//=========================================================================================
		//		final Optional<String> optionalString = Optional.of("S").filter(s -> s.length() > 3);
		//		System.out.println(optionalString);
		//
		//		final List<String> list = new ArrayList<>();
		//		list.add("Test1");
		//		list.add("Test2");
		//		list.add("Test3");
		//		list.add("Test4");
		//		list.add("Test5");
		//		list.add("T5");
		//		list.add("T23");
		//
		//		list.removeIf(s -> s.length() > 3);
		//		System.out.println(list);
		//
		//		Optional.of(1).ifPresent(c -> System.out.println(1));
		//		// Jeśli mamy Optional.empty(), to nie
		//		// wiemy jaki będzie typ wiec, Optional.empty() ma typ Object
		//		final String s = Optional.<String>empty().orElse("default value");
		//		System.out.println(s);

		//=================================================================================
		//		final Map<Integer, String> map = new HashMap<>();
		//		map.put(1, "Cat");
		//		map.put(2, "NotCat");
		//		map.forEach((t, u) -> {
		//			System.out.println("Value for key: " + t + " is: " + u);
		//		});

		//=================================================================================
		//		Optional.of("SomeValue").map(Cat::new);

		//=================================================================================
		//		final Map<Integer, String> mapReplace = new HashMap<>();
		//		mapReplace.put(1, "Cat");
		//		mapReplace.put(2, "NotCat");
		//		//		mapReplace.forEach((t, u) -> System.out.println("T: " + t + " U: " + u));
		//		mapReplace.replaceAll((t, u) -> "T:" + t.toString() + " U:" + u);
		//		System.out.println(mapReplace);

		//=================================================================================
		final List<String> stringList = new ArrayList<>();
		stringList.add("qwqfSFAFAAasdad");
		stringList.add("ASsss");
		stringList.add("DAAdwq");
		// UnaryOperator, przyjmuje ten sam typ który zwraca, czyli implementacja Function<T, T>
		stringList.replaceAll(String::toLowerCase);
		System.out.println(stringList);
	}

	private static class Cat {
		public Cat(final String s) {
		}
	}
}
