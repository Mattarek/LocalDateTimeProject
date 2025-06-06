package old_2024.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(final String[] args) {
		try {
			// Pobranie obiektu klasy
			final Class<?> personObj = Class.forName("old_2024.Reflection.Person");

			// Pobranie konstruktora i utworzenie instancji
			final Constructor<?> constructor = personObj.getConstructor(String.class, int.class);
			final Object personInstance = constructor.newInstance("Alice", 25);

			// Wywołanie metody introduce
			final Method introduceMethod = personObj.getMethod("introduce");
			introduceMethod.invoke(personInstance);

			// Modyfikacja prywatnego pola
			final Field nameField = personObj.getDeclaredField("name");
			nameField.setAccessible(true);
			nameField.set(personInstance, "Bob");

			// Ponowne wywołanie metody introduce po zmianie pola
			introduceMethod.invoke(personInstance);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
