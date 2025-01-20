package org.Exceptions.constructors;

public class Person {
	private static int age;

	// pojawai się na rekrutacjach
	static {
		age = 12;
		if (age == 12) {
			try {
				throw new WrongAgeException("Cannot be 12 years old");
			} catch (final WrongAgeException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Valid age in init block!");
	}

	public Person() throws WrongAgeException {
	}

	public Person(final int age) throws WrongAgeException {
		System.out.println("Person constructor beginning");
		if (age > 0 && age < 120) {
			Person.age = age;
			System.out.println("Person constructor being fine!");
		} else {
			System.out.println("Person constructor throwing exception");
			throw new WrongAgeException("What is this dude?");
		}
		System.out.println("Person constructor ending");
	}
}
