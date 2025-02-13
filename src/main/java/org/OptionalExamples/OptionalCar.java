package org.OptionalExamples;

import java.util.Optional;

public class OptionalCar {
	public static void main(final String[] args) {
		final Optional<Car> car = Optional.of(new Car());
		car.map(Car::getSteeringWheel);

		final Car carOne = new Car();
		final SteeringWheel steeringWheel = carOne.getSteeringWheel();
		final double diameter = steeringWheel.getDiameter();
	}
}
