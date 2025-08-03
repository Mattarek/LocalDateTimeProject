package current_2025_lipiec.files.$23serializationPractice;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
	@Serial
	private static final long serialVersionUID = 4L;
	private final String name;

	public Person(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
