package org.Loops;

import java.util.ArrayList;
import java.util.List;

public class Loops {
	public static void main(final String[] args) {
		final List<Integer> integers = new ArrayList<>();
		final List<Integer> fillElement = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		integers.addAll(fillElement);

		// Pętla for
		for (int i = 0; i < integers.size(); i++) {
			System.out.println(integers.get(i));
		}

		// Pętla for..each
		for (final int integer : integers) {
			System.out.println(integer);
		}

		// forEach
		integers.forEach(System.out::println);

		//While
		int whileLoopStart = 10;
		while (whileLoopStart > 5) {
			System.out.println(whileLoopStart);
			whileLoopStart--;
		}

		// While
		int i = 0;
		do {
			i++;
			System.out.println(i);
		} while (i < 5);
	}
}
