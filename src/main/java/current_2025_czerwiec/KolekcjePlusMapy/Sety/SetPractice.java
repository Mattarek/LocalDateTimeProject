package current_2025_czerwiec.KolekcjePlusMapy.Sety;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class SetPractice {

	public static void main(final String[] args) {
		final Set<String> stringSet = new HashSet<>();
		final Set<String> sets = Set.of("A");

		// Immutable object is modified - nie wiemy jaki jest to set, a chcemy go zmodyfikować
		sets.add("Abc");
		System.out.println(sets);

		stringSet.add("first");
		stringSet.add("second");

		System.out.println(stringSet);

		final Set<Duck> ducks = new LinkedHashSet();
		ducks.add(new Duck("Q"));
		ducks.add(new Duck("W"));
		ducks.add(new Duck("W"));

		System.out.println(ducks);
	}

	public static class Duck {
		private final String name;

		public Duck(final String name) {
			this.name = name;
		}

		@Override
		public boolean equals(final Object o) {
			if (!(o instanceof final Duck duck)) {
				return false;
			}
			return Objects.equals(name, duck.name);
		}

		@Override
		public int hashCode() {
			return Objects.hashCode(name);
		}

		@Override
		public String toString() {
			return "Duck{" +
					"name='" + name + '\'' +
					'}';
		}
	}
}
