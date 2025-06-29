package current_2025_czerwiec.Compare.exercise1;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
	private final String name;
	private final String lastName;
	private final int age;
	private final double salary;

	public Employee(final String name, final String lastName, final int age, final double salary) {
		this.name = name;
		this.salary = salary;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public String getLastName() {
		return lastName;
	}

	// # Naturalny porządek sortowania:
	//	comparing(...) – ustala pierwsze kryterium sortowania
	//	thenComparing(...) – kolejne kryteria, jeśli wcześniejsze są równe
	//	Comparator.reverseOrder() – zmiana porządku z rosnącego na malejący

	@Override
	public int compareTo(@NotNull final Employee o) {
		return Comparator
				.comparing(Employee::getName)                       // imię rosnąco
				.thenComparing(Employee::getLastName, Comparator.reverseOrder()) // nazwisko malejąco
				.thenComparingInt(Employee::getAge)                      // wiek rosnąco
				.thenComparing(Employee::getSalary, Comparator.reverseOrder()) // wypłata malejąco
				.compare(this, o); // porównaj ten obiekt(this) i obiekt który zostanie przekazany: o
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}
}
