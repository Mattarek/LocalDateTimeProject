package org.LambdaInterfacesInPractice;

import java.util.function.Supplier;

public class LambdaSupplierExample {
	public static void main(final String[] args) {
		//		final Supplier<Double> randomSupplier = Math::random;
		//		System.out.println(randomSupplier.get());
		//		System.out.println(randomSupplier.get());

		final double randomSupplier = Math.random();
		System.out.println(randomSupplier);
		System.out.println(randomSupplier);
	}
}
