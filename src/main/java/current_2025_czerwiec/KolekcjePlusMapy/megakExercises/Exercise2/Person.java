package current_2025_czerwiec.KolekcjePlusMapy.megakExercises.Exercise2;

import java.util.Objects;

public class Person {
	private final String name;
	private final String surname;
	private final String phone;

	public Person(final String input) {
		final String[] splitInput = input.split(" ");
		if (splitInput.length == 3) {
			name = splitInput[0];
			surname = splitInput[1];
			phone = splitInput[2];
		} else {
			throw new RuntimeException("Wrong input: " + input);
		}
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Person person)) {
			return false;
		}
		return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(phone, person.phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname, phone);
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
