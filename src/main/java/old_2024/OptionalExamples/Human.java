package old_2024.OptionalExamples;

import java.util.Objects;
import java.util.Optional;

public class Human {
	String name;

	public Human(final String name) {
		this.name = name;
	}

	public Optional<String> getName() {
		return Optional.of(name);
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Human human)) {
			return false;
		}
		return Objects.equals(name, human.name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}

	@Override
	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				'}';
	}
}
