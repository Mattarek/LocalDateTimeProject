package org.staticInheritence;

import org.staticInheritence.A.A;

public class B extends A {
	public static final String CONST = "CONST_B";

	private static void printB() {
		System.out.println("Inside B class");
		printA();
	}
}
