package org.workingWithTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalExamples {
	public static void main(final String[] args) {
		final LocalTime id = LocalTime.of(0, 10, 0, 24);
		System.out.println(LocalTime.ofNanoOfDay(id.toNanoOfDay()));
		System.out.println(LocalTime.ofSecondOfDay(id.toSecondOfDay()));
	}
}