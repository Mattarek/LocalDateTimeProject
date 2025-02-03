package org.workingWithTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalExamples {
	public static void main(final String[] args) {
		final LocalDate localDate = LocalDate.of(2000, Month.MARCH, 20);
		System.out.println(localDate.withMonth(Month.APRIL.ordinal() + 1)); // Aby wyświetlić Kwiecień, musimy dodać +1

		final LocalTime localTime = LocalTime.parse("00:15:15");
		final LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime); // 2000-03-20T00:15:15
	}
}