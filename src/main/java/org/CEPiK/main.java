package org.CEPiK;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
	private static final List<Vehicle> vehicleList = new ArrayList();

	public static void main(final String[] args) {
		final Car opel = new Car("Astra", "1234", "Opel", LocalDateTime.of(2024, 2, 13, 13, 21), "RZR11111",
				"new", "red");
		addToList(opel);
		System.out.println(getListOfVehicle());
	}

	public static void addToList(final Vehicle vehicle) {
		vehicleList.add(vehicle);
	}

	public static List<Vehicle> getListOfVehicle() {
		return vehicleList;
	}
}
