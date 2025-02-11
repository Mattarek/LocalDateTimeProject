package org.BigIntAndBigDecimal;

import java.math.BigInteger;

public class Silnia {
	public static void main(final String[] args) {
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(6));
		System.out.println(factorial(7));
		System.out.println(factorial(8));
		System.out.println(factorial(9));
		System.out.println(factorial(10));
		System.out.println(factorial(11));
		System.out.println(factorial(12));
		System.out.println(factorial(13));
		System.out.println(factorial(14));
		System.out.println(factorial(15));

		// W pewnym momencie, miejsce w incie sie konczy i otrzymujemy juz przekrecone wartosci
		System.out.println(factorial(18));
		System.out.println(factorial(19));
		System.out.println(factorial(20));

		System.out.println("=== BigInteger ===");
		System.out.println(factorialBigInteger(15));
		System.out.println(factorialBigInteger(16));
		System.out.println(factorialBigInteger(17));
		System.out.println(factorialBigInteger(18));
		System.out.println(factorialBigInteger(19));
		System.out.println(factorialBigInteger(20));
	}

	public static int factorial(final int n) {
		int f = 1;
		for (int i = 1; i < n; i++) {
			f = f * i;
		}
		return f;
	}

	public static BigInteger factorialBigInteger(final int n) {
		BigInteger f = BigInteger.TEN;
		for (int i = 1; i < n; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
}
