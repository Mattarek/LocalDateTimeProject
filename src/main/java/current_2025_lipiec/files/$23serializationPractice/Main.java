package current_2025_lipiec.files.$23serializationPractice;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(final String[] args) {
		final Person personOne = new Person("Damian");
		final Person personTwo = new Person("Maciek");
		final Person personThree = new Person("Marcin");
		final Person personFour = new Person("Czesław");
		serializePerson(personOne, personTwo, personThree, personFour);
	}

	private static void serializePerson(final Person... persons) {
		try (
				final ObjectOutputStream serializer = new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("src/main/java/current_2025_lipiec/files" +
										"/$23serializationPractice/Person.txt")
						)
				)
		) {
			for (final Person person : persons) {
				serializer.writeObject(person);
				System.out.println(person);
			}
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
	}
}
