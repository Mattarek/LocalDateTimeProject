package org.CEPiK;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	private static final Scanner scanner = new Scanner(System.in);

	private static final List<Car> cars = new ArrayList<>();
	private static final List<CarDriver> drivers = new ArrayList<>();
	private static final List<RegistrationCertificate> registrationCertificates = new ArrayList<>();

	public static void main(final String[] args) {
		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Dodaj samochód");
			System.out.println("2. Dodaj kierowcę");
			System.out.println("3. Powiąż kierowcę z samochodem");
			System.out.println("4. Wyświetl samochody");
			System.out.println("5. Wyświetl kierowców");
			System.out.println("6. Wyświetl dowody rejestracyjne");
			System.out.println("7. Porównaj dwóch kierowców");
			System.out.println("8. Wyjdź");
			System.out.print("Wybierz opcję: ");

			final int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1 -> {
					System.out.print("Podaj markę samochodu: ");
					final String mark = scanner.nextLine();

					System.out.println("Podaj model samochodu: ");
					final Model[] models = Model.values();

					for (int i = 0; i < models.length; i++) {
						System.out.println((i + 1) + ". " + models[i]);
					}

					System.out.print("Wybrany model: ");
					final int choiceModel = scanner.nextInt();
					scanner.nextLine();
					final Model selectedModel = models[choiceModel - 1];

					System.out.print("Podaj vin: ");
					final String vin = scanner.nextLine();

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

					final Car car = new Car(selectedModel, vin, mark, productionDate, registrationNumber,
							technicalCondition, color);
					final RegistrationCertificate newRegistrationCertificate = new RegistrationCertificate(car);

					cars.add(car);
					registrationCertificates.add(newRegistrationCertificate);
					System.out.println("Samochód dodany.");
				}
				case 2 -> {
					System.out.print("Podaj imię kierowcy: ");
					final String name = scanner.nextLine();

					System.out.print("Podaj nazwisko kierowcy: ");
					final String lastName = scanner.nextLine();

					System.out.print("Podaj kategorie jakie ten kierowca posiada: ");
					final String licence = scanner.nextLine();

					final CarDriver driver = new CarDriver(name, lastName, licence);
					drivers.add(driver);
					System.out.println("Kierowca dodany.");
				}
				case 3 -> {
					if (cars.isEmpty() || drivers.isEmpty() || registrationCertificates.isEmpty()) {
						System.out.println("Brak samochodów lub kierowców do powiązania.");
						break;
					}

					System.out.println("Lista kierowców:");
					for (int i = 0; i < drivers.size(); i++) {
						System.out.println((i + 1) + ". " + drivers.get(i));
					}

					System.out.print("Wybierz numer kierowcy: ");
					final int driverIndex = scanner.nextInt() - 1;
					scanner.nextLine();

					System.out.println("Lista samochodów:");
					for (int i = 0; i < registrationCertificates.size(); i++) {
						System.out.println((i + 1) + ". " + registrationCertificates.get(i));
					}

					System.out.print("Wybierz numer samochodu: ");
					final int carIndex = scanner.nextInt() - 1;
					scanner.nextLine();

					final CarDriver selectedDriver = drivers.get(driverIndex);
					final RegistrationCertificate selectedCar = registrationCertificates.get(carIndex);

					if (true) {
						drivers.add(selectedDriver);
						registrationCertificates.add(selectedCar);
						System.out.println("Kierowca został powiązany z samochodem.");
					} else {
						System.out.println("Samochód ma już maksymalną liczbę kierowców.");
					}
				}
				case 4 -> {
					if (cars.isEmpty()) {
						System.out.println("Brak samochodów do wyświetlenia.");
					} else {
						cars.forEach(System.out::println);
					}
				}
				case 5 -> {
					if (drivers.isEmpty()) {
						System.out.println("Brak kierowców do wyświetlenia.");
					} else {
						drivers.forEach(System.out::println);
					}
				}
				case 6 -> {
					if (registrationCertificates.isEmpty()) {
						System.out.println("Brak dowodów rejestracyjnych do wyświetlenia");
					} else {
						registrationCertificates.forEach(System.out::println);
					}
				}
				case 7 -> {
					if (drivers.size() < 2) {
						System.out.println("Brak wystarczającej liczby kierowców do porównania.");
						break;
					}

					System.out.println("Lista kierowców:");
					for (int i = 0; i < drivers.size(); i++) {
						System.out.println((i + 1) + ". " + drivers.get(i));
					}

					System.out.print("Wybierz numer pierwszego kierowcy: ");
					final int firstDriverIndex = scanner.nextInt() - 1;
					scanner.nextLine();

					System.out.print("Wybierz numer drugiego kierowcy: ");
					final int secondDriverIndex = scanner.nextInt() - 1;
					scanner.nextLine();

					final CarDriver firstDriver = drivers.get(firstDriverIndex);
					final CarDriver secondDriver = drivers.get(secondDriverIndex);

					System.out.println("Porównanie kierowców:");
					System.out.println("Kierowca 1: " + firstDriver);
					System.out.println("Kierowca 2: " + secondDriver);

					if (firstDriver.equals(secondDriver)) {
						System.out.println("Kierowcy są tacy sami.");
					} else {
						System.out.println("Kierowcy są różni.");
					}
				}
				case 8 -> {
					System.out.println("Zakończono program.");
					return;
				}
				default -> System.out.println("Nieprawidłowa opcja.");
			}
		}
	}
}
