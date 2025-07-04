package current_2025_czerwiec.megakExercises.Exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(final String[] args) {
		final List<Car> carsOne = new ArrayList<>();
		final List<Car> carsTwo = new ArrayList<>();

		System.out.println("Dodawanie samochodów dla osoby 1. Wpisz '1' aby zakończyć lub naciśnij enter aby " +
				"kontynuować.");
		while (true) {
			System.out.print("Podaj markę: ");
			final String brand = scanner.nextLine();
			if (brand.equals("1")) {
				break;
			}

			System.out.print("Podaj model: ");
			final String model = scanner.nextLine();

			System.out.print("Podaj rok: ");
			final String year = scanner.nextLine();

			carsOne.add(new Car(brand, model, year));
		}

		System.out.println("\nDodawanie samochodów dla osoby 2. Wpisz '1' jako marka, aby zakończyć.");
		while (true) {
			System.out.print("Podaj markę: ");
			final String brand = scanner.nextLine();
			if (brand.equals("1")) {
				break;
			}

			System.out.print("Podaj model: ");
			final String model = scanner.nextLine();

			System.out.print("Podaj rok: ");
			final String year = scanner.nextLine();

			carsTwo.add(new Car(brand, model, year));
		}

		// Łączenie i usuwanie duplikatów
		final Set<Car> uniqueCars = new HashSet<>();
		uniqueCars.addAll(carsOne);
		uniqueCars.addAll(carsTwo);

		// Sortowanie
		final List<Car> sortedList = new ArrayList<>(uniqueCars);
		sortedList.sort(Comparator
				.comparing(Car::getYear)
				.thenComparing(Car::getBrand)
				.thenComparing(Car::getModel));
		// Wyświetlanie
		System.out.println("\nSamochody do obejrzenia w muzeum:");
		for (final Car car : sortedList) {
			System.out.println(car);
		}
	}
}
