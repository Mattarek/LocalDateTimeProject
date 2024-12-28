package org.CEPiK;

import java.time.LocalDateTime;

public class Car extends Vehicle {
	public Car(final Model model, final String vin, final String mark, final LocalDateTime productionDate,
			   final String registrationNumber, final String technicalCondition, final String color) {
		super(model, vin, mark, productionDate, registrationNumber, technicalCondition, color);
	}

	@Override
	public String toString() {
		return "Car{} " + super.toString();
	}
}
