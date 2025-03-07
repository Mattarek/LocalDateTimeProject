package Vehicle;

import java.util.List;
import java.util.Optional;

record Vehicle(String number) {
	public String getVehicleNumber(final Fleet fleet) {
		return Optional.ofNullable(fleet)
				.map(f -> f.vehicles())
				.filter(v -> !v.isEmpty())
				.map(List::getFirst)
				.map(Vehicle::number)
				.orElse(null);
	}
}