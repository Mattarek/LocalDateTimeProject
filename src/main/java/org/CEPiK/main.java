package org.CEPiK;

import java.time.LocalDateTime;

public class main {

	public static void main(final String[] args) {
		final Car opel = new Car("Astra", "12345678901234567", "Opel", LocalDateTime.of(2024, 2, 13, 13, 21),
				"RZ1111",
				"new", "red");

		final CarDriver carDriver = new CarDriver("Szymon", "Hołownia", "B");
		carDriver.addCar(opel);
		System.out.println(carDriver);
	}
}
