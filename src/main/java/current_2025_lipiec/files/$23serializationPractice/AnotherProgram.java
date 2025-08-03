package current_2025_lipiec.files.$23serializationPractice;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AnotherProgram {
	public static void main(final String[] args) {
		final List<Person> peopleList = (List<Person>) deserializatedPerson().orElse(List.of(new Person("Default")));
		for (final Person person : peopleList) {
			System.out.println(person);
		}
	}

	private static Optional<List<?>> deserializatedPerson() {
		final List<Person> personList = new ArrayList<>();

		try (
				final ObjectInputStream deserializer = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream("src/main/java/current_2025_lipiec/files/$23serializationPractice" +
										"/Person.txt")
						)
				)
		) {
			while (true) {
				try {
					final Object object = deserializer.readObject(); // W tym momencie Java serialVersionUID
					if (object instanceof Person) {
						personList.add((Person) object);
					}
				} catch (final EOFException eof) {
					break;
				} catch (final ClassNotFoundException e) {
					throw new RuntimeException("Nieznana klasa podczas deserializacji", e);
				}
			}
			return Optional.of(personList);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}
}
