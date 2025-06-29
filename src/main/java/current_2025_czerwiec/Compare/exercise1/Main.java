package current_2025_czerwiec.Compare.exercise1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<Employee> employees = Arrays.asList(
				new Employee("Marcin", "Barć", 28, 8000),
				new Employee("Patryk", "Barć", 28, 6000),
				new Employee("Sylwia", "Barć", 32, 5000),
				new Employee("Kamil", "Barć", 30, 6000),
				new Employee("Łukasz", "Barć", 32, 5000),
				new Employee("Adrian", "Barć", 32, 3000),
				new Employee("Czesław", "Barć", 52, 6500),
				new Employee("Jolanta", "Barć", 52, 6800),
				new Employee("Stanisław", "Barć", 59, 4000),
				new Employee("Grażyna", "Barć", 60, 4500)
		);

		System.out.println("== Sortowanie według compareTo (naturalny porządek) ==");
		employees.stream().sorted().forEach(System.out::println);

		System.out.println("======================================================");

		System.out.println("\n== Comparator: imię ↓, nazwisko ↓, wiek ↑, wypłata ↑ ==");
		employees.stream()
				.sorted(
						Comparator.comparing(Employee::getName, Comparator.reverseOrder())
								.thenComparing(Employee::getLastName, Comparator.reverseOrder())
								.thenComparingInt(Employee::getAge)
								.thenComparingDouble(Employee::getSalary)
				)
				.forEach(System.out::println);

		System.out.println("\n== Comparator: odwrócenie poprzedniego ==");
		employees.stream()
				.sorted(
						Comparator.comparing(Employee::getName, Comparator.reverseOrder())
								.thenComparing(Employee::getLastName, Comparator.reverseOrder())
								.thenComparingInt(Employee::getAge)
								.thenComparingDouble(Employee::getSalary)
								.reversed()
				)
				.forEach(System.out::println);
	}
}
