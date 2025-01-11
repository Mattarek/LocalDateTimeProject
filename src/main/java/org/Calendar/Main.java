package org.Calendar;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	private static final FileManager fileManager = new FileManager();
	private static final List eventsList = new ArrayList<>();

	public static void main(final String[] args) {
		while (true) {
			System.out.println("\nDostępne opcje:");
			System.out.println("1. Dodaj wydarzenie");
			System.out.println("2. Edytuj wydarzenie");
			System.out.println("3. Wyświetl wydarzenia");
			System.out.println("4. Usuń wydarzenie");
			System.out.println("5. Zapisz wydarzenia do pliku");
			System.out.println("6. Odczyt wydarzeń z pliku");
			System.out.println("0. Wyjdź");

			final int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1 -> addNewEvent();
				case 2 -> editEvent();
				case 3 -> showAllEvents();
				case 4 -> removeEvent();
				case 5 -> saveToFile();
				case 6 -> loadFile();
				case 0 -> {
					System.out.println("Zakończono program.");
					return;
				}
				default -> System.out.println("Nieprawidłowa opcja.");
			}
		}
	}

	public static void showAllEvents() {
		for (int i = 0; i < eventsList.size(); i++) {
			System.out.println((i + 1) + ". " + eventsList.get(i));
		}
	}

	public static void removeEvent() {
		System.out.println("Podaj numer wydarzenia do usunięcia:");
		for (int i = 0; i < eventsList.size(); i++) {
			System.out.println((i + 1) + ". " + eventsList.get(i));
		}
		final int eventIndex = scanner.nextInt() - 1;
		eventsList.remove(eventIndex);
		System.out.println("Usunięto event o indexie: " + (eventIndex + 1));
	}

	private static int getIntInput(final String prompt) {
		System.out.println(prompt);
		while (!scanner.hasNextInt()) {
			System.out.println("Nieprawidłowy numer. Spróbuj ponownie:");
			scanner.next();
		}
		return scanner.nextInt();
	}

	public static void addNewEvent() {
		System.out.println("Podaj nazwę wydarzenia: ");
		final String nameOfEvent = scanner.nextLine();

		System.out.println("Podaj opis wydarzenia:");
		final String description = scanner.nextLine();

		final int yearOfEvent = getIntInput("Podaj rok:");
		final int monthOfEvent = getIntInput("Podaj miesiąc (1-12):");
		final int dayOfEvent = getIntInput("Podaj dzień (1-31):");
		final int hourOfEvent = getIntInput("Podaj godzinę (0-23):");
		final int minuteOfEvent = getIntInput("Podaj minutę (0-59):");

		try {
			final Event event = new Event(nameOfEvent, description, LocalDateTime.of(yearOfEvent, monthOfEvent, dayOfEvent, hourOfEvent, minuteOfEvent));
			eventsList.add(event);
			System.out.println("Dodano wydarzenie: " + event);
		} catch (final Exception e) {
			System.out.println("Błąd podczas tworzenia wydarzenia: " + e.getMessage());
		}
	}

	public static void editEvent() {
		if (eventsList.isEmpty()) {
			System.out.println("Brak wydarzeń do edycji.");
			return;
		}
		System.out.println("Podaj numer wydarzenia do edycji:");

		showAllEvents();

		final int eventIndex = scanner.nextInt() - 1;
		scanner.nextLine();

		if (eventIndex < 0 || eventIndex >= eventsList.size()) {
			System.out.println("Nieprawidłowy numer wydarzenia.");
			return;
		}

		final Event eventToEdit = (Event) eventsList.get(eventIndex);
		System.out.println("\nCo chcesz edytować?");
		System.out.println("1. Nazwa wydarzenia (obecna: " + eventToEdit.getName() + ")");
		System.out.println("2. Opis wydarzenia (obecny: " + eventToEdit.getDescription() + ")");
		System.out.println("3. Data i godzina wydarzenia (obecna: " + eventToEdit.getDateOfEvent() + ")");
		System.out.println("0. Zakończ edycję");
		System.out.print("Podaj numer opcji: ");
		final int editChoice = scanner.nextInt();
		scanner.nextLine();

		choiceEventToEdit(editChoice, eventToEdit);
	}

	public static void choiceEventToEdit(final int editChoice, final Event eventToEdit) {
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
			}
			default -> System.out.println("Nieprawidłowa opcja. Wybierz ponownie");
		}
	}

	public static void saveToFile() {
		System.out.println("Podaj nazwę pliku który chcesz wczytać");
		final String fileName = scanner.nextLine();
		try {
			final List<Event> newList = fileManager.loadFile(fileName);
			eventsList.addAll(newList);
			fileManager.saveToFile(fileName, eventsList);
			System.out.println("Plik został zapisany");
		} catch (final IOException e) {
			System.out.println(e);
		}
	}

	public static void loadFile() {
		System.out.println("Podaj nazwę pliku który chcesz wczytać");
		final String fileName = scanner.nextLine();

		try {
			final List<Event> newList = fileManager.loadFile(fileName);
			if (!eventsList.isEmpty()) {
				System.out.println("1. Dodaj eventy z pliku do istniejącej listy");
				System.out.println("2. Odczytaj i nadpisz istniejące eventy. ");
				final int choice = scanner.nextInt();

				switch (choice) {
					case 1:
						if (!newList.isEmpty()) {
							System.out.println(newList);
							eventsList.addAll(newList);
							System.out.println("Plik został wczytany poprawnie.");
						} else {
							System.out.println("Nie znaleziono żadnych pasujących danych w pliku.");
						}
						break;
					case 2:
						eventsList.clear();
						eventsList.addAll(newList);
						break;
					default:
						System.out.println("Nieprawidłowa opcja. Wybierz ponownie");
				}
			}
		} catch (final Exception e) {
			System.err.println("Błąd odczytu pliku: " + e.getMessage());
		}
	}
}
