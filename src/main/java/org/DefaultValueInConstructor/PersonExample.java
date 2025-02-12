package org.DefaultValueInConstructor;

public class PersonExample {
	private final int age;
	private final String firstName;
	private final String lastName;

	// Konstruktor domyślny
	public PersonExample() {
		this("Jan", "Kowalski", 18);
	}

	// Konstruktor z imieniem
	public PersonExample(final String firstName) {
		this(firstName, "Kowalski", 18);
	}

	// Konstruktor z imieniem i nazwiskiem
	public PersonExample(final String firstName, final String lastName) {
		this(firstName, lastName, 18);
	}

	// Pełny konstruktor
	public PersonExample(final String firstName, final String lastName, final int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonExample{" +
				"age=" + age +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
