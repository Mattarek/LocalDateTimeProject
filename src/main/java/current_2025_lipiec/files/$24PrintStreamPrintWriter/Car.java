package current_2025_lipiec.files.$24PrintStreamPrintWriter;

public class Car {
	private final String name;

	public Car(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				'}';
	}
}
