package current_2025_czerwiec.KolekcjePlusMapy.Compare.project6;

public class Employee {
	private final String name;
	private final int salary;

	public Employee(final String name, final int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}
}
