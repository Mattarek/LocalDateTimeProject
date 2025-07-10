package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.Zadanie3;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.function.BinaryOperator;

/*
	3. Napisz implementację interfejsu BinaryOperator, która z przekazanych do niej obiektów zwróci
	większy. Jeżeli przekazane 2 obiekty są sobie równe, zwróć null,a potem obsłuż go wykorzystując Optional,
	który wyrzuci wyjątek, w przypadku gdy obiekty są sobie równe.
 */
public class Main {
	public static void main(final String[] args) {
		final BinaryOperator<Car> carTest = (v1, v2) -> {
			final int comparingResult = v1.name.compareTo(v2.name);

			if (comparingResult == 0) {
				return null;
			}

			return comparingResult > 0 ? v1 : v2;
		};
		final Optional<Car> optionalCar = Optional.ofNullable(
				Optional.ofNullable(carTest.apply(new Car("w"), new Car("w")))
						.orElseThrow(() -> new MyCustomException("Equals objects!")));

		System.out.println(optionalCar);
	}

	private static class Car implements Comparable<Car> {
		String name;

		public Car(final String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Car{" +
					"name='" + name + '\'' +
					'}';
		}

		@Override
		public int compareTo(@NotNull final Car o) {
			return name.compareTo(o.name);
		}
	}

	private static class MyCustomException extends RuntimeException {
		public MyCustomException(final String message) {
			super(message);
		}
	}
}
