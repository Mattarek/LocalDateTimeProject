package current_2025_czerwiec.KolekcjePlusMapy.ProjektKoncowyBigKurs;

import java.util.Objects;

public class Person {
	private final String name;
	private final String surname;
	private final int counter;
	private final String id;
	private final Boolean isVip;

	public Person(final String name, final String surname, final int counter) {
		// Jeśli podamy, że jest vipem, to wykonujemy konstruktor poniżej,
		// jeśli nie podamy czy jest vipem, domyślnie traktujemy, że nim nie jest
		this(name, surname, counter, false);
	}

	public Person(final String name, final String surname, final int counter, final Boolean isVip) {
		this.name = name;
		this.surname = surname;
		this.counter = counter;
		this.isVip = isVip;
		id = generateId();
	}

	private String generateId() {
		return isVip
				? String.format("%s_%s_%s_%s", name, surname, counter, isVip)
				: String.format("%s_%s_%s", name, surname, counter);
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
