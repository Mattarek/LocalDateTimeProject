package current_2025_czerwiec.KolekcjePlusMapy.Mapy;

import java.util.Map;
import java.util.Objects;

public class LinkedHashMap {
	public static void main(final String[] args) {
		final Map<Dog, Integer> linkedHashMap = new java.util.LinkedHashMap<>();
		linkedHashMap.put(new Dog("A"), 123);
		linkedHashMap.put(new Dog("Z"), 321);
		linkedHashMap.put(new Dog("F"), 213);
		linkedHashMap.put(new Dog("X"), 553);
		linkedHashMap.put(new Dog("E"), 658);

		System.out.println(linkedHashMap);

		for (final Map.Entry<Dog, Integer> stringIntegerEntry : linkedHashMap.entrySet()) {
			System.out.println(stringIntegerEntry);
		}
	}

	private static class Dog {
		private String name;

		public Dog(final String name) {
			this.name = name;
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
