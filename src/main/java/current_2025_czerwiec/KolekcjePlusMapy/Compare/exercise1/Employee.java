package current_2025_czerwiec.KolekcjePlusMapy.Compare.exercise1;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private final String name;
	private final String lastName;
	private final int age;
	private final BigDecimal salary;

	public Employee(final String name, final String lastName, final int age, final BigDecimal salary) {
		this.name = name;
		this.salary = salary;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getSalary() {
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
	public int compareTo(@NotNull final Employee e) {

		// Bardziej ręcznie:
		//		final int nameComparisionResult = name.compareTo(o.name);
		//		if (nameComparisionResult != 0) {
		//			return nameComparisionResult;
		//		}
		//
		//		final int lastNameComparisionResult = lastName.compareTo(o.lastName);
		//		if (lastNameComparisionResult != 0) {
		//			return lastNameComparisionResult;
		//		}
		//
		//		final int ageComparisionResult = age - o.age;
		//		if (ageComparisionResult != 0) {
		//			return ageComparisionResult;
		//		}
		//
		//		final int salaryComparisionResult = salary.compareTo(o.salary);
		//		if (salaryComparisionResult != 0) {
		//			return salaryComparisionResult;
		//		}
		//		return 0;

		// Jako Comparator:
		return Comparator
				.comparing(Employee::getName)                       // imię rosnąco
				.thenComparing(Employee::getLastName, Comparator.reverseOrder()) // nazwisko malejąco
				.thenComparingInt(Employee::getAge)                      // wiek rosnąco
				.thenComparing(Employee::getSalary, Comparator.reverseOrder()) // wypłata malejąco
				.compare(this, e); // porównaj ten obiekt(this) i obiekt który zostanie przekazany: o
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
