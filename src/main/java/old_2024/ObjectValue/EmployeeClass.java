package old_2024.ObjectValue;

public class EmployeeClass {
	private final String name;
	private final int employeeNumber;

	//	public EmployeeClass() {
	//
	//	}

	public EmployeeClass(final String name, final int employeeNumber) {

		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	public String someMethod() {
		return "getEmployee";
	}

	public String getName() {
		return name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}
}
