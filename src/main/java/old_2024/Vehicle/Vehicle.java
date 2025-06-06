package old_2024.Vehicle;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

record Vehicle(String number) {
	public String getVehicleNumber(final Fleet fleet) {
		return Optional.ofNullable(fleet)
				.map(Fleet::vehicles)
				.filter(Predicate.not(List::isEmpty))
				.map(List::getFirst)
				.map(Vehicle::number)
				.orElse(null);
	}
}