package org.Collections.PassByValue;

import java.util.Objects;

public class Dog {
	private String name;

	public Dog(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Dog dog)) {
			return false;
		}
		return Objects.equals(name, dog.name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}
}
