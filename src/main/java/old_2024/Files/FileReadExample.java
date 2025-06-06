package old_2024.Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample {
	public static void main(final String[] args) {
		try (final Scanner scanner = new Scanner(new File("example.txt"))) {
			while (scanner.hasNextLine()) {
				final String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (final IOException e) {
			System.out.println("Nie znaleziono pliku.");
			e.printStackTrace();
		}
	}
}
