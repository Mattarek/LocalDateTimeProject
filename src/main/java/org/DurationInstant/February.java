package org.DurationInstant;

import java.time.Duration;
import java.time.LocalDateTime;

public class February {
	public static void main(final String[] args) {
		final LocalDateTime firstDay = LocalDateTime.of(2025, 2, 1, 0, 0, 0);
		final LocalDateTime lastDay = LocalDateTime.of(2025, 3, 1, 0, 0, 0);
		System.out.println(Duration.between(firstDay, lastDay).toSeconds());
	}
}
