package org.StaticBlockInit;

public class Main {
	public static void main(final String[] args) {
		System.out.println("Beggining of Main");
		final Parrot parrot = new Parrot();
		System.out.println(parrot);

		Dog.someMethod();
		Dog.someMethod();

		Animal.someMethod();

		Doable.doo();

		Parrot.getName();

		System.out.println("Ending of Main");
	}
}
