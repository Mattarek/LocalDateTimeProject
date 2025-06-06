package old_2024.workingWithTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationExample {
	public static void main(final String[] args) {
		System.out.println("Duration.ofDays: " + Duration.ofDays(1)); //	Duration.ofDays: PT24H
		System.out.println("Duration.ofHours: " + Duration.ofHours(1)); //	Duration.ofHours: PT1H
		System.out.println("Duration.ofMinutes: " + Duration.ofMinutes(1)); //	Duration.ofMinutes: PT1M
		System.out.println("Duration.ofSeconds: " + Duration.ofSeconds(1)); //	Duration.ofSeconds: PT1S
		System.out.println("Duration.ofMilliseconds: " + Duration.ofMillis(1)); //	Duration.ofMilliseconds: PT0.001S
		System.out.println("Duration.ofNanos: " + Duration.ofNanos(1)); //	Duration.ofNanos: PT0.000000001S

		Duration.ofHours(2);
		System.out.println("Duration.ofNanos: " + Duration.ofMinutes(3)); //	Duration.ofNanos: PT3M

		System.out.println("Duration.of " + Duration.of(1, ChronoUnit.DAYS)); //	Duration.of PT24H
		System.out.println("Duration.of " + Duration.of(1, ChronoUnit.HOURS)); //	Duration.of PT1H
		System.out.println("Duration.of " + Duration.of(1, ChronoUnit.MINUTES)); //	Duration.of PT1M
		System.out.println("Duration.of " + Duration.of(1, ChronoUnit.SECONDS)); //	Duration.of PT1S

		final LocalTime localTimeOne = LocalTime.of(20, 10, 20);
		final LocalTime localTimeTwo = LocalTime.of(23, 12, 27);
		final Duration duration = Duration.between(localTimeOne, localTimeTwo);

		System.out.println(duration);
		System.out.println("duration.truncatedTo: " + duration.truncatedTo(ChronoUnit.HOURS));
		System.out.println("duration.truncatedTo: " + duration.truncatedTo(ChronoUnit.MINUTES));
		System.out.println("duration.truncatedTo: " + duration.truncatedTo(ChronoUnit.SECONDS));
	}

	private static void someMethod(final TemporalUnit days) {
		Duration.of(1, days);
	}
}
