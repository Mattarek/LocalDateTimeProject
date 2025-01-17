package org.StaticBlockInit;

public class Main {
	public static void main(final String[] args) {
		System.out.println("Beggining of Main");
		final Parrot parrot = new Parrot();
		System.out.println(parrot);

		Dog.someMethod();
		Animal.someMethod();
		Animal.someMethod();

		Doable.doo();

		Parrot.getName();
		Parrot.getName();

		System.out.println("Ending of Main");
	}
}
