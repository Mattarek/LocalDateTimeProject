package old_2024.Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
	public static void main(final String[] args) {
		try (final FileWriter writer = new FileWriter("example.txt")) {
			writer.write("Hello world \n");
			writer.write("Druga linia");
			// jako, żę wykonujemy try... with resources, ten automatycznie dodaje writer.close()
			// i dlatego tekst jest zapisywany
			System.out.println("Tekst został zapisany do pliku!");
		} catch (final IOException e) {
			System.out.println("Wystąpił błąd podczas zapisu do pliku");
			e.printStackTrace();
		}
	}
}
