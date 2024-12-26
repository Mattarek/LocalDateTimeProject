package org.CEPiK;

import java.time.LocalDateTime;
import java.util.Scanner;

public class main {

	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);

		System.out.print("Podaj model samochodu: ");
		final String model = scanner.nextLine();

		System.out.print("Podaj vin: ");
		final String vin = scanner.nextLine();

		System.out.print("Podaj markę samochodu: ");
		final String mark = scanner.nextLine();

		System.out.print("Podaj rok produkcji: ");
		final int year = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Podaj miesiąc produkcji: ");
		final int month = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Podaj dzień produkcji: ");
		final int day = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Podaj godzinę produkcji: ");
		final int hour = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Podaj minutę produkcji: ");
		final int minute = scanner.nextInt();
		scanner.nextLine();

		final LocalDateTime productionDate = LocalDateTime.of(year, month, day, hour, minute);

		System.out.print("Podaj rejestrację: ");
		final String registrationNumber = scanner.nextLine();

		System.out.print("Podaj stan techniczny: ");
		final String technicalCondition = scanner.nextLine();

		System.out.print("Podaj kolor: ");
		final String color = scanner.nextLine();

		final Car car = new Car(model, vin, mark, productionDate, registrationNumber, technicalCondition, color);
		System.out.println(car);
	}
}
