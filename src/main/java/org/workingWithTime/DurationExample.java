package org.workingWithTime;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationExample {
	public static void main(final String[] args) {
		System.out.println("Duration.ofDays: " + Duration.ofDays(1));
		System.out.println("Duration.ofHours: " + Duration.ofHours(1));
		System.out.println("Duration.ofMinutes: " + Duration.ofMinutes(1));
		System.out.println("Duration.ofSeconds: " + Duration.ofSeconds(1));
		System.out.println("Duration.ofMilliseconds: " + Duration.ofMillis(1));
		System.out.println("Duration.ofNanos: " + Duration.ofNanos(1));

		Duration.ofHours(2);
		System.out.println("Duration.ofNanos: " + Duration.ofMinutes(3));

		System.out.println("Duration.of " + Duration.of(1, ChronoUnit.DAYS));
		System.out.println("Duration.of " + Duration.of(1, ChronoUnit.HOURS));
		System.out.println("Duration.of " + Duration.of(1, ChronoUnit.MINUTES));
		System.out.println("Duration.of " + Duration.of(1, ChronoUnit.SECONDS));
	}

	private static void someMethod(final TemporalUnit days) {
		Duration.of(1, days);
	}
}
