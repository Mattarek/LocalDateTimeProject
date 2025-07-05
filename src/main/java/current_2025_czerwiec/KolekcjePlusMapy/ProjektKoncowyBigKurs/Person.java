package current_2025_czerwiec.KolekcjePlusMapy.ProjektKoncowyBigKurs;

import java.util.Objects;

public class Person {
	private final String name;
	private final String surname;
	private final int counter;
	private final String id;

	public Person(final String name, final String surname, final int counter) {
		this.name = name;
		this.surname = surname;
		this.counter = counter;
		id = generateId();
	}

	private String generateId() {
		return String.format("%s_%s_%s", name, surname, counter);
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Person person)) {
			return false;
		}
		return Objects.equals(id, person.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return id;
	}
}
