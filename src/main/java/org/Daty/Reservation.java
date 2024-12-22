package org.Daty;

import java.time.LocalDateTime;

public class Reservation {
	private final Room room;
	private final LocalDateTime startTime;
	private final LocalDateTime endTime;

	public Reservation(final Room room, final LocalDateTime startTime, final LocalDateTime endTime) {
		if (room == null || startTime == null || endTime == null) {
			throw new IllegalArgumentException("Wszystkie pola muszą być wypełnione.");
		}
		if (!startTime.isBefore(endTime)) {
			throw new IllegalArgumentException("Czas rozpoczęcia musi być przed czasem zakończenia!");
		}

		this.room = room;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Room getRoom() {
		return room;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	@Override
	public String toString() {
		return "Reservation{" +
				"room=" + room +
				", startTime=" + startTime +
				", endTime=" + endTime +
				'}';
	}
}
