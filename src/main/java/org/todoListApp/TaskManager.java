package org.todoListApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
	private List<Task> tasks = new ArrayList<>();

	public void addTask(final String description, final int priority, final LocalDateTime dueDate) {
		final Task task = new Task(description, priority, dueDate);
		tasks.add(task);
	}

	public void removeTask(final int index) {
		if (index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("Invalid task index!");
		}
	}

	public void listTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks available.");
		} else {
			tasks.stream()
					.sorted(Comparator.comparingInt(Task::getPriority))
					.forEach(System.out::println);
		}
	}

	public void saveTasksToFile(final String filename) {
		try (final ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(tasks);
		} catch (final IOException e) {
			System.out.println("Error saving tasks: " + e.getMessage());
		}
	}

	public void loadTasksFromFile(final String filename) {
		try (final ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			tasks = (List<Task>) in.readObject();
		} catch (final IOException | ClassNotFoundException e) {
			System.out.println("Error loading tasks: " + e.getMessage());
		}
	}
}
