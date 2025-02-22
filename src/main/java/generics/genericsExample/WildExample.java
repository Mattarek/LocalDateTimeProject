package generics.genericsExample;

import java.util.List;

public class WildExample {
	public static void printList(final List<?> list) {
		for (final Object elem : list) {
			System.out.println(elem);
		}
	}

	public static void main(final String[] args) {
		final List<String> stringList = List.of("A", "B", "C", "D");
		final List<Integer> intList = List.of(1, 2, 3);
		printList(stringList);
		printList(intList);
	}
}
