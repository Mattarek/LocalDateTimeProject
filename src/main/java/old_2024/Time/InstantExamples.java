package old_2024.Time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InstantExamples {
	public static void main(final String[] args) {
		final Instant currentInstant = Instant.now();
		System.out.println("\nBieżący moment czasu: " + currentInstant);

		final Instant futureInstant = currentInstant.plus(10, ChronoUnit.SECONDS);
		System.out.println("Moment czasu za 10 sekund: " + futureInstant);

		final Instant pastInstant = currentInstant.minus(5, ChronoUnit.MINUTES);
		System.out.println("Moment czasu sprzed 5 minut: " + pastInstant);
		System.out.println("Epoch Second: " + currentInstant.getEpochSecond());

		// Formatowanie dat i czasów
		final LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("\nBieżąca data i czas: " + currentDateTime);

		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("\nSformatowana data i czas: " + currentDateTime.format(formatter));
	}
}
