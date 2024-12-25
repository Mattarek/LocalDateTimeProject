package org.CEPiK;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
	private final List<CarDriver> driversList = new ArrayList<>();

	public Car(final String model, final String vin, final String mark, final LocalDateTime productionDate,
			   final String registrationNumber, final String technicalCondition, final String color) {
		super(model, vin, mark, productionDate, registrationNumber, technicalCondition, color);
	}

	public boolean addDriver(final CarDriver carDriver) {
		if (driversList.size() >= 2) {
			return false;
		}
		driversList.add(carDriver);
		return true;
	}

	@Override
	public String toString() {
		return "Car{}" + super.toString();
	}
}
