package org.CEPiK;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehicle {
	private final Mark mark;
	private final Model model;
	private final LocalDateTime productionDate;
	private final String registrationNumber;
	private final String technicalCondition;
	private final String color;
	private final String vin;

	public Vehicle(final Model model, final String vin, final Mark mark, final LocalDateTime productionDate,
				   final String registrationNumber, final String technicalCondition, final String color) {
		this.model = model;
		this.mark = mark;
		if (isVinCorrect(vin)) {
			this.vin = vin;
		} else {
			this.vin = "";
		}

		this.productionDate = productionDate;
		if (isValidRegistrationNumber(registrationNumber)) {
			this.registrationNumber = registrationNumber;
		} else {
			this.registrationNumber = "";
		}
		this.technicalCondition = technicalCondition;
		this.color = color;
	}

	public boolean isVinCorrect(final String vin) {
		return vin.length() == 17 &&
				!vin.contains("O") &&
				!vin.contains("Q") &&
				!vin.contains("I");
	}

	public boolean isValidRegistrationNumber(final String registrationNumber) {
		return registrationNumber.length() >= 5 &&
				registrationNumber.length() <= 8 &&
				Character.isLetter(registrationNumber.charAt(0)) &&
				Character.isLetter(registrationNumber.charAt(1));
	}

	@Override
	public String toString() {
		return "Vehicle{" +
				"mark='" + mark + '\'' +
				", model='" + model + '\'' +
				", productionDate=" + productionDate +
				", registrationNumber='" + registrationNumber + '\'' +
				", technicalCondition='" + technicalCondition + '\'' +
				", color='" + color + '\'' +
				", vin='" + vin + '\'' +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Vehicle vehicle)) {
			return false;
		}
		return Objects.equals(mark, vehicle.mark) &&
				Objects.equals(model, vehicle.model) &&
				Objects.equals(vin, vehicle.vin) &&
				Objects.equals(productionDate, vehicle.productionDate) &&
				Objects.equals(registrationNumber, vehicle.registrationNumber) &&
				Objects.equals(technicalCondition, vehicle.technicalCondition) &&
				Objects.equals(color, vehicle.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mark, model, vin, productionDate, registrationNumber, technicalCondition, color);
	}
}
