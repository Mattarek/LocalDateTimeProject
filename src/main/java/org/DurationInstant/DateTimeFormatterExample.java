package org.DurationInstant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
	public static void main(final String[] args) {
		final LocalDateTime parsed = LocalDateTime.parse("2020-10-10T10:10:00");
		System.out.println(parsed);
		// Format jest dowolny jeśli chodzi o oddzielenie, yy to lata, MM to miesiace, dd to dni, HH godziny, mm
		// minutry i ss to sekundy
		final DateTimeFormatter dateTimeFormatterOne = DateTimeFormatter.ofPattern("yy.MM.dd HH:mm:ss");
		final DateTimeFormatter dateTimeFormatterTwo = DateTimeFormatter.ofPattern("yy MM dd HH mm ss");
		final DateTimeFormatter dateTimeFormatterThree = DateTimeFormatter.ofPattern("yy-MM-dd HH-mm-ss");

		System.out.println(dateTimeFormatterOne.format(parsed));
		System.out.println(dateTimeFormatterTwo.format(parsed));
		System.out.println(dateTimeFormatterThree.format(parsed));
	}
}
