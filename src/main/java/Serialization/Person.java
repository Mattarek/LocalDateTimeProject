package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L; // Unikalny identyfikator wersji
	final transient String password; // To pole nie zostanie zapisane
	private final String name;
	private final int age;

	public Person(final String name, final int age, final String password) {
		this.name = name;
		this.age = age;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + ", password='" + password + "'}";
	}
}
