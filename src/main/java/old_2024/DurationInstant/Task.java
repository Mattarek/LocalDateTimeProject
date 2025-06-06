package old_2024.DurationInstant;

import java.time.Duration;
import java.time.Instant;

public class Task {
	private final String name;
	private Instant startTime;
	private Instant endTime;

	public Task(final String name) {
		this.name = name;
	}

	public void start() {
		startTime = Instant.now();
		System.out.println("Zadanie \"" + name + "\" rozpoczęte o " + startTime);
	}

	public void stop() {
		if (startTime == null) {
			System.out.println("Nie można zatrzymać zadania, ponieważ nie zostało rozpoczęte.");
			return;
		}
		endTime = Instant.now();
		System.out.println("Zadanie \"" + name + "\" zakończone o " + endTime);
	}

	public Duration getDuration() {
		if (startTime != null && endTime != null) {
			return Duration.between(startTime, endTime);
		}
		return Duration.ZERO;
	}

	@Override
	public String toString() {
		return "Task{name='" + name + "', duration=" + getDuration().toSeconds() + " seconds}";
	}
}
