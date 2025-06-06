package old_2024.Files;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
	public static void main(final String[] args) {
		final File file = new File("./example.txt");

		try {
			if (file.createNewFile()) {
				System.out.println("Plik został utworzony: " + file.getName());
			} else {
				System.out.println("Plik już istnieje!");
			}
		} catch (final IOException e) {
			System.out.println("Wystąpiłbłąd podczas tworzenia pliku.");
			e.printStackTrace();
		}
	}
}
