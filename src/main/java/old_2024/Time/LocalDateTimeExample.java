package old_2024.Time;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
	public static void main(final String[] args) {
		final LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("\nBieżąca data i czas: " + currentDateTime);

		final LocalDateTime specificDateTime = LocalDateTime.of(2024, 12, 25, 14, 30);
		System.out.println("Określona data i czas: " + specificDateTime);

		final LocalDateTime parsedDateTime = LocalDateTime.parse("2025-01-01T15:45:00");
		System.out.println("Parsowana data i czas: " + parsedDateTime);

		final LocalDateTime adjustedDateTime = currentDateTime.withDayOfMonth(1).withHour(12);
		System.out.println("Ustawiony dzień miesiąca i godzina: " + adjustedDateTime);

		final LocalDateTime futureDateTime = currentDateTime.plusWeeks(2);
		System.out.println("Data i czas za 2 tygodnie: " + futureDateTime);
	}
}
