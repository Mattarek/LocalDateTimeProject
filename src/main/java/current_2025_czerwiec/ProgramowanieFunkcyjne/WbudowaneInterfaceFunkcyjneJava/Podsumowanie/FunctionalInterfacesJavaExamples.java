package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.Podsumowanie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterfacesJavaExamples {
	public static void main(final String[] args) {
		final Map<Integer, Cat> someMap = new HashMap<>();
		someMap.put(1, new Cat("Zajavka1"));
		someMap.put(1, new Cat("Zajavka2"));
		someMap.put(1, new Cat("Zajavka3"));
		someMap.put(1, new Cat("Zajavka4"));
		System.out.println(someMap);
		someMap.replaceAll((ket, value) -> new Cat(value.name + "changed"));

		final List<String> lists = new ArrayList<>();
		lists.add("Q");
		lists.add("W");
		lists.add("E");
		lists.replaceAll(String::toUpperCase);
		System.out.println(lists);
	}

	static class Cat {
		private final String name;

		public Cat(final String name) {
			this.name = name;
		}
	}
}
