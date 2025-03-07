package Vehicle;

import java.util.List;

record Fleet(List<Vehicle> vehicles) {
	public Vehicle vehicle(final int index) {
		return vehicles.get(index);
	}
}
