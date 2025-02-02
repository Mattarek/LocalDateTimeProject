package org.Collections.PassByValue;

public class PassByValue {
	public static void main(final String[] args) {
		final Dog dog = new Dog("Andrzej");
		edit(dog); // Java zawsze jest pass by value ale tym value jest referencja
		System.out.println(dog.getName());
	}

	public static void edit(final Dog dog) {
		dog.setName("Rex");
	}
}
