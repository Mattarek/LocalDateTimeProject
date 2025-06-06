package old_2024.staticInheritence;

import old_2024.staticInheritence.A.A;

import static old_2024.staticInheritence.B.printA;

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
