package org.RandomExample;

import java.util.Random;

public class RandomExample {

	public static void main(final String[] args) {
		final Random random = new Random();

		final int numberOne = random.nextInt(1, 6);
		final boolean numberBoolean = random.nextBoolean();
		final double numberDouble = random.nextDouble(1, 400000);
		final double numberGaussian = random.nextGaussian();
		final double numberExponential = random.nextExponential();

		System.out.println(numberOne);
		System.out.println(numberBoolean);
		System.out.println(numberDouble);
		System.out.println(numberGaussian);
		System.out.println(numberExponential);
		random.ints(3, 10, 20).forEachOrdered(System.out::println);
	}
}
