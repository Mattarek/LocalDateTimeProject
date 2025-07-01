package current_2025_czerwiec.Mapy;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(final String[] args) {
		// Construction of sorted collection with non-comparable elements
		// Sposób nr.1 przez comparator
		// final Map<Dog, String> treeMap = new TreeMap<>(Comparator.comparing(o -> o.name));
		//		treeMap.put(new Dog("A"), "SomeA");
		//		treeMap.put(new Dog("B"), "SomeB");
		//		treeMap.put(new Dog("D"), "SomeD");
		//		treeMap.put(new Dog("E"), "SomeE");
		//		treeMap.put(new Dog("C"), "SomeC");
		//		System.out.println(treeMap);

		// Sposób nr.2, implementująć interface Comparable w klasie i nadpisanie compareTo
		final Map<Dog, String> treeMap = new TreeMap<>();
		treeMap.put(new Dog("A"), "SomeA");
		treeMap.put(new Dog("B"), "SomeB");
		treeMap.put(new Dog("D"), "SomeD");
		treeMap.put(new Dog("E"), "SomeE");
		treeMap.put(new Dog("C"), "SomeC");
		System.out.println(treeMap);

		final NavigableMap<Integer, Integer> navigableMap = new TreeMap<>();
	}

	private static class Dog implements Comparable<Dog> {
		private String name;

		public Dog(final String name) {
			this.name = name;
		}

		@Override
		public int compareTo(@NotNull final TreeMapExample.Dog o) {
			return name.compareTo(o.name);
		}

		public String getName() {
			return name;
		}

		public void setName(final String name) {
			this.name = name;
		}

		@Override
		public boolean equals(final Object o) {
			if (!(o instanceof final Dog dog)) {
				return false;
			}
			return Objects.equals(name, dog.name);
		}

		@Override
		public int hashCode() {
			return Objects.hashCode(name);
		}

		@Override
		public String toString() {
			return "Dog{" +
					"name='" + name + '\'' +
					'}';
		}
	}
}
