package old_2024.Time;

import java.time.LocalTime;

public class LocalTimeExamples {
	public static void main(final String[] args) {
		final LocalTime currentTime = LocalTime.now();
		System.out.println("\nBieżący czas: " + currentTime);

		final LocalTime specificTime = LocalTime.of(14, 30, 15);
		System.out.println("Określony czas: " + specificTime);

		final LocalTime parsedTime = LocalTime.parse("23:45:00");
		System.out.println("Parsowany czas: " + parsedTime);

		System.out.println("Godzina: " + currentTime.getHour());
		System.out.println("Minuta: " + currentTime.getMinute());
		System.out.println("Sekunda: " + currentTime.getSecond());

		final LocalTime futureTime = currentTime.plusHours(2);
		System.out.println("Czas za 2 godziny: " + futureTime);

		System.out.println("Czy " + specificTime + " jest po " + currentTime + "? " + specificTime.isAfter(currentTime));
	}
}
