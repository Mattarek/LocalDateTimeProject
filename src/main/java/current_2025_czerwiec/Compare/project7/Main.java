package current_2025_czerwiec.Compare.project7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	//🧠 Zadanie 6: Użycie TreeSet z własnym Comparator
	//📌 Opis:
	//	Stwórz klasę Student, która ma:
	//	String name double GPA
	//	Umieść studentów w TreeSet, sortując:
	//	najpierw po GPA malejąco,
	//	potem alfabetycznie po imieniu.

	public static void main(final String[] args) {
		final Comparator<Student> studentComparator = Comparator
				.comparingDouble(Student::getGpa)
				.reversed()
				.thenComparing(Student::getName);

		final Set<Student> students = new TreeSet<>(studentComparator);

		students.add(new Student("Anna", 3.8));
		students.add(new Student("Tomek", 4.0));
		students.add(new Student("Zosia", 4.0));
		students.add(new Student("Bartek", 3.5));
		students.add(new Student("Adam", 4.0));

		students.forEach(System.out::println);
	}
}
