package org.Collections.PassByValue;

public class PassByValue {
	public static void main(final String[] args) {
		final Dog dog = new Dog("Andrzej");
		final Dog dogTwo = new Dog("Rafał");

		edit(dogTwo); // Java zawsze jest pass by value ale tym value jest referencja
		System.out.println(dog.getName());
	}

	public static void edit(final Dog dog) {
		dog.setName("Rex");
	}

	//	public static void main(final String[] args) {
	//		final PassByValue homework = new PassByValue();
	//		homework.run();
	//	}
	//
	//	private static void method(String variable1, final Dog dog) {
	//		variable1.toUpperCase();
	//		dog.setName("Tomek");
	//		variable1 = dog.getName();
	//		System.out.println(variable1);
	//		System.out.println(dog.getName());
	//	}
	//
	//	private void run() {
	//		String variable1 = "zaJavka";
	//		final Dog dog = new Dog("Romek");
	//		dog.setName("Rafał");
	//		method(variable1, dog);
	//		System.out.println(dog.getName());
	//		variable1 = "Rafał";
	//	}
}
