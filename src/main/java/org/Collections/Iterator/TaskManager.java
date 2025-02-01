package org.Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TaskManager {
	private final List<String> tasks = new ArrayList<>();

	public void addTask(final String task) {
		tasks.add(task);
		System.out.println("Dodano zadanie: " + task);
	}

	public void removeTask(final String task) {
		final Iterator<String> iterator = tasks.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals(task)) {
				iterator.remove();
				System.out.println("Usunięto zadanie: " + task);
				return;
			}
		}
		System.out.println("Zadanie nie znalezione.");
	}

	public void showTasksForward() {
		final ListIterator<String> iterator = tasks.listIterator();
		while (iterator.hasNext()) {
			System.out.println("- " + iterator.next());
		}
	}

	public void showTasksBackword() {
		final ListIterator<String> iterator = tasks.listIterator(tasks.size());
		System.out.println("Lista zadań (do tyłu):");
		while (iterator.hasNext()) {
			System.out.println("- " + iterator.next());
		}
	}

	public void updateTask(final String oldTask, final String newTask) {
		final ListIterator<String> iterator = tasks.listIterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals(oldTask)) {
				iterator.set(newTask);
				System.out.println("Zaktualizowano zadanie: " + oldTask + " -> " + newTask);
				return;
			}
		}
		System.out.println("Nie znaleziono zadania do aktualizacji.");
	}
}
