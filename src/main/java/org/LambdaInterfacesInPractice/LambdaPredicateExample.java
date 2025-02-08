package org.LambdaInterfacesInPractice;

import java.util.function.Predicate;

public class LambdaPredicateExample {
	//	Wymagania:
	//	Stwórz Predicate<Integer> isPrime, który sprawdza, czy liczba jest pierwsza.
	//	Użyj tej metody, aby sprawdzić kilka liczb.
	public static void main(final String[] args) {
		final Predicate<Integer> isPrime = n -> {
			if (n < 2) {
				return false;
			}
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};
		System.out.println(isPrime.test(1));
		System.out.println(isPrime.test(3));
		System.out.println(isPrime.test(5));
		System.out.println(isPrime.test(6));

		System.out.println(isPrime.test(10));
	}
}
