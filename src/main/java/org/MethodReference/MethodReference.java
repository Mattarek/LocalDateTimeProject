package org.MethodReference;

import java.util.function.Consumer;
import java.util.function.IntPredicate;

public class MethodReference {
	public static void main(final String[] args) {
		// wywołaj `run` przekazujac tam `Utils.isPrime`
		run(Utils::isPrime);
		final Consumer<String> printConsumer = new Consumer<String>() {
			@Override
			public void accept(final String s) {
			}
		};
	}

	public static void run(final IntPredicate intPredicate) {
		System.out.println(intPredicate.test(19));
	}

	public class Utils {
		public static boolean isPrime(final int x) {
			// sprawdzamy czy x jest pierwsze
			return true;
		}
	}
}
