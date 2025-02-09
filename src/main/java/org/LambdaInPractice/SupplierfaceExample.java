package org.LambdaInPractice;

import java.time.LocalTime;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierfaceExample {
	public static void main(final String[] args) {
		// Dodanie losowej liczby całkowitej
		final int num = new Random().nextInt();
		final Supplier<Integer> randomInt = () -> num;
		System.out.println(randomInt.get());

		// Dostarczenie aktualnej godziny
		final Supplier<LocalTime> currentTime = LocalTime::now;
		System.out.println(currentTime.get());

		// Dostarczenie losowego identyfikatora UUID
		final Supplier<String> randomUUID = () -> UUID.randomUUID().toString();
		System.out.println(randomUUID.get());

		// Dostarczenie domyślnego tekstu
		final Supplier<String> defaultText = () -> "Hello, world";
		System.out.println(defaultText.get());

		// Dostarczanie losowej wartosci boolean
		final Supplier<Boolean> randomBoolean = () -> new Random().nextBoolean();
		System.out.println(randomBoolean.get());
	}
}

