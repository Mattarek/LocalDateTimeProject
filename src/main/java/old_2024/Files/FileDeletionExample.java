package old_2024.Files;

import java.io.File;

public class FileDeletionExample {
	public static void main(final String[] args) {
		final File file = new File("example.txt");
		if (file.delete()) {
			System.out.println("Plik został usunięty: " + file.getName());
		} else {
			System.out.println("Nie udało się usunąć pliku!");
		}
	}
}
