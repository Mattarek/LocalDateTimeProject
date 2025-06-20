package old_2024.ObjectValue;

// Konstruktor, equals, toString, gettery, hashCode i pola są inicjalizowane
// pod maska więc nie musimy się o nie martwić
// Pamiętajmy, że automatycznie nie są generowane settery
// Głównym z powodów uzywania recordow jest to, ze sa podstawowo niemutowalne

// W klasach mozemy tworzyć metody dla instancji
// pola instancji nie są możliwe w recordzie

// Recordy nie mogą rozszerzać innych klas
// Wszystkie rekordy pośrednio rozszrzaja klase record, tak jak ENUM
// rozszerza enum. A Java nie pozwala na wielodziedziczenie

// każdy record jest takż pośrednio final, czyli nie mogą być rozszerzane przez
// żadna inna klase, dlatego tez final jest wysarzane

public record EmployeeRecord(String name, int employeeNumber) implements Runnable {

	public static String someMethodTwo() {
		return "getEmployee";
	}

	public String someMethod() {
		return "getEmployee";
	}

	@Override
	public void run() {
	}
}
