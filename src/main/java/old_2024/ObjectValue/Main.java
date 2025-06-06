package old_2024.ObjectValue;

public class Main {
	public static void main(final String[] args) {

		final EmployeeClass employee = new EmployeeClass("Jerry", 12345);
		System.out.println(employee.getName());

		final EmployeeRecord employeeRecord = new EmployeeRecord("Kramer", 54321);
		System.out.println(employeeRecord.name());
		System.out.println(employeeRecord.someMethod());
		System.out.println(EmployeeRecord.someMethodTwo());
	}
}
