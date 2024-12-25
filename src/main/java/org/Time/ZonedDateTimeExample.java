package org.Time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
	public static void main(final String[] args) {
		final ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
		System.out.println("\nBieżąca data i czas ze strefą: " + currentZonedDateTime);

		final LocalDateTime specificDateTime = LocalDateTime.of(2024, 12, 25, 14, 30);
		System.out.println("Określona data i czas: " + specificDateTime);
		final ZonedDateTime specificZonedDateTime = ZonedDateTime.of(specificDateTime, ZoneId.of("Europe/Warsaw"));
		System.out.println("Określona data i czas ze strefą: " + specificZonedDateTime);

		final ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("Czas UTC: " + utcDateTime);

		final ZonedDateTime futureZonedDateTime = currentZonedDateTime.plusDays(3);
		System.out.println("Data i czas za 3 dni ze strefą: " + futureZonedDateTime);

		System.out.println("Strefa czasowa: " + currentZonedDateTime.getZone());
	}
}
