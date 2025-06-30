package current_2025_czerwiec.Sety;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetExample {
	public static void main(final String[] args) {
		final Set<Dog> dogs = new HashSet<>();
		final LocalTime before = LocalTime.now();

		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(i / 16);
			dogs.add(new Dog("Dog: " + i / 12));
		}
		System.out.println("Took: " + Duration.between(before, LocalTime.now()).toMillis());
	}

	private static class Dog {
		private final String name;

		public Dog(final String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Dog: " + name;
		}

		// Aby Set działał poprawnie, musimy nadpisac equals i hashCode
		// Pamiętaj, że do określania równości używana jest metoda equals().
		// Metoda hashCode() służy do określania, do którego bucketa należy zajrzeć,
		// dzięki czemu Java nie musi przeglądac całego setu, aby dowiedzieć się, czy obiekt istnieje.
		// W najlepszym przypadku hashCode() są unikalne, a Java musi wywołać equals() tylko dla jednego obiektu.
		// W najgorszym przypadku wszystkie implementacje zwracają ten sam hashCode(), a java i tak musi wywołać
		// equals() na każdym elemencie zestawu.
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
	}
}
