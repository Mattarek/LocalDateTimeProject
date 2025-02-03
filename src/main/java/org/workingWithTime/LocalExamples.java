package org.workingWithTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalExamples {
	public static void main(final String[] args) {
		final LocalDate id = LocalDate.of(2000, Month.MARCH, 20);
		System.out.println(id.withMonth(Month.APRIL.ordinal() + 1)); // Aby wyświetlić Kwiecień, musimy dodać +1
	}
}