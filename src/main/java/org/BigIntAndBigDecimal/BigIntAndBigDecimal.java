package org.BigIntAndBigDecimal;

import java.math.BigInteger;

public class BigIntAndBigDecimal {
	public static void main(final String[] args) {
		final BigInteger a = new BigInteger("5000000000000000000000");
		final BigInteger b = new BigInteger("2000000000000000000000");

		// Operacje arytmetyczne
		System.out.println("Dodawanie: " + a.add(b));
		System.out.println("Odejmowanie: " + a.subtract(b));
		System.out.println("Mnożenie: " + a.multiply(b));
		System.out.println("Dzielenie: " + a.divide(b));
		System.out.println("Modulo: " + a.mod(b));
		System.out.println("Modulo: " + a.pow(2));

		// Porównywanie liczb
		final BigInteger one = new BigInteger("1");
		final BigInteger oneToCompare = new BigInteger("1");

		final BigInteger two = new BigInteger("2");
		final BigInteger twoToCompare = new BigInteger("2");

		// Porównanie liczb
		System.out.println(two.compareTo(one)); // 1 - większe
		System.out.println(two.compareTo(twoToCompare)); // 0 - równe
		System.out.println(one.compareTo(two)); // -1 - mniejsze

		// SPrawdza równość - equals(Object)
		System.out.println(two.equals(two)); // true
		System.out.println(two.equals(twoToCompare)); // false

		System.out.println(one.equals(two));  // false
		System.out.println(one.equals(oneToCompare)); // true

		//		System.out.println("Dodawanie: " + a.add(b));
		//		System.out.println("Odejmowanie: " + a.subtract(b));
		//		System.out.println("Mnożenie: " + a.multiply(b));
		//		System.out.println("Dzielenie: " + a.divide(b));
		//		System.out.println("Modulo: " + a.mod(b));
		//		System.out.println("Potęgowanie: " + a.pow(2));
	}
}
