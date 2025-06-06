package old_2024.OptionalExamples;

import java.util.Optional;

public class Car {
	private final SteeringWheel steeringWheel;

	public Car() {
		steeringWheel = new SteeringWheel(0.3);
	}

	public Car(final SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public Optional<SteeringWheel> getSteeringWheelOptional() {
		return Optional.ofNullable(steeringWheel);
	}
}
