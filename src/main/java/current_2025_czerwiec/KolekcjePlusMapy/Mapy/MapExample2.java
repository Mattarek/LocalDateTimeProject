package current_2025_czerwiec.KolekcjePlusMapy.Mapy;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExample2 {
	public static void main(final String[] args) {
		// Example 1
		//		final Map<Dog, String> dogStringMap = new HashMap<>();
		//
		//		final Dog stefan = new Dog("Stefan");
		//		dogStringMap.put(stefan, "Stefan istnieje");
		//
		//		dogStringMap.put(new Dog("Romek"), "Ma swoj domek");
		//		dogStringMap.put(new Dog("Andrzej"), "Ma swoj szałas");
		//		System.out.println(dogStringMap.get(stefan));
		//		stefan.setName("stefan1");
		//
		//		System.out.println(dogStringMap);
		//		System.out.println(dogStringMap.get(stefan));

		// Example 2
		final Map<Dog, String> dogStringMapTwo = new HashMap<>();
		final LocalTime before = LocalTime.now();
		for (int i = 0; i < 100_000; i++) {
			dogStringMapTwo.put(new Dog("Dog" + i / 15), "Some value");
		}

		System.out.println("Loop took: " + Duration.between(before, LocalTime.now()).toMillis());
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
