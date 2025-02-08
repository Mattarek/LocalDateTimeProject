package org.LambdaInterfacesInPractice;

import java.lang.classfile.constantpool.IntegerEntry;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaFunctionExample {
	//Stwórz Supplier<Double>, który zwraca Math.random().
	//Wywołaj go kilka razy i wyświetl wyniki.
	public static void main(final String[] args) {
		final Function<String, Integer> stringLength = String::length;

		final List<String> words = List.of("Apple", "Banana", "Cherry");
		final List<Integer> lengths = words.stream().map(stringLength).collect(Collectors.toList());

		// Z lambda
		System.out.println(lengths);
	}
}
