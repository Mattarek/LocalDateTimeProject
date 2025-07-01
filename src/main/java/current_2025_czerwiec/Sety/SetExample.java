package current_2025_czerwiec.Sety;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(final String[] args) {
		final List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 2, 1, 3, 2, 4, 2, 3, 1, 2, 3, 81, 57, 64, 23, 34);
		final Set<Integer> hashSet = new HashSet<>(integerList); // Nie sortowane: 64,1,2,34,3,4,81,23,57,
		final Set<Integer> treeSet = new TreeSet<>(integerList); // Posortowane: 1,2,3,4,23,34,57,64,81,
		final Set<Dog> dogsTreeSet = new TreeSet<>();

		dogsTreeSet.add(new Dog("Mar"));
		dogsTreeSet.add(new Dog("Bar"));
		dogsTreeSet.add(new Dog("Far"));
		dogsTreeSet.add(new Dog("Far"));

		System.out.println(dogsTreeSet);

		final NavigableSet<Integer> navInt = new TreeSet<>();

		for (int i = 0; i <= 100; i++) {
			navInt.add(i);
		}

		System.out.println(navInt.lower(75));
		System.out.println(navInt.floor(25));
		System.out.println(navInt.ceiling(50));
		System.out.println(navInt.higher(75));

		//		for (final Integer tree : hashSet) {
		//			System.out.print(tree + ",");
		//		}
		//
		//		System.out.println();
		//
		//		for (final Integer hash : treeSet) {
		//			System.out.print(hash + ",");
		//		}

		// ========================================================
		// Nie mamy gwarancji kolejnosci przechowywania w HashSecie
		//  final Set<Dog> dogs = new HashSet<>();
		//		dogs.add(new Dog("P"));
		//		dogs.add(new Dog("A"));
		//		dogs.add(new Dog("B"));
		//		dogs.add(new Dog("C"));
		//		dogs.add(new Dog("E"));
		//		System.out.println(dogs);

		// ========================================================
		// W LinkedHashSet już mamy taką gwarancję, LinkedHashSet, to podwójnie linkowana LinkedLista pod spodem
		//  final Set<Dog> dogsLinkedHashSet = new LinkedHashSet<>();
		//		dogsLinkedHashSet.add(new Dog("P"));
		//		dogsLinkedHashSet.add(new Dog("A"));
		//		dogsLinkedHashSet.add(new Dog("B"));
		//		dogsLinkedHashSet.add(new Dog("C"));
		//		dogsLinkedHashSet.add(new Dog("E"));
		//		System.out.println(dogsLinkedHashSet);

		// ========================================================
		// Sprawdzenie czasu jeśli nie zaimplementujemy hashCode (do testu zmienić zawartość hashCode na return 1)
		//		final LocalTime before = LocalTime.now();
		//		for (int i = 0; i < 1_000_000; i++) {
		//			System.out.println(i / 16);
		//			dogs.add(new Dog("Dog: " + i / 12));
		//		}
		//		System.out.println("Took: " + Duration.between(before, LocalTime.now()).toMillis());

		// ========================================================
	}

	private static class Dog implements Comparable<Dog> {
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

		@Override
		public int compareTo(@NotNull final Dog o) {
			return o.name.compareTo(name);
		}
	}
}
