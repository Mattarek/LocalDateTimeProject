package old_2024.Collections.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskListIteratorExample {
	public static void main(final String[] args) {
		final TaskManager manager = new TaskManager();
		final Integer[] array = {1, 2, 3, 4, 5};

		// Arrays.asList nie zwraca klasy ArrayList, tylko specjalną
		// wewnętrzną klasę Arrays$ArrayList która działa jak wrapper
		// na tablice i nie obsługuje zmian rozmiaru.

		// final List<Integer> arrayList = Arrays.asList(array); // to tworzy Array$ArrayList
		// arrayList.add(6); // java.lang.UnsupportedOperationException

		// Tablica na ArrayList
		final List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);

		System.out.println(arrayList);

		// ArrayList na tablice
		final List<String> arrayStringList = new ArrayList<>();
		arrayStringList.add("1");
		arrayStringList.add("2");
		arrayStringList.add("3");
		System.out.println(arrayStringList);

		final Object[] arrayString = arrayStringList.toArray();
		System.out.println(Arrays.toString(arrayString));

		manager.addTask("Nauczyć się Javy");
		manager.addTask("Zrobić zakupy");
		manager.addTask("Napisać report");
		manager.showTasksForward();

		manager.updateTask("Zrobić zakupy", "Zrobić zakupy online");
		manager.showTasksForward();

		manager.removeTask("Nauczyć się Javy");
		manager.showTasksBackword();
	}
}
