package org.CEPiK;

import java.util.Objects;

public class CarDriver {
	private final String name;
	private final String lastName;
	private final String licence;

	public CarDriver(final String name, final String lastName, final String licence) {
		this.name = name;
		this.lastName = lastName;
		this.licence = licence;
	}

	@Override
	public String toString() {
		return "CarDriver{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", licence='" + licence + '\'' +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final CarDriver carDriver)) {
			return false;
		}
		return Objects.equals(name, carDriver.name) && Objects.equals(lastName, carDriver.lastName) && Objects.equals(licence, carDriver.licence);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, lastName, licence);
	}
}
