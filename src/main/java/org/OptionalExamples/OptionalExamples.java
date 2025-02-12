package org.OptionalExamples;

import java.util.Optional;

public class OptionalExamples {
	public static void main(final String[] args) {
		final Optional<String> opOne = Optional.empty();
		final Optional<String> opString = Optional.of("Something");
		// final Optional<String> opNullPointerException = Optional.of(null); // NullPointerException
		final Optional<String> opOfNullable = Optional.ofNullable(null); // Optional.empty

		System.out.println(opOne);
		System.out.println(opString);
		//System.out.println(opNullPointerException);
		System.out.println(opOfNullable);

		final Optional<String> ofFull = Optional.of("Hello");

		if (ofFull.isPresent()) {
			final String variable = ofFull.get();
			System.out.println(variable);
		}

		final String variable = opOne.orElse("Default");
		System.out.println(variable); // Default

		final String variableOne = opOne.orElse(defaultOne());
		final String variableTwo = opOne.orElseGet(() -> defaultTwo());
		System.out.println(variableOne);
		System.out.println(variableTwo);
	}

	private static String defaultOne() {
		System.out.println("Default one");
		return "Default one";
	}

	private static String defaultTwo() {
		System.out.println("Default two");
		return "Default two";
	}

	public static Optional<String> someMethod() {
		return Optional.empty();
	}
}
