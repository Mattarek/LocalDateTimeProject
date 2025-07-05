package current_2025_czerwiec.KolekcjePlusMapy.Compare.exercise1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<Employee> employees = Arrays.asList(
				new Employee("Marcin", "Barć", 28, BigDecimal.valueOf(8000)),
				new Employee("Patryk", "Barć", 28, BigDecimal.valueOf(6000)),
				new Employee("Sylwia", "Barć", 32, BigDecimal.valueOf(5000)),
				new Employee("Kamil", "Barć", 30, BigDecimal.valueOf(6000)),
				new Employee("Łukasz", "Abarć", 32, BigDecimal.valueOf(5000)),
				new Employee("Adrian", "Barć", 32, BigDecimal.valueOf(3000)),
				new Employee("Czesław", "Barć", 52, BigDecimal.valueOf(6500)),
				new Employee("Jolanta", "Barć", 52, BigDecimal.valueOf(6800)),
				new Employee("Stanisław", "Barć", 59, BigDecimal.valueOf(4000)),
				new Employee("Grażyna", "Barć", 60, BigDecimal.valueOf(4500))
		);

		System.out.println("== Sortowanie według compareTo (naturalny porządek) ==");

		// Metoda sorted() wywołana bez argumentu: employees.stream().sorted()
		// korzysta z metody compareTo(), ponieważ wymaga, by elementy implementowały interfejs Comparable<T>.

		//		📌 Co to oznacza?
		//				Obiekty klasy Employee muszą implementować Comparable<Employee>
		//		Wtedy Stream.sorted() wie, jak porównać dwa obiekty Employee
		//		Używa dokładnie tej implementacji:
		//		@Override
		//		public int compareTo(Employee other) {
		//			// ...
		//		}

		//		🧠 Podsumowanie:
		//			| Wywołanie                            | Działanie                             |
		//			| ------------------------------------ | ------------------------------------- |
		//			| `stream().sorted()`                  | Używa `compareTo()` z `Comparable<T>` |
		//			| `stream().sorted(comparator)`        | Używa przekazanego `Comparator<T>`    |
		//			| `Collections.sort(list)`             | Używa `compareTo()`                   |
		//			| `Collections.sort(list, comparator)` | Używa przekazanego `Comparator<T>`    |

		employees.stream().sorted().forEach(System.out::println);

		System.out.println("======================================================");

		// Sposób nr.1 inline
		final Comparator<Employee> nameReversedComparatorExample1 = Comparator
				.comparing(Employee::getName)
				.thenComparing(Employee::getLastName)
				.thenComparing(Employee::getAge)
				.thenComparing(Employee::getSalary);

		Collections.sort(employees, nameReversedComparatorExample1);
		System.out.println(employees);

		// Sposób nr.2 by variable
		final Comparator<Employee> nameReversedComparator = Comparator.comparing(Employee::getName);
		final Comparator<Employee> lastnameReversedComparator = Comparator.comparing(Employee::getLastName);
		final Comparator<Employee> ageReversedComparator = Comparator.comparing(Employee::getAge);
		final Comparator<Employee> salaryReversedComparator = Comparator.comparing(Employee::getSalary);

		final Comparator<Employee> secondComparator = nameReversedComparator
				.thenComparing(lastnameReversedComparator)
				.thenComparing(ageReversedComparator)
				.thenComparing(salaryReversedComparator);

		System.out.println(secondComparator);

		System.out.println("======================================================");
		System.out.println("\n== Comparator: imię ↓, nazwisko ↓, wiek ↑, wypłata ↑ ==");
		employees.stream()
				.sorted(
						Comparator.comparing(Employee::getName, Comparator.reverseOrder())
								.thenComparing(Employee::getLastName, Comparator.reverseOrder())
								.thenComparingInt(Employee::getAge)
								.thenComparing(Employee::getSalary)
				)
				.forEach(System.out::println);

		System.out.println("\n== Comparator: odwrócenie poprzedniego ==");
		employees.stream()
				.sorted(
						Comparator.comparing(Employee::getName, Comparator.reverseOrder())
								.thenComparing(Employee::getLastName, Comparator.reverseOrder())
								.thenComparingInt(Employee::getAge)
								.thenComparing(Employee::getSalary)
								.reversed()
				)
				.forEach(System.out::println);
	}
}
