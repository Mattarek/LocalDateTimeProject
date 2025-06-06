package old_2024.CEPiK;

import java.time.LocalDateTime;

public class Car extends Vehicle {
	public Car(final Model model, final VIN vin, final Mark mark, final LocalDateTime productionDate,
			   final RegistrationNumber registrationNumber, final String technicalCondition, final String color) {
		super(model, vin, mark, productionDate, registrationNumber, technicalCondition, color);
	}

	@Override
	public String toString() {
		return "Car{} " + super.toString();
	}
}
