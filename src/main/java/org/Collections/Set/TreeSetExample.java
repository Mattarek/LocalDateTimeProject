package org.Collections.Set;

import java.util.Set;
import java.util.TreeSet;

/*
	Elementy są posortowane naturalnie lub przez komparator.
	Wolniejszy niż HashSet.
*/
public class TreeSetExample {
	public static void main(final String[] args) {
		final Set<Integer> treeSet = new TreeSet<>();

		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(8);

		for (final Integer number : treeSet) {
			System.out.println(number); // Posortowane
		}
	}
}
