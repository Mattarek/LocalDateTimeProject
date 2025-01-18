package org.Exceptions;

public class Driver {
	private int age;

	public Driver(final int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) throws RuntimeException {
		if (age < 18) {
			throw new DrivingException("You cannot drive below 18 years old!");
		}
		this.age = age;
	}
}
