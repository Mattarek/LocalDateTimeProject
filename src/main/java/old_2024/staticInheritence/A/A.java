package old_2024.staticInheritence.A;

public class A {
	public static final String CONST = "CONST_A";

	public static void printA() {
		System.out.println("Inside A class");
	}

	protected void method() {
		printA();
	}
}
