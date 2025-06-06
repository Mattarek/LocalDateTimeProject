package old_2024.Collections.courseList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test {

	public static void main(final String[] args) {
		final LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");

		final ListIterator<String> iterator = linkedList.listIterator(linkedList.size());
		System.out.println("od tyłu:");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}
