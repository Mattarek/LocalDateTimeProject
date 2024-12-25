package org.CEPiK;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarDriver {
	private final String name;
	private final String lastName;
	private final String licence;
	private final List<Car> carsList = new ArrayList<>();

	public CarDriver(final String name, final String lastName, final String licence) {
		this.name = name;
		this.lastName = lastName;
		this.licence = licence;
	}

	public void addCar(final Car car) {
		carsList.add(car);
	}

	@Override
	public String toString() {
		return "CarDriver{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", licence='" + licence + '\'' +
				", carsList=" + carsList +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final CarDriver carDriver)) {
			return false;
		}
		return Objects.equals(name, carDriver.name) &&
				Objects.equals(lastName, carDriver.lastName) &&
				Objects.equals(licence, carDriver.licence) &&
				Objects.equals(carsList, carDriver.carsList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, lastName, licence, carsList);
	}
}
