package current_2025_czerwiec.Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(final String[] args) {
		final List<String> stringList = new ArrayList<>();
		final List<String> list1 = Arrays.asList("a", "B");
		final List<String> list2 = List.of("a", "b", "c");

		// Jakas lista, która implementuje interface List ale
		// jeszcze nie wiemy jaka
		final List<String> list3 = Collections.emptyList();
		final List<String> list4 = Collections.singletonList("a");
		final List<String> list5 = new LinkedList<>();
		final List<String> list6 = new ArrayList<>();

		System.out.println(list6);
		list6.add("a");
		list6.add("b");
		list6.add("c");
		list6.add("d");
		list6.add("e");
		list6.add("f");
		list6.add("b");
		list6.add(list6.size() - 2, "z");
		System.out.println(list6);
		System.out.println(list6.indexOf("b"));
		System.out.println(list6.lastIndexOf("b"));
	}
}
