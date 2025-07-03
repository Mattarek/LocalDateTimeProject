package current_2025_czerwiec.megakExercises.Exercise1;

import java.util.Objects;

public class Car {
	private final String brand;
	private final String model;
	private final String year;

	public Car(final String brand, final String model, final String year) {
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

	public String getYear() {
		return year;
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
