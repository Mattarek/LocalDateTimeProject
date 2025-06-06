package old_2024.staticInheritence;

import old_2024.staticInheritence.A.A;

public class B extends A {
	public static final String CONST = "CONST_B";

	private static void printB() {
		System.out.println("Inside B class");
		printA();
	}
}
