package current_2025_czerwiec.megakExercises.Exercise1;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car> {
	private final String brand;
	private final String model;
	private final Integer year;

	public Car(final String brand, final String model, final Integer year) {
		this.year = year;
		this.model = model;
		this.brand = brand;
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Car car)) {
			return false;
		}
		return Objects.equals(year, car.year) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, model, year);
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public Integer getYear() {
		return year;
	}

	@Override
	public int compareTo(@NotNull final Car car) {
		// Sposób nr.1
		return Comparator
				.comparingInt(Car::getYear)
				.thenComparing(Car::getBrand)
				.thenComparing(Car::getModel)
				.compare(this, car); // uzywamy aby zwrócić int który jest wymagany przez compareTo
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", year=" + year +
				'}';
	}
}
