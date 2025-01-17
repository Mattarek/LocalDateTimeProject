package org.StaticBlockInit;

public class Parrot extends Bird {
	public static String name;

	static {
		System.out.println("Static block Parrot");
		name = "Statyczna Agata";
	}

	private final String surname;

	{
		System.out.println("Non-static block Parrot");
		name = "Niestatyczna Agata";
		surname = "I Hakuna matata";
	}

	public Parrot() {
		System.out.println("Constructor Parrot called.");
	}

	public static String getName() {
		return name;
	}
}
