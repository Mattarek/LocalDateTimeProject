package org.LambdaInterfacesInPractice;

import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumerExample {
	public static void main(final String[] args) {
		final Consumer<String> printUpperCase = text -> System.out.println(text);
		final List<String> names = List.of("anna", "maria", "John");

		// Bez wykorzystania Lambdy:
		names.forEach(x -> System.out.println(x));

		// Z wykorzystaniem Lambdy
		names.forEach(printUpperCase);
	}
}
