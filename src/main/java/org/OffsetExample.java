package org;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

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
	}
}
