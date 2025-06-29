package current_2025_czerwiec.Compare.project5;

import java.util.Comparator;

public class Main {
	public static void main(final String[] args) {
		final Comparator<Person> nameThenAge = Comparator
				.comparing((Person p) -> p.getName())
				.thenComparingInt(p -> p.getAge());
	}
}
