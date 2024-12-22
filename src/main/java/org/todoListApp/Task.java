package org.todoListApp;

import java.time.LocalDateTime;

public class Task {
	private final String description;
	private final int priority;
	private final LocalDateTime dueDate;

	public Task(final String description, final int priority, final LocalDateTime dueDate) {
		this.description = description;
		this.priority = priority;
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public int getPriority() {
		return priority;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	@Override
	public String toString() {
		return "Task: " + description + ", Priority: " + priority + ", Due: " + dueDate;
	}
}