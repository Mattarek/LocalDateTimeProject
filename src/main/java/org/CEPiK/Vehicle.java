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
		if (validateRegistrationNumber(registrationNumber)) {
			this.registrationNumber = registrationNumber;
		} else {
			this.registrationNumber = "";
		}
		this.technicalCondition = technicalCondition;
		this.color = color;
	}

	public static boolean validateRegistrationNumber(final String registrationNumber) {
		if (registrationNumber == null || registrationNumber.length() <= 4 || registrationNumber.length() >= 8) {
			return false;
		}

		final String[] parts = registrationNumber.split(" ");

		if (parts.length != 2) {
			return false;
		}

		final String city = parts[0];
		for (final char firstLetter : city.toCharArray()) {
			if (!Character.isLetter(firstLetter)) {
				return false;
			}
		}

		final String rest = parts[1];
		for (final char c : rest.toCharArray()) {
			if (!Character.isLetterOrDigit(c)) {
				return false;
			}
		}

		return true;
	}

	public boolean isVinCorrect(final String vin) {
		return vin.length() == 17 &&
				!vin.contains("O") &&
				!vin.contains("Q") &&
				!vin.contains("I");
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
