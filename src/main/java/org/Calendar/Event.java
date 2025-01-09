package org.Calendar;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event {
	private String name;
	private String description;
	private LocalDateTime dateOfEvent;

	public Event(final String name, final String description, final LocalDateTime dateOfEvent) {
		this.name = name;
		this.description = description;
		this.dateOfEvent = dateOfEvent;
	}

	public static Event fromString(final String line) {
		final String[] parts = line.split(";");

		if (parts.length != 3) {
			throw new IllegalArgumentException("Invalid format. Expected format: name;description;yyyy-MM-dd'T'HH:mm");
		}

		final String name = parts[0];
		final String description = parts[1];
		final LocalDateTime dateOfEvent = LocalDateTime.parse(parts[2]);

		return new Event(name, description, dateOfEvent);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public LocalDateTime getDateOfEvent() {
		return dateOfEvent;
	}

	public void setDateOfEvent(final LocalDateTime dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Event{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", dateOfEvent=" + dateOfEvent +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Event event)) {
			return false;
		}
		return Objects.equals(name, event.name) && Objects.equals(description, event.description) && Objects.equals(dateOfEvent, event.dateOfEvent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, description, dateOfEvent);
	}
}
