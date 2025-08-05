package current_2025_lipiec.files.$22serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		//		final List<Car> cars = new ArrayList<>();
		//		cars.add(new Car("Ford Mustang", 1969L, List.of(new Door("left"), new Door("right"))));
		//		cars.add(new Car("BMW S6", 2015L, List.of(new Door("left"), new Door("right"))));
		//		cars.add(new Car("Mercedes G-class", 2004L, List.of(new Door("left"), new Door("right"))));
		//		System.out.println(cars);

		final File destination = new File("src/main/java/current_2025_lipiec/files/$22serialization/car.whatever");
		//		serialize(cars, destination);
		//		final List<Car> carsDeserialized = deserializeCars(destination);

		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat("Burek", "Burecki"));
		cats.add(new Cat("Fafik", "Fafikowy"));
		cats.add(new Cat("Aport", "Aporcinski"));
		System.out.println(cats);

		serialize(cats, destination);
		deserialize(destination);
	}

	private static List<Object> deserialize(final File destination) {
		final List<Object> obj = new ArrayList<>();

		try (final ObjectInputStream inputStream =
					 new ObjectInputStream(
							 new BufferedInputStream(
									 new FileInputStream(destination)
							 )
					 )
		) {

			while (true) {
				// readObject - wczytuje do momentu aż otrzyma wyjątek: EndOfFileException
				final Object object = inputStream.readObject();
				obj.add(object);
			}
		} catch (final EOFException e) {
			System.out.println("While loop exception");
		} catch (final IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return obj;
	}

	private static void serialize(final List<?> objects, final File destination) {
		try (final ObjectOutputStream outputStream =
					 new ObjectOutputStream(
							 new BufferedOutputStream(
									 new FileOutputStream(destination)))) {
			for (final Object object : objects) {
				outputStream.writeObject(object);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
