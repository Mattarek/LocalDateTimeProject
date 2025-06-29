package current_2025_czerwiec.Compare.project6;

import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<Department> departments = List.of(
				new Department("HR", List.of(
						new Employee("Anna", 5000),
						new Employee("Tomek", 7000))
				),
				new Department("IT", List.of(
						new Employee("Zosia", 10000),
						new Employee("Adam", 9000)
				)
				)
		);

		departments.stream().sorted(Comparator.comparing(Department::getName))
				.flatMap(d -> d.getEmployees()
						.stream()
						.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
						.map(e -> d.getName() + ": " + e)
				).forEach(System.out::println);
	}
}
