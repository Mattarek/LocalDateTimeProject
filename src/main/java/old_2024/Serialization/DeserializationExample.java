package old_2024.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
	// Wczytano obiekt: Person{name='Marcin', age=30, password='null'}
	// password jest nullem, ponieważ w Personie uzywamy: 	transient String password; // To pole nie zostanie zapisane

	public static void main(final String[] args) {
		try (final ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
			final Person person = (Person) ois.readObject();
			System.out.println("Wczytano obiekt: " + person);
		} catch (final IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
