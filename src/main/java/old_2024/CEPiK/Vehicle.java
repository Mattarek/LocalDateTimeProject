package old_2024.CEPiK;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehicle {
	private final Mark mark;
	private final Model model;
	private final LocalDateTime productionDate;
	private final RegistrationNumber registrationNumber;
	private final String technicalCondition;
	private final String color;
	private final VIN vin;

	public Vehicle(final Model model, final VIN vin, final Mark mark, final LocalDateTime productionDate,
				   final RegistrationNumber registrationNumber, final String technicalCondition, final String color) {
		this.model = model;
		this.mark = mark;
		this.vin = vin;

		this.productionDate = productionDate;
		this.registrationNumber = registrationNumber;
		this.technicalCondition = technicalCondition;
		this.color = color;
	}

	@Override
	public String toString() {
		return "old2024.Vehicle{" +
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
