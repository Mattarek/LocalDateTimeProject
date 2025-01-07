package org.Calendar;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event {
	final String name;
	final String description;
	final LocalDateTime dateOfEvent;

	public Event(final String name, final String description, final LocalDateTime dateOfEvent) {
		this.name = name;
		this.description = description;
		this.dateOfEvent = dateOfEvent;
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
