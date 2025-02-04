package org.workingWithTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodExample {

	public static void main(final String[] args) {

		// Tworzenie obiektów Period
		final Period p1 = Period.of(2, 3, 5);
		final Period p2 = Period.ofDays(7);
		final Period p3 = Period.ofMonths(3);
		final Period p4 = Period.ofWeeks(2);

		// 3. Obliczanie różnicy między datami
		final LocalDate start = LocalDate.of(2020, 1, 1);
		final LocalDate end = LocalDate.of(2023, 6, 15);
		final Period period = Period.between(start, end);
		System.out.println(period);

		// 4. Odczytywanie wartości
		final int years = period.getYears();   // 3
		final int months = period.getMonths(); // 5
		final int days = period.getDays();     // 14

		// 5. Dodawanie i odejmowanie okresów
		// Dodawanie
		final Period p = Period.of(1, 2, 3); // 1 rok, 2 miesiące, 3 dni
		final Period newPeriod = p.plusYears(2).plusMonths(3).plusDays(5);
		System.out.println(newPeriod); // P3Y5M8D

		// Odejmowanie
		final Period reducedPeriod = p.minusYears(1).minusMonths(1).minusDays(1);
		System.out.println(reducedPeriod); // P0Y1M2D

		// 6. Porównywanie Period
		//		final Period p1 = Period.of(2, 3, 5);
		//		final Period p2 = Period.of(2, 3, 5);
		//
		//		System.out.println(p1.equals(p2)); // true

		// 7. Negowanie wartości
		final Period ps = Period.of(1, 2, 3);
		final Period negatedP = ps.negated();
		System.out.println(negatedP); // P-1Y-2M-3D

		// Do czego użyć w praktyce
		final LocalDate localDate = LocalDate.of(2020, 12, 1);
		final LocalTime localTime = LocalTime.of(20, 10);
		final LocalDateTime localDataTime = LocalDateTime.of(localDate, localTime);
		System.out.println("localDate.plus: " + localDate.plus(Period.of(2, 3, 10))); // localDate.plus: 2023-03-11

		// Obliczamy różnice
		final LocalDate one = LocalDate.of(2020, 1, 1);
		final LocalDate two = LocalDate.of(2023, 1, 5);

		System.out.println("Period: " + Period.between(one, two)); // P3Y4D czyli Period 3years 4 days
	}
}
