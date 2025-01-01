package org.staticInheritence;

import org.staticInheritence.A.A;

import static org.staticInheritence.B.printA;

public class main {
	public static void main(final String[] args) {
		final B b = new B();
		printA();

		final A a = new B();
		printA();

		// Bad inheritance, DON"T DO THAT
		printA();

		// Dziedziczenie "hiding" naszą stałą dostępną w klasie A.
		System.out.println(B.CONST);
	}
}
