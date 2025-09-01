package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ToDoItem {
	public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
	private String name;
	private String description;
	private LocalDateTime deadline;
	private Integer priority;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(final Integer priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(final LocalDateTime deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "ToDoItem{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", deadline=" + deadline +
				", priority=" + priority +
				'}';
	}

	public enum Field {
		NAME,
		DESCRIPTION,
		DEADLINE,
		PRIORITY,
		SORT
	}
}
