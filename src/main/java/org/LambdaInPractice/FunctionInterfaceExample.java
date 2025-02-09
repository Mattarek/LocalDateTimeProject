package org.LambdaInPractice;

import java.util.function.Function;

public class FunctionInterfaceExample {
	public static void main(final String[] args) {
		// Obliczanie kwadratu
		final Function<Integer, Integer> square = num -> num * num;
		System.out.println(square.apply(5));

		// Zmiana stringa na jego długosc
		final Function<String, Integer> length = str -> str.length();
		System.out.println(length.apply("Java"));

		// Zmiana temperatury
		final Function<Double, Double> firstChar = num -> num * 9 / 5 + 32;
		System.out.println(firstChar.apply(25.0));

		// Pobieranie pierwszego znaku z stringa
		final Function<String, Character> firstCharString = str -> str.charAt(0);
		System.out.println(firstCharString.apply("Czudec"));

		// Mnożenie przez dwa
		final Function<Integer, Integer> integer = num -> num * 2;
		System.out.println(integer.apply(2));
	}
}
