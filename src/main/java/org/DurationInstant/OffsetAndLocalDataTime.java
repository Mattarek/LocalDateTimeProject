package org.DurationInstant;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetAndLocalDataTime {
	public static void main(final String[] args) {
		final LocalDate localDate = LocalDate.of(2010, 7, 15);
		final LocalTime localTime = LocalTime.of(8, 50);
		final OffsetDateTime offsetDateTime = OffsetDateTime.of(localDate, localTime, ZoneOffset.of("-05:00"));
		System.out.println(offsetDateTime);
		System.out.println(OffsetDateTime.of(offsetDateTime.toLocalDateTime(), ZoneOffset.ofHours(2)));
		System.out.println(OffsetDateTime.of(offsetDateTime.toLocalDateTime(), ZoneOffset.ofHours(8)));
	}
}
