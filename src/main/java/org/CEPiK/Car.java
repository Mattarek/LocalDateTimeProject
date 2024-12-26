package org.CEPiK;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car extends Vehicle {
	private final List<CarDriver> driversList = new ArrayList<>();

	public Car(final String model, final String vin, final String mark, final LocalDateTime productionDate,
			   final String registrationNumber, final String technicalCondition, final String color) {
		super(model, vin, mark, productionDate, registrationNumber, technicalCondition, color);
	}

	@Override
	public String toString() {
		return "Car{" +
				"} " + super.toString();
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Car car)) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		return Objects.equals(driversList, car.driversList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), driversList);
	}

	public boolean addDriver(final CarDriver carDriver) {
		if (driversList.size() >= 2) {
			return false;
		}
		driversList.add(carDriver);
		return true;
	}
}
