package org.Daty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(final String[] args) {
		final LocalDateTime now = LocalDateTime.now();

		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		//final String dateTimeString = "2024-09-12 14:30:00";
		//		final LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
		//		System.out.println(parsedDateTime);

		// Parsowanie daty z tekstu
		final String dateTimeString = "2024-09-12 14:30:00";
		final LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
		System.out.println(parsedDateTime);
	}
}
