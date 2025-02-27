package ObjectValue;

// Konstruktor, equals, toString, gettery, hashCode i pola są inicjalizowane
// pod maska więc nie musimy się o nie martwić
// Pamiętajmy, że automatycznie nie są generowane settery
// Głównym z powodów uzywania recordow jest to, ze sa podstawowo niemutowalne

// W klasach mozemy tworzyć metody dla instancji
// pola instancji nie są możliwe w recordzie

// Recordy nie mogą rozszerzać innych klas
public record EmployeeRecord(String name, int employeeNumber) {

	public static String someMethodTwo() {
		return "getEmployee";
	}

	public String someMethod() {
		return "getEmployee";
	}
}
