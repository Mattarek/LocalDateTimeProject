package AndretStreamExercieses;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// I.
// 1. List all company names.
// 2. For each company on the list, list the amount of employees.
// 3. Only list companies that have an odd employee-count.
// 4. Sum up all employees from all the companies.
// 5. Calculate the average amount of employees for all the companies listed.
// 6. List the company names and the employee count alphabetically.

// II.
// 1. List all the male employees of all companies.
// 2. Only list the first and last names of the non-male employees.
// 3. Only list companies that have more males than females.
// 4. List the average salary of each company individually
// 5. List all employees earning more than 3400.
// 6. List all employees in order of their salary descending.
// 7. For each company display the gender, for which the average salary is greater.

// III.
// 1. List all employees that have the HR or the PR role.
// 2. List companies that have more than 2 employees with the WORKER role.
// 3. Sum up the salary of all employees from all the companies that have the MANAGER role.
// 4. Count the average salary of all employees having more than 1 role.
// 5. List all the employees with PR role but without the MANAGER role.
// 6. List last names and salaries only of the employees having the ACCOUNTANT role.
// 7. For each company count all the roles assigned to its employees.

public final class Main {
	public static void main(final String[] args) {
		final List<Company> companies = List.of(
				new Company("SDA", List.of(
						new Employee("Tom", "Johnson", Gender.MALE, List.of(Role.HR), 3000),
						new Employee("Maria", "Rose", Gender.FEMALE, List.of(Role.HR, Role.ACCOUNTANT), 3200),
						new Employee("Rob", "Williams", Gender.NON_BINARY, List.of(Role.WORKER, Role.PR), 3500),
						new Employee("John", "Smith", Gender.MALE, List.of(Role.MANAGER), 3900),
						new Employee("Caren", "Ground", Gender.FEMALE, List.of(Role.ACCOUNTANT, Role.WORKER, Role.PR), 4100),
						new Employee("Jerry", "Williams", Gender.MALE, List.of(Role.PR, Role.WORKER), 4100)
				)),
				new Company("Avengerex", List.of(
						new Employee("Steven", "Strange", Gender.MALE, List.of(Role.PR), 3600),
						new Employee("Natasha", "Romanow", Gender.FEMALE, List.of(Role.WORKER, Role.ACCOUNTANT,
								Role.PR), 4200),
						new Employee("Loki", "Asgardian", Gender.NON_BINARY, List.of(Role.PR, Role.MANAGER), 3800),
						new Employee("Tony", "Stark", Gender.MALE, List.of(Role.MANAGER, Role.ACCOUNTANT, Role.PR),
								4500),
						new Employee("Carol", "Danvers", Gender.FEMALE, List.of(Role.WORKER, Role.HR), 4100))));
		//		System.out.println(companies);

		//=========================================================================================================
		// I.
		//		// 1
		//		final List<String> namesOfCompanies = companies.stream()
		//		.map(u -> u.name())
		//		.toList();
		//		System.out.println(namesOfCompanies); // [SDA, Avengerex]
		//
		//		// 2.
		//		final List<Employee> employeesOfCompanies =
		//				companies.stream()
		//				.flatMap(company -> company.employees().stream())
		//				.toList();
		//		System.out.println(employeesOfCompanies);

		//		// 3
		//		final List<Company> companiesWithOddCountOfEmployees =
		//				companies.stream()
		//				.filter(company -> company.employees().size() % 2 != 0)
		//				.toList();
		//		System.out.println(companiesWithOddCountOfEmployees);
		//
		//		// 4
		//		final List<Employee> managers = companies.stream()
		//				.flatMap(company -> company.employees().stream())
		//				.filter(employee -> employee.roles().contains(Role.MANAGER))
		//				.toList();
		//		System.out.println(managers);
		//
		// 		// 5.
		//		final List<Integer> countOfEmployee = companies.stream()
		//				.map(company -> company.employees().size())
		//				.toList();
		//		System.out.println(countOfEmployee);

		//		// 6
		//		final List<Company> eomployeesAlphabetically =
		//				companies.stream().map(company -> new Company(company.name(),
		//						company.employees().stream().sorted(Comparator.comparing(Employee::firstName)).toList())).toList();
		//
		//		System.out.println(eomployeesAlphabetically);
		//=============================================================================================================================================
		// II
		// // 1.
		//		final List<Employee> maleEmployee =
		//				companies.stream().flatMap(company -> company.employees().stream())
		//						.filter(employee -> employee.gender() == Gender.MALE)
		//						.toList();
		//		System.out.println(maleEmployee);

		// // 2.
		//		final List<Employee> employessWithoutMale = companies
		//				.stream()
		//				.flatMap(company -> company.employees().stream())
		//				.filter(employee -> employee.gender() != Gender.MALE)
		//				.toList();
		//
		//		System.out.println(employessWithoutMale);

		// // 3.+++++++
		//		final List<Company> companiesWithMoreMales = companies.stream().filter(company -> {
		//			final long maleCount = company.employees()
		//					.stream()
		//					.filter(employee -> employee.gender() == Gender.MALE)
		//					.count();
		//			final long femaleCount = company.employees()
		//					.stream()
		//					.filter(employee -> employee.gender() == Gender.FEMALE)
		//					.count();
		//
		//			return maleCount > femaleCount;
		//		}).toList();
		//		System.out.println(companiesWithMoreMales);

		// 4.+++++++
		//				final List<Double> averangeSalaryForAllCompanies =
		//						companies.stream()
		//								.map(company -> company.employees().stream().mapToDouble(Employee::salary)
		//								.average().orElse(0.0))
		//								.toList();
		//				System.out.println(averangeSalaryForAllCompanies);

		// 5.
		//		final List<Employee> earningThanThreeThousandFourHoundred =
		//				companies.stream()
		//						.flatMap(company -> company.employees().stream())
		//						.filter(employee -> employee.salary() > 3400)
		//						.toList();
		//		System.out.println(earningThanThreeThousandFourHoundred);

		// 6.++++++
		//		final List<Employee> employeesSalaryDescending = companies
		//				.stream()
		//				.flatMap(company -> company.employees().stream())
		//				.sorted(Comparator.comparing(Employee::salary).reversed())
		//				.toList();
		//		System.out.println(employeesSalaryDescending);

		// 7.+++++++++++++++++++++++++++++++++++++++++++++
		//		final Map<Gender, Double> employeeAvgSalary = companies.stream().collect(Collectors.toMap(
		//				company -> {
		//					final double maleAvg = company.employees()
		//							.stream()
		//							.filter(e -> e.gender() == Gender.MALE)
		//							.mapToDouble(Employee::salary)
		//							.average().orElse(0.0);
		//
		//					final double femaleAvg = company.employees()
		//							.stream()
		//							.filter(e -> e.gender() == Gender.FEMALE)
		//							.mapToDouble(Employee::salary)
		//							.average().orElse(0.0);
		//
		//					return maleAvg > femaleAvg ? Gender.MALE : femaleAvg > maleAvg ? Gender.FEMALE : null;
		//				},
		//				company -> {
		//					final double maleAvg = company.employees()
		//							.stream()
		//							.filter(e -> e.gender() == Gender.MALE)
		//							.mapToDouble(Employee::salary)
		//							.average().orElse(0.0);
		//
		//					final double femaleAvg = company.employees()
		//							.stream()
		//							.filter(e -> e.gender() == Gender.FEMALE)
		//							.mapToDouble(Employee::salary)
		//							.average().orElse(0.0);
		//
		//					return Math.max(maleAvg, femaleAvg);
		//				}
		//		));
		//
		//		System.out.println(employeeAvgSalary);

		//=============================================================================================================================================
		// III
		// 7. For each company count all the roles assigned to its employees.

		// 1.
		//		final List<Employee> employeesWithRoleHrOrPr =
		//				companies.stream()
		//						.flatMap(company -> company.employees().stream())
		//						.filter(employee -> employee.roles().contains(Role.PR) || employee.roles().contains(Role.HR))
		//						.toList();
		//
		//		System.out.println(employeesWithRoleHrOrPr);

		// 2.
		//		final List<Company> companiesWithMoreThanTwoWorkderRole =
		//				companies.stream()
		//						.filter(company -> company.employees().stream().filter(employee -> employee.roles().contains(Role.WORKER)).count() > 2)
		//						.toList();
		//		System.out.println(companiesWithMoreThanTwoWorkderRole);

		// 3.
		//		final double managerSalarySum =
		//				companies.stream()
		//						.flatMap(company -> company.employees().stream())
		//						.filter(employee -> employee.roles().contains(Role.MANAGER))
		//						.mapToDouble(Employee::salary)
		//						.sum();
		//		System.out.println(managerSalarySum);

		// 4.
		//		final List<Employee> listOfEmployeeWithMoreThanOneRike =
		//				companies.stream()
		//						.flatMap(company -> company.employees().stream())
		//						.filter(employee -> employee.roles().size() > 1)
		//						.toList();
		//
		//		System.out.println(listOfEmployeeWithMoreThanOneRike);

		// 5.
		//		final List<Employee> employeeWithPrAndWithousManager =
		//				companies.stream()
		//						.flatMap(company -> company.employees().stream())
		//						.filter(employee -> employee.roles().contains(Role.PR) && !employee.roles().contains(Role.MANAGER))
		//						.toList();
		//		System.out.println(employeeWithPrAndWithousManager);

		// 6.
		//		final Map<String, Double> qwe =
		//				companies.stream()
		//						.flatMap(company -> company.employees().stream())
		//						.filter(employee -> employee.roles().contains(Role.ACCOUNTANT))
		//						.collect(Collectors.toMap(Employee::lastName, Employee::salary));
		//
		//		System.out.println(qwe);

		// 7.
		//		final int countOfEmployeesRole =
		//				companies.stream()
		//						.flatMap(company -> company.employees().stream())
		//						.mapToInt(employee -> employee.roles().size()).sum();
		//		System.out.println(countOfEmployeesRole);
	}
}
