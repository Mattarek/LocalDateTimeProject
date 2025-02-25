package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(final String[] args) {
		final Person person = new Person("Marcin", 30, "secret123");

		try (final ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
			oos.writeObject(person);
			System.out.println("Obiekt został zapisany do pliku.");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
