package org.Calendar;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final Scanner scanner = new Scanner(System.in);
	private static final List eventsList = new ArrayList<>();

	public static void main(final String[] args) {
		while (true) {
			System.out.println("\nDostępne opcje:");
			System.out.println("1. Dodaj wydarzenie");
			System.out.println("2. Edytuj wydarzenie");
			System.out.println("3. Wyświetl wydarzenia");
			System.out.println("4. Usuń wydarzenie");
			System.out.println("0. Wyjdź");

			final int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1 -> {
					System.out.println("Podaj nazwę wydarzenia: ");
					final String nameOfEvent = scanner.next();

					System.out.println("Podaj opis wydarzenia");
					final String description = scanner.next();

					System.out.println("Podaj rok:");
					final int yearOfEvent = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Podaj miesiąć:");
					final int monthOfEvent = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Podaj dzień:");
					final int dayOfEvent = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Podaj godzine:");
					final int hourOfEvent = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Podaj minutę:");
					final int minuteOfEvent = scanner.nextInt();
					scanner.nextLine();

					final Event event = new Event(nameOfEvent, description, LocalDateTime.of(yearOfEvent, monthOfEvent, dayOfEvent, hourOfEvent, minuteOfEvent));
					eventsList.add(event);
					System.out.println(event);
				}
				case 2 -> {

				}
				case 3 -> {

				}
				case 4 -> {

				}
				case 0 -> {
					System.out.println("Zakończono program.");
					return;
				}
				default -> System.out.println("Nieprawidłowa opcja.");
			}
		}
	}
}
