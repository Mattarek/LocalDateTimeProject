package org.BigIntAndBigDecimal;

import java.math.BigInteger;

public class BigIntAndBigDecimal {
	public static void main(final String[] args) {
		final BigInteger a = new BigInteger("5000000000000000000000");
		final BigInteger b = new BigInteger("2000000000000000000000");

		System.out.println("Dodawanie: " + a.add(b));
		System.out.println("Odejmowanie: " + a.subtract(b));
		System.out.println("Mnożenie: " + a.multiply(b));
		System.out.println("Dzielenie: " + a.divide(b));
		System.out.println("Modulo: " + a.mod(b));
		System.out.println("Potęgowanie: " + a.pow(2));
	}
}
