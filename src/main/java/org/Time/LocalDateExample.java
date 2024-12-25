package org.Time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
	public static void main(final String[] args) {
		// Tworzenie obiektu LocalDate z bieżącą datą
		final LocalDate currentDate = LocalDate.now();
		System.out.println("Bieżąca data: " + currentDate);

		// 1. Podstawowe metody
		System.out.println("Rok: " + currentDate.getYear());
		System.out.println("Miesiąc (enum): " + currentDate.getMonth());
		System.out.println("Numer miesiąca: " + currentDate.getMonthValue());
		System.out.println("Dzień miesiąca: " + currentDate.getDayOfMonth());
		System.out.println("Dzień tygodnia: " + currentDate.getDayOfWeek());

		// 2. Manipulowanie datą
		final LocalDate tenDaysLater = currentDate.plusDays(10);
		System.out.println("Data za 10 dni: " + tenDaysLater);

		final LocalDate twoMonthsEarlier = currentDate.minusMonths(2);
		System.out.println("Data sprzed 2 miesięcy: " + twoMonthsEarlier);

		final LocalDate nextYearSameDay = currentDate.plusYears(1);
		System.out.println("Data za rok: " + nextYearSameDay);

		final LocalDate specificDayInMonth = currentDate.withDayOfMonth(15);
		System.out.println("Ustawiona data na 15 dzień miesiąca: " + specificDayInMonth);

		// 3. Porównywanie dat
		final LocalDate someDate = LocalDate.of(2023, Month.DECEMBER, 25);
		System.out.println("Porównywanie dat: ");
		System.out.println("Czy " + someDate + " jest przed " + currentDate + "? " + someDate.isBefore(currentDate));
		System.out.println("Czy " + someDate + " jest po " + currentDate + "? " + someDate.isAfter(currentDate));
		System.out.println("Czy " + someDate + " jest równa " + currentDate + "? " + someDate.isEqual(currentDate));

		// 4. Inne metody
		System.out.println("Liczba dni w miesiącu: " + currentDate.lengthOfMonth());
		System.out.println("Liczba dni w roku: " + currentDate.lengthOfYear());
		System.out.println("Liczba dni od 1970-01-01: " + currentDate.toEpochDay());
	}
}
