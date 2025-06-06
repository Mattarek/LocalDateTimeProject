package old_2024.OptionalExamples;

import java.util.List;
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

		//----------------------------------------------------------------------------
		//		final Optional<Car> car = Optional.of(new Car()); // 0.3
		//		final Optional<Car> car = Optional.empty(); // 0.0
		//
		//		final double diameter =
		//				car
		//						.flatMap(c -> c.getSteeringWheelOptional())
		//						.flatMap(sw -> sw.getDiameterOptional())
		//						.orElse(0.0);
		//		System.out.println(diameter);
		//----------------------------------------------------------------------------
		//		final Optional<Car> car = Optional.empty();
		//		final Optional<Double> diameterFiltered = car
		//				.map(c -> c.getSteeringWheel())
		//				.map(sw -> sw.getDiameter())
		//				.filter(d -> {
		//					System.out.println(d);
		//					return d >= 0.5;
		//				})
		//				.filter(d -> d < 0.7);
		//		System.out.println(diameterFiltered);

		final List<String> list = List.of("Brasil", "Denmark", "China", "Poland");
		final Optional<String> found = find(list, Optional.of("Denmark"));
		System.out.println(found);
	}

	private static Optional<String> find(final List<String> countries, final Optional<String> element) {
		for (final String country : countries) {
			if (element.get().equals(country)) {
				return Optional.of(country);
			}
		}
		return Optional.empty();
	}
}


