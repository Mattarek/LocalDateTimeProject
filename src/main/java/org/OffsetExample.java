package org;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class OffsetExample {
	public static void main(final String[] args) {
		final LocalDate localDate = LocalDate.of(2020, 10, 10);
		final LocalTime localTime = LocalTime.of(20, 12, 2);
		final LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		final OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(2));

		System.out.println("offsetDateTime: " + offsetDateTime);
		System.out.println("offsetDateTime.toLocalDate: " + offsetDateTime.toLocalDate());
		System.out.println("offsetDateTime.toLocalTime(): " + offsetDateTime.toLocalTime());
		System.out.println("offsetDateTime.toLocalDateTime(): " + offsetDateTime.toLocalDateTime());
		System.out.println("offsetDateTime.toZonedDateTime(): " + offsetDateTime.toZonedDateTime());
		System.out.println("offsetDateTime.getOffset(): " + offsetDateTime.getOffset());

		//============================================================
		final ZoneId zone = ZoneId.of("Europe/Paris");
		final LocalDate dateOne = LocalDate.of(2018, 10, 28);
		final LocalTime timeOne = LocalTime.of(1, 55);
		ZonedDateTime dateTime = ZonedDateTime.of(dateOne, timeOne, zone);
		System.out.println(dateTime); // 2018-03-25T14:30+02:00[Europe/Paris]

		//============================================================
		// Wybierzmy date zmiany czasu na godzinę w tył, aby strefa sama zaktualizowała się za nas.
		System.out.println("Step 1: " + dateTime); // Step 1: 2018-10-28T01:55+02:00[Europe/Paris]
		dateTime = dateTime.plusHours(1);
		System.out.println("Step 2: " + dateTime); // Step 2: 2018-10-28T02:55+02:00[Europe/Paris]
		dateTime = dateTime.plusHours(2);
		System.out.println("Step 3: " + dateTime); // Step 3: 2018-10-28T03:55+01:00[Europe/Paris]
	}
}
