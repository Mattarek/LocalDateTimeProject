package old_2024.Collections.List;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(final String[] args) {
		final List<String> vector = new Vector<>();

		vector.add("Element1");
		vector.add("Element2");

		System.out.println("Pierwszy element: " + vector.get(0));

		for (final String item : vector) {
			System.out.println(item);
		}
	}
}
