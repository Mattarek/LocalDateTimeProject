package current_2025_lipiec.files.$24PrintStreamPrintWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(final String[] args) {
		// Wyświetlanie i formatowanie
		//		System.err.println("Zajavka");
		//		System.out.println("Zajavka");
		//		System.err.println("Zajavka");
		//
		//		System.out.format("%s=%s", "key", "value");
		//		System.out.println();
		//		System.out.format("%s=%s", "key", "value");
		//		System.out.println();
		//		System.out.format("%s=%s", "key", "value");
		//		System.out.println();
		//		System.out.format("%s=%s", "key", "value");

		// Do pliku
		final File file = new File("src/main/java/current_2025_lipiec/files/$24PrintStreamPrintWriter/example.txt");
		try (final PrintWriter writer = new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)
				)
		)) {
			writer.print(1L);
			writer.print(1L);

			final Car car = new Car("Stefan");
			writer.print(car);
			writer.println();

			writer.println("zajavka");
			
			writer.printf("Some value: [%s]%n", car);
			writer.printf("Some value: [%s]%n", car);
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
	}
}
