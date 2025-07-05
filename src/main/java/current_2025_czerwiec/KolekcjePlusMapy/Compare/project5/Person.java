package current_2025_czerwiec.KolekcjePlusMapy.Compare.project5;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
	//	Opis:
	//		Stwórz klasę Person z polami:
	//
	//	String name
	//	int age
	//
	//	Część A (Comparable):
	//	Zaimplementuj Comparable, sortując ludzi rosnąco po wieku.
	//	Część B (Comparator):
	//	Stwórz Comparator<Person>, który sortuje alfabetycznie po imieniu, a jeśli imię jest takie samo — po wieku.
	private final String name;
	private final int age;

	public Person(final String name, final int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(@NotNull final Person o) {
		return Integer.compare(age, o.age);
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
