package org.LambdaFirstExample;

import java.util.function.Predicate;

public class Animal {
	// Interfejs Predicate dla filtrowania
	public static Predicate<Animal> isAdult = animal -> animal.getAge() >= 5;
	private final String name;
	private final String species;
	private final int age;

	public Animal(final String name, final String species, final int age) {
		this.name = name;
		this.species = species;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Animal{name='" + name + "', species='" + species + "', age=" + age + '}';
	}

	// Method to represent lambda function inside class
	public void makeSound() {
		final Runnable sound = () -> System.out.println(name + " makes a sound");
		sound.run();
	}
}