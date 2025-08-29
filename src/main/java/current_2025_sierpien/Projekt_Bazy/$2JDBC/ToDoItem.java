package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ToDoItem {
	private String name;
	private String description;
	private LocalDateTime localDateTime;
	private Integer priority;

	public String getName() {
		return name;
	}

	public Integer getPriority() {
		return priority;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public String getDescription() {
		return description;
	}
}
