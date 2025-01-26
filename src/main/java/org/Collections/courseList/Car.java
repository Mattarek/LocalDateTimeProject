package org.Collections.courseList;

import java.util.Objects;

public class Car {
	private final String age;
	private final String model;
	private String name;

	public Car(final String name, final String age, final String model) {
		this.name = name;
		this.age = age;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", model='" + model + '\'' +
				'}';
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Car car)) {
			return false;
		}
		return Objects.equals(name, car.name) && Objects.equals(age, car.age) && Objects.equals(model, car.model);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, model);
	}
}
