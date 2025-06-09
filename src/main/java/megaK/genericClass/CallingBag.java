package megaK.genericClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CallingBag {
	public static void main(final String[] args) {
		final Bag<String> bag = new Bag();
		System.out.println(bag);
		bag.pack("String element");
		System.out.println(bag);
		final String empty = bag.empty();
		System.out.println(bag);

		callFilteringBag();
	}

	private static void callFilteringBag() {
		final Car car = new Car("red", 2020);
		final FilteringBag<Car, Predicate<Car>, Predicate<Car>> filteringBag =
				new FilteringBag<>(c -> c.getColor().equals("red"), c -> c.getYear().equals(2020));
		filteringBag.pack(car);
	}

	static class Car {
		private final String color;
		private final int year;

		public Car(final String color, final int year) {
			this.color = color;
			this.year = year;
		}

		public String getColor() {
			return color;
		}

		public Integer getYear() {
			return year;
		}
	}
}
