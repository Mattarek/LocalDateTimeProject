package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import java.util.Optional;
import java.util.function.Function;

public class FunctionExample {
	public static void main(final String[] args) {
		final Function<Car, String> carStringFunction = Car::toString;
		final Optional<String> carOpt = Optional.of(new Car())
				.map(carStringFunction);

		final Function<Car, String> functionImpl = FunctionExample::convertCarToString;

		final String applyResult = functionImpl.apply(new Car());
		System.out.println(applyResult);
	}

	private static String convertCarToString(final Car c) {
		System.out.println("Car printing: " + c);
		return "someString";
	}

	static class Car {
	}
}
