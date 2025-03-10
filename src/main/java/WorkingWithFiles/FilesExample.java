package WorkingWithFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesExample {

	public static void main(final String[] args) {
		final Path filePath = Paths.get("example.txt");

		try {
			// Tworzenie pliku, jeśli nie istnieje
			if (!Files.exists(filePath)) {
				Files.createFile(filePath);
				System.out.println("Plik został utworzony.");
			}

			// Zapisywanie do pliku
			final List<String> lines = List.of("Linia 1", "Linia 2", "Linia 3");
			Files.write(filePath, lines);
			System.out.println("Zapisano dane do pliku.");

			// Odczyt pliku
			final List<String> readLines = Files.readAllLines(filePath);
			System.out.println("Zawartość pliku:");
			readLines.forEach(System.out::println);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}

