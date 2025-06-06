package old_2024.DurationInstant;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	private final List<Task> tasks = new ArrayList<>();

	public void showTasks() {
		if (tasks.isEmpty()) {
			System.out.println("Brak tasków");
		} else {
			tasks.forEach(System.out::println);
		}
	}

	public void addTask(final Task task) {
		tasks.add(task);
	}
}
