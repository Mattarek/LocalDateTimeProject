package org.CEPiK;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehicle {
	private final String mark;
	private final String model;
	private final LocalDateTime productionDate;
	private final String registrationNumber;
	private final String technicalCondition;
	private final String color;
	private final String vin;

	public Vehicle(final String model, final String vin, final String mark, final LocalDateTime productionDate,
				   final String registrationNumber, final String technicalCondition, final String color) {
		this.model = model;
		this.mark = mark;
		if (isVinCorrect()) {
			this.vin = vin;
		} else {
			this.vin = "";
		}

		this.productionDate = productionDate;
		this.registrationNumber = registrationNumber;
		this.technicalCondition = technicalCondition;
		this.color = color;
	}

	public boolean isVinCorrect() {
		return vin.length() == 17 && !vin.contains("O") && !vin.contains("Q") && !vin.contains("I");
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Vehicle vehicle)) {
			return false;
		}
		return Objects.equals(mark, vehicle.mark) && Objects.equals(model, vehicle.model) && Objects.equals(vin, vehicle.vin) && Objects.equals(productionDate, vehicle.productionDate) && Objects.equals(registrationNumber, vehicle.registrationNumber) && Objects.equals(technicalCondition, vehicle.technicalCondition) && Objects.equals(color, vehicle.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mark, model, vin, productionDate, registrationNumber, technicalCondition, color);
	}
}