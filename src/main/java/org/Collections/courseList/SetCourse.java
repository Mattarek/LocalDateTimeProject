package org.Collections.courseList;

import java.util.HashSet;
import java.util.Set;

public class SetCourse {
	// Set domyślnie nie zachowuje kolejności dodawanych elementów ale dba aby nie było
	// w nim duplikatów. Mamy za to TreeSet, któy implementuje Set -> SortedSet, co sprawia,
	// że jest posortowany.

	// Jeśli stworzymy set
	public static void main(final String[] args) {
		final Set<String> myNewSetFirst = new HashSet<>();
		myNewSetFirst.add("Math");
		myNewSetFirst.add("Warszaw");
		myNewSetFirst.add("Rzeszow");

		final Set<String> myNewSetSecond = new HashSet<>();
		myNewSetSecond.add("Krakow");
		myNewSetSecond.add("Poznan");
		myNewSetSecond.add("Gdynia");

		final Set<String> myNewSetThird = new HashSet<>();
		myNewSetThird.add("Szczecin");
		myNewSetThird.add("Lublin");

		final Set<String> union = new HashSet<>() {{
			addAll(myNewSetFirst);
			addAll(myNewSetSecond);
			addAll(myNewSetThird);
		}};

		System.out.println(union.contains("Lublin"));// true
		System.out.println(union.containsAll(myNewSetThird)); // true

		final Set<Car> carSet = new HashSet<>();
		final Car carOne = new Car("BMW", "12-12-1990", "X6");

		carSet.add(carOne);
		System.out.println(carSet);

		carOne.setName("Audi");
		carSet.add(carOne);
		System.out.println(carSet); // [Car{name='Audi', age='12-12-1990', model='X6'}, Car{name='Audi', age='12-12-1990', model='X6'}]
	}
}
