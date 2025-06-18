package current_2025.wzorceProjektowe.Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SteeringWheel {
	private double diameter;

	public SteeringWheel deepCopy() {
		final var newSteeringWheel = new SteeringWheel();
		newSteeringWheel.diameter = diameter;
		return newSteeringWheel;
	}
}
