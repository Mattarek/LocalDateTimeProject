package megaK.genericMethods;

import java.util.Map;

public class GenericMethodMain<T> {
	private static final Map<String, Vehicle> vehicleMap = Map.of(
			"vehicle1", new Bike()
	);

	public static void main(final String[] args) {
		callOne(new Bike());
		callTwo(new Bike());

		// Do ZAPAMIĘTANIA
		final String o = GenericMethodMain.<Bike>callThree().getName();
	}

	public static <T extends Vehicle> void callOne(final T element) {
		System.out.println(element);
	}

	public static <T extends Vehicle> T callTwo(final T element) {
		System.out.println(element);
		return element;
	}

	public static <T> T callThree() {
		return (T) vehicleMap.get("vehicle1");
	}

	interface Vehicle {

	}

	static class Bike implements Vehicle {
		final String getName() {
			return "bikeName";
		}
	}

	static class Apple {
	}
}
