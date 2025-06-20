package current_2025.ComparableTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<Dog> dogs = new ArrayList<>();

		dogs.add(new Dog(1, "Marcin"));
		dogs.add(new Dog(2, "Patryk"));
		dogs.add(new Dog(3, "Sylwia"));
		dogs.add(new Dog(4, "Marcin"));
		dogs.add(new Dog(5, "Marek"));
		dogs.add(new Dog(6, "Mariusz"));

		System.out.println(dogs);
		Collections.sort(dogs);
		System.out.println(dogs);
	}
}
