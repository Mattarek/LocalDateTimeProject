package org.todoListApp;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		final TaskManager taskManager = new TaskManager();

		taskManager.loadTasksFromFile("tasks.dat");

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Add Task");
			System.out.println("2. Remove Task");
			System.out.println("3. List Tasks");
			System.out.println("4. Save and Exit");

			final int choice = scanner.nextInt();
			scanner.nextLine();  // consume newline

			switch (choice) {
				case 1:
					System.out.println("Enter task description:");
					final String description = scanner.nextLine();
					System.out.println("Enter task priority:");
					final int priority = scanner.nextInt();
					System.out.println("Enter task due date (YYYY-MM-DD HH:MM):");
					final String dueDateStr = scanner.next();
					final LocalDateTime dueDate = LocalDateTime.parse(dueDateStr.replace(" ", "T"));
					taskManager.addTask(description, priority, dueDate);
					break;
				case 2:
					System.out.println("Enter task index to remove:");
					final int index = scanner.nextInt();
					taskManager.removeTask(index);
					break;
				case 3:
					taskManager.listTasks();
					break;
				case 4:
					taskManager.saveTasksToFile("tasks.dat");
					System.out.println("Tasks saved.");
					return;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}
