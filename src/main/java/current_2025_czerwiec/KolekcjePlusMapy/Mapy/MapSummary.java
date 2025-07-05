package current_2025_czerwiec.KolekcjePlusMapy.Mapy;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class MapSummary {
	public static void main(final String[] args) {
		// Compare przekazane w TreeMap<>(...) ma pierwszeństwo nad compareTo
		final Map<Cat, Integer> stringMap = new TreeMap<>((o1, o2) -> {
			System.out.println("Comparator calling");
			return o2.name.compareTo(o1.name);
		});
		stringMap.put(new Cat("Burek"), 1);
		stringMap.put(new Cat("Tygrys"), 2);
		stringMap.put(new Cat("Czarnuch"), 3);

		System.out.println(stringMap);
	}

	public static class Cat implements Comparable<Cat> {
		private final String name;

		public Cat(final String name) {
			this.name = name;
		}

		@Override
		public boolean equals(final Object o) {
			System.out.println("Equals run...");
			if (!(o instanceof final Cat cat)) {
				return false;
			}
			return Objects.equals(name, cat.name);
		}

		@Override
		public int hashCode() {
			System.out.println("HashCode run...");
			return Objects.hashCode(name);
		}

		@Override
		public String toString() {
			return "Cat{" +
					"name='" + name + '\'' +
					'}';
		}

		@Override
		public int compareTo(@NotNull final Cat o) {
			System.out.println("CompareTo run...");
			return name.compareTo(o.name);
		}
	}
}
