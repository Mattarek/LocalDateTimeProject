package current_2025_lipiec.files.$22serialization;

import java.io.Serializable;
import java.util.List;

public class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	private final String name;
	private final Long year;
	private final transient List<Door> doors;
	private Hood hood;

	public Car(final String name, final Long year, final List<Door> doors) {
		this.name = name;
		this.year = year;
		this.doors = doors;
	}

	public String getName() {
		return name;
	}

	public Long getYear() {
		return year;
	}

	public Hood getHood() {
		return hood;
	}

	public List<Door> getDoors() {
		return doors;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", year=" + year +
				", doors=" + doors +
				", hood=" + hood +
				'}';
	}
}
