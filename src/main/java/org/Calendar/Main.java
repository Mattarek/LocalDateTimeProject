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
				}
				case 2 -> {
					if (eventsList.isEmpty()) {
						System.out.println("Brak wydarzeń do edycji.");
						break;
					}

					System.out.println("Podaj numer wydarzenia do edycji:");
					for (int i = 0; i < eventsList.size(); i++) {
						System.out.println((i + 1) + ". " + eventsList.get(i));
					}

					final int eventIndex = scanner.nextInt() - 1;
					scanner.nextLine();

					if (eventIndex < 0 || eventIndex >= eventsList.size()) {
						System.out.println("Nieprawidłowy numer wydarzenia.");
						break;
					}

					final Event eventToEdit = (Event) eventsList.get(eventIndex);

					while (true) {
						System.out.println("\nCo chcesz edytować?");
						System.out.println("1. Nazwa wydarzenia (obecna: " + eventToEdit.getName() + ")");
						System.out.println("2. Opis wydarzenia (obecny: " + eventToEdit.getDescription() + ")");
						System.out.println("3. Data i godzina wydarzenia (obecna: " + eventToEdit.getDateOfEvent() + ")");
						System.out.println("0. Zakończ edycję");
						System.out.print("Podaj numer opcji: ");
						
						final int editChoice = scanner.nextInt();
						scanner.nextLine();

						switch (editChoice) {
							case 1 -> {
								System.out.println("Podaj nową nazwę wydarzenia: ");

								final String newName = scanner.nextLine();
								eventToEdit.setName(newName);
							}
							case 2 -> {
								System.out.println("Podaj nowy opis wydarzenia: ");

								final String newDescription = scanner.nextLine();
								eventToEdit.setDescription(newDescription);
							}
							case 3 -> {
								System.out.println("Podaj nową datę i godzinę wydarzenia: ");
								System.out.println("Podaj rok: ");
								final int newYear = scanner.nextInt();

								System.out.println("Podaj miesiąc: ");
								final int newMonth = scanner.nextInt();

								System.out.println("Podaj dzień: ");
								final int newDay = scanner.nextInt();

								System.out.println("Podaj godzine: ");
								final int newHour = scanner.nextInt();

								System.out.println("Podaj minutę: ");
								final int newMinute = scanner.nextInt();
								scanner.nextLine();

								eventToEdit.setDateOfEvent(LocalDateTime.of(newYear, newMonth, newDay, newHour, newMinute));
								System.out.println("Wydarzenie zakatualizowane.");
							}
							case 0 -> {
								System.out.println("Zakończono edycję.");
								return;
							}
							default -> System.out.println("Nieprawidłowa opcja. Wybierz ponownie");
						}
					}
				}
				case 3 -> {
					for (int i = 0; i < eventsList.size(); i++) {
						System.out.println((i + 1) + ". " + eventsList.get(i));
					}
				}
				case 4 -> {
					System.out.println("Podaj numer wydarzenia do usunięcia:");
					for (int i = 0; i < eventsList.size(); i++) {
						System.out.println((i + 1) + ". " + eventsList.get(i));
					}
					final int eventIndex = scanner.nextInt() - 1;
					eventsList.remove(eventIndex);
					System.out.println("Usunięto event o infexie: " + (eventIndex + 1));
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
