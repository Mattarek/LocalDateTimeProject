package org.OptionalExamples;

import java.util.Objects;
import java.util.Optional;

public class OptionalExamples {
	public static void main(final String[] args) {
		//		final Optional<String> empty = Optional.empty();
		//		final Optional<String> ofFull = Optional.of("Hello");
		//		final Optional<String> ofNullableNull = Optional.ofNullable(null);
		//
		//		final String variable = empty.orElse("Default");
		//		final String variableTwo = empty.orElseGet(() -> "Default");
		//
		//		// empty.orElseThrow(() -> new RuntimeException("Empty value"));
		//		// System.out.println(empty.orElseThrow());
		//		System.out.println(ofFull);
		//		System.out.println(ofNullableNull);
		//
		//		final String old = null;
		//
		//		if (Objects.nonNull(old)) {
		//			System.out.println("Not null");
		//		} else {
		//			System.out.println("Is null");
		//		}

		final Optional<Car> car = Optional.of(new Car());
		// dla Optionala w Optionalu, twórcy stworzyli flatMap
		final Optional<SteeringWheel> steeringWheel = car.flatMap(c -> c.getSteeringWheelOptional());
		System.out.println(steeringWheel);
	}
}
`

