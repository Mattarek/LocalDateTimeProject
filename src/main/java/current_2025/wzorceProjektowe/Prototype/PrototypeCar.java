package current_2025.wzorceProjektowe.Prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class PrototypeCar implements Cloneable {
	private String brand;
	private String model;
	private SteeringWheel steeringWheel;
	private List<String> doors;

	public PrototypeCar(final String brand, final String model) {
		this.brand = brand;
		this.model = model;
		steeringWheel = SteeringWheel.of(10.65);
		doors = new ArrayList<>(Arrays.asList("lf", "rf", "lf"));
	}

	public PrototypeCar shallowCopy() {
		final var newCar = new PrototypeCar("Ford", "Focus");
		newCar.steeringWheel = steeringWheel;
		return newCar;
	}

	public PrototypeCar deepCopy() {
		final var newCar = new PrototypeCar("Ford", "Focus");
		newCar.steeringWheel = steeringWheel.deepCopy();
		return newCar;
	}

	@Override
	protected PrototypeCar clone() throws CloneNotSupportedException {
		return (PrototypeCar) super.clone();
	}
}
